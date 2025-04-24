package gof.patterns.abstractFactory.application

class JsonInvoiceEncoderFactory: InvoiceEncoderFactory() {
    override fun createInvoiceEncoder(): InvoiceEncoder {
        return JsonInvoiceEncoder()
    }
}