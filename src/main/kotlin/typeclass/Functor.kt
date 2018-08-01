package typeclass

interface Functor<out T> {
    fun <R> map(transformer: (T) -> R): Functor<R>
}