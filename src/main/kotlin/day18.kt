fun day18ProblemReader(text: String): List<String> {
    return text.split(',')
}

// https://adventofcode.com/2020/day/17
class Day18(
    private val initialState: List<String>,
) {

    fun solvePart1(): Long {
        return 0
    }

    fun solvePart2(): Long {
        return 0
    }
}

fun main() {
    val problem = day18ProblemReader(Day18::class.java.getResource("day18.txt").readText())
    println("solution = ${Day18(problem).solvePart1()}")
    println("solution part2 = ${Day18(problem).solvePart2()}")
}