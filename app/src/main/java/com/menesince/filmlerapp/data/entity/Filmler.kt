package com.menesince.filmlerapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity("filmler")
data class Filmler (
 @PrimaryKey(autoGenerate = true) @ColumnInfo("id") @NotNull var id : Int ,
 @ColumnInfo("ad") @NotNull var ad : String ,
 @ColumnInfo("image") @NotNull var image : String ,
 @ColumnInfo("fiyat") @NotNull var fiyat : Int) : Serializable{


}