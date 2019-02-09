package com.androidapps.dagger2flavours

import android.content.Context

interface DataProviderSdk{
    fun initSdk(context:Context)
    fun createUser(user: User)
    fun  getUser() : User
    fun deleteUser()
    fun login(user: User)
    fun logout(user: User)
}