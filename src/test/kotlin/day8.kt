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

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day8ProblemReader(exampleProblemString)
        val solution = Day8(problem).solvePart1()

        Assert.assertEquals(5, solution)
    }


}