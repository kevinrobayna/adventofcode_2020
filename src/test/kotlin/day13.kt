import org.junit.Assert
import org.junit.Test

class Day13Test {

    private val exampleProblemString = Day13Test::class.java.getResource("example_day13.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day13ProblemReader(exampleProblemString)
        val solution = Day13(problem).solvePart1()

        Assert.assertEquals(295, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day13ProblemReader(exampleProblemString)
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(1068781, solution)
    }

    @Test
    fun exampleProblem_b_part2_is_solvedCorrectly() {
        val problem = Pair(1, "17,x,13,19".split(","))
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(3417, solution)
    }

    @Test
    fun exampleProblem_c_part2_is_solvedCorrectly() {
        val problem = Pair(1, "67,7,59,61".split(","))
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(754018, solution)
    }

    @Test
    fun exampleProblem_d_part2_is_solvedCorrectly() {
        val problem = Pair(1, "67,x,7,59,61".split(","))
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(779210, solution)
    }

    @Test
    fun exampleProblem_e_part2_is_solvedCorrectly() {
        val problem = Pair(1, "67,7,x,59,61".split(","))
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(1261476, solution)
    }

    @Test
    fun exampleProblem_f_part2_is_solvedCorrectly() {
        val problem = Pair(1, "1789,37,47,1889".split(","))
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(1202161486, solution)
    }

}