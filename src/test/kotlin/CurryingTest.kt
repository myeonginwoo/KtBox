import function.curried
import function.uncurried
import org.junit.Test

class CurryingTest {

    @Test
    fun curryingTest() {
        val fun1 = { x1: Int, x2: Int -> x1 + x2 }
        val curriedFun1 = fun1.curried()
        require(fun1(1, 2) == curriedFun1(1)(2))

        val fun2 = { x1: Int, x2: Int, x3: Int -> x1 + x2 + x3 }
        val curriedFun2 = fun2.curried()
        require(fun2(1, 2, 3) == curriedFun2(1)(2)(3))

        val fun3 = { x1: Int, x2: Int, x3: Int, x4: Int -> x1 + x2 + x3 + x4 }
        val curriedFun3 = fun3.curried()
        require(fun3(1, 2, 3, 4) == curriedFun3(1)(2)(3)(4))

        val fun4 = { x1: Int, x2: Int, x3: Int, x4: Int -> x1 + x2 + x3 + x4 }
        val curriedFun4 = fun4.curried()
        require(fun4(1, 2, 3, 4) == curriedFun4(1)(2)(3)(4))

        val fun5 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int -> x1 + x2 + x3 + x4 + x5 }
        val curriedFun5 = fun5.curried()
        require(fun5(1, 2, 3, 4, 5) == curriedFun5(1)(2)(3)(4)(5))

        val fun6 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int -> x1 + x2 + x3 + x4 + x5 + x6 }
        val curriedFun6 = fun6.curried()
        require(fun6(1, 2, 3, 4, 5, 6) == curriedFun6(1)(2)(3)(4)(5)(6))

        val fun7 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 }
        val curriedFun7 = fun7.curried()
        require(fun7(1, 2, 3, 4, 5, 6, 7) == curriedFun7(1)(2)(3)(4)(5)(6)(7))

        val fun8 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 }
        val curriedFun8 = fun8.curried()
        require(fun8(1, 2, 3, 4, 5, 6, 7, 8) == curriedFun8(1)(2)(3)(4)(5)(6)(7)(8))

        val fun9 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 }
        val curriedFun9 = fun9.curried()
        require(fun9(1, 2, 3, 4, 5, 6, 7, 8, 9) == curriedFun9(1)(2)(3)(4)(5)(6)(7)(8)(9))

        val fun10 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 }
        val curriedFun10 = fun10.curried()
        require(fun10(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) == curriedFun10(1)(2)(3)(4)(5)(6)(7)(8)(9)(10))

        val fun11 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 }
        val curriedFun11 = fun11.curried()
        require(fun11(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11) == curriedFun11(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11))

        val fun12 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 }
        val curriedFun12 = fun12.curried()
        require(fun12(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12) == curriedFun12(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12))

        val fun13 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 }
        val curriedFun13 = fun13.curried()
        require(fun13(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) == curriedFun13(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13))

        val fun14 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 }
        val curriedFun14 = fun14.curried()
        require(fun14(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14) == curriedFun14(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14))

        val fun15 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 }
        val curriedFun15 = fun15.curried()
        require(fun15(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) == curriedFun15(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15))

        val fun16 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 }
        val curriedFun16 = fun16.curried()
        require(fun16(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16) == curriedFun16(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16))

        val fun17 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 }
        val curriedFun17 = fun17.curried()
        require(fun17(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17) == curriedFun17(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17))

        val fun18 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 }
        val curriedFun18 = fun18.curried()
        require(fun18(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18) == curriedFun18(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18))

        val fun19 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int, x19: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 }
        val curriedFun19 = fun19.curried()
        require(fun19(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19) == curriedFun19(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19))

        val fun20 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int, x19: Int, x20: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 + x20 }
        val curriedFun20 = fun20.curried()
        require(fun20(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20) == curriedFun20(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19)(20))

        val fun21 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int, x19: Int, x20: Int, x21: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 + x20 + x21 }
        val curriedFun21 = fun21.curried()
        require(fun21(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21) == curriedFun21(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19)(20)(21))
    }

    @Test
    fun unCurriedTest() {
        val fun1 = { x1: Int, x2: Int -> x1 + x2 }
        val curriedFun1 = fun1.curried()
        require(fun1(1, 2) == curriedFun1.uncurried()(1, 2))

        val fun2 = { x1: Int, x2: Int, x3: Int -> x1 + x2 + x3 }
        val curriedFun2 = fun2.curried()
        require(fun2(1, 2, 3) == curriedFun2.uncurried()(1, 2, 3))

        val fun3 = { x1: Int, x2: Int, x3: Int, x4: Int -> x1 + x2 + x3 + x4 }
        val curriedFun3 = fun3.curried()
        require(fun3(1, 2, 3, 4) == curriedFun3.uncurried()(1, 2, 3, 4))

        val fun4 = { x1: Int, x2: Int, x3: Int, x4: Int -> x1 + x2 + x3 + x4 }
        val curriedFun4 = fun4.curried()
        require(fun4(1, 2, 3, 4) == curriedFun4.uncurried()(1, 2, 3, 4))

        val fun5 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int -> x1 + x2 + x3 + x4 + x5 }
        val curriedFun5 = fun5.curried()
        require(fun5(1, 2, 3, 4, 5) == curriedFun5.uncurried()(1, 2, 3, 4, 5))

        val fun6 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int -> x1 + x2 + x3 + x4 + x5 + x6 }
        val curriedFun6 = fun6.curried()
        require(fun6(1, 2, 3, 4, 5, 6) == curriedFun6.uncurried()(1, 2, 3, 4, 5, 6))

        val fun7 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 }
        val curriedFun7 = fun7.curried()
        require(fun7(1, 2, 3, 4, 5, 6, 7) == curriedFun7.uncurried()(1, 2, 3, 4, 5, 6, 7))

        val fun8 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 }
        val curriedFun8 = fun8.curried()
        require(fun8(1, 2, 3, 4, 5, 6, 7, 8) == curriedFun8.uncurried()(1, 2, 3, 4, 5, 6, 7, 8))

        val fun9 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 }
        val curriedFun9 = fun9.curried()
        require(fun9(1, 2, 3, 4, 5, 6, 7, 8, 9) == curriedFun9.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9))

        val fun10 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 }
        val curriedFun10 = fun10.curried()
        require(fun10(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) == curriedFun10.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

        val fun11 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 }
        val curriedFun11 = fun11.curried()
        require(fun11(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11) == curriedFun11.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11))

        val fun12 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 }
        val curriedFun12 = fun12.curried()
        require(fun12(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12) == curriedFun12.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12))

        val fun13 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 }
        val curriedFun13 = fun13.curried()
        require(fun13(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) == curriedFun13.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13))

        val fun14 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 }
        val curriedFun14 = fun14.curried()
        require(fun14(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14) == curriedFun14.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14))

        val fun15 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 }
        val curriedFun15 = fun15.curried()
        require(fun15(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15) == curriedFun15.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15))

        val fun16 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 }
        val curriedFun16 = fun16.curried()
        require(fun16(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16) == curriedFun16.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16))

        val fun17 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 }
        val curriedFun17 = fun17.curried()
        require(fun17(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17) == curriedFun17.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17))

        val fun18 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 }
        val curriedFun18 = fun18.curried()
        require(fun18(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18) == curriedFun18.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18))

        val fun19 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int, x19: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 }
        val curriedFun19 = fun19.curried()
        require(fun19(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19) == curriedFun19.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19))

        val fun20 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int, x19: Int, x20: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 + x20 }
        val curriedFun20 = fun20.curried()
        require(fun20(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20) == curriedFun20.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))

        val fun21 = { x1: Int, x2: Int, x3: Int, x4: Int, x5: Int, x6: Int, x7: Int, x8: Int, x9: Int, x10: Int, x11: Int, x12: Int, x13: Int, x14: Int, x15: Int, x16: Int, x17: Int, x18: Int, x19: Int, x20: Int, x21: Int -> x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 + x20 + x21 }
        val curriedFun21 = fun21.curried()
        require(fun21(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21) == curriedFun21.uncurried()(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21))
    }
}