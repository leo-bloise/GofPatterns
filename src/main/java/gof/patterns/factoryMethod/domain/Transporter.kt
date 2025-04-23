package gof.patterns.factoryMethod.domain

abstract class Transporter(val product: Product) {
    abstract fun deliver(address: Address)
}