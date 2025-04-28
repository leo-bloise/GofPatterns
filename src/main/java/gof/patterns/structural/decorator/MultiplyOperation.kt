package gof.patterns.structural.decorator

class MultiplyOperation(
    private val sumOperation: MathOperation
): MathOperation {
    override fun execute(x: Int, y: Int): Int {
        var total = 0
        for (i in 1..y) {
            total = sumOperation.execute(total, x)
        }
        return total
    }
}