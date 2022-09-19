fun main() {
    println("Type Coversion")
    println()
    val a = 100
    println("Integer Value : $a")
    val x: Double = a.toDouble()
    println("Double Value (From Integer) $x")
    val b = "120"
    println("String Value : $b")
    val y: Int = b.toInt()
    println("Integer Value (From String)$y")
    val c = "150"
    println("String value : $c")
    val z: Double = c.toDouble()
    println("Double Value (From String) $z")
}
