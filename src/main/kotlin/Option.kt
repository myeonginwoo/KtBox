sealed class Option<out T> {
}

data class Some<out T>(val value: T) : Option<T>()
object None : Option<Nothing>()

inline infix fun <T, R> Option<T>.map(f: (T) -> R): Option<R> = when (this) {
    is None -> this
    is Some -> Some(f(value))
}

inline infix fun <T, R> Option<T>.flatMap(f: (T) -> Option<R>): Option<R> = when (this) {
    is None -> this
    is Some -> f(value)
}

fun <T> Option<T>.get(): T = when (this) {
    is None -> throw NullPointerException()
    is Some -> value
}

fun <T> Option<T>.getOrElse(defaultValue: T): T = when (this) {
    is None -> defaultValue
    is Some -> value
}