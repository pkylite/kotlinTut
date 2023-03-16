fun main() {
    var count = 0
    var num = 123467545

    while (num != 0) {
        num /= 10
        ++count
    }
        println("Number of digits: $count")
}