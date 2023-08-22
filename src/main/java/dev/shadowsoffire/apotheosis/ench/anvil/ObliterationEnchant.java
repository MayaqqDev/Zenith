package dev.shadowsoffire.apotheosis.ench.anvil;

import dev.shadowsoffire.apotheosis.ench.EnchModule;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ObliterationEnchant extends Enchantment {

    public ObliterationEnchant() {
        super(Rarity.RARE, EnchantmentCategory.BREAKABLE, new EquipmentSlot[0]);
    }

    @Override
    public int getMinCost(int enchantmentLevel) {
        return 30;
    }

    @Override
    public int getMaxCost(int enchantmentLevel) {
        return 200;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

}
