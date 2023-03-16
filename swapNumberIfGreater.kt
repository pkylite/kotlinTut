import java.util.*

fun main(arg: Array<String>){
    // InputStream to Get Input
    var reader = Scanner(System.`in`)
    //Get Values
    println("Enter first value: ")
    var first = reader.nextInt();
    println("Enter second value: ")
    var second = reader.nextInt();
    println("Numbers before Swap: \n first = $first \n second = $second")
    if (first > second)
    {
        var temp = first
        first = second
        second = temp
        println("Numbers after Swap: \n first = $first \n second = $second")
    }
    else
    {
    println("Cannot Swap:  first number [$first] is NOT greater than second number [$second]10")
    } 
}