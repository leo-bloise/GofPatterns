package gof.patterns.behavioral.memento

import java.util.Stack

fun main() {
    val history = Stack<Memento>()
    val order = Order(123, listOf("Plates", "Workspaces"))
    history.push(order.save())
    order.itens = listOf<String>("Workspaces")
    history.push(order.save())
    order.itens = listOf<String>()
    println(order)
    for (i in 1..history.size) {
        val lastState = history.pop()
        lastState.restore()
        println(order)
    }
}