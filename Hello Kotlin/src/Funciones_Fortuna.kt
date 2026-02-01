import kotlin.random.Random

fun main() {
    // Función de fortunas
    fun getFortuneCookie() {
        val lista: List<String> = listOf(
            "¡Tendrás un gran día!",
            "Las cosas te irán bien hoy.",
            "Disfruta de un maravilloso día de éxito.",
            "Sé humilde y todo saldrá bien",
            "Hoy es un buen día para ejercer la moderación.",
            "¡Tómatelo con calma y disfruta de la vida!",
            "Atesora a tus amigos porque son tu mayor fortuna"
        )
        print("Ingresa tu fecha de nacimiento:")
        val birthday: Int? = readLine()?.toIntOrNull()
        val resultado: Int = (birthday ?: 1).div(lista.size)
        val random = Random(resultado)
        var fortuna: String? = null
        var index: Int

        // Ejecutarlo 10 veces o hasta que se haya seleccionado
        // "Tómatelo con calma".
        for (i in 1..10) {
            index = random.nextInt(lista.size)
            fortuna = lista[index]

            if (fortuna != "¡Tómatelo con calma y disfruta de la vida!") continue
        }
        println("Tu fortuna es: $fortuna")
    }
    getFortuneCookie()
}