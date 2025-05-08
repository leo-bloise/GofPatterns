package gof.patterns.behavioral.strategy

interface SearchAlgorithm<T> {
    fun search(collection: List<T>, item: T): Boolean
}