package mate.academy

const val ONE = 1
const val HUNDRED = 100
fun getCentury(year: Int) : Int {
    return (year - ONE) / HUNDRED + ONE
}
