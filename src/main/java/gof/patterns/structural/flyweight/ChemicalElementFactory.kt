package gof.patterns.structural.flyweight

class ChemicalElementFactory {
    private val cache: MutableMap<String, ChemicalElement> = HashMap()
    fun create(symbol: String, name: String): ChemicalElement {
        return cache.getOrElse(symbol) {
            val element = ChemicalElement(symbol, name)
            cache.put(symbol, element)
            println("Created element $element")
            return element
        }
    }
}