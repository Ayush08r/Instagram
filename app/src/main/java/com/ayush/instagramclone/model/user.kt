package com.ayush.instagramclone.model

import android.os.Parcel
import android.os.Parcelable

data class user(
    val Cid:Int? = null,
    val Fname:String? = null,
    val Lname:String? = null,
    val Username:String? = null,
    val Password:String? = null,
    val Batch:String? = null,
    val profile:String?=null
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(Cid)
        parcel.writeString(Fname)
        parcel.writeString(Lname)
        parcel.writeString(Username)
        parcel.writeString(Password)
        parcel.writeString(Batch)
        parcel.writeString(profile)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<user> {
        override fun createFromParcel(parcel: Parcel): user {
            return user(parcel)
        }

        override fun newArray(size: Int): Array<user?> {
            return arrayOfNulls(size)
        }
    }
}