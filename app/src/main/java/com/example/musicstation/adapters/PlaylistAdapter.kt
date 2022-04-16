package com.example.musicstation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicstation.R
import com.example.musicstation.models.Playlist

class PlaylistAdapter(val context: Context, val playlists: MutableList<Playlist>): RecyclerView.Adapter<PlaylistAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_playlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = playlists.get(position)
        holder.bind(post)
    }

    override fun getItemCount(): Int {
        return playlists.size
    }

    // Clean all elements of the recycler
    fun clear() {
        playlists.clear()
        notifyDataSetChanged()
    }

    // Add a list of items -- change to type used
    fun addAll(tweetList: List<Playlist>) {
        playlists.addAll(tweetList)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val playlistImage: ImageView
        val playlistTitle: TextView
        val playlistAuthor: TextView

        init {
            playlistImage = itemView.findViewById(R.id.playlistImage)
            playlistTitle = itemView.findViewById(R.id.playlistTitle)
            playlistAuthor = itemView.findViewById(R.id.playlistAuthor)
        }

        fun bind(post: Playlist) {
//            tvDescription.text = post.getDescription()
//            tvUsername.text = post.getUser()?.username
//
//            Glide.with(itemView.context).load(post.getImage()?.url).into(ivImage)
        }
    }
}