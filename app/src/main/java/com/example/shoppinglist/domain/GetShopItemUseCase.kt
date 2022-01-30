package com.example.shoppinglist.domain

import javax.inject.Inject

/**
 * Получаю id элемента, который откроется для редактирования
 */
class GetShopItemUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }
}