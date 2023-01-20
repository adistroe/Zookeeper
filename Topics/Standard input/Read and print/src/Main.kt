import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print(
            scanner.nextLine() + "\n"
                    + scanner.nextLine() + "\n"
                    + scanner.nextInt() + "\n"
                    + scanner.nextInt()
    )
}