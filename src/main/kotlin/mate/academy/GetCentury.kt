package mate.academy

const val PLUS_VALUE = 99
const val DIVIDE_VALUE = 100

fun getCentury(year: Int): Int {
    return (year + PLUS_VALUE) / DIVIDE_VALUE
}
