fun main() {
    val hasInvitation = readlnOrNull().toBoolean() // read other value in the same way
    // write your code here
    val hasGift = readlnOrNull().toBoolean()
    print(hasInvitation && hasGift)
}