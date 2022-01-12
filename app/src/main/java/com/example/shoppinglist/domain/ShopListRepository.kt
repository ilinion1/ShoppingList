package com.example.shoppinglist.domain

/**
 * Для реализации domain UseCase
 */
interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopList(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopLIst(): List<ShopItem>
}