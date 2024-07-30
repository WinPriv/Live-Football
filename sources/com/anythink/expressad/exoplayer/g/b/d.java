package com.anythink.expressad.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.expressad.exoplayer.g.b.d.1
        private static d a(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i10) {
            return new d[i10];
        }

        private static d[] a(int i10) {
            return new d[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8042a = "CTOC";

    /* renamed from: b, reason: collision with root package name */
    public final String f8043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8044c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8045d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8046e;
    private final h[] f;

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super(f8042a);
        this.f8043b = str;
        this.f8044c = z10;
        this.f8045d = z11;
        this.f8046e = strArr;
        this.f = hVarArr;
    }

    private int a() {
        return this.f.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8044c == dVar.f8044c && this.f8045d == dVar.f8045d && af.a((Object) this.f8043b, (Object) dVar.f8043b) && Arrays.equals(this.f8046e, dVar.f8046e) && Arrays.equals(this.f, dVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = ((((this.f8044c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f8045d ? 1 : 0)) * 31;
        String str = this.f8043b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8043b);
        parcel.writeByte(this.f8044c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8045d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8046e);
        parcel.writeInt(this.f.length);
        for (h hVar : this.f) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i10) {
        return this.f[i10];
    }

    public d(Parcel parcel) {
        super(f8042a);
        this.f8043b = parcel.readString();
        this.f8044c = parcel.readByte() != 0;
        this.f8045d = parcel.readByte() != 0;
        this.f8046e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
