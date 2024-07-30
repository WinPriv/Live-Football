package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.anythink.expressad.exoplayer.g.b.l.1
        private static l a(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ l[] newArray(int i10) {
            return new l[i10];
        }

        private static l[] a(int i10) {
            return new l[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f8084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8085b;

    public l(String str, String str2, String str3) {
        super(str);
        this.f8084a = str2;
        this.f8085b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f8074g.equals(lVar.f8074g) && af.a((Object) this.f8084a, (Object) lVar.f8084a) && af.a((Object) this.f8085b, (Object) lVar.f8085b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int b10 = e0.i.b(this.f8074g, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f8084a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (b10 + i10) * 31;
        String str2 = this.f8085b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": url=" + this.f8085b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8074g);
        parcel.writeString(this.f8084a);
        parcel.writeString(this.f8085b);
    }

    public l(Parcel parcel) {
        super(parcel.readString());
        this.f8084a = parcel.readString();
        this.f8085b = parcel.readString();
    }
}
