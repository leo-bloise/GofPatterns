package gof.patterns.abstractFactory.application

import gof.patterns.abstractFactory.domain.Invoice
import kotlinx.serialization.json.Json

class JsonInvoiceEncoder: InvoiceEncoder {
    override fun encode(invoice: Invoice): String {
        return Json.encodeToString(invoice)
    }
}