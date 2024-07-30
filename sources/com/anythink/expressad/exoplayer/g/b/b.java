package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.expressad.exoplayer.g.b.b.1
        private static b a(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
            return new b[i10];
        }

        private static b[] a(int i10) {
            return new b[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8035a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f8035a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8074g.equals(bVar.f8074g) && Arrays.equals(this.f8035a, bVar.f8035a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8035a) + e0.i.b(this.f8074g, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8074g);
        parcel.writeByteArray(this.f8035a);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f8035a = parcel.createByteArray();
    }
}
