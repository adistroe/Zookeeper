fun main() {
    // write your code here
    val number = readln().toInt()
    print(
            if (number == 0) "zero"
            else if (number < 0) "negative" else "positive"
    )
}