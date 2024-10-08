package com.nav.paging3demo.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nav.paging3demo.util.Constants
import kotlinx.serialization.Serializable


@Entity(tableName = Constants.UNSPLASH_IMAGE_TABLE)
@Serializable
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
)
