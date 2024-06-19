package mate.academy

fun getCentury(year: Int) : Int {
    val yearMultiplier = 100
    val appYear = 1
    val range = 1..year.toString().take(2).toInt() * yearMultiplier
    val century: Int = when {
        year in range -> year.toString().take(2).toInt()
        else -> year.toString().take(2).toInt() + appYear
    }
    return century
}
