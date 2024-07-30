package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.expressad.exoplayer.g.b.e.1
        private static e a(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e[] newArray(int i10) {
            return new e[i10];
        }

        private static e[] a(int i10) {
            return new e[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8047a = "COMM";

    /* renamed from: b, reason: collision with root package name */
    public final String f8048b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8049c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8050d;

    public e(String str, String str2, String str3) {
        super(f8047a);
        this.f8048b = str;
        this.f8049c = str2;
        this.f8050d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f8049c, (Object) eVar.f8049c) && af.a((Object) this.f8048b, (Object) eVar.f8048b) && af.a((Object) this.f8050d, (Object) eVar.f8050d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.f8048b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f8049c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f8050d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": language=" + this.f8048b + ", description=" + this.f8049c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8074g);
        parcel.writeString(this.f8048b);
        parcel.writeString(this.f8050d);
    }

    public e(Parcel parcel) {
        super(f8047a);
        this.f8048b = parcel.readString();
        this.f8049c = parcel.readString();
        this.f8050d = parcel.readString();
    }
}
