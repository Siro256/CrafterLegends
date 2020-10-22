package dev.siro256.spigotpl.crafterlegends.item.gear.body

import dev.siro256.spigotpl.crafterlegends.i18n.Message

class BodyShieldLv4: BodyShield() {
    override val name = Message.ITEM_GEAR_BODY_SHIELD_LV4
    override val maxDurability = 100

    override fun recover(durability: Int): Int {
        val fixDurability = durability * 2
        if (this.durability + fixDurability > maxDurability) {
            val remainder = this.durability + fixDurability - maxDurability
            this.durability = maxDurability
            return remainder
        }
        this.durability += durability
        return 0
    }
}
