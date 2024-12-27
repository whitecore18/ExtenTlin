fun Int.square(): Int {
    return this * this
}

fun String.concat(other: String): String {
    return this + other
}

fun String.lastIndexOfChar(char: Char): Int {
    return this.lastIndexOf(char)
}

fun Int.sqrt(): Double {
    return Math.sqrt(this.toDouble())
}

fun main() {
    val number = 4
    println("Квадрат числа $number: ${number.square()}") // 16

    val str1 = "Hello"
    val str2 = " World"
    println("Конкатенация строк: ${str1.concat(str2)}")

    val str = "Hello World"
    val charToFind = 'o'
    println("Последний индекс символа '$charToFind' в строке '$str': ${str.lastIndexOfChar(charToFind)}") // 7

    val num = 16
    println("Квадратный корень из числа $num: ${num.sqrt()}")
}