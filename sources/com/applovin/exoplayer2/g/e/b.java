package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.e.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15138a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f15138a = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f.equals(bVar.f) && Arrays.equals(this.f15138a, bVar.f15138a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15138a) + e0.i.b(this.f, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.f15138a);
    }

    public b(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f15138a = (byte[]) ai.a(parcel.createByteArray());
    }
}
