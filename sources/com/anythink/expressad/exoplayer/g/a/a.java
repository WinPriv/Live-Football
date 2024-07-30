package com.anythink.expressad.exoplayer.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.a;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0105a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.expressad.exoplayer.g.a.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
            return new a[i10];
        }

        private static a[] a(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f8024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8025b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8026c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8027d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8028e;
    public final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    private int f8029g;

    public a(String str, String str2, long j10, long j11, byte[] bArr, long j12) {
        this.f8024a = str;
        this.f8025b = str2;
        this.f8026c = j10;
        this.f8028e = j11;
        this.f = bArr;
        this.f8027d = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8027d == aVar.f8027d && this.f8026c == aVar.f8026c && this.f8028e == aVar.f8028e && af.a((Object) this.f8024a, (Object) aVar.f8024a) && af.a((Object) this.f8025b, (Object) aVar.f8025b) && Arrays.equals(this.f, aVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f8029g == 0) {
            String str = this.f8024a;
            int i11 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f8025b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            int i13 = (i12 + i11) * 31;
            long j10 = this.f8027d;
            int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f8026c;
            int i15 = (i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f8028e;
            this.f8029g = Arrays.hashCode(this.f) + ((i15 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
        }
        return this.f8029g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f8024a + ", id=" + this.f8028e + ", value=" + this.f8025b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8024a);
        parcel.writeString(this.f8025b);
        parcel.writeLong(this.f8027d);
        parcel.writeLong(this.f8026c);
        parcel.writeLong(this.f8028e);
        parcel.writeByteArray(this.f);
    }

    public a(Parcel parcel) {
        this.f8024a = parcel.readString();
        this.f8025b = parcel.readString();
        this.f8027d = parcel.readLong();
        this.f8026c = parcel.readLong();
        this.f8028e = parcel.readLong();
        this.f = parcel.createByteArray();
    }
}
