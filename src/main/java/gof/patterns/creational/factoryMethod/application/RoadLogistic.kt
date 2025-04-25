package gof.patterns.creational.factoryMethod.application

import gof.patterns.creational.factoryMethod.domain.Transporter
import gof.patterns.creational.factoryMethod.domain.Logistic
import gof.patterns.creational.factoryMethod.domain.Product

class RoadLogistic(val product: Product): Logistic {
    override fun createTransporter(): Transporter {
        return Truck(product)
    }
}