package gof.patterns.structural.bridge

/**
 * The bridge is based on the CommandPeer interface
 * */
class CommandExecutor(private val commandMap: Map<String, CommandPeer>) {
    private fun getCommand(commandName: String): CommandPeer {
        val peer = commandMap[commandName]
        if (peer == null) {
            throw IllegalArgumentException("Command $commandName does not exists")
        }
        return peer
    }
    fun execute(commandName: String, args: Map<String, String>) {
        val peer = getCommand(commandName)
        peer.execute(args)
    }
}