package function

fun <P1, P2, P3> compose(f1: (P1) -> P2, f2: (P2) -> P3): (P1) -> P3 = {
    f2(f1(it))
}