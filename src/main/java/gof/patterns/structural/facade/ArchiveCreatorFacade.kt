package gof.patterns.structural.facade

import gof.patterns.structural.composite.application.ArchiveAbstractFactory
import gof.patterns.structural.composite.domain.Archive
import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.exists

class ArchiveCreatorFacade: ArchiveCreator {
    override fun create(
        filename: String,
        content: String?
    ): Archive {
        val basepath = Path(filename)
        if (basepath.exists()) {
            throw IllegalArgumentException("file with $filename already exists")
        }
        val file = File(basepath.toString())
        file.createNewFile()
        if(file.isFile && content != null) {
            file.writeText(content)
        }
        val factory = ArchiveAbstractFactory.getFactory(file)
        return factory.create()
    }
}