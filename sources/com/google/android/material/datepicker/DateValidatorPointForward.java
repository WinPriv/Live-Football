package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final long f20656s;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DateValidatorPointForward[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    }

    public DateValidatorPointForward(long j10) {
        this.f20656s = j10;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean b(long j10) {
        if (j10 >= this.f20656s) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.f20656s == ((DateValidatorPointForward) obj).f20656s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20656s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f20656s);
    }
}
