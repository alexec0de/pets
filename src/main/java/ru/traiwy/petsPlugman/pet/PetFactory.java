package ru.traiwy.petsPlugman.pet;

import org.bukkit.entity.Player;
import ru.traiwy.petsPlugman.pet.species.LegendaryPet;
import ru.traiwy.petsPlugman.pet.species.NormalPet;
import ru.traiwy.petsPlugman.pet.species.RagePet;

import java.util.List;

public class PetFactory {
    public Pet create(PetType pet, Player owner, String namePet, List<String> description, int levelPet){
        return switch (pet){
            case RAGE -> new RagePet(namePet, description, levelPet, owner);
            case NORMAL -> new NormalPet(namePet, description, levelPet, owner);
            case LEGENDARY -> new LegendaryPet(namePet, description, levelPet, owner);
        };

    }
}
