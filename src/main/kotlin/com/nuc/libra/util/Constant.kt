package com.nuc.libra.util

/**
 * @author 杨晓辉 2019/4/11 14:52
 */
object Constant {

    val TOTAL_SCORE = 100
    /*选择题  类型 1 */
    val SELECT = 5
    val SELECT_TYPE = "选择题"
    val SELECT_SCORE = 6
    /*填空题  类型 2 */
    val EXERCISE = 3
    val EXERCISE_TYPE = "填空题"
    val EXERCISE_SCORE = 8

    /*简答题  类型 3 */
    val SHORT_ANSWER = 1
    val SHORT_ANSWER_TYPE = "简答题"
    val SHORT_SCORE = 20

    /*代码题  类型 4 */
    val CODE = 1
    val CODE_TYPE = "代码题"
    val CODE_SCORE = 24


    fun scoreFactory(type: String): Int {
        return if (type.equals("填空题"))
            EXERCISE_SCORE
        else if (type.equals("选择题"))
            SELECT_SCORE
        else if (type.equals("简答题"))
            SHORT_SCORE
        else if (type.equals("代码题"))
            CODE_SCORE
        else
            0
    }


}
