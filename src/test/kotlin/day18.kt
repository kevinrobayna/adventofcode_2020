import org.junit.Assert
import org.junit.Test

class Day18Test {

    @Test
    fun exampleProblemA_is_solvedCorrectly() {
        val problem = day18ProblemReader("1 + 2 * 3 + 4 * 5 + 6")
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(71, solution)
    }

    @Test
    fun exampleProblemB_is_solvedCorrectly() {
        val problem = day18ProblemReader("1 + (2 * 3) + (4 * (5 + 6))")
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(51, solution)
    }

    @Test
    fun exampleProblemC_is_solvedCorrectly() {
        val problem = day18ProblemReader("2 * 3 + (4 * 5)")
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(26, solution)
    }

    @Test
    fun exampleProblemD_is_solvedCorrectly() {
        val problem = day18ProblemReader("5 + (8 * 3 + 9 + 3 * 4 * 3)")
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(437, solution)
    }

    @Test
    fun exampleProblemE_is_solvedCorrectly() {
        val problem = day18ProblemReader("5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4))")
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(12240, solution)
    }

    @Test
    fun exampleProblemF_is_solvedCorrectly() {
        val problem = day18ProblemReader("((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2")
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(13632, solution)
    }

    @Test
    fun exampleProblemAll_is_solvedCorrectly() {
        val allExamples = Day18Test::class.java.getResource("example_day18.txt").readText()
        val problem = day18ProblemReader(allExamples)
        val solution = Day18(problem).solvePart1()

        Assert.assertEquals(71 + 51 + 26 + 437 + 12240 + 13632, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day18ProblemReader("0,3,6")
        val solution = Day18(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}