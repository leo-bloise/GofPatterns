package gof.patterns.prototype

abstract class Shape {
    var x: Int = 0
    var y: Int = 0
    var color: String = ""
    constructor()
    constructor(source: Shape) {
        x = source.x
        y = source.y
        color = source.color
    }
    abstract fun clone(): Shape
    override fun toString(): String {
        return "x=[$x],y=[$y],color=[$color]"
    }
}