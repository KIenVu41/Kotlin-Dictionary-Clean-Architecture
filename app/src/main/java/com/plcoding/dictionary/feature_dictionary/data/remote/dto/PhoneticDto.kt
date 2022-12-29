package com.plcoding.dictionary.feature_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PhoneticDto(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)