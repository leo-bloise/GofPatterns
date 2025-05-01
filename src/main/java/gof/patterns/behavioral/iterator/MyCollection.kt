package gof.patterns.behavioral.iterator

class MyCollection<T> {
    val data: ArrayList<T> = ArrayList()
    private var iterator: Iterator<T>? = null
    fun add(item: T) {
        data.add(item)
    }
    fun iterator(): Iterator<T> {
        if (iterator == null) iterator = MyCollectionIterator(this)
        return iterator as Iterator<T>
    }
}