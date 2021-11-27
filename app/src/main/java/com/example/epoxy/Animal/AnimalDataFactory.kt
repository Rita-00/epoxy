package com.example.epoxy.Animal

import androidx.annotation.StringRes
import com.example.epoxy.R
import java.util.*

object AnimalDataFactory{

    //region Random Data Generators
    private val random = Random()

    private val titles = arrayListOf<String>("Luna", "Erin", "Isha", "Loki", "Mia", "Cori", "Mandy")
    private val descs = arrayListOf<String>("Affectionate", "Stubborn", "Ambitious", "Calm")

    private fun randomTitle() : String {
        val title = random.nextInt(7)
        return titles[title]
    }
    private fun randomDesc() : String {
        val desc = random.nextInt(4)
        return descs[desc]
    }

    private fun randomPicture() : Int{
        val grid = random.nextInt(7)

        return when(grid) {
            0 -> R.drawable.cat
            1 -> R.drawable.cat1
            2 -> R.drawable.cat2
            3 -> R.drawable.cat3
            4 -> R.drawable.cat4
            5 -> R.drawable.cat5
            6 -> R.drawable.cat6
            else -> R.drawable.cat7
        }
    }
    //endregion

    fun getAnimalItems(count:Int) : List<Animal>{
        var animalItems = mutableListOf<Animal>()
        repeat(count){
            val image = randomPicture()
            val title = randomTitle()
            val desc = randomDesc()
            animalItems.add(Animal(image,title,desc))
        }
        return animalItems
    }
}