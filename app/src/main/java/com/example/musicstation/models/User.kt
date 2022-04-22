package com.example.musicstation.models

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject

@ParseClassName("User")
class User: ParseObject() {
    fun getFirstName(): String? {
        return getString(KEY_FIRSTNAME)
    }

    fun setFirstName(firstName: String) {
        put(KEY_FIRSTNAME, firstName)
    }

    fun getLastName(): String? {
        return getString(KEY_LASTNAME)
    }

    fun setLastName(lastName: String) {
        put(KEY_LASTNAME, lastName)
    }

    fun getLikedSongs(): List<Song>? {
        return getList(KEY_LIKEDSONGS)
    }

    fun setLikedSongs(likedSongs: List<Song>) {
        put(KEY_LIKEDSONGS, likedSongs)
    }

    fun getPlaylists(): List<Playlist>? {
        return getList(KEY_PLAYLISTS)
    }

    fun setPlaylists(playlists: List<Playlist>) {
        put(KEY_PLAYLISTS, playlists)
    }

    fun getAvatar(): ParseFile? {
        return getParseFile(KEY_AVATAR)
    }

    fun setAvatar(avatar: ParseFile) {
        put(KEY_AVATAR, avatar)
    }

    companion object {
        const val KEY_FIRSTNAME = "firstName"
        const val KEY_LASTNAME = "lastName"
        const val KEY_LIKEDSONGS = "likedSongs"
        const val KEY_PLAYLISTS = "playlists"
        const val KEY_AVATAR = "avatar"
    }
}