package gof.patterns.abstractFactory.application

abstract class InvoiceEncoderFactory {
    abstract fun createInvoiceEncoder(): InvoiceEncoder
    companion object {
        fun createInvoiceEncoderFactory(format: InvoiceEncoderFactories): InvoiceEncoderFactory {
            return when(format) {
                InvoiceEncoderFactories.XML -> XMLInvoiceEncoderFactory()
                InvoiceEncoderFactories.JSON -> JsonInvoiceEncoderFactory()
            }
        }
    }
}