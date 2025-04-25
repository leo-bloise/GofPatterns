package gof.patterns.creational.abstractFactory.application

class XMLInvoiceEncoderFactory: InvoiceEncoderFactory() {
    override fun createInvoiceEncoder(): InvoiceEncoder {
        return XMLInvoiceEncoder()
    }
}