package mate.academy

const val ZERO = 0
const val ONE = 1
const val HUNDRED = 100

fun getCentury(year: Int) : Int {
    return if (year % HUNDRED == ZERO) (year / HUNDRED) else (year / HUNDRED + ONE)
}
