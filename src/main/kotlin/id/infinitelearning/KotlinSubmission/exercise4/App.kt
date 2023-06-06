package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val dividend = 10
        val divisor = 0
        val result = dividend / divisor
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi error: ${e.message}")
    }

}