package com.example.shoppinglist.domain

/**
 * Получаю id элемента, который откроется для редактирования
 */
class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }
}