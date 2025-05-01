package gof.patterns.behavioral.command

class CommandExecutor(private val commands: Map<Events, Command>) {
    fun dispatch(event: Events, context: CommandContext) {
        val commandHandler = commands[event]
        if (commandHandler == null) {
            println("No handler configured for $event")
            return
        }
        commandHandler.context = context
        commandHandler.execute()
    }
}