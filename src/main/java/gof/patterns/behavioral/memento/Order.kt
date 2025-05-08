package gof.patterns.behavioral.memento

import java.util.Arrays

class Order(var number: Int, var itens: Collection<String>): Originator {
    override fun save(): Memento {
        return OrderSnapshot(this)
    }
    override fun toString(): String {
        return itens.toString()
    }
}