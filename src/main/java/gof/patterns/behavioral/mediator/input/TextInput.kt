package gof.patterns.behavioral.mediator.input

import gof.patterns.behavioral.mediator.components.Control
import gof.patterns.behavioral.mediator.components.Mediator

class TextInput(private val mediator: Mediator<Control>, override var visible: Boolean): Control {
    private var text: String? = null
    override fun render(title: String) {
        println("Rendering title: $title")
    }
    override fun onChangeText(text: String) {
        this.text = text;
        mediator.notify(this, "onChange")
    }
}