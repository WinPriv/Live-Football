package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import k4.o0;

/* loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f20017s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20018t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20019u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20020v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f20021w;

    /* renamed from: x, reason: collision with root package name */
    public final int f20022x;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, String str, String str2, String str3, boolean z10, int i11) {
        d6.a.a(i11 == -1 || i11 > 0);
        this.f20017s = i10;
        this.f20018t = str;
        this.f20019u = str2;
        this.f20020v = str3;
        this.f20021w = z10;
        this.f20022x = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.a(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.f20017s == icyHeaders.f20017s && g0.a(this.f20018t, icyHeaders.f20018t) && g0.a(this.f20019u, icyHeaders.f20019u) && g0.a(this.f20020v, icyHeaders.f20020v) && this.f20021w == icyHeaders.f20021w && this.f20022x == icyHeaders.f20022x) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(o0.a aVar) {
        String str = this.f20019u;
        if (str != null) {
            aVar.E = str;
        }
        String str2 = this.f20018t;
        if (str2 != null) {
            aVar.C = str2;
        }
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20017s) * 31;
        int i13 = 0;
        String str = this.f20018t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f20019u;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f20020v;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f20021w ? 1 : 0)) * 31) + this.f20022x;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f20019u + "\", genre=\"" + this.f20018t + "\", bitrate=" + this.f20017s + ", metadataInterval=" + this.f20022x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20017s);
        parcel.writeString(this.f20018t);
        parcel.writeString(this.f20019u);
        parcel.writeString(this.f20020v);
        int i11 = g0.f27302a;
        parcel.writeInt(this.f20021w ? 1 : 0);
        parcel.writeInt(this.f20022x);
    }

    public IcyHeaders(Parcel parcel) {
        this.f20017s = parcel.readInt();
        this.f20018t = parcel.readString();
        this.f20019u = parcel.readString();
        this.f20020v = parcel.readString();
        int i10 = g0.f27302a;
        this.f20021w = parcel.readInt() != 0;
        this.f20022x = parcel.readInt();
    }
}
