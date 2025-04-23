package gof.patterns.factoryMethod.application

import gof.patterns.factoryMethod.domain.Transporter
import gof.patterns.factoryMethod.domain.Address
import gof.patterns.factoryMethod.domain.Product

class Ship(product: Product): Transporter(product) {
    override fun deliver(address: Address) {
        println("Delivery $product by Ship to $address")
    }
}