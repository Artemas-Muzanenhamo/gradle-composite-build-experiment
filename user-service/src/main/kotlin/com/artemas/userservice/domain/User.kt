package com.artemas.userservice.domain

import java.util.UUID

data class User(
    val id: UUID,
    val name: String,
    val surname: String,
    val greeting: String? = null
)