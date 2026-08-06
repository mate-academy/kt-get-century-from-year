package mate.academy

const val YEARS_IN_CENTURY = 100
const val LAST_YEAR_OF_PREVIOUS_CENTURY = 99

fun getCentury(year: Int) : Int {
    return (year + LAST_YEAR_OF_PREVIOUS_CENTURY)/ YEARS_IN_CENTURY
}
