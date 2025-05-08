package mate.academy

const val VEK = 100

fun getCentury(year: Int) : Int {

    return if (year % VEK == 0) {
        year / VEK
    } else {
        year / VEK + 1
    }

}
