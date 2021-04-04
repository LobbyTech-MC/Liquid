package io.github.seggan.liquid;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    private Items() {}

    public static final Category category = new Category(
        new NamespacedKey(Liquid.getInstance(), "liquids"),
        new CustomItem(Material.LAVA_BUCKET, "&6流体科技")
    );

    public static final SlimefunItemStack MELTER = new SlimefunItemStack(
        "MELTER",
        Material.BLAST_FURNACE,
        "&6金属熔化机",
        "",
        "&7高温熔炉",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack SOLIDIFIER = new SlimefunItemStack(
        "SOLIDIFIER",
        Material.LIGHT_BLUE_STAINED_GLASS,
        "&b超冷却器",
        "",
        "&7加强版冰箱",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack TESTLCONTAINER = new SlimefunItemStack(
        "TESTLCONTAINER",
        Material.HAY_BLOCK,
        "&bTest LContainer",
        "",
        "&7Test Item"
    );

    public static final SlimefunItemStack TESTLCONTAINER_2 = new SlimefunItemStack(
        "TESTLCONTAINER_2",
        Material.HAY_BLOCK,
        "&bTest LContainer 2",
        "",
        "&7Test Item"
    );

    public static final SlimefunItemStack MIXER = new SlimefunItemStack(
        "MIXER",
        Material.BLAST_FURNACE,
        "&6流体混合机",
        "",
        "&7这个升级的熔化机专为",
        "&7混合流体打造",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack CENTRIFUGE = new SlimefunItemStack(
        "CENTRIFUGE",
        Material.HAY_BLOCK,
        "&6离心机",
        "",
        "&7离心机可以将流体分离",
        LoreBuilder.powerPerSecond(32),
        LoreBuilder.powerBuffer(64)
    );

    public static final SlimefunItemStack CRYSTALLIZER = new SlimefunItemStack(
        "CRYSTALLIZER",
        Material.DIAMOND_BLOCK,
        "&b结晶器",
        "",
        "&7结晶器用于让流体结晶",
        LoreBuilder.powerPerSecond(8),
        LoreBuilder.powerBuffer(16)
    );

    public static final SlimefunItemStack SPRAY_SOLIDIFIER = new SlimefunItemStack(
        "SPRAY_SOLIDIFIER",
        Material.SMITHING_TABLE,
        "&b喷射型超冷却器",
        "",
        "&7这种超冷却器喷射雾状的流体",
        "&7因此，这个机器比传统超冷却器工作",
        "&7更快但是也更耗能。",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128)
    );

    public static final SlimefunItemStack SLAG = new SlimefunItemStack(
        "SLAG",
        Material.CHARCOAL,
        "&7炉渣",
        "",
        "&7“一个人的垃圾是另一个人的宝藏。”"
    );
}
