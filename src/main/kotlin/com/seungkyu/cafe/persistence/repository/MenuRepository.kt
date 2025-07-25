package com.seungkyu.cafe.persistence.repository

import com.seungkyu.cafe.persistence.entity.MenuEntity

interface MenuRepository {

    fun save(menuEntity: MenuEntity): MenuEntity

    fun findAllByCafeId(cafeId: String): List<MenuEntity>
}