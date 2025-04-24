package gof.patterns.abstractFactory.application

import gof.patterns.abstractFactory.domain.Invoice

interface InvoiceEncoder {
    fun encode(invoice: Invoice): String
}