package gof.patterns.behavioral.strategy

class BinarySearch: SearchAlgorithm<Int> {
    override fun search(collection: List<Int>, item: Int): Boolean {
         var l = 0;
         var r = collection.size - 1
         while (l <= r) {
             val m = l + (r - l) / 2
             if (collection[m] == item) return true
             if (collection[m] > item) {
                 r = m - 1;
                 continue
             }
             l = m + 1
         }
        return false
    }
}