package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import d6.w;
import e0.i;
import i7.c;
import java.util.Arrays;
import k4.o0;

/* loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final int f20008s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20009t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20010u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20011v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20012w;

    /* renamed from: x, reason: collision with root package name */
    public final int f20013x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f20014z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f20008s = i10;
        this.f20009t = str;
        this.f20010u = str2;
        this.f20011v = i11;
        this.f20012w = i12;
        this.f20013x = i13;
        this.y = i14;
        this.f20014z = bArr;
    }

    public static PictureFrame a(w wVar) {
        int d10 = wVar.d();
        String r10 = wVar.r(wVar.d(), c.f29200a);
        String q10 = wVar.q(wVar.d());
        int d11 = wVar.d();
        int d12 = wVar.d();
        int d13 = wVar.d();
        int d14 = wVar.d();
        int d15 = wVar.d();
        byte[] bArr = new byte[d15];
        wVar.b(bArr, 0, d15);
        return new PictureFrame(d10, r10, q10, d11, d12, d13, d14, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.f20008s == pictureFrame.f20008s && this.f20009t.equals(pictureFrame.f20009t) && this.f20010u.equals(pictureFrame.f20010u) && this.f20011v == pictureFrame.f20011v && this.f20012w == pictureFrame.f20012w && this.f20013x == pictureFrame.f20013x && this.y == pictureFrame.y && Arrays.equals(this.f20014z, pictureFrame.f20014z)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(o0.a aVar) {
        aVar.a(this.f20008s, this.f20014z);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20014z) + ((((((((i.b(this.f20010u, i.b(this.f20009t, (this.f20008s + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f20011v) * 31) + this.f20012w) * 31) + this.f20013x) * 31) + this.y) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f20009t + ", description=" + this.f20010u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20008s);
        parcel.writeString(this.f20009t);
        parcel.writeString(this.f20010u);
        parcel.writeInt(this.f20011v);
        parcel.writeInt(this.f20012w);
        parcel.writeInt(this.f20013x);
        parcel.writeInt(this.y);
        parcel.writeByteArray(this.f20014z);
    }

    public PictureFrame(Parcel parcel) {
        this.f20008s = parcel.readInt();
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20009t = readString;
        this.f20010u = parcel.readString();
        this.f20011v = parcel.readInt();
        this.f20012w = parcel.readInt();
        this.f20013x = parcel.readInt();
        this.y = parcel.readInt();
        this.f20014z = parcel.createByteArray();
    }
}
