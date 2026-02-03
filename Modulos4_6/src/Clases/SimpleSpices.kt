package Clases

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
}

class SimpleSpice {
    var name: String = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }

}