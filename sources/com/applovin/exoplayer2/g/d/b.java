package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0172a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.d.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f15126a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15127b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15128c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15129d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15130e;
    public final int f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        com.applovin.exoplayer2.l.a.a(i11 == -1 || i11 > 0);
        this.f15126a = i10;
        this.f15127b = str;
        this.f15128c = str2;
        this.f15129d = str3;
        this.f15130e = z10;
        this.f = i11;
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
    public static com.applovin.exoplayer2.g.d.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.d.b.a(java.util.Map):com.applovin.exoplayer2.g.d.b");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15126a == bVar.f15126a && ai.a((Object) this.f15127b, (Object) bVar.f15127b) && ai.a((Object) this.f15128c, (Object) bVar.f15128c) && ai.a((Object) this.f15129d, (Object) bVar.f15129d) && this.f15130e == bVar.f15130e && this.f == bVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15126a) * 31;
        String str = this.f15127b;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f15128c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f15129d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f15130e ? 1 : 0)) * 31) + this.f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f15128c + "\", genre=\"" + this.f15127b + "\", bitrate=" + this.f15126a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15126a);
        parcel.writeString(this.f15127b);
        parcel.writeString(this.f15128c);
        parcel.writeString(this.f15129d);
        ai.a(parcel, this.f15130e);
        parcel.writeInt(this.f);
    }

    public b(Parcel parcel) {
        this.f15126a = parcel.readInt();
        this.f15127b = parcel.readString();
        this.f15128c = parcel.readString();
        this.f15129d = parcel.readString();
        this.f15130e = ai.a(parcel);
        this.f = parcel.readInt();
    }
}
