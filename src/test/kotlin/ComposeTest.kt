import function.compose
import org.junit.Test

class ComposeTest {

    @Test
    fun composeTest() {
        val f1: (Int) -> Float = { it.toFloat() }
        val f2: (Float) -> String = { it.toString() }

        val result = f2(f1(1))

        val f3 = compose(f1, f2)
        val composeResult = f3(1)

        require(result == composeResult)
    }
}