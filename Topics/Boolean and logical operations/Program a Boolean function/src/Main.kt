fun main() {
    val x = readlnOrNull().toBoolean() // read other values in the same way
    // write your code here
    val y = readlnOrNull().toBoolean()
    val z = readlnOrNull().toBoolean()
    print(!(x && y) || z)
}