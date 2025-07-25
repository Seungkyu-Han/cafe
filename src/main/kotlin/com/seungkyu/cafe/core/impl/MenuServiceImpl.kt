package com.seungkyu.cafe.core.impl

import com.seungkyu.cafe.core.MenuService
import com.seungkyu.cafe.persistence.entity.MenuEntity
import com.seungkyu.cafe.persistence.repository.CafeRepository
import com.seungkyu.cafe.persistence.repository.MenuRepository
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

    override fun findByCafeName(cafeName: String): List<MenuEntity> {
        val cafe = cafeRepository.findByName(name = cafeName)
        return menuRepository.findAllByCafeId(cafeId = cafe.id)
    }

    override fun deleteByCafeName(cafeName: String) {
        val cafe = cafeRepository.findByName(cafeName)
        return menuRepository.deleteAllByCafeId(cafeId = cafe.id)
    }
}