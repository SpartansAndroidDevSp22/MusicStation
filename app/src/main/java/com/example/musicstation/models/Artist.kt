package com.example.musicstation.models

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject

@ParseClassName("Artist")
class Artist: ParseObject() {
    fun getName(): String? {
        return getString(KEY_NAME)
    }

    fun setName(name: String) {
        put(KEY_NAME, name)
    }

    fun getGenre(): String? {
        return getString(KEY_GENRE)
    }

    fun setGenre(genre: String) {
        put(KEY_GENRE, genre)
    }

    fun getSongs(): List<Song>? {
        return getList(KEY_SONGS)
    }

    fun setSongs(songs: List<Song>) {
        put(KEY_SONGS, songs)
    }

    fun getAlbums(): List<Playlist>? {
        return getList(KEY_ALBUMS)
    }

    fun setAlbums(albums: List<Playlist>) {
        put(KEY_ALBUMS, albums)
    }

    fun getAvatar(): ParseFile? {
        return getParseFile(KEY_AVATAR)
    }

    fun setAvatar(avatar: ParseFile) {
        put(KEY_AVATAR, avatar)
    }

    companion object {
        const val KEY_NAME = "name"
        const val KEY_GENRE = "genre"
        const val KEY_SONGS = "songs"
        const val KEY_ALBUMS = "albums"
        const val KEY_AVATAR = "avatar"
    }
}