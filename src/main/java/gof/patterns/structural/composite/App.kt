package gof.patterns.structural.composite

import gof.patterns.structural.composite.application.ArchiveAbstractFactory
import gof.patterns.structural.composite.application.ArchivePrinter

fun main() {
    val archiveFactory = ArchiveAbstractFactory.getFactory("teste")
    val archive = archiveFactory.create()
    val printer = ArchivePrinter()
    printer.print(archive)
}