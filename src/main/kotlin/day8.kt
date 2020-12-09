data class Instruction(
    val operation: String,
    val positive: Boolean,
    val amount: Int
) {
    companion object {
        const val NOP = "nop"
        const val ACC = "acc"
        const val JUMP = "jmp"
    }
}

fun day8ProblemReader(string: String): List<Instruction> {
    val instructionRegex = """(\w+)\s(\+|\-)(\d+)""".toRegex()
    return string
        .split("\n")
        .map { line ->
            val (instruction, signStr, amount) = instructionRegex.matchEntire(line)!!.destructured
            if (signStr == "+") {
                Instruction(instruction, true, amount.toInt())
            } else {
                Instruction(instruction, false, amount.toInt())
            }
        }.toList()
}


// https://adventofcode.com/2020/day/8
class Day8(
    private val code: List<Instruction>,
) {

    fun solvePart1(): Int {
        val (_, acc: Int) = executeCode(code)
        return acc
    }

    private fun executeCode(instructions: List<Instruction>): Pair<List<Int>, Int> {
        var acc = 0
        val visited = instructions.map { 0 }.toMutableList()
        var index = 0
        while (visited[index] <= 1) {
            visited[index] += 1
            val instruction = instructions[index]
            when (instruction.operation) {
                Instruction.ACC -> {
                    acc = calculateNext(instruction, acc)
                    index += 1
                }
                Instruction.JUMP -> {
                    index = calculateNext(instruction, index)
                }
                Instruction.NOP -> {
                    index += 1
                }
            }
            visited[index] += 1
        }
        return Pair(visited, acc)
    }

    private fun calculateNext(instruction: Instruction, counter: Int): Int {
        return if (instruction.positive) {
            counter.plus(instruction.amount)
        } else {
            counter.minus(instruction.amount)
        }
    }

}

fun main() {
    val problem = day8ProblemReader(Day6::class.java.getResource("day8.txt").readText())
    println("solution = ${Day8(problem).solvePart1()}")
}