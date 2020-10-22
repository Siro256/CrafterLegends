package dev.siro256.spigotpl.crafterlegends.item.gear.body

import dev.siro256.spigotpl.crafterlegends.item.gear.Gear
import kotlin.math.abs

abstract class BodyShield: Gear() {
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

    open fun recover(durability: Int): Int {
        if (this.durability + durability > maxDurability) {
            val remainder = this.durability + durability - maxDurability
            this.durability = maxDurability
            return remainder
        }
        this.durability += durability
        return 0
    }

    init {
        durability = maxDurability
    }
}
