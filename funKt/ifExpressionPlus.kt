// Kotlin code
fun main(args: Array<String>){
	val a = 1000
	val b = 999
	var c = 1122
	var max1 = if(a > b) a else b 
	var max2 = if(c > a) c else a
	println("The maximum of ${a} and ${b} is $max1")
	println("The maximum of ${c} and ${a} is $max2")
}
