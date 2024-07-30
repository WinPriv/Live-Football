package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.anythink.expressad.exoplayer.g.b.k.1
        private static k a(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ k[] newArray(int i10) {
            return new k[i10];
        }

        private static k[] a(int i10) {
            return new k[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f8082a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8083b;

    public k(String str, String str2, String str3) {
        super(str);
        this.f8082a = str2;
        this.f8083b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f8074g.equals(kVar.f8074g) && af.a((Object) this.f8082a, (Object) kVar.f8082a) && af.a((Object) this.f8083b, (Object) kVar.f8083b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int b10 = e0.i.b(this.f8074g, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f8082a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (b10 + i10) * 31;
        String str2 = this.f8083b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": value=" + this.f8083b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8074g);
        parcel.writeString(this.f8082a);
        parcel.writeString(this.f8083b);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f8082a = parcel.readString();
        this.f8083b = parcel.readString();
    }
}
