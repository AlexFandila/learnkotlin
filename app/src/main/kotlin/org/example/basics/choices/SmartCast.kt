package org.example.basics.choices

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/**
 * When you're using smart cast with a property of a class, as in this example,
 * the property has to be a val and it can't have custom accessor.
 * Otherwise it would not be possible to verify access to the property would return
 * the same value.
 */
fun eval(e: Expr): Int {
    if(e is Num) {
        // val n = e as Num - Redundant because when you use IS, kotlin automatically cast the value
        return e.value
    }
    if(e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

/**
 * Explicit cast AS
 */
fun explicit(n: Expr) {
    val m = n as Num
    println("m is a Num with value ${m.value}")
}

/**
 * Using if expressions that return values
 */
fun evalIfReturn(e: Expr): Int =
    if(e is Num) {
        e.value
    } else if(e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown Expression")
    }

fun evalIfReturnConcise(e: Expr): Int =
    if(e is Num) e.value
    else if(e is Sum) eval(e.right) + eval(e.left)
    else throw IllegalArgumentException("Unknown expression")

/**
 * This how it should be in clean way
 */
fun cleanEval(e: Expr): Int =
    when(e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

/**
 * Blocks as branches of if and when
 *
 */
fun evalWithLogging(e: Expr): Int =
    when(e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expr")
    }

fun main() {
    evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))) // 7
}