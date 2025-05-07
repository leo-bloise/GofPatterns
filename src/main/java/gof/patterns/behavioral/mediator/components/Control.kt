package gof.patterns.behavioral.mediator.components

interface Control {
    var visible: Boolean;
    fun render(title: String);
    fun onChangeText(text: String);
}