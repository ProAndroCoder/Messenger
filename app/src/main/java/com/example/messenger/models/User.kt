package com.example.messenger.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


//Bu classın nesnesinin diğer activitylere gönderilebilmesi için Parcelable olması gerekiyor. Bunu da kalıtım ve de eklentiyle yapıyoruz.
@Parcelize
class User(val profileImageUrl: String, val uid: String, val username: String) : Parcelable {
    constructor() : this("", "", "")
}