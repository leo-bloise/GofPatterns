package gof.patterns.behavioral.chainOfResponsabilitiy

class MiddlewareChain(
    val first: Middleware
): Iterator<Middleware> {
    private var cursor: Middleware? = first
    fun handle(request: HttpRequest) {
        first.handle(request)
    }
    fun setNext(middleware: Middleware) {
        var mid = first
        do {
            val hasNext = mid.next != null
            if (hasNext) {
                mid = mid.next as Middleware
            }
        } while (hasNext)
        mid.next = middleware
    }
    override fun next(): Middleware {
        val actual = cursor as Middleware
        cursor = actual.next
        return actual
    }
    override fun hasNext(): Boolean {
        return cursor != null
    }
}