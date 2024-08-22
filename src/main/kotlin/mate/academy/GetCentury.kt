package mate.academy

fun getCentury(year: Int) : Int {
    val addYearsToGetCentury = 99
    val yearsInCentury = 100
    return (year + addYearsToGetCentury) / yearsInCentury
}
