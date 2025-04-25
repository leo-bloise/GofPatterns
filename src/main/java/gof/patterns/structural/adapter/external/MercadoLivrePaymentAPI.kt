package gof.patterns.structural.adapter.external

class MercadoLivrePaymentAPI {
    fun pay(cardholder: String, number: String, value: Double): Boolean {
        println("Paying value $value with $cardholder and $number")
        return true
    }
}