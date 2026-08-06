package mate.academy

const val TYPE = 1
const val NUMBER = 100

fun getCentury(year: Int) : Int {
    val century: Int = (year - TYPE) / NUMBER + TYPE
    return century
}
