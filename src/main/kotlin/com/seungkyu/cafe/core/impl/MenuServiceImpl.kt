package com.seungkyu.cafe.core.impl

import com.seungkyu.cafe.core.MenuService
import com.seungkyu.cafe.persistence.entity.MenuEntity
import com.seungkyu.cafe.persistence.repository.CafeRepository
import com.seungkyu.cafe.persistence.repository.MenuRepository
import org.apache.coyote.BadRequestException
import org.springframework.stereotype.Service

@Service
class MenuServiceImpl(
    private val menuRepository: MenuRepository,
    private val cafeRepository: CafeRepository
): MenuService {

    override fun save(
        name: String,
        img: String,
        cafeName: String
    ): MenuEntity {
        val cafe = cafeRepository.findByName(name = cafeName)
        val menuEntity = MenuEntity(name = name, cafeId = cafe.id, img = img)
        return menuRepository.save(menuEntity)
    }

    override fun findByCafeId(cafeId: String): List<MenuEntity> {
        if(!cafeRepository.existsById(cafeId))
            throw BadRequestException()
        return menuRepository.findAllByCafeId(cafeId = cafeId)
    }

    override fun deleteByCafeName(cafeName: String) {
        val cafe = cafeRepository.findByName(cafeName)
        return menuRepository.deleteAllByCafeId(cafeId = cafe.id)
    }
}