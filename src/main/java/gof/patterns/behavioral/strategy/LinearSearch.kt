package gof.patterns.behavioral.strategy

class LinearSearch: SearchAlgorithm<Int> {
    override fun search(collection: List<Int>, item: Int): Boolean {
        for (number in collection) {
            if (number == item) return true
        }
        return false
    }
}