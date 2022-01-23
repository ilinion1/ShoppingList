package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

/**
 * Для реализации domain UseCase
 */
interface ShopListRepository {

    suspend fun addShopItem(shopItem: ShopItem)
    suspend fun deleteShopItem(shopItem: ShopItem)
    suspend fun editShopList(shopItem: ShopItem)
    suspend fun getShopItem(shopItemId: Int): ShopItem
    fun getShopLIst(): LiveData<List<ShopItem>>
}