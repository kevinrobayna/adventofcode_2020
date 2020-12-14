import java.math.BigInteger


data class Mask(
    val bitmask: String,
    val memorySettings: List<Pair<String, Long>>,
)

fun day14ProblemReader(text: String): List<Mask> {
    val maskRegex = "mask\\s=\\s(\\w+)".toRegex()
    val memRegex = "mem\\[(\\d+)\\]\\s=\\s(\\d+)".toRegex()
    var bitmask = ""
    var memorySettings = mutableListOf<Pair<String, Long>>()
    val masks = mutableListOf<Mask>()
    val lines = text.split('\n').withIndex().toList()
    for ((inx, line) in lines) {
        if (bitmask.isNotEmpty() && line.matches(maskRegex)) {
            masks.add(Mask(bitmask, memorySettings))
            bitmask = ""
            memorySettings = mutableListOf()
        }
        if (line.matches(maskRegex)) {
            val (mask) = maskRegex.matchEntire(line)!!.destructured
            bitmask = mask
        } else {
            val (key, value) = memRegex.matchEntire(line)!!.destructured
            memorySettings.add(key to value.toLong())
        }

        if (inx == lines.size - 1) {
            masks.add(Mask(bitmask, memorySettings))
        }
    }
    return masks
}

// https://adventofcode.com/2020/day/14
class Day14(
    private val masks: List<Mask>,
) {

    fun solvePart1(): Long {
        val memory = mutableMapOf<String, String>()
        for (program in masks) {
            program.memorySettings.forEach { (inx, value) ->
                val valueInBinary = Integer.toBinaryString(value.toInt()).padStart(program.bitmask.length, '0')
                memory[inx] = program.bitmask.withIndex().map { (inx, char) ->
                    when (char) {
                        'X' -> valueInBinary[inx]
                        else -> char
                    }
                }.joinToString("")
            }
        }
        return memory.map { (_, value) -> BigInteger(value, 2).toLong() }.sum()
    }

    fun solvePart2(): Long {
        return 0
    }
}

fun main() {
    val problem = day14ProblemReader(Day14::class.java.getResource("day14.txt").readText())
    println("solution = ${Day14(problem).solvePart1()}")
    println("solution part2 = ${Day14(problem).solvePart2()}")
}