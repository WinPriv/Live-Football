package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.anythink.expressad.exoplayer.g.b.c.1
        private static c a(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ c[] newArray(int i10) {
            return new c[i10];
        }

        private static c[] a(int i10) {
            return new c[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8036a = "CHAP";

    /* renamed from: b, reason: collision with root package name */
    public final String f8037b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8038c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8039d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8040e;
    public final long f;

    /* renamed from: h, reason: collision with root package name */
    private final h[] f8041h;

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super(f8036a);
        this.f8037b = str;
        this.f8038c = i10;
        this.f8039d = i11;
        this.f8040e = j10;
        this.f = j11;
        this.f8041h = hVarArr;
    }

    private int a() {
        return this.f8041h.length;
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f8038c == cVar.f8038c && this.f8039d == cVar.f8039d && this.f8040e == cVar.f8040e && this.f == cVar.f && af.a((Object) this.f8037b, (Object) cVar.f8037b) && Arrays.equals(this.f8041h, cVar.f8041h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((this.f8038c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f8039d) * 31) + ((int) this.f8040e)) * 31) + ((int) this.f)) * 31;
        String str = this.f8037b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8037b);
        parcel.writeInt(this.f8038c);
        parcel.writeInt(this.f8039d);
        parcel.writeLong(this.f8040e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.f8041h.length);
        for (h hVar : this.f8041h) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i10) {
        return this.f8041h[i10];
    }

    public c(Parcel parcel) {
        super(f8036a);
        this.f8037b = parcel.readString();
        this.f8038c = parcel.readInt();
        this.f8039d = parcel.readInt();
        this.f8040e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f8041h = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f8041h[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
