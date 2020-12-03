import org.junit.Assert
import kotlin.test.Test

class Day3Test {

    @Test
    fun example_solution() {
        val problem = buildMapFromString(Day3Test::class.java.getResource("example_day3.txt").readText())
        val solution = Day3(problem).solve()
        Assert.assertEquals(7, solution)
    }
}