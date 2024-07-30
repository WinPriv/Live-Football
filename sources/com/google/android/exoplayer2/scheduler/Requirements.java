package com.google.android.exoplayer2.scheduler;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f20119s;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    public Requirements(int i10) {
        this.f20119s = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Requirements.class != obj.getClass()) {
            return false;
        }
        if (this.f20119s == ((Requirements) obj).f20119s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20119s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20119s);
    }
}
