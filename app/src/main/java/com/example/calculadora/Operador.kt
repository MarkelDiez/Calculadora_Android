package com.example.calculadora

class Operador {
    @Throws(Exception::class)
    fun doOperation(operation: String): String? {
        var ret: String? = null
        var firstNumber = ""
        var lastNumber = ""
        if (isAddition(operation)) {
            firstNumber = operation.substring(0, operation.lastIndexOf("+"))
            lastNumber = operation.substring(operation.lastIndexOf("+") + 1)
            ret =
                "" + add(firstNumber.trim { it <= ' ' }.toInt(),
                    lastNumber.trim { it <= ' ' }.toInt())
        } else if (isSubtraction(operation)) {
            firstNumber = operation.substring(0, operation.lastIndexOf("-"))
            lastNumber = operation.substring(operation.lastIndexOf("-") + 1)
            ret = "" + substract(firstNumber.trim { it <= ' ' }.toInt(),
                lastNumber.trim { it <= ' ' }.toInt()
            )
        } else if (isMultiply(operation)) {
            firstNumber = operation.substring(0, operation.lastIndexOf("*"))
            lastNumber = operation.substring(operation.lastIndexOf("*") + 1)
            ret = "" + multiply(firstNumber.trim { it <= ' ' }.toInt(),
                lastNumber.trim { it <= ' ' }.toInt()
            )
        } else if (isDivide(operation)) {
            firstNumber = operation.substring(0, operation.lastIndexOf("/"))
            lastNumber = operation.substring(operation.lastIndexOf("/") + 1)
            ret = "" + divide(firstNumber.trim { it <= ' ' }.toInt(),
                lastNumber.trim { it <= ' ' }.toInt()
            )
        }
        return ret
    }

    private fun isAddition(operation: String): Boolean {
        var ret = false
        val countAdd = operation.length - operation.replace("+", "").length
        val countSubs = operation.length - operation.replace("-", "").length
        if (countAdd == 1 && countSubs == 0) ret = true
        return ret
    }

    private fun isSubtraction(operation: String): Boolean {
        var ret = false
        val countAdd = operation.length - operation.replace("-", "").length
        val countSubs = operation.length - operation.replace("+", "").length
        if (countAdd == 1 && countSubs == 0) ret = true
        return ret
    }

    private fun isMultiply(operation: String): Boolean {
        var ret = false
        val countAdd = operation.length - operation.replace("*", "").length
        val countSubs = operation.length - operation.replace("/", "").length
        if (countAdd == 1 && countSubs == 0) ret = true
        return ret
    }

    private fun isDivide(operation: String): Boolean {
        var ret = false
        val countAdd = operation.length - operation.replace("/", "").length
        val countSubs = operation.length - operation.replace("*", "").length
        if (countAdd == 1 && countSubs == 0) ret = true
        return ret
    }

    private fun add(op1: Int, op2: Int): Int {
        return op1 + op2
    }

    private fun substract(op1: Int, op2: Int): Int {
        return op1 - op2
    }

    private fun multiply(op1: Int, op2: Int): Int{
        return op1 * op2
    }

    private fun divide(op1: Int, op2: Int): Int{
        return op1 / op2
    }
}