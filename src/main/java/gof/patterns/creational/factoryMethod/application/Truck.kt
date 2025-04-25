package gof.patterns.creational.factoryMethod.application

import gof.patterns.creational.factoryMethod.domain.Transporter
import gof.patterns.creational.factoryMethod.domain.Address
import gof.patterns.creational.factoryMethod.domain.Product

class Truck(product: Product): Transporter(product) {
    override fun deliver(address: Address) {
        println("Deliverying $product by Truck to $address")
    }
}