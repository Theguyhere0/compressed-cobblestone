package me.Theguyhere.CompressedCobble;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class CommandTab implements TabCompleter {

    private final List<String> arguments = new ArrayList<>();
    private final List<String> toolArgs = new ArrayList<>();

    public List<String> onTabComplete(CommandSender commandSender, Command command, String label, String[] args) {
        // Arguments after "cc"
        if (arguments.isEmpty()) {
            arguments.add("cobble");
            arguments.add("craft");
            arguments.add("help");
            arguments.add("materials");
            arguments.add("tools");
        }

        // Arguments after "tools"
        if (toolArgs.isEmpty()) {
            toolArgs.add("t0");
            toolArgs.add("t1");
            toolArgs.add("t2");
            toolArgs.add("t3");
            toolArgs.add("t4");
            toolArgs.add("t5");
            toolArgs.add("t6");
            toolArgs.add("t7");
            toolArgs.add("t8");
            toolArgs.add("t9");
            toolArgs.add("t10");
            toolArgs.add("not");
            toolArgs.add("anti");
        }

        List<String> result = new ArrayList<>();
        if (args.length == 1) {
            for (String a : arguments)
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);
            return result;
        }

        if (args.length == 2) {
            if (args[0].equals("tools"))
                for (String a : toolArgs)
                    if (a.toLowerCase().startsWith(args[1].toLowerCase()))
                        result.add(a);
                return result;
        }

        return null;
    }
}
