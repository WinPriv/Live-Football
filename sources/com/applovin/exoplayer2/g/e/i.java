package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.applovin.exoplayer2.g.e.i.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15164c;

    public i(String str, String str2, String str3) {
        super(com.anythink.expressad.exoplayer.g.b.i.f8075a);
        this.f15162a = str;
        this.f15163b = str2;
        this.f15164c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (ai.a((Object) this.f15163b, (Object) iVar.f15163b) && ai.a((Object) this.f15162a, (Object) iVar.f15162a) && ai.a((Object) this.f15164c, (Object) iVar.f15164c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f15162a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f15163b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f15164c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": domain=" + this.f15162a + ", description=" + this.f15163b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f);
        parcel.writeString(this.f15162a);
        parcel.writeString(this.f15164c);
    }

    public i(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.i.f8075a);
        this.f15162a = (String) ai.a(parcel.readString());
        this.f15163b = (String) ai.a(parcel.readString());
        this.f15164c = (String) ai.a(parcel.readString());
    }
}
