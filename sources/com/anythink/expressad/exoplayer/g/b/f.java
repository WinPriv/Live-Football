package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.expressad.exoplayer.g.b.f.1
        private static f a(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i10) {
            return new f[i10];
        }

        private static f[] a(int i10) {
            return new f[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8051a = "GEOB";

    /* renamed from: b, reason: collision with root package name */
    public final String f8052b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8053c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8054d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8055e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(f8051a);
        this.f8052b = str;
        this.f8053c = str2;
        this.f8054d = str3;
        this.f8055e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (af.a((Object) this.f8052b, (Object) fVar.f8052b) && af.a((Object) this.f8053c, (Object) fVar.f8053c) && af.a((Object) this.f8054d, (Object) fVar.f8054d) && Arrays.equals(this.f8055e, fVar.f8055e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.f8052b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f8053c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f8054d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f8055e) + ((i14 + i12) * 31);
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": mimeType=" + this.f8052b + ", filename=" + this.f8053c + ", description=" + this.f8054d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8052b);
        parcel.writeString(this.f8053c);
        parcel.writeString(this.f8054d);
        parcel.writeByteArray(this.f8055e);
    }

    public f(Parcel parcel) {
        super(f8051a);
        this.f8052b = parcel.readString();
        this.f8053c = parcel.readString();
        this.f8054d = parcel.readString();
        this.f8055e = parcel.createByteArray();
    }
}
