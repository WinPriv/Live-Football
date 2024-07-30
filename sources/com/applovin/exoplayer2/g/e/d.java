package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.e.d.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15145a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15147c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f15148d;

    /* renamed from: e, reason: collision with root package name */
    private final h[] f15149e;

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super(com.anythink.expressad.exoplayer.g.b.d.f8042a);
        this.f15145a = str;
        this.f15146b = z10;
        this.f15147c = z11;
        this.f15148d = strArr;
        this.f15149e = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15146b == dVar.f15146b && this.f15147c == dVar.f15147c && ai.a((Object) this.f15145a, (Object) dVar.f15145a) && Arrays.equals(this.f15148d, dVar.f15148d) && Arrays.equals(this.f15149e, dVar.f15149e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f15146b ? 1 : 0)) * 31) + (this.f15147c ? 1 : 0)) * 31;
        String str = this.f15145a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15145a);
        parcel.writeByte(this.f15146b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15147c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f15148d);
        parcel.writeInt(this.f15149e.length);
        for (h hVar : this.f15149e) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public d(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.d.f8042a);
        this.f15145a = (String) ai.a(parcel.readString());
        this.f15146b = parcel.readByte() != 0;
        this.f15147c = parcel.readByte() != 0;
        this.f15148d = (String[]) ai.a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f15149e = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f15149e[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
