package dev.siro256.spigotpl.crafterlegends.i18n

import java.util.*
import kotlin.collections.HashMap

enum class Message {
    ;

    companion object {
        val mapping = HashMap<Locale, HashMap<Message, String>>()

        fun getString(lang: Locale, message: Message): String {
            if (!mapping.containsKey(lang)) return mapping[Locale.JAPANESE]!![message]!!
            return mapping[lang]!![message]!!
        }
    }
}
