import org.junit.Assert
import kotlin.test.Test

class Day4Test {

    private val problemString = Day4Test::class.java.getResource("example_day4.txt").readText()
    private val problem = day4ProblemReader(Day4Test::class.java.getResource("example_day4.txt").readText())

    @Test
    fun problem_is_read_correctly() {
        val problem = day4ProblemReader(problemString)

        Assert.assertEquals(4, problem.size)
        Assert.assertEquals(8, problem[0].size)
        Assert.assertEquals("860033327", problem[0].get("pid"))
    }

    @Test
    fun last_passport_contains_all_its_values() {
        val problem = day4ProblemReader(problemString)

        Assert.assertEquals(4, problem.size)
        Assert.assertEquals(6, problem[3].size)
        Assert.assertEquals("860033327", problem[0].get("pid"))
    }

    @Test
    fun day4_example_returns_expected_count() {
        val validPassports = Day4(problem).solve()

        Assert.assertEquals(2, validPassports)
    }

    @Test
    fun invalid_list_returns_none() {
        val problemPart2 = day4ProblemReader(Day4Test::class.java.getResource("example_day4_invalid.txt").readText())
        val validPassports = Day4(problemPart2).solve()

        Assert.assertEquals(0, validPassports)
    }

    @Test
    fun valid_list_returns_all() {
        val problemPart2 = day4ProblemReader(Day4Test::class.java.getResource("example_day4_valid.txt").readText())
        val validPassports = Day4(problemPart2).solve()

        Assert.assertEquals(4, validPassports)
    }

}