package gof.patterns.abstractFactory.domain

class Store(private val products: Map<String, Product>) {
    private fun validateProductCode(code: String) {
        val product = products[code]
        if(product == null) {
            throw IllegalArgumentException("product code [$code] does not relate to any product")
        }
    }
    fun buy(code: String): PaymentProcess {
        validateProductCode(code)
        val product = products[code]
        return PaymentProcess(product as Product)
    }
}