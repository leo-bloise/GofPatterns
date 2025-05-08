package gof.patterns.behavioral.memento

class OrderSnapshot(val originator: Order): Memento {
    private val number = originator.number;
    private val itens = originator.itens;
    override fun restore() {
        originator.number = number;
        originator.itens = itens;
    }
}