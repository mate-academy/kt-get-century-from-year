package mate.academy
const val FIRSTDIGIT = 99
const val SECONDDIGIT = 100

fun getCentury(year: Int) : Int {
    return (year + FIRSTDIGIT) / SECONDDIGIT
}
