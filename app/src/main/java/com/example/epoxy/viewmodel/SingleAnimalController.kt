package com.example.epoxy.viewmodel

import com.airbnb.epoxy.EpoxyController
import com.example.epoxy.Animal.Animal
import com.example.epoxy.Animal.AnimalDataFactory
import com.example.epoxy.Animal.epoxy.SingleAnimalModel_

//import com.example.epoxy.Animal.epoxy.SingleAnimalModel_

class SingleAnimalController : EpoxyController(){

    var animalItems : List<Animal> = AnimalDataFactory.getAnimalItems(10)

    init {
        animalItems = AnimalDataFactory.getAnimalItems(10)
    }

    private var index = 0L

    override fun buildModels() = animalItems.forEach{
        SingleAnimalModel_(it)
            .id(index++)
            .addTo(this)
    }

}