package Clases

fun main() {
    val spiceList = listOf(
        Spice("Curry", "mild"),
        makeSalt() // Usando la función auxiliar
    )

    spiceList.filter { it.heat > 0 }.forEach { println(it.name + " " + it.heat) }
}

class Spice (val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                else -> 0
            }
        }

    init {
        println("Spice[name=$name, spiciness=$spiciness, heat=$heat]")
    }
}

fun makeSalt() = Spice("Salt")