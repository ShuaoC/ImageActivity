package edu.temple.imageactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_ImageObject : Array<ImageObject>, _myFunc : (ImageObject)->Unit) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

    val ImageObjects = _ImageObject
    val myEventHandlingFunc = _myFunc

    inner class ImageViewHolder(_view: View) : RecyclerView.ViewHolder(_view) {
        val ImageText = _view.findViewById<TextView>(R.id.textView2)
        val Image = _view.findViewById<View>(R.id.imageView2)

        lateinit var imageObject: ImageObject
        init {
            _view.setOnClickListener{myEventHandlingFunc(imageObject)}
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