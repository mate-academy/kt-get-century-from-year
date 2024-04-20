package mate.academy

const val CENTURY_OFFSET = 99
const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFFSET) / YEARS_IN_CENTURY
}
