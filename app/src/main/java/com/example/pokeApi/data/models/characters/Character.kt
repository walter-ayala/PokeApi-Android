package com.example.pokeApi.data.models.characters


import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Character(
    val name: String?,
    val url1: String="https://pokeres.bastionbot.org/images/pokemon/1.png",
    val url: String,
    val imagen: String=getImageUrl(url),
    val id: String= getID(url)
): Parcelable {

}

fun getImageUrl(url: String): String {
    val index = url!!.split("/".toRegex())!!.dropLast(1).last()
    return "https://pokeres.bastionbot.org/images/pokemon/$index.png"

}

fun getID(url: String): String {
    val index = url!!.split("/".toRegex())!!.dropLast(1).last()
    return index

}
