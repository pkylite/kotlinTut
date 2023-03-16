fun main(){
    var a = 3
    var b = 4
    var c = 0
    if (a < b){
        c += b
        b = a
        a = c 
    }
    println("$a = new a")
    println("$b = new b")
}