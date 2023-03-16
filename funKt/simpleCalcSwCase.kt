import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter Two Numbers")

    // nextDouble() reads the next double from the keyboard
    print("1st number: ")
    val first = reader.nextDouble()
    print("2nd number: ")
    val second = reader.nextDouble()

    print("Enter an operator (+, -, *, /): ")
    val operatorx = reader.next()[0]

    val result: Double

    when (operatorx) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        // operator doesn't match any case constant (+, -, *, /)
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operatorx, second, result)
}