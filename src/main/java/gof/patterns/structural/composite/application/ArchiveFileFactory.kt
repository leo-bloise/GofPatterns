package gof.patterns.structural.composite.application

import gof.patterns.structural.composite.domain.Archive
import gof.patterns.structural.composite.domain.ArchiveFile
import java.io.File

class ArchiveFileFactory(file: File): ArchiveAbstractFactory(file) {
    override fun create(): Archive {
        return ArchiveFile(file.absolutePath)
    }
}