package gof.patterns.structural.composite.domain

class ArchiveFolder(filepath: String, private val children: Collection<Archive>): Archive(filepath), Iterable<Archive> {
    override fun delete() {
        for (child in children) {
            child.delete()
        }
        fileObj.delete()
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.appendLine(super.toString())
        for(child in children) {
            sb.append("    ")
            sb.appendLine("- ${child}")
        }
        return sb.toString()
    }

    override fun iterator(): Iterator<Archive> {
        return children.iterator()
    }
}