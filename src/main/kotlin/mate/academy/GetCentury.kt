package mate.academy

const val NUMBER_OF_YEARS_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    if (year % NUMBER_OF_YEARS_IN_CENTURY == 0) {
        return year / NUMBER_OF_YEARS_IN_CENTURY
    }
    return year / NUMBER_OF_YEARS_IN_CENTURY + 1
}
