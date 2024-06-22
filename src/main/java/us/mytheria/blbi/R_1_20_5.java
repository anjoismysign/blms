package us.mytheria.blbi;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class R_1_20_5 implements Breaking{
    private static R_1_20_5 instance;

    public static R_1_20_5 getInstance() {
        if (instance == null) {
            instance = new R_1_20_5();
        }
        return instance;
    }

    private R_1_20_5() {
    }

    @Override
    public float getHardness(@Nonnull Material material) {
        return material.getHardness();
    }

    @Override
    public boolean isTool(@Nonnull Block block,
                          @Nonnull ItemStack hand) {
        return !block.getDrops(hand).isEmpty();
    }

    @Override
    public double getBreakSpeed(@Nonnull Player player) {
        AttributeInstance instance = player.getAttribute(Attribute.PLAYER_BLOCK_BREAK_SPEED);
        if (instance == null)
            return 0;
        return instance.getValue();
    }
}
