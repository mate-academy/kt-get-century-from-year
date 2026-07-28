package mate.academy

const val CENTURY_ADJUSTMENT = 99
const val CENTURY_SIZE = 100
fun getCentury(year: Int) : Int {

    return (year + CENTURY_ADJUSTMENT) / CENTURY_SIZE
}
