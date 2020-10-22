package dev.siro256.spigotpl.crafterlegends.item.gear.body

import dev.siro256.spigotpl.crafterlegends.i18n.Message

class EvoShieldLv5: EvoShield() {
    override val name = Message.ITEM_GEAR_EVO_SHIELD_LV5
    override val maxDurability = 125
    override var evoDamage = 500
}
