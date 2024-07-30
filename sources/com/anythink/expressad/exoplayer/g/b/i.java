package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.anythink.expressad.exoplayer.g.b.i.1
        private static i a(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ i[] newArray(int i10) {
            return new i[i10];
        }

        private static i[] a(int i10) {
            return new i[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8075a = "----";

    /* renamed from: b, reason: collision with root package name */
    public final String f8076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8077c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8078d;

    public i(String str, String str2, String str3) {
        super(f8075a);
        this.f8076b = str;
        this.f8077c = str2;
        this.f8078d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (af.a((Object) this.f8077c, (Object) iVar.f8077c) && af.a((Object) this.f8076b, (Object) iVar.f8076b) && af.a((Object) this.f8078d, (Object) iVar.f8078d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.f8076b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f8077c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f8078d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": domain=" + this.f8076b + ", description=" + this.f8077c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8074g);
        parcel.writeString(this.f8076b);
        parcel.writeString(this.f8078d);
    }

    public i(Parcel parcel) {
        super(f8075a);
        this.f8076b = (String) com.anythink.expressad.exoplayer.k.a.a(parcel.readString());
        this.f8077c = (String) com.anythink.expressad.exoplayer.k.a.a(parcel.readString());
        this.f8078d = (String) com.anythink.expressad.exoplayer.k.a.a(parcel.readString());
    }
}
