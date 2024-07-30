package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import k4.o0;

/* loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f20023s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20024t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20025u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f20023s = bArr;
        this.f20024t = str;
        this.f20025u = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyInfo.class == obj.getClass()) {
            return Arrays.equals(this.f20023s, ((IcyInfo) obj).f20023s);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(o0.a aVar) {
        String str = this.f20024t;
        if (str != null) {
            aVar.f30692a = str;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20023s);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f20024t, this.f20025u, Integer.valueOf(this.f20023s.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f20023s);
        parcel.writeString(this.f20024t);
        parcel.writeString(this.f20025u);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f20023s = createByteArray;
        this.f20024t = parcel.readString();
        this.f20025u = parcel.readString();
    }
}
