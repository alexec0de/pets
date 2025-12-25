package ru.traiwy.petsPlugman.util;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.Material;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.UUID;

@UtilityClass
public class CustomHead {

    public ItemStack getCustomHead(String texture){
        final ItemStack stack = new ItemStack(Material.PLAYER_HEAD, 1);
        final SkullMeta meta = (SkullMeta) stack.getItemMeta();
        if (meta != null) {
            createRandomProfile(meta, texture);
            stack.setItemMeta(meta);
        }
        return stack;
    }

    private void createRandomProfile(SkullMeta skullMeta, String texture) {
        final PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID());
        profile.setProperty(new ProfileProperty("textures", texture));
        skullMeta.setPlayerProfile(profile);
    }
}
