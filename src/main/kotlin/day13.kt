fun day13ProblemReader(text: String): Pair<Int, List<String>> {
    val lines = text.split('\n')
    return Pair(
        lines[0].toInt(),
        lines[1].split(",")
    )
}

// https://adventofcode.com/2020/day/13
class Day13(
    private val problem: Pair<Int, List<String>>,
) {

    fun solvePart1(): Int {
        return 0
    }

    fun solvePart2(): Int {
        return 0
    }
}

fun main() {
    val problem = day13ProblemReader(Day13::class.java.getResource("day13.txt").readText())
    println("solution = ${Day13(problem).solvePart1()}")
    println("solution part2 = ${Day13(problem).solvePart2()}")
}