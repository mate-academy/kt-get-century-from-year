package mate.academy

const val HUNDRED = 100
const val ZERO = 0
const val ONE = 1

fun getCentury(year: Int) : Int {
    return when {
        year % HUNDRED == ZERO -> year / HUNDRED
        else -> year / HUNDRED + ONE
    }
}
