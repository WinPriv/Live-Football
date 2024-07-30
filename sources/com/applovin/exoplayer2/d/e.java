package com.applovin.exoplayer2.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.applovin.exoplayer2.d.e.1
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
    public final String f14020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14021b;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f14022c;

    /* renamed from: d, reason: collision with root package name */
    private int f14023d;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.d.e.a.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final UUID f14024a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14025b;

        /* renamed from: c, reason: collision with root package name */
        public final String f14026c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f14027d;

        /* renamed from: e, reason: collision with root package name */
        private int f14028e;

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(UUID uuid) {
            return com.applovin.exoplayer2.h.f15239a.equals(this.f14024a) || uuid.equals(this.f14024a);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            if (!ai.a((Object) this.f14025b, (Object) aVar.f14025b) || !ai.a((Object) this.f14026c, (Object) aVar.f14026c) || !ai.a(this.f14024a, aVar.f14024a) || !Arrays.equals(this.f14027d, aVar.f14027d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.f14028e == 0) {
                int hashCode2 = this.f14024a.hashCode() * 31;
                String str = this.f14025b;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f14028e = Arrays.hashCode(this.f14027d) + e0.i.b(this.f14026c, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f14028e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f14024a.getMostSignificantBits());
            parcel.writeLong(this.f14024a.getLeastSignificantBits());
            parcel.writeString(this.f14025b);
            parcel.writeString(this.f14026c);
            parcel.writeByteArray(this.f14027d);
        }

        public a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f14024a = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.f14025b = str;
            this.f14026c = (String) com.applovin.exoplayer2.l.a.b(str2);
            this.f14027d = bArr;
        }

        public a a(byte[] bArr) {
            return new a(this.f14024a, this.f14025b, this.f14026c, bArr);
        }

        public a(Parcel parcel) {
            this.f14024a = new UUID(parcel.readLong(), parcel.readLong());
            this.f14025b = parcel.readString();
            this.f14026c = (String) ai.a(parcel.readString());
            this.f14027d = parcel.createByteArray();
        }
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[0]));
    }

    public a a(int i10) {
        return this.f14022c[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (ai.a((Object) this.f14020a, (Object) eVar.f14020a) && Arrays.equals(this.f14022c, eVar.f14022c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (this.f14023d == 0) {
            String str = this.f14020a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f14023d = (hashCode * 31) + Arrays.hashCode(this.f14022c);
        }
        return this.f14023d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14020a);
        parcel.writeTypedArray(this.f14022c, 0);
    }

    public e(a... aVarArr) {
        this(null, aVarArr);
    }

    public e a(String str) {
        return ai.a((Object) this.f14020a, (Object) str) ? this : new e(str, false, this.f14022c);
    }

    public e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private e(String str, boolean z10, a... aVarArr) {
        this.f14020a = str;
        aVarArr = z10 ? (a[]) aVarArr.clone() : aVarArr;
        this.f14022c = aVarArr;
        this.f14021b = aVarArr.length;
        Arrays.sort(aVarArr, this);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        UUID uuid = com.applovin.exoplayer2.h.f15239a;
        if (uuid.equals(aVar.f14024a)) {
            return uuid.equals(aVar2.f14024a) ? 0 : 1;
        }
        return aVar.f14024a.compareTo(aVar2.f14024a);
    }

    public e(Parcel parcel) {
        this.f14020a = parcel.readString();
        a[] aVarArr = (a[]) ai.a((a[]) parcel.createTypedArray(a.CREATOR));
        this.f14022c = aVarArr;
        this.f14021b = aVarArr.length;
    }
}
