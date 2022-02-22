package edu.temple.imageactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_ImageObject : Array<ImageObject>, func : (ImageObject)->Unit) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

    val ImageObjects = _ImageObject
    val evenhandler = func

    inner class ImageViewHolder(_view: View) : RecyclerView.ViewHolder(_view) {
        val ImageText = _view.findViewById<TextView>(R.id.name)
        val Image = _view.findViewById<View>(R.id.image)

        lateinit var imageObject: ImageObject
        init {
            _view.setOnClickListener{evenhandler(imageObject)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_layout, parent, false)
        return ImageViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.ImageText.text = ImageObjects[position].name
        holder.Image.setBackgroundResource(ImageObjects[position].drawable)
        holder.imageObject = ImageObjects[position]
    }

    override fun getItemCount(): Int {
        return ImageObjects.size
    }
}