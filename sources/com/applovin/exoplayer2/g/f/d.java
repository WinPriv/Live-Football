package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.g.a;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class d implements a.InterfaceC0172a {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.f.d.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final float f15199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15200b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15199a == dVar.f15199a && this.f15200b == dVar.f15200b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((com.applovin.exoplayer2.common.b.b.a(this.f15199a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f15200b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f15199a + ", svcTemporalLayerCount=" + this.f15200b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f15199a);
        parcel.writeInt(this.f15200b);
    }

    public d(float f, int i10) {
        this.f15199a = f;
        this.f15200b = i10;
    }

    private d(Parcel parcel) {
        this.f15199a = parcel.readFloat();
        this.f15200b = parcel.readInt();
    }
}
