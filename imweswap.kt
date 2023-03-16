import java.util.Scanner
fun main(arg: Array<String>) {
    var reader = Scanner(System.`in`)
    println("Enter the first value : ")
    var first = reader.nextInt();
    println("Enter the second value : ")
    var second = reader.nextInt();
    println("numbers before swap : \n first = $first \n second ")
    //code for swap numbers
    var temp = first
    first = second
    second = temp
    if( first 2< second ){
        println("Cant swap since number is smaller")
    }
    else{
        //(swap)
        println("Numbers after swap : \n first = $first \n second = $second ")
    }
}