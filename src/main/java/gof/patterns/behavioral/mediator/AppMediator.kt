import gof.patterns.behavioral.mediator.FormControlMediator

fun main() {
    val mediator = FormControlMediator()
    mediator.usernameInputText.onChangeText("Hello World")
}