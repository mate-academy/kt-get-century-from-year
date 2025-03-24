package mate.academy

const val CENTURY = 99
const val CENTURY_AMOUNT = 100

fun getCentury(year: Int) : Int {
    return (year + CENTURY) / CENTURY_AMOUNT
}
