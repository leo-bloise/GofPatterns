package gof.patterns.structural.proxy.domain

import gof.patterns.structural.composite.domain.Archive
import gof.patterns.structural.composite.domain.ArchiveFile

class CachedArchiveFile(private val archive: ArchiveFile): Archive(archive.getPath()) {
    private var cache: String? = null
    override fun delete() {
        archive.delete()
    }
    fun read(): String {
        if (cache == null) {
            cache = archive.read()
            println("Cache updated!")
        }
        println("Getting from cache")
        return cache as String
    }
}