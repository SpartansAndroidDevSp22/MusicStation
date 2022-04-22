package com.example.musicstation.models

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject
import com.parse.ParseUser

@ParseClassName("Playlist")
class Playlist: ParseObject() {
    fun getName(): String? {
        return getString(KEY_NAME)
    }

    fun setName(name: String) {
        put(KEY_NAME, name)
    }

    fun getAuthor(): ParseUser? {
        return getParseUser(KEY_AUTHOR)
    }

    fun setAuthor(author: ParseUser) {
        put(KEY_AUTHOR, author)
    }

    fun getArtist(): ParseObject? {
        return getParseObject(KEY_ARTIST)
    }

    fun setArtist(artist: ParseObject) {
        put(KEY_ARTIST, artist)
    }

    fun getSongs(): List<Song>? {
        return getList(KEY_SONGS)
    }

    fun setSongs(songs: List<Song>) {
        put(KEY_SONGS, songs)
    }

    fun getCover(): ParseFile? {
        return getParseFile(KEY_COVER)
    }

    fun setCover(cover: ParseFile) {
        put(KEY_COVER, cover)
    }

    companion object {
        const val KEY_NAME = "name"
        const val KEY_AUTHOR = "author"
        const val KEY_ARTIST = "artist"
        const val KEY_SONGS = "songs"
        const val KEY_COVER = "cover"
    }
}