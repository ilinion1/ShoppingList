package com.example.shoppinglist.domain

/**
 * Редактирую элемент
 */
class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun editShopList(shopItem: ShopItem){
        shopListRepository.editShopList(shopItem)
    }
}