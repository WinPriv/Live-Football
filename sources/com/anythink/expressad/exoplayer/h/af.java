package com.anythink.expressad.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class af implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f8256b;

    /* renamed from: c, reason: collision with root package name */
    private final ae[] f8257c;

    /* renamed from: d, reason: collision with root package name */
    private int f8258d;

    /* renamed from: a, reason: collision with root package name */
    public static final af f8255a = new af(new ae[0]);
    public static final Parcelable.Creator<af> CREATOR = new Parcelable.Creator<af>() { // from class: com.anythink.expressad.exoplayer.h.af.1
        private static af a(Parcel parcel) {
            return new af(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ af createFromParcel(Parcel parcel) {
            return new af(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ af[] newArray(int i10) {
            return new af[i10];
        }

        private static af[] a(int i10) {
            return new af[i10];
        }
    };

    public af(ae... aeVarArr) {
        this.f8257c = aeVarArr;
        this.f8256b = aeVarArr.length;
    }

    public final ae a(int i10) {
        return this.f8257c[i10];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af.class == obj.getClass()) {
            af afVar = (af) obj;
            if (this.f8256b == afVar.f8256b && Arrays.equals(this.f8257c, afVar.f8257c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8258d == 0) {
            this.f8258d = Arrays.hashCode(this.f8257c);
        }
        return this.f8258d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8256b);
        for (int i11 = 0; i11 < this.f8256b; i11++) {
            parcel.writeParcelable(this.f8257c[i11], 0);
        }
    }

    public final int a(ae aeVar) {
        for (int i10 = 0; i10 < this.f8256b; i10++) {
            if (this.f8257c[i10] == aeVar) {
                return i10;
            }
        }
        return -1;
    }

    public af(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8256b = readInt;
        this.f8257c = new ae[readInt];
        for (int i10 = 0; i10 < this.f8256b; i10++) {
            this.f8257c[i10] = (ae) parcel.readParcelable(ae.class.getClassLoader());
        }
    }

    private boolean a() {
        return this.f8256b == 0;
    }
}
