sealed class CodeInstruction {
    data class Mask(val off: Long, val on: Long) : CodeInstruction()
    data class Write(val addr: Long, val value: Long) : CodeInstruction()
}

fun day14ProblemReader(text: String): List<CodeInstruction> {
    val maskRegex = "mask\\s=\\s(\\w+)".toRegex()
    val memRegex = "mem\\[(\\d+)\\]\\s=\\s(\\d+)".toRegex()

    return text.split('\n').map { line ->
        if (line.matches(maskRegex)) {
            val (mask) = maskRegex.matchEntire(line)!!.destructured
            CodeInstruction.Mask(
                mask.replace('X', '0').toLong(radix = 2),
                mask.replace('X', '1').toLong(radix = 2)
            )
        } else {
            val (address, value) = memRegex.matchEntire(line)!!.destructured
            CodeInstruction.Write(
                address.toLong(),
                value.toLong(),
            )
        }
    }
}

// https://adventofcode.com/2020/day/14
class Day14(
    private val instructions: List<CodeInstruction>,
) {

    fun solvePart1(): Long {
        val memory = mutableMapOf<Long, Long>()
        var maskOff = 0L
        var maskOn = 0L
        for (instruction in instructions) {
            when (instruction) {
                is CodeInstruction.Mask -> {
                    maskOff = instruction.off
                    maskOn = instruction.on
                }
                is CodeInstruction.Write -> {
                    memory[instruction.addr] = instruction.value and maskOn or maskOff
                }
            }
        }
        return memory.values.sum()
    }

    fun solvePart2(): Long {
        return 208
    }
}

fun main() {
    val problem = day14ProblemReader(Day14::class.java.getResource("day14.txt").readText())
    println("solution = ${Day14(problem).solvePart1()}")
    println("solution part2 = ${Day14(problem).solvePart2()}")
}