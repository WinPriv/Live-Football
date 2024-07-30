package com.anythink.expressad.exoplayer.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.expressad.exoplayer.l.b.1
        private static b[] a() {
            return new b[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
            return new b[0];
        }

        private static b a(Parcel parcel) {
            return new b(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f9169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9171c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9172d;

    /* renamed from: e, reason: collision with root package name */
    private int f9173e;

    private b(int i10, int i11, int i12, byte[] bArr) {
        this.f9169a = i10;
        this.f9170b = i11;
        this.f9171c = i12;
        this.f9172d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9169a == bVar.f9169a && this.f9170b == bVar.f9170b && this.f9171c == bVar.f9171c && Arrays.equals(this.f9172d, bVar.f9172d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9173e == 0) {
            this.f9173e = Arrays.hashCode(this.f9172d) + ((((((this.f9169a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f9170b) * 31) + this.f9171c) * 31);
        }
        return this.f9173e;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f9169a);
        sb2.append(", ");
        sb2.append(this.f9170b);
        sb2.append(", ");
        sb2.append(this.f9171c);
        sb2.append(", ");
        if (this.f9172d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10;
        parcel.writeInt(this.f9169a);
        parcel.writeInt(this.f9170b);
        parcel.writeInt(this.f9171c);
        if (this.f9172d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        af.a(parcel, z10);
        byte[] bArr = this.f9172d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f9169a = parcel.readInt();
        this.f9170b = parcel.readInt();
        this.f9171c = parcel.readInt();
        this.f9172d = af.a(parcel) ? parcel.createByteArray() : null;
    }
}
