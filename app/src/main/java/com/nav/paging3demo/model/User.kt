package com.nav.paging3demo.model

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("links")
    @Embedded
    val userLink: UserLinks,
    val userName: String
)
