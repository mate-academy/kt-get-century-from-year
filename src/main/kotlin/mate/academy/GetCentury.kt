package mate.academy

fun getCentury(year: Int) : Int {
    val centuryDuration = 100
    val nullCheck = 0
    val additionalCentury = 1

    if (year % centuryDuration != nullCheck) {
        return year / centuryDuration + additionalCentury
    }
    return year / centuryDuration
}
