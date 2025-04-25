package gof.patterns.prototype;

fun main() {
    val listOfShapes = ArrayList<Shape>()
    for (i in 0..10) {
        listOfShapes.add(
            Circle(radius = 10 * i + 1, x = 10 * i + 1, y = 10 * i + 1, color = "red " + (i *10) ),
        )
    }
    val first = listOfShapes.get(0)
    val cloneOfFirst = first.clone()
    println(cloneOfFirst)
}