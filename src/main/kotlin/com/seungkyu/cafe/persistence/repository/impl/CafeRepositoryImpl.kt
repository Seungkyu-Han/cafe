package com.seungkyu.cafe.persistence.repository.impl

import com.seungkyu.cafe.persistence.entity.CafeEntity
import com.seungkyu.cafe.persistence.repository.CafeRepository
import org.apache.coyote.BadRequestException
import org.springframework.stereotype.Repository

@Repository
class CafeRepositoryImpl: CafeRepository {

    private val cafes = mutableListOf<CafeEntity>()

    override fun save(cafeEntity: CafeEntity): CafeEntity {
        cafes.removeIf { it.name == cafeEntity.name }
        cafes.add(cafeEntity)
        return cafeEntity
    }

    override fun findByName(name: String): CafeEntity {
        return cafes.find { it.name == name } ?: throw BadRequestException()
    }

    override fun findAll(): List<CafeEntity> {
        return cafes
    }

    override fun existsById(id: String): Boolean {
        return cafes.any { it.id == id }
    }
}