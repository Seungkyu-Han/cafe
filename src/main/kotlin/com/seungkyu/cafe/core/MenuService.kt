package com.seungkyu.cafe.core

import com.seungkyu.cafe.persistence.entity.MenuEntity

interface MenuService {

    fun save(name: String, img: String, cafeName: String): MenuEntity

    fun findByCafeName(cafeName: String): List<MenuEntity>

    fun deleteByCafeName(cafeName: String)
}