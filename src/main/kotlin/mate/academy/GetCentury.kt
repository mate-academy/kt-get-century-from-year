package mate.academy

const val HUNDRED = 100
const val CENT = 99

fun getCentury(year: Int) : Int {
    return (year + CENT)/ HUNDRED
}
