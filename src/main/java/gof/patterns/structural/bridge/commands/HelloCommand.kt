package gof.patterns.structural.bridge.commands

import gof.patterns.structural.bridge.CommandPeer

class HelloCommand: CommandPeer {
    override fun execute(args: Map<String, String>) {
        var name = args["name"]
        if(name == null) {
            name = "Anonymous"
        }
        println("Hello, $name. How may I help you today?")
    }
}