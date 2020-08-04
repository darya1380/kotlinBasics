import java.sql.Array

fun main()
{
//    Primitive data types

    val a : Int = 12
    val a1 : Double = 12.12
    val a2 : Float = 12.12F
    val a3 : Long = 1232123451234567867L
    val a4 : Char = '@'

//  Array
    val b1 =  arrayOf(a, a1, a2, a3, a4)
//    String
    val b2 = "hello"
//    Array List
    val b3 = arrayListOf(a, a1, a2, a3, a4)
    b3.add(1)
    b3.removeAt(0)
    b3.remove(12)

}