package mate.academy

const val ONE_CENTURY = 100
const val ONE = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    val centuries = year / ONE_CENTURY
    if (year % ONE_CENTURY > ZERO) return centuries + ONE
    return centuries
}
