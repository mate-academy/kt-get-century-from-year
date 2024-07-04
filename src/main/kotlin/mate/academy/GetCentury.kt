package mate.academy

const val DIVIDER = 100
const val COUNTER_YEAR = 1

fun getCentury(year: Int) : Int {
    return (year - COUNTER_YEAR) / DIVIDER + COUNTER_YEAR
}
