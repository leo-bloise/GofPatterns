package gof.patterns.behavioral.chainOfResponsabilitiy

interface Middleware {
    var next: Middleware?
    fun handle(request: HttpRequest);
}