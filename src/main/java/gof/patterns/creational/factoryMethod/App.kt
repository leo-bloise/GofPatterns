package gof.patterns.creational.factoryMethod

import gof.patterns.creational.factoryMethod.application.LogisticProvider
import gof.patterns.creational.factoryMethod.domain.Address
import gof.patterns.creational.factoryMethod.domain.Product
import gof.patterns.creational.factoryMethod.domain.Store

fun main() {
    val store = Store()
    val logisticProvider = LogisticProvider()
    val a = Address(100, 10)
    val p = Product("A123", "Marble Plates", "Plates made out of marble")
    val order = store.buy(p, a)
    val logistic = logisticProvider.createLogistic(order)
    val transporter = logistic.createTransporter()
    transporter.deliver(order.address)
}