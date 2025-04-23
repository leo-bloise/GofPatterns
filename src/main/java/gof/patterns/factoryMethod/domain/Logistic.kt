package gof.patterns.factoryMethod.domain

interface Logistic {
    /**
     * Factory method to create the transporter
     * */
    fun createTransporter(): Transporter
}