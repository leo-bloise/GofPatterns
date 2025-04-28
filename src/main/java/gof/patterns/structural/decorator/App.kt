package gof.patterns.structural.decorator

fun main() {
    val sumOperation = SumOperation()
    val multiplyOperation = MultiplyOperation(sumOperation)
    println("Sum: ${sumOperation.execute(1,1)}")
    println("Multiply 2 * 3: ${multiplyOperation.execute(2, 3)}")
}