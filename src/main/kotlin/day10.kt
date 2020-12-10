fun day10ProblemReader(string: String): List<Int> {
    return string
        .split("\n")
        .map { line -> line.toInt() }
        .toList()
}


// https://adventofcode.com/2020/day/10
class Day10(
    private val numbers: List<Int>
) {

    fun solvePart1(): Int {
        val goToList = numbers.toMutableList()
        val n1 = mutableListOf<Int>()
        val n3 = mutableListOf<Int>()
        var pointer = 0

        while (goToList.isNotEmpty()) {
            pointer += when {
                numbers.contains(pointer.plus(1)) -> {
                    n1.add(pointer)
                    goToList.remove(pointer)
                    1
                }
                numbers.contains(pointer.plus(3)) -> {
                    n3.add(pointer)
                    goToList.remove(pointer)
                    3
                }
                else -> {
                    n3.add(pointer)
                    goToList.remove(pointer)
                    3
                }
            }
        }
        return n1.size * n3.size
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