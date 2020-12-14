import org.junit.Assert
import org.junit.Test

class Day14Test {

    private val examplePart1 = Day14Test::class.java.getResource("example_day14_part1.txt").readText()
    private val examplePart2 = Day14Test::class.java.getResource("example_day14_part2.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day14ProblemReader(examplePart1)
        val solution = Day14(problem).solvePart1()

        Assert.assertEquals(165, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day14ProblemReader(examplePart2)
        val solution = Day14(problem).solvePart2()

        Assert.assertEquals(208, solution)
    }

}