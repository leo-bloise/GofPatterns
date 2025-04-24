package gof.patterns.builder

import gof.patterns.builder.application.TaxInvoiceExportStringBuilder
import gof.patterns.builder.domain.Order
import gof.patterns.builder.domain.Product
import gof.patterns.builder.domain.TaxInvoice

fun main() {
    val order = Order(
        product = Product(
            "A",
            "Plates",
            10.23
        ),
        quantity = 10,
        "Leonardo Bloise"
    )
    val invoice = TaxInvoice(order.owner, listOf(order))
    val builder = TaxInvoiceExportStringBuilder()
    println(builder
        .buildHeader(invoice)
        .buildBody(invoice)
        .buildFooter(invoice)
        .build())

}