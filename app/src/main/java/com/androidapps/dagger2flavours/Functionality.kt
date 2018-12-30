package com.androidapps.dagger2flavours

interface Functionality {
    fun init()
    fun prepare()
    fun execute()
    fun persist()
    fun delete()
    fun exit()
}