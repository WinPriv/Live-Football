package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;
import k4.o0;

/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20026t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20027u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20028v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f20029w;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super(com.anythink.expressad.exoplayer.g.b.a.f8030a);
        this.f20026t = str;
        this.f20027u = str2;
        this.f20028v = i10;
        this.f20029w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f20028v == apicFrame.f20028v && g0.a(this.f20026t, apicFrame.f20026t) && g0.a(this.f20027u, apicFrame.f20027u) && Arrays.equals(this.f20029w, apicFrame.f20029w)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(o0.a aVar) {
        aVar.a(this.f20028v, this.f20029w);
    }

    public final int hashCode() {
        int i10;
        int i11 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20028v) * 31;
        int i12 = 0;
        String str = this.f20026t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f20027u;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f20029w) + ((i13 + i12) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": mimeType=" + this.f20026t + ", description=" + this.f20027u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20026t);
        parcel.writeString(this.f20027u);
        parcel.writeInt(this.f20028v);
        parcel.writeByteArray(this.f20029w);
    }

    public ApicFrame(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.a.f8030a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20026t = readString;
        this.f20027u = parcel.readString();
        this.f20028v = parcel.readInt();
        this.f20029w = parcel.createByteArray();
    }
}
