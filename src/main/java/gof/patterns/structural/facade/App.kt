package gof.patterns.structural.facade

fun main() {
    val archiveCreator = ArchiveCreatorFacade()
    archiveCreator.create("teste.txt", "Hello World!")
}