package EFM_REGIONAL_KOTLIN_V2

class EXERCICE1 {

    fun String.estVideOuBlanche(): Boolean {
        return this.trim().isEmpty()
    }

    fun String.sigle(): String {
        val words = this.split(" ")
        return words.map { it.first().uppercase() }.joinToString("")
    }

}