package com.example.shoppinglist.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Создаю таблицу(модель) для базы даннных
 */
@Entity(tableName = "shop_items")
data class ShopItemDbModel(
    //указываю автогенирацию id
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val count: Int,
    val enable: Boolean
    )