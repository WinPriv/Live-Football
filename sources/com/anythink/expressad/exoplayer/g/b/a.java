package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.expressad.exoplayer.g.b.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
            return new a[i10];
        }

        private static a[] a(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8030a = "APIC";

    /* renamed from: b, reason: collision with root package name */
    public final String f8031b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8032c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8033d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8034e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super(f8030a);
        this.f8031b = str;
        this.f8032c = str2;
        this.f8033d = i10;
        this.f8034e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8033d == aVar.f8033d && af.a((Object) this.f8031b, (Object) aVar.f8031b) && af.a((Object) this.f8032c, (Object) aVar.f8032c) && Arrays.equals(this.f8034e, aVar.f8034e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (this.f8033d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f8031b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f8032c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f8034e) + ((i13 + i12) * 31);
    }

    @Override // com.anythink.expressad.exoplayer.g.b.h
    public final String toString() {
        return this.f8074g + ": mimeType=" + this.f8031b + ", description=" + this.f8032c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8031b);
        parcel.writeString(this.f8032c);
        parcel.writeInt(this.f8033d);
        parcel.writeByteArray(this.f8034e);
    }

    public a(Parcel parcel) {
        super(f8030a);
        this.f8031b = parcel.readString();
        this.f8032c = parcel.readString();
        this.f8033d = parcel.readInt();
        this.f8034e = parcel.createByteArray();
    }
}
