package com.ekorydes.bscs6thb100420;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable{

    private int roll;
    private String name;
    private Subjects madSubject;

    public Student() {
    }


    protected Student(Parcel in) {
        roll = in.readInt();
        name = in.readString();
        madSubject = in.readParcelable(Subjects.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(roll);
        dest.writeString(name);
        dest.writeParcelable(madSubject, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subjects getMadSubject() {
        return madSubject;
    }

    public void setMadSubject(Subjects madSubject) {
        this.madSubject = madSubject;
    }
}
