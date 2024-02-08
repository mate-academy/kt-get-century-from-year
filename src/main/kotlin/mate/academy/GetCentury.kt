package mate.academy

const val HUNDRED = 100
const val ONE = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    return if (year % HUNDRED == ZERO) year / HUNDRED else year / HUNDRED + ONE
}
