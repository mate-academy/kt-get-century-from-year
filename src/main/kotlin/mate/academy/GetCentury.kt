package mate.academy

const val CENTURY_BALANCER = 1
const val YEARS_IN_CENTURY  = 100
const val CENTURY_OFFSET  = 1

fun getCentury(year: Int) : Int {
    return (year - CENTURY_BALANCER) / YEARS_IN_CENTURY + CENTURY_OFFSET
}
