package gof.patterns.behavioral.memento

interface Originator {
    fun save(): Memento;
}