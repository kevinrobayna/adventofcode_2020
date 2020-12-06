import java.util.stream.Collectors

fun day6ProblemReader(string: String): List<Set<String>> {
    val problemSplit = string.split("\n")
    val problem = mutableListOf<Set<String>>()
    var group = mutableSetOf<String>()
    for (lineCount in problemSplit.indices) {
        val line = problemSplit[lineCount]
        if (line.isNotBlank()) {
            line.split("").forEach {
                if (it.isNotBlank()) {
                    group.add(it)
                }
            }
        }

        val isLastLine = lineCount == (problemSplit.size - 1)
        if (line.isBlank() || isLastLine) {
            problem.add(group)
            group = mutableSetOf()
            continue
        }
    }
    return problem
}


// https://adventofcode.com/2020/day/6
class Day6(
    private val quiz: List<Set<String>>,
) {

    fun solve(): Long {
        return quiz
            .stream()
            .map { it.size.toLong() }
            .collect(Collectors.toList())
            .sum()
    }

}

fun main() {
    val problem = day6ProblemReader(Day6::class.java.getResource("day6.txt").readText())
    println("solution = ${Day6(problem).solve()}")
}