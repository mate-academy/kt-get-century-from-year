package mate.academy
const val CENTURY_OFF =99
const val CENTURY_ON =100

fun getCentury(year: Int) : Int {
    return (year + CENTURY_OFF) / CENTURY_ON;
}
