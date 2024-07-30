package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.anythink.expressad.exoplayer.g.b.j.1
        private static j a(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ j[] newArray(int i10) {
            return new j[i10];
        }

        private static j[] a(int i10) {
            return new j[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8079a = "PRIV";

    /* renamed from: b, reason: collision with root package name */
    public final String f8080b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8081c;

    public j(String str, byte[] bArr) {
        super(f8079a);
        this.f8080b = str;
        this.f8081c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (af.a((Object) this.f8080b, (Object) jVar.f8080b) && Arrays.equals(this.f8081c, jVar.f8081c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f8080b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f8081c) + ((i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": owner=" + this.f8080b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8080b);
        parcel.writeByteArray(this.f8081c);
    }

    public j(Parcel parcel) {
        super(f8079a);
        this.f8080b = parcel.readString();
        this.f8081c = parcel.createByteArray();
    }
}
