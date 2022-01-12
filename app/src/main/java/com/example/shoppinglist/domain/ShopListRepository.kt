package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

/**
 * Для реализации domain UseCase
 */
interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopList(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopLIst(): LiveData<List<ShopItem>>
}