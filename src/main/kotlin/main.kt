fun main() {
    //Считаем, что изначально переменная likes имеет целочисленный тип,
    //чтобы ее значение было удобно уменьшать и увеличивать
    val likes = 101
    val likesStr = likes.toString()
    val resultWord = if (likesStr.endsWith("1") && !likesStr.endsWith("11")) "человеку" else "людям"
    println("Понравилось $likesStr $resultWord")
}