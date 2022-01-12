package io.github.seggan.liquid;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    private Items() {}

    public static final ItemGroup CATEGORY = new ItemGroup(
        new NamespacedKey(Liquid.getInstance(), "liquids"),
        new CustomItemStack(Material.LAVA_BUCKET, "&6流体")
    );

    public static final SlimefunItemStack MELTER = new SlimefunItemStack(
        "MELTER",
        Material.BLAST_FURNACE,
        "&6熔炉",
        "",
        "&7高温炉",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack SOLIDIFIER = new SlimefunItemStack(
        "SOLIDIFIER",
        Material.LIGHT_BLUE_STAINED_GLASS,
        "&b固化器",
        "",
        "&7先进的冰柜",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack TESTLCONTAINER = new SlimefunItemStack(
        "TESTLCONTAINER",
        Material.HAY_BLOCK,
        "&b测试容器",
        "",
        "&7测试物品"
    );

    public static final SlimefunItemStack TESTLCONTAINER_2 = new SlimefunItemStack(
        "TESTLCONTAINER_2",
        Material.HAY_BLOCK,
        "&b测试容器 2",
        "",
        "&7测试物品"
    );

    public static final SlimefunItemStack MIXER = new SlimefunItemStack(
        "MIXER",
        Material.BLAST_FURNACE,
        "&6混合器",
        "",
        "&7这个升级的熔炉非常适合",
        "&7用于将液体混合在一起",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack CENTRIFUGE = new SlimefunItemStack(
        "CENTRIFUGE",
        Material.HAY_BLOCK,
        "&6离心机",
        "",
        "&7离心机可以分离液体",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack CRYSTALLIZER = new SlimefunItemStack(
        "CRYSTALLIZER",
        Material.DIAMOND_BLOCK,
        "&b结晶器",
        "",
        "&7结晶器可以使晶体凝固",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack SPRAY_SOLIDIFIER = new SlimefunItemStack(
        "SPRAY_SOLIDIFIER",
        Material.SMITHING_TABLE,
        "&b喷雾固化剂",
        "",
        "&7这种固化剂喷出液体",
        "&7将这些液体变成矿粉",
        "&7这台机器工作得更快但消耗更多",
        "&7比普通固化剂更强大",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack SLAG = new SlimefunItemStack(
        "SLAG",
        Material.CHARCOAL,
        "&7战斗",
        "",
        "&7一个人的垃圾是另一个人的宝藏...",
    );
}