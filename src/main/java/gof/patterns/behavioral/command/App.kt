package gof.patterns.behavioral.command

import gof.patterns.behavioral.command.commands.SayHiCommand

fun main() {
    val commandMap = HashMap<Events, Command>()
    commandMap.put(Events.SAY_HI, SayHiCommand())
    val commandExecutor = CommandExecutor(commandMap)
    val commandContext = CommandContext("leonardo")
    commandExecutor.dispatch(Events.SAY_HI, commandContext)
}