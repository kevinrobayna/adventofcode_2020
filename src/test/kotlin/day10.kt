import org.junit.Assert
import org.junit.Test

class Day10Test {

    private val smallProblemString = Day10Test::class.java.getResource("small_example_day10.txt").readText()
    private val exampleProblemString = Day10Test::class.java.getResource("example_day10.txt").readText()

    @Test
    fun smallExampleProblem_is_solvedCorrectly() {
        val problem = day10ProblemReader(smallProblemString)
        val solution = Day10(problem).solvePart1()

        Assert.assertEquals(7 * 5, solution)
    }

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day10ProblemReader(exampleProblemString)
        val solution = Day10(problem).solvePart1()

        Assert.assertEquals(22 * 10, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day10ProblemReader(exampleProblemString)
        val solution = Day10(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}