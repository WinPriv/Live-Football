package com.anythink.expressad.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.s;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.expressad.exoplayer.g.c.a.1
        private static a a(Parcel parcel) {
            return new a(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel, (byte) 0);
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
    public final long f8086a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8087b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8088c;

    public /* synthetic */ a(Parcel parcel, byte b10) {
        this(parcel);
    }

    public static a a(s sVar, int i10, long j10) {
        long h10 = sVar.h();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        sVar.a(bArr, 0, i11);
        return new a(h10, bArr, j10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8086a);
        parcel.writeLong(this.f8087b);
        parcel.writeInt(this.f8088c.length);
        parcel.writeByteArray(this.f8088c);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f8086a = j11;
        this.f8087b = j10;
        this.f8088c = bArr;
    }

    private a(Parcel parcel) {
        this.f8086a = parcel.readLong();
        this.f8087b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f8088c = bArr;
        parcel.readByteArray(bArr);
    }
}
