package mate.academy

const val REMAIN = 100
const val ZERO = 0
const val ONE = 1

fun getCentury(year: Int) : Int {
    if (year % REMAIN != ZERO)
        return (year / REMAIN) + ONE
    else
        return year / REMAIN
}
