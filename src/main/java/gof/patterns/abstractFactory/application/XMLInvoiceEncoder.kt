package gof.patterns.abstractFactory.application

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import gof.patterns.abstractFactory.domain.Invoice

class XMLInvoiceEncoder: InvoiceEncoder {
    private val mapper = XmlMapper().apply {
        registerKotlinModule()
    }
    override fun encode(invoice: Invoice): String {
        return mapper.writeValueAsString(invoice)
    }
}