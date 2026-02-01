import kotlin.random.Random

fun main() {
    // Tirada de dados del 1 al 12
    val rollDice = { Random.nextInt(1, 12) }
    println(rollDice())

    val rollDiceMejorado: (Int) -> Int = {
        sides -> Random.nextInt(sides) + 1
    }
    println(rollDiceMejorado(2))

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random.nextInt(sides) + 1
    }
    println(rollDice2(2))

    // Gameplay, función con lambda como parametro
    fun gamePlay(operation: (Int) -> Int) {
        println(operation(12))
    }
    gamePlay(rollDice2)

}