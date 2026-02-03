package Clases.Spicies

fun main() {
    val spice = Curry("Curry Asiatico", "spicy")
    println(spice.color)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

abstract class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {

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

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {
        println("Moliendo Curry")
    }

    override fun prepareSpice() {
        println("Preparando Curry")
    }
}