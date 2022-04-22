package com.example.musicstation.models

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject

@ParseClassName("Song")
class Song: ParseObject() {
    fun getTitle(): String? {
        return getString(KEY_TITLE)
    }

    fun setTitle(title: String) {
        put(KEY_TITLE, title)
    }

    fun getArtist(): ParseObject? {
        return getParseObject(KEY_ARTIST)
    }

    fun setArtist(artist: ParseObject) {
        put(KEY_ARTIST, artist)
    }

    fun getDuration(): Number? {
        return getNumber(KEY_DURATION)
    }

    fun setDuration(duration: Number) {
        put(KEY_DURATION, duration)
    }

    fun getYear(): Number? {
        return getNumber(KEY_YEAR)
    }

    fun setYear(year: Number) {
        put(KEY_YEAR, year)
    }

    fun getCover(): ParseFile? {
        return getParseFile(KEY_COVER)
    }

    fun setCover(cover: ParseFile) {
        put(KEY_COVER, cover)
    }

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_ARTIST = "artist"
        const val KEY_DURATION = "duration"
        const val KEY_YEAR = "year"
        const val KEY_COVER = "cover"
    }
}