import org.junit.Assert
import org.junit.Test

class Day17Test {

    private val example = Day17Test::class.java.getResource("example_day17.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day17ProblemReader(example)
        val solution = Day17(problem).solvePart1()

        Assert.assertEquals(112, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day17ProblemReader(example)
        val solution = Day17(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}