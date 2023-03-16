


fun main(args: Array<String>) {
    print("Enter Two Numbers")
    var num1 = readLine() ?:"0"
    var num2 = readLine() ?:"0"
    if (num2.toInt() > num1.toInt())
        {
        print(num2+ "\n" +num1)
        }
    else
        {
        print(num1+ "\n" +num2)
        }
    }