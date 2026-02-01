import kotlin.random.Random

fun main() {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nTu fortuna es: $fortune")
        if (fortune.contains("Tómatelo con calma")) break;
    }
}

fun getBirthday() : Int{
    print("Ingresa tu fecha de nacimiento:")
    val birthday: Int? = readLine()?.toIntOrNull()
    val resultado: Int = (birthday ?: 1).div(7)
    val random = Random(resultado)
    return random.nextInt(7)
}

fun getFortune(elem: Int) : String {
    when (elem) {
        0 -> return "¡Tendrás un gran día!"
        1 -> return "Las cosas te irán bien hoy."
        2 -> return "Disfruta de un maravilloso día de éxito."
        3 -> return "Sé humilde y todo saldrá bien"
        4 -> return "Hoy es un buen día para ejercer la moderación."
        5 -> return "¡Tómatelo con calma y disfruta de la vida!"
        6 -> return "Atesora a tus amigos porque son tu mayor fortuna"
        else -> return "No tienes fortuna :("
    }
}