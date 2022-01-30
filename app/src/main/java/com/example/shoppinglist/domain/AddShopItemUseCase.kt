package com.example.shoppinglist.domain

import androidx.room.Index
import javax.inject.Inject

/**
 * Добавляю элемент
 */
class AddShopItemUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}