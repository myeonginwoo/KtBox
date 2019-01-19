package function

fun <P1, P2, P3> compose(f1: (P1) -> P2, f2: (P2) -> P3): (P1) -> P3 = {
    f2(f1(it))
}

fun <P1, P2, P3, P4> compose(f1: (P1) -> P2, f2: (P2) -> P3, f3: (P3) -> P4): (P1) -> P4 = {
    f3(f2(f1(it)))
}

fun <P1, P2, P3, P4, P5> compose(f1: (P1) -> P2, f2: (P2) -> P3, f3: (P3) -> P4, f4: (P4) -> P5): (P1) -> P5 = {
    f4(f3(f2(f1(it))))
}

fun <P1, P2, P3, P4, P5, P6> compose(f1: (P1) -> P2, f2: (P2) -> P3, f3: (P3) -> P4, f4: (P4) -> P5, f5: (P5) -> P6): (P1) -> P6 = {
    f5(f4(f3(f2(f1(it)))))
}

fun <P1, P2, P3, P4, P5, P6, P7> compose(f1: (P1) -> P2, f2: (P2) -> P3, f3: (P3) -> P4, f4: (P4) -> P5, f5: (P5) -> P6, f6: (P6) -> P7): (P1) -> P7 = {
    f6(f5(f4(f3(f2(f1(it))))))
}

fun <P1, P2, P3, P4, P5, P6, P7, P8> compose(f1: (P1) -> P2, f2: (P2) -> P3, f3: (P3) -> P4, f4: (P4) -> P5, f5: (P5) -> P6, f6: (P6) -> P7, f7: (P7) -> P8): (P1) -> P8 = {
    f7(f6(f5(f4(f3(f2(f1(it)))))))
}