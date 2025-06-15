package io.github.anjoismysign.blms;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public interface Breaking {

    /**
     * Gets the hardness for a specific Material.
     *
     * @param material the Material to check.
     * @return The hardness.
     */
    float getHardness(@Nonnull Material material);

    /**
     * Gets the hardness for a specific Block.
     *
     * @param block the Block to check.
     * @return The hardness.
     */
    default float getHardness(@Nonnull Block block){
        return getHardness(block.getType());
    }

    /**
     * Checks if hand is a tool for breaking a block.
     *
     * @param block the Block to check.
     * @param hand the ItemStack to check.
     * @return True if hand is a tool for breaking block.
     */
    boolean isTool(@Nonnull Block block,
                   @Nonnull ItemStack hand);

    /**
     * Gets the break speed for a specific Player.
     * Doesn't check for hand.
     *
     * @param player the Player to check.
     * @return The break speed. Empty if player has no break speed.
     */
    double getBreakSpeed(@Nonnull Player player);
}
