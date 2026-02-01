fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    // Cotienen "curry" y ordenados por tamaño de String
    println(spices.filter { it.contains("curry") }
        .sortedBy { it.length }
    )

    // Empiezan por "c" y terminan con "e"
    println(spices.filter { it.startsWith("c") }
        .filter { it.endsWith("e") }
    )

    // Primeros 3 que empiezan con "c"
    println(spices.filter { it.startsWith("c") }
        .take(3)
    )
}