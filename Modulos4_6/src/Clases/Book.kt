package Clases

import java.util.Random

fun main() {
    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}

const val MAX_NUMBER_BOOKS = 20

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

open class Book(val title: String, val author: String) {

    private var currentPage: Int = 0
    var pages: Int = 0

    constructor(title: String, author: String, pages: Int, currentPage: Int) : this(title, author) {
        this.pages = pages
        this.currentPage = currentPage
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    open fun readPage() {
        currentPage++
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }
}

fun Book.weight() : Double { return (pages * 1.5) }
fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
    }
}