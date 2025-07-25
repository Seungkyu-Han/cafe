package com.seungkyu.cafe.presentation.dto

import io.swagger.v3.oas.annotations.media.Schema

data class CreateCafeDto(
    @Schema(description = "카페의 이름")
    val name: String
)
