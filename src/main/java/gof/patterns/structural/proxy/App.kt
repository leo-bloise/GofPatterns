package gof.patterns.structural.proxy

import gof.patterns.structural.composite.domain.ArchiveFile
import gof.patterns.structural.proxy.domain.CachedArchiveFile
import java.io.File

fun main() {
    val file = File("teste.txt")
    val archiveFile = ArchiveFile(file.absolutePath)
    val cachedArchiveFile = CachedArchiveFile(archiveFile)
    cachedArchiveFile.read() // really reads the file
    cachedArchiveFile.read() // uses cache.
}