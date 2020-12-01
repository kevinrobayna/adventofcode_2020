import org.junit.Assert
import kotlin.test.Test

class Day1Test {

    @Test
    fun example_solution() {
        val solutions = Day1(listOf(1721, 299)).solve()
        Assert.assertEquals(1, solutions.size)
        Assert.assertEquals(514579, solutions[0])
    }

    @Test
    fun full_example() {
        val solutions = Day1(listOf(1721, 979, 366, 299, 675, 1456)).solve()
        Assert.assertEquals(2, solutions.size)
        Assert.assertEquals(514579, solutions[0])
    }
}