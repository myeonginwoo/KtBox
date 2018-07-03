import org.junit.Test

class OptionTest {

    @Test
    fun testSome() {
        assert(Some(3).isDefined)
        assert(!Some(3).isEmpty)
    }

    @Test
    fun testNone() {
        assert(!None.isDefined)
        assert(None.isEmpty)
    }

    @Test
    fun testSomeOf() {
        assert(someOf(3) == Some(3))
        assert(someOf("kotlin") == Some("kotlin"))
        assert(someOf(3.0) == Some(3.0))
    }

    @Test
    fun testMap() {
        assert(someOf(3).map { it * 3 } == Some(9))
        assert(someOf(3).map { it.toString() } == Some("3"))
        assert(someOf(3).map { "Kotlin" } == Some("Kotlin"))

        assert(None.map { "Kotlin" } == None)
        assert(None.map { 3 } == None)
    }

    @Test
    fun testFlatMap() {
        assert(someOf(3).flatMap { Some(10) } == Some(10))
        assert(someOf(3).flatMap { Some("Kotlin") } == Some("Kotlin"))

        assert(None.flatMap { Some(3) } == None)
        assert(None.flatMap { Some("Kotlin") } == None)
    }

    @Test
    fun testFilter() {
        assert(someOf(3).filter { it % 2 == 1 } == Some(3))
        assert(someOf(3).filter { it % 2 == 0 } == None)

        assert(None.filter { true } == None)
        assert(None.filter { false } == None)
    }

    @Test
    fun testExists() {
        assert(someOf(3).exists { it % 2 == 1 })
        assert(!someOf(3).exists { it % 2 == 0 })

        assert(!None.exists { true })
        assert(!None.exists { false })
    }

    @Test
    fun testGet() {
        assert(someOf(3).get() == 3)
        assert(someOf("Kotlin").get() == "Kotlin")

        val e = try {
            None.get()
        } catch (error: Exception) {
            error
        }

        assert(e is NullPointerException)
    }

    @Test
    fun testGetOrElse() {
        assert(someOf(3).getOrElse(10) == 3)
        assert(someOf("Kotlin").getOrElse("Java") == "Kotlin")

        assert(None.getOrElse(10) == 10)
        assert(None.getOrElse("Kotlin") == "Kotlin")
    }

    @Test
    fun testOrElse() {
        assert(someOf(3).orElse(Some(10)) == Some(3))
        assert(someOf("Kotlin").orElse(Some("Java")) == Some("Kotlin"))

        assert(None.orElse(Some(10)) == Some(10))
        assert(None.orElse(Some("Kotlin")) == Some("Kotlin"))
    }
}