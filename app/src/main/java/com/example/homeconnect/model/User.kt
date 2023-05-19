package com.example.homeconnect.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userid")
    val userid: Long,
    @SerializedName("username")
    val username: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("userType")
    val userType: Int,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("salt")
    val salt: String
) : Parcelable{

    constructor(parcel: Parcel) : this(
        parcel.readLong(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ){

    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeLong(userid)
        dest?.writeString(username)
        dest?.writeString(email)
        dest?.writeString(password)
        dest?.writeInt(userType)
        dest?.writeString(phoneNumber)
        dest?.writeString(address)
        dest?.writeString(salt)
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}
