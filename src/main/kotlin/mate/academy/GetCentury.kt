package mate.academy

const val CENTURY = 100
const val PLUS_YEAR = 1
const val MINUS_YEAR = 1

fun getCentury(year: Int): Int {
    return (year - MINUS_YEAR) / CENTURY + PLUS_YEAR
}
