package me.naete.kit.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class KitCommand implements CommandExecutor {

    public boolean onCommand(CommandSender caller, Command command, String label, String[] args) {

        // Check if the user performing the command is a player.
        if (!(caller instanceof Player)) return true;

        // Check if the user performing the command has permission.
        if (!(caller.hasPermission("kit.use"))) return true;

        // Create a local variable of the caller, casted as a player.
        Player player = (Player) caller;

        // Create a local variable of the callers current world.
        World world = player.getWorld();

        // Create a local variable of the callers inventory.
        PlayerInventory playerInventory = player.getInventory();

        // Set the world, and inventory of the caller.
        world.setTime(1000l);
        player.setHealth(20);
        player.setFoodLevel(20);
        playerInventory.clear();
        playerInventory.setHelmet(new ItemStack(Material.DIAMOND_HELMET));
        playerInventory.setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
        playerInventory.setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        playerInventory.setBoots(new ItemStack(Material.DIAMOND_BOOTS));
        playerInventory.addItem(new ItemStack(Material.DIAMOND_SWORD));
        playerInventory.addItem(new ItemStack(Material.DIAMOND_AXE));
        playerInventory.addItem(new ItemStack(Material.BOW));
        playerInventory.addItem(new ItemStack(Material.ARROW, 7));

        // Send the user performing the command a message.
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[Kit] You claimed kit successfully."));

        return false;
    }

}
