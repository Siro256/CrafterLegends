package dev.siro256.spigotpl.crafterlegends.item.gear.backpack

import dev.siro256.spigotpl.crafterlegends.item.gear.Gear

abstract class Backpack: Gear() {
    abstract val capacity: Int
}