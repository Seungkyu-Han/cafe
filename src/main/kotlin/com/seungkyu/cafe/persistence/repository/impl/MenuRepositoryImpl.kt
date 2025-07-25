package com.seungkyu.cafe.persistence.repository.impl

import com.seungkyu.cafe.persistence.entity.MenuEntity
import com.seungkyu.cafe.persistence.repository.MenuRepository
import org.springframework.stereotype.Repository

@Repository
class MenuRepositoryImpl: MenuRepository {

    private val menus = mutableListOf<MenuEntity>()

    override fun save(menuEntity: MenuEntity): MenuEntity {
        menus.add(menuEntity)
        return menuEntity
    }

    override fun findAllByCafeId(cafeId: String): List<MenuEntity> {
        return menus.filter { it.cafeId == cafeId }
    }
}