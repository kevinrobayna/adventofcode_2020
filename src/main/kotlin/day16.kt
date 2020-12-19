fun day16ProblemReader(text: String): List<String> {
    return text.split(',')
}

// https://adventofcode.com/2020/day/16
class Day16(
    private val tickets: List<String>,
) {

    fun solvePart1(): Long {
        return 0
    }

    fun solvePart2(): Long {
        return 0
    }
}

fun main() {
    val problem = day16ProblemReader(Day14::class.java.getResource("day16.txt").readText())
    println("solution = ${Day16(problem).solvePart1()}")
    println("solution part2 = ${Day16(problem).solvePart2()}")
}