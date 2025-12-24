package net.legendzary.ppbadditions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.legendzary.ppbadditions.PushpinbirdAdditions;
import net.legendzary.ppbadditions.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PUSHPINBIRD_ADDITIONS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PushpinbirdAdditions.MOD_ID, "pushpinbird_additions"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PUSHPIBALD))
                    .displayName(Text.translatable("itemgroup.ppbadditions.item.group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PUSHPIN);

                        entries.add(ModItems.CHAT_MASCOT);

                        entries.add(ModItems.PUSHPIBALD);
                        entries.add(ModBlocks.PUSHPIBALD_BLOCK);

                        entries.add(ModBlocks.PUSHPIBALD_ORE);
                        entries.add(ModBlocks.PUSHPIBALD_DEEPSLATE_ORE);

                        entries.add(ModItems.PUSHPIBALD_SWORD);
                        entries.add(ModItems.PUSHPIBALD_PICKAXE);
                        entries.add(ModItems.PUSHPIBALD_AXE);
                        entries.add(ModItems.PUSHPIBALD_SHOVEL);
                        entries.add(ModItems.PUSHPIBALD_HOE);

                        entries.add(ModItems.PUSHPIBALD_HELMET);
                        entries.add(ModItems.PUSHPIBALD_CHESTPLATE);
                        entries.add(ModItems.PUSHPIBALD_LEGGINGS);
                        entries.add(ModItems.PUSHPIBALD_BOOTS);

                    }).build());



    public static void registerItemGroups() {
        PushpinbirdAdditions.LOGGER.info("Registering Item Groups for " + PushpinbirdAdditions.MOD_ID);
    }
}
