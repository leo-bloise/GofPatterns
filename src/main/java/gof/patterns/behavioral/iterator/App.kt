package gof.patterns.behavioral.iterator

fun main() {
    val intCollection = MyCollection<Int>()
    for (i in 1..10) {
        intCollection.add(i)
    }
    while (intCollection.iterator().hasNext()) {
        println(intCollection.iterator().next())
    }
}