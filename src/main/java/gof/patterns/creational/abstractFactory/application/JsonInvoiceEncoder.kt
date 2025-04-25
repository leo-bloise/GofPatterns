package gof.patterns.creational.abstractFactory.application

import gof.patterns.creational.abstractFactory.domain.Invoice
import kotlinx.serialization.json.Json

class JsonInvoiceEncoder: InvoiceEncoder {
    override fun encode(invoice: Invoice): String {
        return Json.encodeToString(invoice)
    }
}