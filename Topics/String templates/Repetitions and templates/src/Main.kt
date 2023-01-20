fun main() {
    // write your code here
    val word = readln()
    val repetitions = word.length
    print("$repetitions repetitions of the word $word: ${word.repeat(repetitions)}")
}