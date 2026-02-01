//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Valores nulls
    val amount: Double? = 10.0
    var list: List<String?>? = listOf(null, null)
    println(list?.size)

    var fishFoodThreats = 5
    val a = fishFoodThreats?.dec() ?: 0
    println(a)

    // Probar varias mutables y nulas
    var rainbowColor = "Azul"
    rainbowColor = "Brown"
    val blackColor = "Black"
    // blackColor = "White"

    //rainbowColor = null
    val greenColor: String? = null
    val blueColor = null

    // Una sola linea
    val peces = 2.plus(71).plus(233).minus(13).div(30).plus(1)

    // listas
    val lista = listOf(null, null)
    val lista2: List<Int?> = listOf(null, null)
    val lista3: List<Int>? = null

    var nullTest: Int? = null
    println(nullTest?.inc() ?: 0)

    // Variables de Cadena
    val trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")

    // Declaración "When"
    val fishName = "Musolini"
    when(fishName.length){
        0 -> println("Error, el nombre no puede estar vacio")
        in 3..12 -> println("Nombre del buen pez")
        else -> println("Nombre del pez OK")
    }

    // Array inicializado
    val array = Array(5) { Math.pow(2.0, it + 10.0) }
    println(array.joinToString())

    // Iterar y crear Arrays y Listas
    val numbers = Array(5) {it + 11}
    println(numbers.joinToString())

    val listaMutable: MutableList<String> = mutableListOf()
    for (i in numbers) {
        listaMutable.add(i.toString())
    }
    println(listaMutable)

    // Lista de numeros divisibles entre 7 del 0 al 100
    val numerosDivisibles: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) {
        numerosDivisibles.add(i)
    }
    println(numerosDivisibles)

}