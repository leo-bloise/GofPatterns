package gof.patterns.structural.bridge

import gof.patterns.structural.bridge.commands.HelloCommand

fun getCommands(): Map<String, CommandPeer> {
    val helloCommand = HelloCommand()
    val commandsMap = HashMap<String, CommandPeer>()
    commandsMap.put("hello", helloCommand)
    return commandsMap
}

fun parseArgs(args: Array<String>): Map<String, String> {
    val commandArgs = HashMap<String, String>()
    for (arg: String in args) {
        if (arg.startsWith("--")) {
            val argData = arg.replaceFirst("--", "").split("=")
            commandArgs.put(argData[0], argData[1])
            continue
        }
        commandArgs.put("commandName", arg)
    }
    return commandArgs
}

fun main(args: Array<String>) {
    val commands = getCommands()
    val commandExecutor = CommandExecutor(commands)
    val commandArgs = parseArgs(args)
    val commandName = commandArgs["commandName"]
    if(commandName == null) {
        throw IllegalArgumentException("No command name informed")
    }
    commandExecutor.execute(commandName, commandArgs)
}