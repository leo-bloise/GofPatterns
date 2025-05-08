package gof.patterns.behavioral.strategy

fun main() {
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val binarySearch = BinarySearch()
    val linearSearch = LinearSearch()
    val search = Search(binarySearch)
    println(search.search(list, 2))
    search.searchAlgorithm = linearSearch
    println(search.search(list, 2))
}