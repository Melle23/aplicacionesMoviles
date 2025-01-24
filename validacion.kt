fun main() {
    println(verificaCadena("nombre")) // true
    println(verificaCadena("_nombre")) // true
    println(verificaCadena("_12")) //true
    println(verificaCadena(" ")) //false
    println(verificaCadena("012")) //false
    println(verificaCadena("no$")) //false
}


fun verificaCadena(cadena: String): Boolean {

    if (cadena.isEmpty()) return false
    if (!cadena[0].isLetter() && cadena[0] != '_') return false
    if (cadena.any { !it.isLetterOrDigit() && it != '_' }) return false

    return true
}