package com.singh.harsukh.yqlapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by harsukh on 2/1/16.
 */
public class Results implements Parcelable {
    String title;
    String address;
    String city;
    String state;
    String phone;
    double longitude;
    double latitude;
    String distance;
    String businessURL;


    public Results(String title, String address, String city, String state, String phone, double longitude, double latitude, String distance, String businessURL) {
        this.title = title;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.longitude = longitude;
        this.latitude = latitude;
        this.distance = distance;
        this.businessURL = businessURL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)//members to write to the parcel object
    {
        dest.writeString(title);
        dest.writeString(address);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeString(phone);
        dest.writeDouble(longitude);
        dest.writeDouble(latitude);
        dest.writeString(distance);
        dest.writeString(businessURL);
    }

    protected Results(Parcel in) {
        title = in.readString();
        address = in.readString();
        city = in.readString();
        state = in.readString();
        phone = in.readString();
        longitude = in.readDouble();
        latitude = in.readDouble();
        distance = in.readString();
        businessURL = in.readString();
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Results> CREATOR = new Parcelable.Creator<Results>() {
        @Override
        public Results createFromParcel(Parcel in) {
            return new Results(in);
        }

        @Override
        public Results[] newArray(int size) {
            return new Results[size];
        }
    };
}
