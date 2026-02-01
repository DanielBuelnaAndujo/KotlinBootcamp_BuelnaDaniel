fun main() {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(galones: Double,
                currentFish: List<Int>,
                fishSize: Int = 2,
                hasDecorations: Boolean = true
) : Boolean {
    var totalPulgadasPeces: Int = 0
    var capacidad: Double = galones

    totalPulgadasPeces = currentFish.sum()

    if (hasDecorations) {
        capacidad = galones *  0.8
    }

    return !((totalPulgadasPeces + fishSize) > capacidad)
}