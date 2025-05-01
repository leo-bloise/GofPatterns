package gof.patterns.behavioral.chainOfResponsabilitiy.middlewares

import gof.patterns.behavioral.chainOfResponsabilitiy.HttpRequest

class ContentTypeMiddleware: HttpMiddleware() {
    override fun canHandle(request: HttpRequest): Boolean {
        return true
    }

    override fun handleRequest(request: HttpRequest) {
        val contentType = request.headers["Content-Type"]
        if (contentType == null) {
            throw MiddlewareException("Content-Type must be defined", "ContentTypeMiddleware")
        }
        if (contentType != "application/json") {
            throw MiddlewareException("This application can only respond in JSON", "ContentTypeMiddleware")
        }
    }
}