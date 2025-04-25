package gof.patterns.creational.abstractFactory.application

import gof.patterns.creational.abstractFactory.domain.Invoice

interface InvoiceEncoder {
    fun encode(invoice: Invoice): String
}