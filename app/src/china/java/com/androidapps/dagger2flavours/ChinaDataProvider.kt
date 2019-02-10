package com.androidapps.dagger2flavours

import android.content.Context

class ChinaDataProvider:DataProviderSdk{
    override fun initSdk(context: Context) {
    }

    override fun createUser(user: User) {
    }

    override fun getUser(): User {
        return ChinaUser("jsdkf",434,"sdhfjdf@sdjfds.com",23873289L)
    }

    override fun deleteUser() {
    }

    override fun login(user: User) {
    }

    override fun logout(user: User) {
    }

}