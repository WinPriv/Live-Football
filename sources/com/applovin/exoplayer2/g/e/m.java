package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.applovin.exoplayer2.g.e.m.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15175b;

    public m(String str, String str2, String str3) {
        super(str);
        this.f15174a = str2;
        this.f15175b = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f.equals(mVar.f) && ai.a((Object) this.f15174a, (Object) mVar.f15174a) && ai.a((Object) this.f15175b, (Object) mVar.f15175b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int b10 = e0.i.b(this.f, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f15174a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (b10 + i10) * 31;
        String str2 = this.f15175b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": url=" + this.f15175b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f);
        parcel.writeString(this.f15174a);
        parcel.writeString(this.f15175b);
    }

    public m(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f15174a = parcel.readString();
        this.f15175b = (String) ai.a(parcel.readString());
    }
}
