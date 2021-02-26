package me.Theguyhere.CompressedCobble.items;

import me.Theguyhere.CompressedCobble.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ResourceEvents implements Listener {
	private final Resources r;
	
	public ResourceEvents(Resources r) {
		this.r = r;
	}
	
	@EventHandler()
	public void destroy(PlayerInteractEvent e) {
		Player player = e.getPlayer();

		// Only check if the player is holding an anti cobblestone
		if (!Main.equals(player.getInventory().getItemInMainHand(), r.a()))
			return;

		// Only check right click events
		if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK))
			return;

		// Cancel block placement
		e.setCancelled(true);

		// Remove clicked block
		e.getClickedBlock().setType(Material.AIR);

		int amount = player.getInventory().getItemInMainHand().getAmount();

		// Remove one anti cobblestone
		if (amount > 1)
			player.getInventory().getItemInMainHand().setAmount(amount - 1);
		else
			player.getInventory().remove(r.a());
	}
}
