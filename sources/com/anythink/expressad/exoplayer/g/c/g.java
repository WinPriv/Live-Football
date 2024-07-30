package com.anythink.expressad.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.ac;
import com.anythink.expressad.exoplayer.k.s;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.anythink.expressad.exoplayer.g.c.g.1
        private static g a(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ g[] newArray(int i10) {
            return new g[i10];
        }

        private static g[] a(int i10) {
            return new g[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f8124a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8125b;

    public /* synthetic */ g(long j10, long j11, byte b10) {
        this(j10, j11);
    }

    public static g a(s sVar, long j10, ac acVar) {
        long a10 = a(sVar, j10);
        return new g(a10, acVar.a(a10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8124a);
        parcel.writeLong(this.f8125b);
    }

    private g(long j10, long j11) {
        this.f8124a = j10;
        this.f8125b = j11;
    }

    public static long a(s sVar, long j10) {
        long d10 = sVar.d();
        return (128 & d10) != 0 ? 8589934591L & ((((d10 & 1) << 32) | sVar.h()) + j10) : com.anythink.expressad.exoplayer.b.f7291b;
    }
}
