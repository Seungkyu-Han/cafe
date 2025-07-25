package com.seungkyu.cafe.core

import com.seungkyu.cafe.persistence.entity.MenuEntity

interface MenuService {

    fun save(name: String, img: String, cafeName: String): MenuEntity

    fun findByCafeId(cafeId: String): List<MenuEntity>

    fun deleteByCafeName(cafeName: String)
}