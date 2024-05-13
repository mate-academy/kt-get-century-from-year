package mate.academy

fun getCentury(year: Int) : Int {
    val century = (year - 1) / 100 + 1
    return century
}
