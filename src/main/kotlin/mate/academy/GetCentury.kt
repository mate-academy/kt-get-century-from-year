package mate.academy

const val YEARS_IN_CENTURY = 100
const val ONE_YEAR = 1

fun getCentury(year: Int) : Int {
    return (year - ONE_YEAR) / YEARS_IN_CENTURY + ONE_YEAR
}
