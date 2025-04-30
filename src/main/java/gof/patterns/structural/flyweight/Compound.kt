package gof.patterns.structural.flyweight

data class Compound(
    val elements: Map<ChemicalElement, Int>,
    val name: String
) {
    override fun toString(): String {
        return name
    }
}