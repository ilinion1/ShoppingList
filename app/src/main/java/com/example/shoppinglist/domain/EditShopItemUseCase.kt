package com.example.shoppinglist.domain

import javax.inject.Inject

/**
 * Редактирую элемент
 */
class EditShopItemUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    suspend fun editShopList(shopItem: ShopItem){
        shopListRepository.editShopList(shopItem)
    }
}