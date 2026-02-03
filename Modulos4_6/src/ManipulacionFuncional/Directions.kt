package ManipulacionFuncional

import kotlin.math.absoluteValue

fun main() {
    val game = Game()

    println(game.path)

    game.north()
    game.east()
    game.south()
    game.west()

    game.end()

    println(game.path)

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }
    init {
        for (x in 0 until width) {
            for (y in 0 until height) {
                map[x][y] = "Casilla [$x, $y]"
            }
        }
    }
}

class Game {
    var path = mutableListOf(Directions.START)

    var currentX = 0
    var currentY = 0
    val location = Location()

    val north = {
        updateLocation(Directions.NORTH)
        path.add(Directions.NORTH)
        true
    }
    val south = {
        updateLocation(Directions.SOUTH)
        path.add(Directions.SOUTH)
        true
    }
    val east = {
        updateLocation(Directions.EAST)
        path.add(Directions.EAST)
        true
    }
    val west = {
        updateLocation(Directions.WEST)
        path.add(Directions.WEST)
        true
    }

    val end = {
        path.add(Directions.END)
        println("Game Over")
        println("Ruta final: $path")
        path.clear()
        currentX = 0
        currentY = 0
        false
    }

    fun move(where: () -> Boolean ) {
        where.invoke()
    }

    fun updateLocation(direction: Directions) {
        when (direction) {
            Directions.NORTH -> currentY = (currentY + 1).rem(location.height).absoluteValue
            Directions.SOUTH -> currentY = (currentY - 1).rem(location.height).absoluteValue
            Directions.EAST  -> currentX = (currentX + 1).rem(location.width).absoluteValue
            Directions.WEST  -> currentX = (currentX - 1).rem(location.width).absoluteValue
            else -> {}
        }

        println(location.map[currentX][currentY] ?: "D:")
    }

    fun makeMove(command:String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }
}