package gof.patterns.structural.composite.application

import gof.patterns.structural.composite.domain.Archive
import gof.patterns.structural.composite.domain.ArchiveFile
import gof.patterns.structural.composite.domain.ArchiveFolder

class ArchivePrinter {
    private fun generatePrintForFile(archiveFile: ArchiveFile): String {
        return archiveFile.toString()
    }
    private fun generatePrintForDirectory(archiveFolder: ArchiveFolder, depth: Int): String {
        val sb = StringBuilder()
        var spacing = ""
        for (i in 0..depth) {
            spacing += "    "
        }
        sb.appendLine(archiveFolder.getPath())
        for (archive in archiveFolder) {
            if (archive is ArchiveFile) {
                sb.appendLine("${spacing}${generatePrintForFile(archive)}")
            } else if (archive is ArchiveFolder) {
                sb.appendLine("${spacing}${generatePrintForDirectory(archive, depth + 2)}")
            }
        }
        return sb.toString()
    }
    fun print(archive: Archive) {
        val sb = StringBuilder()
        if (archive is ArchiveFile) {
            sb.appendLine(generatePrintForFile(archive))
        } else if (archive is ArchiveFolder) {
            sb.appendLine(generatePrintForDirectory(archive, 0))
        }
        println(sb)
    }
}