package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e0.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0172a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.f.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15185a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15186b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15188d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15185a.equals(aVar.f15185a) && Arrays.equals(this.f15186b, aVar.f15186b) && this.f15187c == aVar.f15187c && this.f15188d == aVar.f15188d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f15186b) + i.b(this.f15185a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f15187c) * 31) + this.f15188d;
    }

    public String toString() {
        return "mdta: key=" + this.f15185a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15185a);
        parcel.writeByteArray(this.f15186b);
        parcel.writeInt(this.f15187c);
        parcel.writeInt(this.f15188d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f15185a = str;
        this.f15186b = bArr;
        this.f15187c = i10;
        this.f15188d = i11;
    }

    private a(Parcel parcel) {
        this.f15185a = (String) ai.a(parcel.readString());
        this.f15186b = (byte[]) ai.a(parcel.createByteArray());
        this.f15187c = parcel.readInt();
        this.f15188d = parcel.readInt();
    }
}
