package mate.academy

const val CENTURY = 100

fun getCentury(year: Int) : Int {
    return (year - 1) / CENTURY + 1
}
