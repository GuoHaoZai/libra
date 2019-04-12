package com.nuc.libra.jni

import com.sun.jna.Structure

import java.util.ArrayList

/**
 * @author 杨晓辉 2019-02-07 16:44
 */
class GoString : Structure {

    var str: String
    var length: Long = 0

    protected val fieldOrder: List<String>
        @Override
        get() {
            val files = ArrayList()
            files.add("str")
            files.add("length")
            return files
        }

    constructor() {

    }

    constructor(str: String) {
        this.str = str
        this.length = str.length()
    }

    class ByValue : GoString, Structure.ByValue {
        constructor() {}

        constructor(str: String) : super(str) {}
    }

    class ByReference : GoString, Structure.ByReference {
        constructor() {}

        constructor(str: String) : super(str) {}
    }
}
