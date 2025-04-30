package gof.patterns.structural.composite.application

import gof.patterns.structural.composite.domain.Archive
import java.io.File

abstract class ArchiveAbstractFactory(protected val file: File) {
    abstract fun create(): Archive
    companion object {
        fun getFactory(filepath: String): ArchiveAbstractFactory {
            val file = File(filepath)
            if(file.isFile) {
                return ArchiveFileFactory(file)
            }
            return ArchiveFolderFactory(file)
        }
        fun getFactory(file: File): ArchiveAbstractFactory {
            return getFactory(file.absolutePath)
        }
    }
}