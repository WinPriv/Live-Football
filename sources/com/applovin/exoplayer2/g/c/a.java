package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e0.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0172a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.c.a.1
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
    public final int f15114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15117d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15118e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15119g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f15120h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f15114a = i10;
        this.f15115b = str;
        this.f15116c = str2;
        this.f15117d = i11;
        this.f15118e = i12;
        this.f = i13;
        this.f15119g = i14;
        this.f15120h = bArr;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public void a(ac.a aVar) {
        aVar.a(this.f15120h, this.f15114a);
    }

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
        if (this.f15114a == aVar.f15114a && this.f15115b.equals(aVar.f15115b) && this.f15116c.equals(aVar.f15116c) && this.f15117d == aVar.f15117d && this.f15118e == aVar.f15118e && this.f == aVar.f && this.f15119g == aVar.f15119g && Arrays.equals(this.f15120h, aVar.f15120h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15120h) + ((((((((i.b(this.f15116c, i.b(this.f15115b, (this.f15114a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f15117d) * 31) + this.f15118e) * 31) + this.f) * 31) + this.f15119g) * 31);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f15115b + ", description=" + this.f15116c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15114a);
        parcel.writeString(this.f15115b);
        parcel.writeString(this.f15116c);
        parcel.writeInt(this.f15117d);
        parcel.writeInt(this.f15118e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f15119g);
        parcel.writeByteArray(this.f15120h);
    }

    public a(Parcel parcel) {
        this.f15114a = parcel.readInt();
        this.f15115b = (String) ai.a(parcel.readString());
        this.f15116c = (String) ai.a(parcel.readString());
        this.f15117d = parcel.readInt();
        this.f15118e = parcel.readInt();
        this.f = parcel.readInt();
        this.f15119g = parcel.readInt();
        this.f15120h = (byte[]) ai.a(parcel.createByteArray());
    }
}
