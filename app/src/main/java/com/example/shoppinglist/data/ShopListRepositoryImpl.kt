package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.ShopListRepository
import com.example.shoppinglist.domain.UNDEFINED_ID

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == UNDEFINED_ID){
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopList(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        deleteShopItem(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId } ?: throw RuntimeException("Элемент $shopItemId не найден")
    }

    override fun getShopLIst(): List<ShopItem> {
        return shopList.toList()
    }
}