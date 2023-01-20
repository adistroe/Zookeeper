fun main() {
    // put your code here
    val seqSize = readln().toInt()
    var max = 0
    repeat(seqSize) {
        val num = readln().toInt()
        if (num > max && num % 4 == 0) max = num
    }
    print(max)
}