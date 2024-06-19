package mate.academy

fun getCentury(year: Int) : Int {
    val yearMultiplier = 100
    val rangeToHundreds = 1..100
    val rangeAfterHundreds = 1..year.toString().take(2).toInt() * yearMultiplier
    val appYear = 1
    val century: Int = when {
        year in rangeToHundreds -> year.toString().take(1).toInt()
        year in rangeAfterHundreds -> year.toString().take(2).toInt()
        else -> year.toString().take(2).toInt() + appYear
    }
    return century
}
