import java.utils.*
fun main() {
    val read = Scanner(System.`in`)

    println("Enter 1st Integer number:")
    val a = read.nextInt()
    println("Enter 2nd Integer number:")
    val b = read.nextInt()
    println("Enter 3rd Integer number:")
    val c = read.nextInt()
    var largestNum = if (a > b) a else b
    largestNum = if (largestNum > c) largestNum else c
    println("Largest Number is: $largestNum")
}