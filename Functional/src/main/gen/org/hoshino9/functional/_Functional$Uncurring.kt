@file:Suppress("unused")

package org.hoshino9.functional

/** A uncurring funtion that takes 0 argument */
fun <R> uncurring(f: () -> R): () -> R = f

/** A uncurring funtion that takes 1 argument */
fun <P0, R> uncurring(f: (P0) -> R): (P0) -> R = { p1 -> f(p1) }

/** A uncurring funtion that takes 2 arguments */
fun <P0, P1, R> uncurring(f: (P0) -> (P1) -> R): (P0, P1) -> R = { p1, p2 -> f(p1)(p2) }

/** A uncurring funtion that takes 3 arguments */
fun <P0, P1, P2, R> uncurring(f: (P0) -> (P1) -> (P2) -> R): (P0, P1, P2) -> R = { p1, p2, p3 -> f(p1)(p2)(p3) }

/** A uncurring funtion that takes 4 arguments */
fun <P0, P1, P2, P3, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> R): (P0, P1, P2, P3) -> R = { p1, p2, p3, p4 -> f(p1)(p2)(p3)(p4) }

/** A uncurring funtion that takes 5 arguments */
fun <P0, P1, P2, P3, P4, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> R): (P0, P1, P2, P3, P4) -> R = { p1, p2, p3, p4, p5 -> f(p1)(p2)(p3)(p4)(p5) }

/** A uncurring funtion that takes 6 arguments */
fun <P0, P1, P2, P3, P4, P5, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> R): (P0, P1, P2, P3, P4, P5) -> R = { p1, p2, p3, p4, p5, p6 -> f(p1)(p2)(p3)(p4)(p5)(p6) }

/** A uncurring funtion that takes 7 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> R): (P0, P1, P2, P3, P4, P5, P6) -> R = { p1, p2, p3, p4, p5, p6, p7 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7) }

/** A uncurring funtion that takes 8 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> R): (P0, P1, P2, P3, P4, P5, P6, P7) -> R = { p1, p2, p3, p4, p5, p6, p7, p8 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8) }

/** A uncurring funtion that takes 9 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9) }

/** A uncurring funtion that takes 10 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10) }

/** A uncurring funtion that takes 11 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11) }

/** A uncurring funtion that takes 12 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12) }

/** A uncurring funtion that takes 13 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13) }

/** A uncurring funtion that takes 14 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14) }

/** A uncurring funtion that takes 15 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15) }

/** A uncurring funtion that takes 16 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16) }

/** A uncurring funtion that takes 17 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17) }

/** A uncurring funtion that takes 18 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18) }

/** A uncurring funtion that takes 19 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19) }

/** A uncurring funtion that takes 20 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19)(p20) }

/** A uncurring funtion that takes 21 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19)(p20)(p21) }

/** A uncurring funtion that takes 22 arguments */
fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> uncurring(f: (P0) -> (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> (P21) -> R): (P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> f(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19)(p20)(p21)(p22) }
