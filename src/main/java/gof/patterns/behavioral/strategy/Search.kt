package gof.patterns.behavioral.strategy

class Search(var searchAlgorithm: SearchAlgorithm<Int>) {
    fun search(collection: List<Int>, value: Int): Boolean {
        return searchAlgorithm.search(collection, value)
    }
}