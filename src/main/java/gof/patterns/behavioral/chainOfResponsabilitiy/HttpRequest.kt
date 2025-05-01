package gof.patterns.behavioral.chainOfResponsabilitiy

data class HttpRequest(
    val body: String,
    val headers: Map<String, String>
) {
}