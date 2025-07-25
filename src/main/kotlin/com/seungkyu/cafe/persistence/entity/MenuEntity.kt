package com.seungkyu.cafe.persistence.entity

import java.util.UUID

data class MenuEntity(
    val id: String = UUID.randomUUID().toString(),

    val cafeId: String,

    val name: String,

    val img: String
)