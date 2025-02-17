
class Book {
        var title: String = "House"
        val author: String = "Bobby"
        var yearPublished: Int = 2001
    }
fun main () {
    val myBook = Book()

    myBook.title = "House"
    myBook.author = "Bobby Lee"
    myBook.yearPublished = 2001
}

class Book(val title: String, val author: String, val yearPublished: Int) {
    fun getBookInfo(): String {
        return "$title by $author ($yearPublished)"
    }
fun main() {
    val myBook = Book("House", "Bobby", 2001)

    println("Title: ${myBook.title}")
    println("Author: ${myBook.author}")
    println("Year Published: ${myBook.yearPublished}")
}




