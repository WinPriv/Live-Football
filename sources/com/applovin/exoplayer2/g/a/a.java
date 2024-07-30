package com.applovin.exoplayer2.g.a;

import a3.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.g.a;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0172a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.a.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) com.applovin.exoplayer2.l.a.b(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f15102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15103b;

    public a(int i10, String str) {
        this.f15102a = i10;
        this.f15103b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f15102a);
        sb2.append(",url=");
        return l.p(sb2, this.f15103b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15103b);
        parcel.writeInt(this.f15102a);
    }
}
