package gof.patterns.creational.prototype

class Circle: Shape {
    private var radius: Int = 0
    constructor(): super()
    constructor(radius: Int, x: Int, y: Int, color: String) {
        this.x = x
        this.y = y
        this.color = color
        this.radius = radius
    }
    constructor(source: Circle): super(source) {
        this.radius = source.radius
    }
    override fun clone(): Shape {
        return Circle(this)
    }
}