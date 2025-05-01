package gof.patterns.behavioral.chainOfResponsabilitiy

import gof.patterns.behavioral.chainOfResponsabilitiy.middlewares.AcceptHeaderMiddleware
import gof.patterns.behavioral.chainOfResponsabilitiy.middlewares.ContentTypeMiddleware

fun main() {
    val middlewareChain = MiddlewareChain(AcceptHeaderMiddleware())
    middlewareChain.setNext(
        ContentTypeMiddleware()
    )
    val headers = HashMap<String, String>()
    val request = HttpRequest(body = "{}", headers)
    headers.put("Accept", "application/json")
    headers.put("Content-Type", "application/json")
    middlewareChain.handle(request)
    println("Request processed by the Middleware Chain")
}