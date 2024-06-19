package mate.academy

fun getCentury(year: Int) : Int {
    val range = 1..year.toString().take(2).toInt() * 100
    val century: Int = when {
        year in range -> year.toString().take(2).toInt()
        else -> year.toString().take(2).toInt() + 1
    }
    return century
}
