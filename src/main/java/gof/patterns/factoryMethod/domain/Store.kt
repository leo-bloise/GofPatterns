package gof.patterns.factoryMethod.domain

class Store {
    fun buy(product: Product, address: Address): Order {
        println("Congratulations! You just bought the product: $product")
        return Order(product, address)
    }
}