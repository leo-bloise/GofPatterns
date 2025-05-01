package gof.patterns.behavioral.command

interface Command {
    var context: CommandContext?
    fun execute();
}