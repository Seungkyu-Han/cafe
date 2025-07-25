package com.seungkyu.cafe.persistence.entity

import java.util.UUID

data class CafeEntity(
    val id: String = UUID.randomUUID().toString(),

    val name: String
)
