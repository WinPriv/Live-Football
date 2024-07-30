package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import e0.i;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final String f20063s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f20064t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20065u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20066v;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f20063s = str;
        this.f20064t = bArr;
        this.f20065u = i10;
        this.f20066v = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (this.f20063s.equals(mdtaMetadataEntry.f20063s) && Arrays.equals(this.f20064t, mdtaMetadataEntry.f20064t) && this.f20065u == mdtaMetadataEntry.f20065u && this.f20066v == mdtaMetadataEntry.f20066v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f20064t) + i.b(this.f20063s, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f20065u) * 31) + this.f20066v;
    }

    public final String toString() {
        return "mdta: key=" + this.f20063s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20063s);
        parcel.writeByteArray(this.f20064t);
        parcel.writeInt(this.f20065u);
        parcel.writeInt(this.f20066v);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = g0.f27302a;
        this.f20063s = readString;
        this.f20064t = parcel.createByteArray();
        this.f20065u = parcel.readInt();
        this.f20066v = parcel.readInt();
    }
}
