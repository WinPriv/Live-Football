package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final int f20052t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20053u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20054v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f20055w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f20056x;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f20052t = i10;
        this.f20053u = i11;
        this.f20054v = i12;
        this.f20055w = iArr;
        this.f20056x = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f20052t == mlltFrame.f20052t && this.f20053u == mlltFrame.f20053u && this.f20054v == mlltFrame.f20054v && Arrays.equals(this.f20055w, mlltFrame.f20055w) && Arrays.equals(this.f20056x, mlltFrame.f20056x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20056x) + ((Arrays.hashCode(this.f20055w) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20052t) * 31) + this.f20053u) * 31) + this.f20054v) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20052t);
        parcel.writeInt(this.f20053u);
        parcel.writeInt(this.f20054v);
        parcel.writeIntArray(this.f20055w);
        parcel.writeIntArray(this.f20056x);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f20052t = parcel.readInt();
        this.f20053u = parcel.readInt();
        this.f20054v = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = g0.f27302a;
        this.f20055w = createIntArray;
        this.f20056x = parcel.createIntArray();
    }
}
