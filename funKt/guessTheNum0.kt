import java.util.*

fun main(args: Array<String>) {
    val min = 0
    val max = 100
    var nbAttempts = 0
    val random = SplittableRandom()
    val goal = random.nextInt(min, max)
    var userGuess: Int

    computerSays("I chose a number between $min and $max")
    do {
        nbAttempts++
        computerSays("What's your guess?")
        userGuess = readln().toInt()
        if (userGuess > goal) computerSays("less!")
        else if (userGuess < goal) computerSays("more!")
    } while(userGuess != goal)

    computerSays("Congratulations! You found the Number in $nbAttempts attemps.")
}

fun computerSays(text: String) {
    println("Computer : " + text)
}