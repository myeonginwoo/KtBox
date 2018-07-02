sealed class Either<out L, out R> {
    abstract val isLeft: Boolean
    abstract val isRight: Boolean

    abstract val left: L
    abstract val right: R
}

data class Left<out L>(val value: L) : Either<L, Nothing>() {
    override val isLeft: Boolean = true
    override val isRight: Boolean = false

    override val left: L
        get() = value
    override val right: Nothing
        get() = throw NullPointerException()
}

data class Right<out R>(val value: R) : Either<Nothing, R>() {
    override val isLeft: Boolean = false
    override val isRight: Boolean = true

    override val left: Nothing
        get() = throw NullPointerException()
    override val right: R
        get() = value
}

fun <L> leftOf(value: L): Left<L> = Left(value)
fun <R> rightOf(value: R): Right<R> = Right(value)
fun <R> eitherOf(f: () -> R): Either<Exception, R> = try {
    rightOf(f())
} catch (e: Exception) {
    leftOf(e)
}

inline infix fun <L, R, R2> Either<L, R>.map(f: (R) -> R2): Either<L, R2> = when (this) {
    is Left -> this
    is Right -> rightOf(f(value))
}

inline infix fun <L, R, L2> Either<L, R>.mapLeft(f: (L) -> L2): Either<L2, R> = when (this) {
    is Left -> leftOf(f(value))
    is Right -> this
}

inline infix fun <L, R, R2> Either<L, R>.flatMap(f: (R) -> Right<R2>): Either<L, R2> = when (this) {
    is Left -> this
    is Right -> f(value)
}

inline infix fun <L, R, L2> Either<L, R>.flatMapLeft(
    f: (L) -> Left<L2>): Either<L2, R> = when (this) {
    is Left -> f(value)
    is Right -> this
}

inline fun <L, R, L2, R2> Either<L, R>.fold(fl: (L) -> L2,
    fr: (R) -> R2): Either<L2, R2> = when (this) {
    is Left -> leftOf(fl(value))
    is Right -> rightOf(fr(value))
}

fun <L, R> Either<L, R>.swap(): Either<R, L> = when (this) {
    is Left -> rightOf(value)
    is Right -> leftOf(value)
}

fun <L, R> Either<L, R>.get(): R = when (this) {
    is Left -> throw NullPointerException()
    is Right -> value
}

fun <L, R> Either<L, R>.getLeft(): L = when (this) {
    is Left -> value
    is Right -> throw NullPointerException()
}

infix fun <L, R> Either<L, R>.getOrElse(default: R): R = when (this) {
    is Left -> default
    is Right -> value
}

infix fun <L, R> Either<L, R>.getLeftOrElse(default: L): L = when (this) {
    is Left -> value
    is Right -> default
}