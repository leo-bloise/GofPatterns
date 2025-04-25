package gof.patterns.creational.factoryMethod.domain

data class Address(val latitude: Int, val longitude: Int) {
    override fun toString(): String {
        return "lat: $latitude, lon: $longitude"
    }
}