package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.g.b.j;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20057t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f20058u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super(j.f8079a);
        this.f20057t = str;
        this.f20058u = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (g0.a(this.f20057t, privFrame.f20057t) && Arrays.equals(this.f20058u, privFrame.f20058u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f20057t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f20058u) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": owner=" + this.f20057t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20057t);
        parcel.writeByteArray(this.f20058u);
    }

    public PrivFrame(Parcel parcel) {
        super(j.f8079a);
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20057t = readString;
        this.f20058u = parcel.createByteArray();
    }
}
