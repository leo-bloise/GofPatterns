package gof.patterns.abstractFactory.application

class XMLInvoiceEncoderFactory: InvoiceEncoderFactory() {
    override fun createInvoiceEncoder(): InvoiceEncoder {
        return XMLInvoiceEncoder()
    }
}