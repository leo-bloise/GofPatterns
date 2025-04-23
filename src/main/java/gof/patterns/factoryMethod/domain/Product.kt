package gof.patterns.factoryMethod.domain

data class Product(val code: String, val name: String, val description: String) {
    override fun toString(): String {
        return "$code - $name"
    }
}