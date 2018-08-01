package typeclass

interface Functor<out T> {
     infix fun <R> map(transformer: (T) -> R): Functor<R>
}