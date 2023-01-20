const val normal = "Normal"
const val excess = "Excess"
const val deficiency = "Deficiency"

fun main() {
    // write your code here
    val (needSleep, overSleep, actualSleep) = Array(3) { readln().toInt() }
    print(
            if (actualSleep in needSleep..overSleep) "$normal"
            else if (actualSleep < needSleep) "$deficiency" else "$excess"
    )
}