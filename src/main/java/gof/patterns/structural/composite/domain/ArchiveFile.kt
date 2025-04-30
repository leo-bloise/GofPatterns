package gof.patterns.structural.composite.domain

class ArchiveFile(filepath: String): Archive(filepath) {
    override fun delete() {
        if(!fileObj.delete()) {
            throw RuntimeException("$this could not be deleted")
        }
    }

    override fun toString(): String {
        return "File: ${super.toString()}"
    }
}