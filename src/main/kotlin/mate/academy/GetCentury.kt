package mate.academy
const val ONE = 1
const val ONE_HUNDRED = 100
const val ZERO = 0

fun getCentury(year: Int) : Int {
    if (year % ONE_HUNDRED == ZERO) {
        return year / ONE_HUNDRED
    }
    return year / ONE_HUNDRED + ONE
}
