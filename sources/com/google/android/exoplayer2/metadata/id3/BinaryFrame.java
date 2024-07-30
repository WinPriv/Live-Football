package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e0.i;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f20030t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f20030t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (this.f20048s.equals(binaryFrame.f20048s) && Arrays.equals(this.f20030t, binaryFrame.f20030t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20030t) + i.b(this.f20048s, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20048s);
        parcel.writeByteArray(this.f20030t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = d6.g0.f27302a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f20030t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }
}
