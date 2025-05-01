package gof.patterns.behavioral.chainOfResponsabilitiy.middlewares

import java.lang.RuntimeException

class MiddlewareException(
    message: String,
    val middlewareName: String
): RuntimeException(message) {
}