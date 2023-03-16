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
        when {34
            userGuess > goal -> "less!".outputAsComputer()
            userGuess < goal -> "more!".outputAsComputer()
            userGuess == goal -> computerSays("Congratulations! You found the Number in $nbAttempts attemps.")
        }
    } while(userGuess != goal)

}

fun computerSays(text: String) {
    println("Computer : " + text)
}

//Extension functions

fun String.outputAsComputer() {
    println("Computer : " + this)
}