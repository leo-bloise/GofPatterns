package gof.patterns.structural.composite.application

import gof.patterns.structural.composite.domain.Archive
import gof.patterns.structural.composite.domain.ArchiveFolder
import java.io.File
import java.util.Collections
import kotlin.io.path.Path
import kotlin.io.path.exists

class ArchiveFolderFactory(file: File): ArchiveAbstractFactory(file) {
    private fun createChildFile(child: String): File {
        val absolutePath = Path(file.absolutePath, child)
        if (!absolutePath.exists()) {
            throw RuntimeException("Path to child $absolutePath does not exists")
        }
        return absolutePath.toFile()
    }
    override fun create(): Archive {
        val children = file.list()
        if(children == null) {
            throw RuntimeException("${file.absolutePath} is not a directory or I/O related error occurred")
        }
        if(children.isEmpty()) {
            return ArchiveFolder(file.absolutePath, Collections.emptyList())
        }
        val archiveChildren = ArrayList<Archive>()
        for (child in children) {
            val childFile = createChildFile(child)
            val archiveFactory = getFactory(childFile)
            val childArchive = archiveFactory.create()
            archiveChildren.add(childArchive)
        }
        return ArchiveFolder(file.absolutePath, archiveChildren)
    }
}