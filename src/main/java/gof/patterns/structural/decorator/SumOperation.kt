package gof.patterns.structural.decorator

class SumOperation: MathOperation {
    override fun execute(x: Int, y: Int): Int {
        return x + y
    }
}