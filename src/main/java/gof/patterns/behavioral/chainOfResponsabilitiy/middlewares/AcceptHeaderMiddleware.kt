package gof.patterns.behavioral.chainOfResponsabilitiy.middlewares

import gof.patterns.behavioral.chainOfResponsabilitiy.HttpRequest

class AcceptHeaderMiddleware: HttpMiddleware() {
    override fun canHandle(request: HttpRequest): Boolean {
        return true
    }
    override fun handleRequest(request: HttpRequest) {
        val accept = request.headers["Accept"]
        if (accept == null) {
            throw MiddlewareException("Accept must have a value", "AcceptHeaderMiddleware")
        }
        if (accept != "application/json") {
            throw MiddlewareException("We can only accept JSON bodies", "AcceptHeaderMiddleware")
        }
    }
}