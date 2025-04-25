package gof.patterns.creational.abstractFactory.application

class JsonInvoiceEncoderFactory: InvoiceEncoderFactory() {
    override fun createInvoiceEncoder(): InvoiceEncoder {
        return JsonInvoiceEncoder()
    }
}