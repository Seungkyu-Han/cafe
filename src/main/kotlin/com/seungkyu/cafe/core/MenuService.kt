package com.seungkyu.cafe.core

import com.seungkyu.cafe.persistence.entity.MenuEntity

interface MenuService {

    fun save(name: String, img: String, cafeId: String): MenuEntity

    fun findByCafeId(cafeId: String): List<MenuEntity>
}