package com.example.shoppinglist.domain

import javax.inject.Inject

/**
 * Удаляю элемент
 */
class DeleteShopItemUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}