package com.theprojectofandrej.bt.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class VersionCommand {

    @ShellMethod(key= "BTversion", value = "bt version information")
    public String version() {
        return "Version 0.1.1";
    }

}
