package mate.academy
const val FIRST_NUM = 99
const val SECOND_NUM = 100

fun getCentury(year: Int) : Int {
    return (year + FIRST_NUM) / SECOND_NUM
}
