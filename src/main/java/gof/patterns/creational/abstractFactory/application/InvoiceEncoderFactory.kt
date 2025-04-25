package gof.patterns.creational.abstractFactory.application

abstract class InvoiceEncoderFactory {
    /**
     * Factory method that generates the final object.
     * */
    abstract fun createInvoiceEncoder(): InvoiceEncoder
    companion object {
        /**
         * Factory method that generates the object holding the factory method
         * */
        fun createInvoiceEncoderFactory(format: InvoiceEncoderFactories): InvoiceEncoderFactory {
            return when(format) {
                InvoiceEncoderFactories.XML -> XMLInvoiceEncoderFactory()
                InvoiceEncoderFactories.JSON -> JsonInvoiceEncoderFactory()
            }
        }
    }
}