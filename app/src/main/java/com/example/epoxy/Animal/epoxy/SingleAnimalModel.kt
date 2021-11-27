package com.example.epoxy.Animal.epoxy
//package com.airbnb.epoxy.sample


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxy.R
import com.example.epoxy.Animal.Animal
import com.example.epoxy.Animal.epoxy.KotlinHolder

@EpoxyModelClass(layout = R.layout.item_list)
abstract class SingleAnimalModel (@EpoxyAttribute var animal: Animal) :     EpoxyModelWithHolder<SingleAnimalModel.AnimalHolder>(){


    override fun bind(holder: AnimalHolder) {
        holder.imageView?.setImageResource(animal.image)
        holder.titleView?.text = animal.title
        holder.descView?.text= animal.desc
    }

    inner class AnimalHolder : KotlinHolder(){

        val imageView by bind<ImageView>(R.id.image)
        val titleView by bind<TextView>(R.id.title)
        val descView by bind<TextView>(R.id.desc)

    }
}