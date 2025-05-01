package mate.academy

const val YEARS_IN_CENTURY = 100
const val YEARS_TO_ADD = 99

fun getCentury(year: Int) : Int {
    return (year + YEARS_TO_ADD) / YEARS_IN_CENTURY
}
