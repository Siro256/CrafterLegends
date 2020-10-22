package dev.siro256.spigotpl.crafterlegends.item.gear.body

import dev.siro256.spigotpl.crafterlegends.i18n.Message

class EvoShieldLv2: EvoShield() {
    override val name = Message.ITEM_GEAR_EVO_SHIELD_LV2
    override val maxDurability = 75
    override var evoDamage = 125
}
