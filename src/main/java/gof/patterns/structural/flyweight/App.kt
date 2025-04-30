package gof.patterns.structural.flyweight

fun main() {
    val chemicalElementFactory = ChemicalElementFactory()
    val oxygenElements = HashMap<ChemicalElement, Int>()
    val sulfurElements = HashMap<ChemicalElement, Int>()
    oxygenElements.put(chemicalElementFactory.create("O", "Oxygen"), 3)
    sulfurElements.put(chemicalElementFactory.create("H", "Hydrogen"), 2)
    sulfurElements.put(chemicalElementFactory.create("S", "Sulfur"), 1)
    oxygenElements.put(chemicalElementFactory.create("O", "Oxygen"), 4)
    val oxygen = Compound(oxygenElements, "Oxygen")
    val sulfuricAcid = Compound(sulfurElements, "Sulfuric Acid")
    println(oxygen)
    println(sulfuricAcid)
}