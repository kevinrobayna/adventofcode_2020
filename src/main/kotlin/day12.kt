import kotlin.math.abs

fun day12ProblemReader(text: String): List<Pair<String, Int>> {
    return text
        .split('\n')
        .map { line ->
            Pair(line.trim().filter { !it.isDigit() }, line.trim().filter { it.isDigit() }.toInt())
        }
}

// https://adventofcode.com/2020/day/12
class Day12(
    private val actions: List<Pair<String, Int>>,
) {
    companion object {
        const val NORTH = "N"
        const val SOUTH = "S"
        const val EAST = "E"
        const val WEST = "W"
        const val FORWARD = "F"
        val MOVEMENTS = listOf(NORTH, SOUTH, EAST, WEST, FORWARD)

        const val LEFT = "L"
        const val RIGHT = "R"
    }

    fun solvePart1(): Int {
        var (dx, dy) = Pair(1, 0)
        var (x, y) = Pair(0, 0)
        for ((change, amount) in actions) {
            when (change in MOVEMENTS) {
                true -> {
                    when (change) {
                        NORTH -> y += amount
                        SOUTH -> y -= amount
                        EAST -> x += amount
                        WEST -> x -= amount
                        FORWARD -> {
                            x += dx * amount
                            y += dy * amount
                        }
                    }
                }
                else -> {
                    when (amount) {
                        90 -> when (change) {
                            LEFT -> dx = -dy.also { dy = dx }
                            RIGHT -> dy = -dx.also { dx = dy }
                        }
                        180 -> dx = -dx.also { dy = -dy }
                        270 -> when (change) {
                            LEFT -> dy = -dx.also { dx = dy }
                            RIGHT -> dx = -dy.also { dy = dx }
                        }
                    }
                }
            }
        }
        return abs(x) + abs(y)
    }

    fun solvePart2(): Int {
        var (dx, dy) = Pair(10, 1)
        var (x, y) = Pair(0, 0)
        for ((change, amount) in actions) {
            when (change in MOVEMENTS) {
                true -> {
                    when (change) {
                        NORTH -> dy += amount
                        SOUTH -> dy -= amount
                        EAST -> dx += amount
                        WEST -> dx -= amount
                        FORWARD -> {
                            x += dx * amount
                            y += dy * amount
                        }
                    }
                }
                else -> {
                    when (amount) {
                        90 -> when (change) {
                            LEFT -> dx = -dy.also { dy = dx }
                            RIGHT -> dy = -dx.also { dx = dy }
                        }
                        180 -> dx = -dx.also { dy = -dy }
                        270 -> when (change) {
                            LEFT -> dy = -dx.also { dx = dy }
                            RIGHT -> dx = -dy.also { dy = dx }
                        }
                    }
                }
            }
        }
        return abs(x) + abs(y)
    }
}

fun main() {
    val problem = day12ProblemReader(Day10::class.java.getResource("day12.txt").readText())
    println("solution = ${Day12(problem).solvePart1()}")
    println("solution part2 = ${Day12(problem).solvePart2()}")
}