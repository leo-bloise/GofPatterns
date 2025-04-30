package gof.patterns.structural.facade

import gof.patterns.structural.composite.domain.Archive

interface ArchiveCreator {
    fun create(filename: String, content: String?): Archive
}