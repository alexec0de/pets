package ru.traiwy.petsPlugman;

import org.bukkit.plugin.java.JavaPlugin;
import ru.traiwy.petsPlugman.command.PetCommand;
import ru.traiwy.petsPlugman.command.subcommand.DespawnCommand;
import ru.traiwy.petsPlugman.command.subcommand.SpawnCommand;
import ru.traiwy.petsPlugman.service.PetService;

import java.util.Objects;

public final class PetsPlugman extends JavaPlugin {

    @Override
    public void onEnable() {
        PetCommand petCommand = new PetCommand();
        PetService petService = new PetService(this);


        petCommand.register(new SpawnCommand(petService));
        petCommand.register(new DespawnCommand(petService));

        Objects.requireNonNull(getCommand("pet")).setExecutor(petCommand);

    }


    @Override
    public void onDisable() {


    }
}
