package com.seungkyu.cafe.presentation.controller

import com.seungkyu.cafe.core.MenuService
import com.seungkyu.cafe.persistence.entity.MenuEntity
import com.seungkyu.cafe.presentation.dto.CreateMenuDto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/menus")
class MenuController(
    private val menuService: MenuService
) {

    @PostMapping
    fun create(@RequestBody createMenuDto: CreateMenuDto): MenuEntity{
        return menuService.save(name = createMenuDto.name, img = createMenuDto.img, cafeName = createMenuDto.cafeName)
    }

    @GetMapping()
    fun getAll(@RequestParam cafeName: String): List<MenuEntity>{
        return menuService.findByCafeName(cafeName)
    }

    @DeleteMapping()
    fun delete(@RequestParam cafeName: String){
        return menuService.deleteByCafeName(cafeName)
    }
}