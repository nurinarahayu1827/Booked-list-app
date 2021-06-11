package id.ac.unhas.book

open class Event<out T>(private val content: T) {
    var hasBeenHandled = false
    private set //Allow external read but not write

    /**
     * Return the content and prevents its use again.
     */

    fun getContentIfNotHandled(): T?{
        return if (hasBeenHandled){
            null
        } else{
            hasBeenHandled = true
            content
        }
    }

    /**
     * Return the content, even if it's already been handled.
     */
    fun peekContent(): T = content

}