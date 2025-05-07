package gof.patterns.behavioral.mediator.components

interface Mediator<TSender> {
    fun notify(sender: TSender, event: String);
}