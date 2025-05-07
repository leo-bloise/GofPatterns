package gof.patterns.behavioral.mediator

import gof.patterns.behavioral.mediator.components.Control
import gof.patterns.behavioral.mediator.components.Mediator
import gof.patterns.behavioral.mediator.input.TextInput

class FormControlMediator: Mediator<Control> {
    val usernameInputText: TextInput = TextInput(this, true)
    val passwordInputText: TextInput = TextInput(this, false)
    override fun notify(sender: Control, event: String) {
        if (sender is TextInput) {
            return handleUsernameInputText(event)
        }
    }
    private fun handleUsernameInputText(event: String) {
        println("Event: $event")
        if(event == "onChange") {
            println("Password Input Text visible to true")
            passwordInputText.visible = true
            return
        }
    }
}