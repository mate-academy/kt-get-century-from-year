package mate.academy

private const val BASE = 100
private const val OFFSET = 1
fun getCentury(year: Int) : Int {

    return (year - OFFSET ) / BASE + OFFSET
}
