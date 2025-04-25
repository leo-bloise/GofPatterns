package gof.patterns.creational.builder.domain

data class Order(
    val product: Product,
    val quantity: Int,
    val owner: String,
) {
}