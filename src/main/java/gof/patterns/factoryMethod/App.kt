package gof.patterns.factoryMethod

import gof.patterns.factoryMethod.application.LogisticProvider
import gof.patterns.factoryMethod.domain.Address
import gof.patterns.factoryMethod.domain.Product
import gof.patterns.factoryMethod.domain.Store

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