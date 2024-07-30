package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.g.a;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0172a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.f.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f15189a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15190b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15191c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15192d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15193e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15189a == bVar.f15189a && this.f15190b == bVar.f15190b && this.f15191c == bVar.f15191c && this.f15192d == bVar.f15192d && this.f15193e == bVar.f15193e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.b.d.a(this.f15193e) + ((com.applovin.exoplayer2.common.b.d.a(this.f15192d) + ((com.applovin.exoplayer2.common.b.d.a(this.f15191c) + ((com.applovin.exoplayer2.common.b.d.a(this.f15190b) + ((com.applovin.exoplayer2.common.b.d.a(this.f15189a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f15189a + ", photoSize=" + this.f15190b + ", photoPresentationTimestampUs=" + this.f15191c + ", videoStartPosition=" + this.f15192d + ", videoSize=" + this.f15193e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15189a);
        parcel.writeLong(this.f15190b);
        parcel.writeLong(this.f15191c);
        parcel.writeLong(this.f15192d);
        parcel.writeLong(this.f15193e);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15189a = j10;
        this.f15190b = j11;
        this.f15191c = j12;
        this.f15192d = j13;
        this.f15193e = j14;
    }

    private b(Parcel parcel) {
        this.f15189a = parcel.readLong();
        this.f15190b = parcel.readLong();
        this.f15191c = parcel.readLong();
        this.f15192d = parcel.readLong();
        this.f15193e = parcel.readLong();
    }
}
