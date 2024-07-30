package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.applovin.exoplayer2.g.e.j.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f15165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15167c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15168d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f15169e;

    public j(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f15165a = i10;
        this.f15166b = i11;
        this.f15167c = i12;
        this.f15168d = iArr;
        this.f15169e = iArr2;
    }

    @Override // com.applovin.exoplayer2.g.e.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f15165a == jVar.f15165a && this.f15166b == jVar.f15166b && this.f15167c == jVar.f15167c && Arrays.equals(this.f15168d, jVar.f15168d) && Arrays.equals(this.f15169e, jVar.f15169e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15169e) + ((Arrays.hashCode(this.f15168d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15165a) * 31) + this.f15166b) * 31) + this.f15167c) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15165a);
        parcel.writeInt(this.f15166b);
        parcel.writeInt(this.f15167c);
        parcel.writeIntArray(this.f15168d);
        parcel.writeIntArray(this.f15169e);
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f15165a = parcel.readInt();
        this.f15166b = parcel.readInt();
        this.f15167c = parcel.readInt();
        this.f15168d = (int[]) ai.a(parcel.createIntArray());
        this.f15169e = (int[]) ai.a(parcel.createIntArray());
    }
}
