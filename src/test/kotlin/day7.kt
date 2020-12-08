import org.junit.Assert
import kotlin.test.Test

class Day7Test {

    private val exampleProblemString = Day6Test::class.java.getResource("example_day7.txt").readText()

    @Test
    fun exampleProblem_is_read_correctly() {
        val problem = day7ProblemReader(exampleProblemString)

        Assert.assertEquals(9, problem.size)
        Assert.assertEquals(listOf(Bag("shiny gold bag", 1)), problem["bright white bag"])
        Assert.assertEquals(listOf(Bag("no other bag", 0)), problem["faded blue bag"])
    }

    @Test
    fun exampleProblemIsSolvedCorrectly() {
        val problem = day7ProblemReader(exampleProblemString)

        Assert.assertEquals(4, Day7(problem).solveAtLeastOneGold())
    }




}