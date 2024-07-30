package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.applovin.exoplayer2.g.e.k.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15170a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15171b;

    public k(String str, byte[] bArr) {
        super(com.anythink.expressad.exoplayer.g.b.j.f8079a);
        this.f15170a = str;
        this.f15171b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (ai.a((Object) this.f15170a, (Object) kVar.f15170a) && Arrays.equals(this.f15171b, kVar.f15171b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f15170a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f15171b) + ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": owner=" + this.f15170a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15170a);
        parcel.writeByteArray(this.f15171b);
    }

    public k(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.j.f8079a);
        this.f15170a = (String) ai.a(parcel.readString());
        this.f15171b = (byte[]) ai.a(parcel.createByteArray());
    }
}
