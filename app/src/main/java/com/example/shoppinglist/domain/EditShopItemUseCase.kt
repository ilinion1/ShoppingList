package com.example.shoppinglist.domain

/**
 * Редактирую элемент
 */
class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopList(shopItem: ShopItem){
        shopListRepository.editShopList(shopItem)
    }
}