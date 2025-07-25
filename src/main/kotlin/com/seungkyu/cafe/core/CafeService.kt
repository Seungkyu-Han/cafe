package com.seungkyu.cafe.core

import com.seungkyu.cafe.persistence.entity.CafeEntity

interface CafeService {

    fun save(name: String, img: String): CafeEntity

    fun findAll(): List<CafeEntity>
}