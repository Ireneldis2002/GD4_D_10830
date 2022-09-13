package com.dabin.data_binding_10830

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random
import kotlin.random.nextInt

object FakeRepository {
    private val friutNames: List<String> = listOf(
        "Pir","mangga","Pisang","Anggur","Stroberi",
        "Jambu","Raspberi","Bambu","Kiwi","Apel"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = friutNames.first()
    }

    fun getRandomfruitName(): String {
        val random = Random.nextInt(friutNames.size)
        return friutNames[random]
    }

    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomfruitName()
    }
}