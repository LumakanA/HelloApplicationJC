package com.example.helloapplicationjc.domain

import kotlin.random.Random

class RandomNumber {
    fun execute(): Int {
        return Random.nextInt(101)
    }
}