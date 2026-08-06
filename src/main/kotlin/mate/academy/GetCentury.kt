package mate.academy

const val YEARS_IN_CENTURY = 100
const val CENTURY_OFFSET = YEARS_IN_CENTURY - 1

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFFSET) / YEARS_IN_CENTURY
}
