fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    print(b in a..c || b in c..a)
}