package gof.patterns.structural.bridge

interface CommandPeer {
    fun execute(args: Map<String, String>)
}