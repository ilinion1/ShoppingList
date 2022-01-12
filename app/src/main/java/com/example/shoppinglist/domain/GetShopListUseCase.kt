package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

/**
 * Получаю список элементов
 */
class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopLIst(): LiveData<List<ShopItem>>{
        return shopListRepository.getShopLIst()
    }
}