package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.applovin.exoplayer2.g.e.f.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15153a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15154b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15155c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15156d;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(com.anythink.expressad.exoplayer.g.b.f.f8051a);
        this.f15153a = str;
        this.f15154b = str2;
        this.f15155c = str3;
        this.f15156d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (ai.a((Object) this.f15153a, (Object) fVar.f15153a) && ai.a((Object) this.f15154b, (Object) fVar.f15154b) && ai.a((Object) this.f15155c, (Object) fVar.f15155c) && Arrays.equals(this.f15156d, fVar.f15156d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f15153a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        String str2 = this.f15154b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f15155c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f15156d) + ((i14 + i12) * 31);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": mimeType=" + this.f15153a + ", filename=" + this.f15154b + ", description=" + this.f15155c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15153a);
        parcel.writeString(this.f15154b);
        parcel.writeString(this.f15155c);
        parcel.writeByteArray(this.f15156d);
    }

    public f(Parcel parcel) {
        super(com.anythink.expressad.exoplayer.g.b.f.f8051a);
        this.f15153a = (String) ai.a(parcel.readString());
        this.f15154b = (String) ai.a(parcel.readString());
        this.f15155c = (String) ai.a(parcel.readString());
        this.f15156d = (byte[]) ai.a(parcel.createByteArray());
    }
}
