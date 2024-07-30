package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.e.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15135b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15136c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15137d;

    public a(String str, String str2, int i10, byte[] bArr) {
        super(com.anythink.expressad.exoplayer.g.b.a.f8030a);
        this.f15134a = str;
        this.f15135b = str2;
        this.f15136c = i10;
        this.f15137d = bArr;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public void a(ac.a aVar) {
        aVar.a(this.f15137d, this.f15136c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15136c == aVar.f15136c && ai.a((Object) this.f15134a, (Object) aVar.f15134a) && ai.a((Object) this.f15135b, (Object) aVar.f15135b) && Arrays.equals(this.f15137d, aVar.f15137d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15136c) * 31;
        String str = this.f15134a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f15135b;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f15137d) + ((i13 + i12) * 31);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": mimeType=" + this.f15134a + ", description=" + this.f15135b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15134a);
        parcel.writeString(this.f15135b);
        parcel.writeInt(this.f15136c);
        parcel.writeByteArray(this.f15137d);
    }

    public a(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.a.f8030a);
        this.f15134a = (String) ai.a(parcel.readString());
        this.f15135b = parcel.readString();
        this.f15136c = parcel.readInt();
        this.f15137d = (byte[]) ai.a(parcel.createByteArray());
    }
}
