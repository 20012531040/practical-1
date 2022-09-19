fun main() {
    val number = 5
    println("Factorial of $number = ${factorial(number)}")
}
tailrec fun factorial(n: Int, temp: Int = 1): Long {
    return if (n == 1) temp.toLong() else factorial(n-1, temp*n)
}