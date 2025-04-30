package gof.patterns.structural.flyweight

data class ChemicalElement(
    val symbol: String,
    val name: String
) {
    override fun toString(): String {
        return "$name - $symbol"
    }
}