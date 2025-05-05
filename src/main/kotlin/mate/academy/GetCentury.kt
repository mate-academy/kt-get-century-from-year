package mate.academy

const val ADD_YEARS_TO_GET_CENTURY = 99
const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int) : Int {
    return (year + ADD_YEARS_TO_GET_CENTURY) / YEARS_IN_CENTURY
}
