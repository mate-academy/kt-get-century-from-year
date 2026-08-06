package mate.academy

const val OFFSET = 99
const val YEARS = 100

fun getCentury(year: Int) : Int {
    return (year + OFFSET) / YEARS
}
