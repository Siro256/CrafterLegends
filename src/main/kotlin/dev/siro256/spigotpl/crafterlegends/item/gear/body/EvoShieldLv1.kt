package dev.siro256.spigotpl.crafterlegends.item.gear.body

import dev.siro256.spigotpl.crafterlegends.i18n.Message

class EvoShieldLv1: EvoShield() {
    override val name = Message.ITEM_GEAR_EVO_SHIELD_LV1
    override val maxDurability = 50
    override var evoDamage = 50
}
