import org.junit.Assert
import org.junit.Test

class Day8Test {

    private val exampleProblemString = Day8Test::class.java.getResource("example_day8.txt").readText()

    @Test
    fun exampleProblem_is_read_correctly() {
        val problem = day8ProblemReader(exampleProblemString)

        Assert.assertEquals(9, problem.size)
        Assert.assertEquals(Instruction(Instruction.NOP, true, 0), problem[0])
        Assert.assertEquals(Instruction(Instruction.JUMP, true, 4), problem[2])
        Assert.assertEquals(Instruction(Instruction.ACC, false, 99), problem[5])
    }

    data class Instruction(
        val instruction: String,
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


}