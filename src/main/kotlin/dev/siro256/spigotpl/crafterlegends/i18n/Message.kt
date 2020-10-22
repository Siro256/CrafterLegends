package dev.siro256.spigotpl.crafterlegends.i18n

import java.util.*
import kotlin.collections.HashMap

enum class Message {
    //Item name
    ITEM_GEAR_BODY_SHIELD_LV1,
    ITEM_GEAR_BODY_SHIELD_LV2,
    ITEM_GEAR_BODY_SHIELD_LV3,
    ITEM_GEAR_BODY_SHIELD_LV4,
    ITEM_GEAR_EVO_SHIELD_LV0,
    ITEM_GEAR_EVO_SHIELD_LV1,
    ITEM_GEAR_EVO_SHIELD_LV2,
    ITEM_GEAR_EVO_SHIELD_LV3,
    ITEM_GEAR_EVO_SHIELD_LV5,
    ITEM_GEAR_HELMET_LV1,
    ITEM_GEAR_HELMET_LV2,
    ITEM_GEAR_HELMET_LV3,
    ITEM_GEAR_HELMET_LV4,
    ITEM_GEAR_KNOCKDOWN_SHIELD_LV1,
    ITEM_GEAR_KNOCKDOWN_SHIELD_LV2,
    ITEM_GEAR_KNOCKDOWN_SHIELD_LV3,
    ITEM_GEAR_KNOCKDOWN_SHIELD_LV4,
    ITEM_GEAR_BACKPACK_LV1,
    ITEM_GEAR_BACKPACK_LV2,
    ITEM_GEAR_BACKPACK_LV3,
    ITEM_GEAR_BACKPACK_LV4;

    companion object {
        val mapping = HashMap<Locale, HashMap<Message, String>>()

        fun getString(lang: Locale, message: Message): String {
            if (!mapping.containsKey(lang)) return mapping[Locale.JAPANESE]!![message]!!
            return mapping[lang]!![message]!!
        }
    }
}
