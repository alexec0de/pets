package ru.traiwy.petsPlugman.pet.species;

import org.bukkit.entity.Player;
import ru.traiwy.petsPlugman.pet.Pet;

import java.util.List;

public class RagePet extends Pet {
    public RagePet(String name, List<String> description, int level, Player owner) {
        super(name, description, level, owner);
    }
}
