package dev.siro256.spigotpl.crafterlegends.item.gear.body

import dev.siro256.spigotpl.crafterlegends.i18n.Message

class EvoShieldLv3: EvoShield() {
    override val name = Message.ITEM_GEAR_EVO_SHIELD_LV3
    override val maxDurability = 100
    override var evoDamage = 250
}
