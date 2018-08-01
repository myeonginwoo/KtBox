import typeclass.Functor

sealed class Option<out T> : Functor<T> {
    abstract val isEmpty: Boolean
    abstract val isDefined: Boolean
}

data class Some<out T>(val value: T) : Option<T>() {
    override val isEmpty: Boolean = false
    override val isDefined: Boolean = true
    override fun <R> map(transformer: (T) -> R): Functor<R> = Some(transformer(value))
}

object None : Option<Nothing>() {
    override val isEmpty: Boolean = true
    override val isDefined: Boolean = false
    override fun <R> map(transformer: (Nothing) -> R): Functor<R> = None
}

fun <T> someOf(value: T): Some<T> = Some(value)

inline infix fun <T, R> Option<T>.flatMap(f: (T) -> Option<R>): Option<R> = when (this) {
    is None -> this
    is Some -> f(value)
}

inline infix fun <T> Option<T>.filter(p: (T) -> Boolean): Option<T> = when (this) {
    is None -> this
    is Some -> if (p(value)) this else None
}

inline infix fun <T> Option<T>.exists(p: (T) -> Boolean): Boolean = when (this) {
    is None -> false
    is Some -> p(value)
}

fun <T> Option<T>.get(): T = when (this) {
    is None -> throw NullPointerException()
    is Some -> value
}

fun <T> Option<T>.getOrElse(defaultValue: T): T = when (this) {
    is None -> defaultValue
    is Some -> value
}

fun <T> Option<T>.orElse(defaultValue: Option<T>): Option<T> = when (this) {
    is None -> defaultValue
    is Some -> this
}