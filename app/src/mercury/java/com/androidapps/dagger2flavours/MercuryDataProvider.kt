package com.androidapps.dagger2flavours

import android.content.Context

class MercuryDataProvider:DataProviderSdk{
    override fun initSdk(context: Context) {
    }

    override fun createUser(user: User) {
    }

    override fun getUser(): User {
        return MercuryUser("mercury",1,"mercycier@mer.com",3287324L)
    }

    override fun deleteUser() {
    }

    override fun login(user: User) {
    }

    override fun logout(user: User) {
    }

}