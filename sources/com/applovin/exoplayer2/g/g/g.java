package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.applovin.exoplayer2.g.g.g.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f15236a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15237b;

    public static g a(y yVar, long j10, ag agVar) {
        long a10 = a(yVar, j10);
        return new g(a10, agVar.b(a10));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15236a);
        parcel.writeLong(this.f15237b);
    }

    private g(long j10, long j11) {
        this.f15236a = j10;
        this.f15237b = j11;
    }

    public static long a(y yVar, long j10) {
        long h10 = yVar.h();
        return (128 & h10) != 0 ? 8589934591L & ((((h10 & 1) << 32) | yVar.o()) + j10) : com.anythink.expressad.exoplayer.b.f7291b;
    }
}
