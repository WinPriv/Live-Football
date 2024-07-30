package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.e.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15141c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15142d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15143e;

    /* renamed from: g, reason: collision with root package name */
    private final h[] f15144g;

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super(com.anythink.expressad.exoplayer.g.b.c.f8036a);
        this.f15139a = str;
        this.f15140b = i10;
        this.f15141c = i11;
        this.f15142d = j10;
        this.f15143e = j11;
        this.f15144g = hVarArr;
    }

    @Override // com.applovin.exoplayer2.g.e.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15140b == cVar.f15140b && this.f15141c == cVar.f15141c && this.f15142d == cVar.f15142d && this.f15143e == cVar.f15143e && ai.a((Object) this.f15139a, (Object) cVar.f15139a) && Arrays.equals(this.f15144g, cVar.f15144g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15140b) * 31) + this.f15141c) * 31) + ((int) this.f15142d)) * 31) + ((int) this.f15143e)) * 31;
        String str = this.f15139a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15139a);
        parcel.writeInt(this.f15140b);
        parcel.writeInt(this.f15141c);
        parcel.writeLong(this.f15142d);
        parcel.writeLong(this.f15143e);
        parcel.writeInt(this.f15144g.length);
        for (h hVar : this.f15144g) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public c(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.c.f8036a);
        this.f15139a = (String) ai.a(parcel.readString());
        this.f15140b = parcel.readInt();
        this.f15141c = parcel.readInt();
        this.f15142d = parcel.readLong();
        this.f15143e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f15144g = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f15144g[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
