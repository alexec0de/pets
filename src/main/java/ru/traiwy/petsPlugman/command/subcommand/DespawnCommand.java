package ru.traiwy.petsPlugman.command.subcommand;

import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;
import ru.traiwy.petsPlugman.pet.Pet;
import ru.traiwy.petsPlugman.service.PetService;

@AllArgsConstructor
public class DespawnCommand implements SubCommand{
    private final PetService petService;

    @Override
    public String getName() {
        return "despawn";
    }

    @Override
    public String getPermission() {
        return "";
    }

    @Override
    public void execute(Player player, String[] args) {
        final Pet pet = petService.getPet(player);
        if(pet != null){
            petService.despawnPet(player);
        }
    }
}
