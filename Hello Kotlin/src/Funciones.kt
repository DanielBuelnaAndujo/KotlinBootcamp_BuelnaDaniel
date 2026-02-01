import java.util.Calendar
import kotlin.random.Random

fun main(args: Array<String>) {
    // Función HelloWorld
    fun printHello() {
        println("Hello World")
    }
    printHello()

    // Función "dayOfWeek()"
    fun dayOfWeek() {
        println("¿Qué día es hoy?")
        val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        println( when (day) {
            1 -> "Domingo"
            2 -> "Lunes"
            3 -> "Jueves"
            4 -> "Miércoles"
            5 -> "Jueves"
            6 -> "Viernes"
            7 -> "Sabado"
            else -> "Time has stopped"
        })
    }
    dayOfWeek()

    // Verificar hora a traves de los argumentos del programa
    if (args[0].toInt() < 12) {
        println("Buenos días, Kotlin")
    } else {
        println("Buenas noches, Kotlin")
    }

}