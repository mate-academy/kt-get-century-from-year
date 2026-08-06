package mate.academy

const val DIVIDER = 100

fun getCentury(year: Int) : Int {
    var century = year / DIVIDER
    if ((year - century * DIVIDER) > 0) {
        century++
    }
    return century
}
