package gof.patterns.creational.factoryMethod.application

import gof.patterns.creational.factoryMethod.domain.Address
import gof.patterns.creational.factoryMethod.domain.Logistic
import gof.patterns.creational.factoryMethod.domain.Order

class LogisticProvider {
    private fun calculateDistanceFromProvider(address: Address): Int {
        return address.latitude * address.longitude
    }
    /**
     * Factory method to determine which logistic will be applied.
     * */
    fun createLogistic(order: Order): Logistic {
        val distance = calculateDistanceFromProvider(order.address)
        if (distance > 100) {
            return SeaLogistic(order.product)
        }
        return RoadLogistic(order.product)
    }
}