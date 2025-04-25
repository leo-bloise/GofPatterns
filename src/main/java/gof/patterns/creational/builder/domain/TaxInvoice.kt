package gof.patterns.creational.builder.domain

import java.time.Instant

data class TaxInvoice(
    val clientName: String,
    val orders: Collection<Order>
) {
    val storeName = "Polygon LTDA"
    val creationDate = Instant.now()
}