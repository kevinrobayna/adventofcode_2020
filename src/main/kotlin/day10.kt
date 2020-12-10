fun day10ProblemReader(string: String): List<Long> {
    return string
        .split("\n")
        .map { line -> line.toLong() }
        .toList()
}


// https://adventofcode.com/2020/day/10
class Day10(
    private val numbers: List<Long>
) {

    fun solvePart1(): Long {
        return 0
    }

    fun solvePart2(): Long {
        return 0
    }


}

fun main() {
    val problem = day10ProblemReader(Day10::class.java.getResource("day10.txt").readText())
    println("solution = ${Day10(problem).solvePart1()}")
    println("solution part2 = ${Day10(problem).solvePart2()}")
}