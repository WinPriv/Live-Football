package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.applovin.exoplayer2.g.e.e.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15152c;

    public e(String str, String str2, String str3) {
        super(com.anythink.expressad.exoplayer.g.b.e.f8047a);
        this.f15150a = str;
        this.f15151b = str2;
        this.f15152c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (ai.a((Object) this.f15151b, (Object) eVar.f15151b) && ai.a((Object) this.f15150a, (Object) eVar.f15150a) && ai.a((Object) this.f15152c, (Object) eVar.f15152c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f15150a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f15151b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f15152c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": language=" + this.f15150a + ", description=" + this.f15151b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f);
        parcel.writeString(this.f15150a);
        parcel.writeString(this.f15152c);
    }

    public e(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.e.f8047a);
        this.f15150a = (String) ai.a(parcel.readString());
        this.f15151b = (String) ai.a(parcel.readString());
        this.f15152c = (String) ai.a(parcel.readString());
    }
}
