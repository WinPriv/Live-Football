package com.google.android.exoplayer2.metadata.dvbsi;

import a3.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f19999s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20000t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new AppInfoTable(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i10) {
            return new AppInfoTable[i10];
        }
    }

    public AppInfoTable(int i10, String str) {
        this.f19999s = i10;
        this.f20000t = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f19999s);
        sb2.append(",url=");
        return l.p(sb2, this.f20000t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20000t);
        parcel.writeInt(this.f19999s);
    }
}
