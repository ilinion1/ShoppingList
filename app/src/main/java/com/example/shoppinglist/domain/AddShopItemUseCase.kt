package com.example.shoppinglist.domain

/**
 * Добавляю элемент
 */
class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}