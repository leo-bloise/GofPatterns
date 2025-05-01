package gof.patterns.behavioral.command.commands

import gof.patterns.behavioral.command.Command
import gof.patterns.behavioral.command.CommandContext

class SayHiCommand: Command {
    override var context: CommandContext? = null
    override fun execute() {
        if(context == null) throw RuntimeException("Context must be informed")
        val username = (context as CommandContext).username
        println("Hi, $username")
    }
}