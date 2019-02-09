package com.androidapps.dagger2flavours

import android.content.Context

class PlanetXDataProvider : DataProviderSdk {
    override fun initSdk(context: Context) {
    }

    override fun createUser(user: User) {

    }

    override fun getUser(): User {
        return  PlanetXUser("",1,"sddsf",377373L)
    }

    override fun deleteUser() {

    }

    override fun login(user: User) {

    }

    override fun logout(user: User) {

    }
}
