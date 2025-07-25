package com.seungkyu.cafe.persistence.repository

import com.seungkyu.cafe.persistence.entity.CafeEntity

interface CafeRepository {

    fun save(cafeEntity: CafeEntity): CafeEntity

    fun findAll(): List<CafeEntity>

    fun findByName(name: String): CafeEntity

    fun existsById(id: String): Boolean
}