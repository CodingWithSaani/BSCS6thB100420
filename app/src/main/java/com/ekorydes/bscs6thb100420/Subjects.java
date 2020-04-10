package com.ekorydes.bscs6thb100420;

import android.os.Parcel;
import android.os.Parcelable;

public class Subjects implements Parcelable {

    public Subjects() {
    }

    private String subjectName;

    protected Subjects(Parcel in) {
        subjectName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(subjectName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Subjects> CREATOR = new Creator<Subjects>() {
        @Override
        public Subjects createFromParcel(Parcel in) {
            return new Subjects(in);
        }

        @Override
        public Subjects[] newArray(int size) {
            return new Subjects[size];
        }
    };

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
