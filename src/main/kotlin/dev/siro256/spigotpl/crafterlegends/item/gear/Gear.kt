package dev.siro256.spigotpl.crafterlegends.item.gear

import dev.siro256.spigotpl.crafterlegends.item.Item
import dev.siro256.spigotpl.crafterlegends.item.ItemType

abstract class Gear: Item {
    override val type = ItemType.GEAR
    override val amount = 1
}
