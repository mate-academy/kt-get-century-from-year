package mate.academy
const val CUT = 100

fun getCentury(year: Int) : Int {
    var century = (year - 1) / CUT + 1
    return century
}
