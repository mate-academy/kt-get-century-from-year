package mate.academy

const val CENTURY_DIVISOR = 100
const val CENTURY_OFFSET = 99
const val TEST_VALUE = 1997

fun main() {
    println(getCentury(TEST_VALUE))
}

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFFSET) / CENTURY_DIVISOR
}
