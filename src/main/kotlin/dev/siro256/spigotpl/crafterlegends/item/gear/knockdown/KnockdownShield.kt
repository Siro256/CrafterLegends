package dev.siro256.spigotpl.crafterlegends.item.gear.knockdown

import dev.siro256.spigotpl.crafterlegends.item.gear.Gear
import kotlin.math.abs

abstract class KnockdownShield: Gear() {
    abstract val maxDurability: Int
    var durability = 0
        protected set

    fun damage(durability: Int): Int {
        if (this.durability - durability < 0) {
            val remainder = abs(this.durability - durability)
            this.durability = 0
            return remainder
        }
        this.durability -= durability
        return 0
    }

    fun recover() {
        durability = maxDurability
    }

    init {
        durability = maxDurability
    }
}
