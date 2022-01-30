package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData
import javax.inject.Inject

/**
 * Получаю список элементов
 */
class GetShopListUseCase @Inject constructor(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>>{
        return shopListRepository.getShopLIst()
    }
}