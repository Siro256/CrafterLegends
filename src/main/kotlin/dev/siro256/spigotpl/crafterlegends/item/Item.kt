package dev.siro256.spigotpl.crafterlegends.item

import dev.siro256.spigotpl.crafterlegends.i18n.Message

interface Item {
    val name: Message
    val type: ItemType
    val amount: Int
}