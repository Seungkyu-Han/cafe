package com.seungkyu.cafe.presentation.controller

import com.seungkyu.cafe.core.CafeService
import com.seungkyu.cafe.persistence.entity.CafeEntity
import com.seungkyu.cafe.presentation.dto.CreateCafeDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cafes")
class CafeController(
    private val cafeService: CafeService
){

    @PostMapping
    fun create(@RequestBody createCafeDto: CreateCafeDto): CafeEntity{
        return cafeService.save(name = createCafeDto.name)
    }

    @GetMapping
    fun getAll(): List<CafeEntity>{
        return cafeService.findAll()
    }

}