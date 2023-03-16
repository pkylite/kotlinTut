fun multiply(a:Int):String{
    if (a <0)
        return "neg"
    else if (a > 0)
        return "pos"
    else
    return "zero"
}
fun main(){
    val a = 10
    val answer = multiply(a)
    println ("$answer")
}

/* val num = -12.3

when{
    num <0.0 -> println("$ negative")
    num >0.0 -> println("$ positive")
    else -> println ("$ zero")
    } 
} */
