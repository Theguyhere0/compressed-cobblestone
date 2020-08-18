package me.Theguyhere.CompressedCobble.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ResourceEvents implements Listener {
	@EventHandler()
	public void destroy(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		if (!(player.getInventory().getItemInMainHand().getType().equals(Material.COMMAND_BLOCK) &&
				player.getInventory().getItemInMainHand().getItemMeta().hasLore()))
			return;
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			e.setCancelled(true);
			e.getClickedBlock().setType(Material.AIR);
			int amount = player.getInventory().getItemInMainHand().getAmount();
			if (amount > 1)
				player.getInventory().getItemInMainHand().setAmount(amount - 1);
			else player.getInventory().remove(new Resources().a());
		}
		return;
	}
}
