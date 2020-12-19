fun day15ProblemReader(text: String): List<String> {
    return text.split(',')
}

// https://adventofcode.com/2020/day/15
class Day15(
    private val spokenNumbers: List<String>,
) {

    fun solvePart1(): Long {
        return 0
    }

    fun solvePart2(): Long {
        return 0
    }
}

fun main() {
    val problem = day15ProblemReader(Day15::class.java.getResource("day15.txt").readText())
    println("solution = ${Day15(problem).solvePart1()}")
    println("solution part2 = ${Day15(problem).solvePart2()}")
}