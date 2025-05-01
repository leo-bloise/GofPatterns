package gof.patterns.behavioral.iterator

class MyCollectionIterator<T>(
    private val collection: MyCollection<T>,
): Iterator<T> {
    private var i = 0
    override fun next(): T {
        return collection.data[i++]
    }
    override fun hasNext(): Boolean {
        return collection.data.size > i
    }
}