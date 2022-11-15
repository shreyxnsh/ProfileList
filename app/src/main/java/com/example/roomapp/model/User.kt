package com.example.roomapp.model

import android.os.Parcelable
import android.widget.ImageView
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
//    val imageView: ImageView,
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int
): Parcelable