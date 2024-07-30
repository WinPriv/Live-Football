package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements a.InterfaceC0172a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.d.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15131a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15132b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15133c;

    public c(byte[] bArr, String str, String str2) {
        this.f15131a = bArr;
        this.f15132b = str;
        this.f15133c = str2;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public void a(ac.a aVar) {
        String str = this.f15132b;
        if (str != null) {
            aVar.a(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f15131a, ((c) obj).f15131a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15131a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f15132b, this.f15133c, Integer.valueOf(this.f15131a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f15131a);
        parcel.writeString(this.f15132b);
        parcel.writeString(this.f15133c);
    }

    public c(Parcel parcel) {
        this.f15131a = (byte[]) com.applovin.exoplayer2.l.a.b(parcel.createByteArray());
        this.f15132b = parcel.readString();
        this.f15133c = parcel.readString();
    }
}
