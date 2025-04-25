package gof.patterns.creational.factoryMethod.domain

interface Logistic {
    /**
     * Factory method to create the transporter
     * */
    fun createTransporter(): Transporter
}