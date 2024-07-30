package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.b.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20044t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20045u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20046v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f20047w;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(f.f8051a);
        this.f20044t = str;
        this.f20045u = str2;
        this.f20046v = str3;
        this.f20047w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (g0.a(this.f20044t, geobFrame.f20044t) && g0.a(this.f20045u, geobFrame.f20045u) && g0.a(this.f20046v, geobFrame.f20046v) && Arrays.equals(this.f20047w, geobFrame.f20047w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f20044t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f20045u;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f20046v;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f20047w) + ((i14 + i12) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": mimeType=" + this.f20044t + ", filename=" + this.f20045u + ", description=" + this.f20046v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20044t);
        parcel.writeString(this.f20045u);
        parcel.writeString(this.f20046v);
        parcel.writeByteArray(this.f20047w);
    }

    public GeobFrame(Parcel parcel) {
        super(f.f8051a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20044t = readString;
        this.f20045u = parcel.readString();
        this.f20046v = parcel.readString();
        this.f20047w = parcel.createByteArray();
    }
}
