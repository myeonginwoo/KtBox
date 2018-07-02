import org.junit.Test

class KtEitherTest {

    @Test
    fun testLeftOf() {
        val left = leftOf("left")

        assert(left.isLeft)
        assert(!left.isRight)
        assert(left.value == "left")
    }

    @Test
    fun testRightOf() {
        val left = rightOf("right")

        assert(left.isRight)
        assert(!left.isLeft)
        assert(left.value == "right")
    }

    @Test
    fun testEitherOf() {
        val l = eitherOf { 10 / 0 }
        assert(l.isLeft)
        assert(!l.isRight)

        val r = eitherOf { 10 / 1 }
        assert(!r.isLeft)
        assert(r.isRight)
    }

    @Test
    fun testGetOrElse() {
        val l = eitherOf { 10 / 0 }
        assert(l.isLeft)
        assert(!l.isRight)
        assert(l.getOrElse(100) == 100)

        val r = eitherOf { 10 / 1 }
        assert(!r.isLeft)
        assert(r.isRight)
        assert(r.getOrElse(100) == 10)
    }

    @Test
    fun testGetLeftOrElse() {
        val l = leftOf(10)
        assert(l.getLeftOrElse(100) == 10)
    }

    @Test
    fun testMap() {
        val l = eitherOf { 10 / 0 }
        assert(l
            .map { it * 10 }
            .map { it + 10 }
            .getOrElse(100) == 100)

        val r = eitherOf { 10 / 1 }
        assert(r
            .map { it * 10 }
            .map { it + 10 }
            .getOrElse(100) == 110)
    }

    @Test
    fun testMapLeft() {
        val l = eitherOf { 10 / 0 }
        assert(l
            .mapLeft { 100 }
            .mapLeft { it * 2 }
            .getLeft() == 200)

        val r = eitherOf { 10 / 1 }
        assert(r
            .mapLeft { 100 }
            .mapLeft { it * 2 }
            .get() == 10)
    }

    @Test
    fun testFlatMap() {
        val l = eitherOf { 10 / 0 }
        assert(l
            .flatMap { rightOf(it * 10) }
            .flatMap { rightOf(it + 10) }
            .getOrElse(100) == 100)

        val r = eitherOf { 10 / 1 }
        assert(r
            .flatMap { rightOf(it * 10) }
            .flatMap { rightOf(it + 10) }
            .getOrElse(100) == 110)
    }

    @Test
    fun testFlatMapLeft() {
        val l = eitherOf { 10 / 0 }
        assert(l
            .flatMapLeft { leftOf(100) }
            .flatMapLeft { leftOf(it * 2) }
            .getLeft() == 200)

        val r = eitherOf { 10 / 1 }
        assert(r
            .flatMapLeft { leftOf(100) }
            .flatMapLeft { leftOf(it * 2) }
            .get() == 10)
    }

    @Test
    fun testFold() {
        val l = eitherOf { 10 / 0 }
            .fold({ it.message }, { it + 10 })

        assert(l.getOrElse(100) == 100)

        val r = eitherOf { 10 / 1 }
            .fold({ it.message }, { it + 10 })

        assert(r.getOrElse(100) == 20)
    }

    @Test
    fun testSwap(){
        val l = eitherOf { 10 / 0 }
        assert(l.isLeft)
        assert(!l.isRight)

        val swapedL = l.swap()
        assert(!swapedL.isLeft)
        assert(swapedL.isRight)

        val r = eitherOf { 10 / 1 }
        assert(!r.isLeft)
        assert(r.isRight)
        assert(r.right.value == 10)

        val swappedR = r.swap()
        assert(swappedR.isLeft)
        assert(!swappedR.isRight)
        assert(swappedR.left.value == 10)
    }
}