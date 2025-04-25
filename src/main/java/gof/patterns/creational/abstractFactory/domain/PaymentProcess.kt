package gof.patterns.creational.abstractFactory.domain

class PaymentProcess(private val product: Product) {
    fun complete(client: Client): Order {
        println("Paying the product $product for client $client")
        return Order(client, product)
    }
}