package gof.patterns.structural.composite.domain

import java.io.File

abstract class Archive(private val filepath: String) {
    protected val fileObj: File = File(filepath)
    init {
        if(!fileObj.exists()) {
            throw IllegalArgumentException("filepath ${filepath} does not exists")
        }
    }
    fun getPath(): String {
        return fileObj.absolutePath
    }
    abstract fun delete()
    override fun toString(): String {
        return filepath
    }
}