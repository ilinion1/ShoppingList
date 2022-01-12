package com.example.shoppinglist.domain

/**
 * Получаю список элементов
 */
class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopLIst(): List<ShopItem>{
        return shopListRepository.getShopLIst()
    }
}