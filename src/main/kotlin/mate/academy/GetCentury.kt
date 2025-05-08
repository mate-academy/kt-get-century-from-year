package mate.academy

const val NUMBER_ONE = 1
const val DIVIDE_TO_CENTURY = 100
const val ADD_TO_CENTURY = 1;

fun getCentury(year: Int): Int {
    return (year - NUMBER_ONE) / DIVIDE_TO_CENTURY + ADD_TO_CENTURY
}
