package gof.patterns.abstractFactory

import gof.patterns.abstractFactory.application.InvoiceEncoderFactories
import gof.patterns.abstractFactory.application.InvoiceEncoderFactory
import gof.patterns.abstractFactory.domain.Address
import gof.patterns.abstractFactory.domain.Client
import gof.patterns.abstractFactory.domain.Invoice
import gof.patterns.abstractFactory.domain.Product
import gof.patterns.abstractFactory.domain.Store

fun defineProducts(): Map<String, Product> {
    val products = arrayOf(
        Product("A", "Produto A"),
        Product("B", "Produto B"),
        Product("C", "Produto C"),
        Product("D", "Produto D"),
        Product("E", "Produto E"),
        Product("F", "Produto F"),
    )
    val map = HashMap<String, Product>()
    for(product: Product in products) {
        map[product.code] = product
    }
    return map
}

fun main() {
    val products = defineProducts()
    val store = Store(products)
    val paymentProcess = store.buy("A")
    val client = Client("Leonardo", Address(10, 10))
    val order = paymentProcess.complete(client)
    val jsonInvoiceEncoderFactory = InvoiceEncoderFactory.createInvoiceEncoderFactory(InvoiceEncoderFactories.JSON)
    val xmlInvoiceEncoderFactory = InvoiceEncoderFactory.createInvoiceEncoderFactory(InvoiceEncoderFactories.XML)
    val jsonInvoiceEncoder = jsonInvoiceEncoderFactory.createInvoiceEncoder()
    val xmlInvoiceEncoder = xmlInvoiceEncoderFactory.createInvoiceEncoder()
    val jsonData = jsonInvoiceEncoder.encode(Invoice(order))
    val xmlData = xmlInvoiceEncoder.encode(Invoice(order))
    println(jsonData)
    println(xmlData)
}