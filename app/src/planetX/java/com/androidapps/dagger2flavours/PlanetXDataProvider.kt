package com.androidapps.dagger2flavours

import android.content.Context
import com.androidapps.dagger2flavours.injection.qualifiers.ApplicationContext

class PlanetXDataProvider() : DataProviderSdk {

    override fun initSdk(context: Context) {

    }

    override fun createUser(user: User) {

    }

    override fun getUser(): User {
        return  PlanetXUser("",1,"sddsf@dsd. com",377373L)
    }

    override fun deleteUser() {

    }

    override fun login(user: User) {

    }

    override fun logout(user: User) {

    }
}
