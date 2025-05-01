package gof.patterns.behavioral.chainOfResponsabilitiy.middlewares

import gof.patterns.behavioral.chainOfResponsabilitiy.HttpRequest
import gof.patterns.behavioral.chainOfResponsabilitiy.Middleware

abstract class HttpMiddleware: Middleware {
    override var next: Middleware? = null
    abstract fun canHandle(request: HttpRequest): Boolean
    abstract fun handleRequest(request: HttpRequest)
    override fun handle(request: HttpRequest) {
        if (canHandle(request)) {
            handleRequest(request)
        }
        if (next != null) {
            next?.handle(request)
        }
    }
}