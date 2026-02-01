fun main() {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday2(mood: String,
                       weather: String = "Soleado",
                       temperature: Int = 24
) : String {
    var recomendacion: String? = null
    fun happyAndSunny (mood: String, weather: String) = mood == "happy" && weather == "Sunny"
    fun sadAndRainy (mood: String, weather: String) = mood == "sad" && weather == "rainy"
    fun tempMayor35 (temperature: Int) = temperature > 35

    return when {
        happyAndSunny(mood, weather) -> "go for a walk"
        sadAndRainy(mood, weather) -> "stay in bed"
        tempMayor35(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}