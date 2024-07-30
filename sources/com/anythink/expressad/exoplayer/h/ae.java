package com.anythink.expressad.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ae implements Parcelable {
    public static final Parcelable.Creator<ae> CREATOR = new Parcelable.Creator<ae>() { // from class: com.anythink.expressad.exoplayer.h.ae.1
        private static ae a(Parcel parcel) {
            return new ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ae createFromParcel(Parcel parcel) {
            return new ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ae[] newArray(int i10) {
            return new ae[i10];
        }

        private static ae[] a(int i10) {
            return new ae[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f8252a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.m[] f8253b;

    /* renamed from: c, reason: collision with root package name */
    private int f8254c;

    public ae(com.anythink.expressad.exoplayer.m... mVarArr) {
        com.anythink.expressad.exoplayer.k.a.b(true);
        this.f8253b = mVarArr;
        this.f8252a = 1;
    }

    public final com.anythink.expressad.exoplayer.m a(int i10) {
        return this.f8253b[i10];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ae.class == obj.getClass()) {
            ae aeVar = (ae) obj;
            if (this.f8252a == aeVar.f8252a && Arrays.equals(this.f8253b, aeVar.f8253b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8254c == 0) {
            this.f8254c = Arrays.hashCode(this.f8253b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f8254c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8252a);
        for (int i11 = 0; i11 < this.f8252a; i11++) {
            parcel.writeParcelable(this.f8253b[i11], 0);
        }
    }

    public final int a(com.anythink.expressad.exoplayer.m mVar) {
        int i10 = 0;
        while (true) {
            com.anythink.expressad.exoplayer.m[] mVarArr = this.f8253b;
            if (i10 >= mVarArr.length) {
                return -1;
            }
            if (mVar == mVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public ae(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8252a = readInt;
        this.f8253b = new com.anythink.expressad.exoplayer.m[readInt];
        for (int i10 = 0; i10 < this.f8252a; i10++) {
            this.f8253b[i10] = (com.anythink.expressad.exoplayer.m) parcel.readParcelable(com.anythink.expressad.exoplayer.m.class.getClassLoader());
        }
    }
}
