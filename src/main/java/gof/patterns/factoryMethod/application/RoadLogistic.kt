package gof.patterns.factoryMethod.application

import gof.patterns.factoryMethod.domain.Transporter
import gof.patterns.factoryMethod.domain.Logistic
import gof.patterns.factoryMethod.domain.Product

class RoadLogistic(val product: Product): Logistic {
    override fun createTransporter(): Transporter {
        return Truck(product)
    }
}