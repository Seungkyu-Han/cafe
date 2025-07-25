package com.seungkyu.cafe.core.impl

import com.seungkyu.cafe.core.CafeService
import com.seungkyu.cafe.persistence.entity.CafeEntity
import com.seungkyu.cafe.persistence.repository.CafeRepository
import org.springframework.stereotype.Service

@Service
class CafeServiceImpl(
    private val cafeRepository: CafeRepository
): CafeService{

    override fun save(name: String, img: String): CafeEntity {
        val cafeEntity = CafeEntity(name = name, img = img)
        return cafeRepository.save(cafeEntity)
    }

    override fun findAll(): List<CafeEntity> {
        return cafeRepository.findAll()
    }

}