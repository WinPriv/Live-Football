package com.anythink.expressad.exoplayer.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.expressad.exoplayer.d.e.1
        private static e a(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e[] newArray(int i10) {
            return new e[i10];
        }

        private static e[] a(int i10) {
            return new e[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f7688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7689b;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f7690c;

    /* renamed from: d, reason: collision with root package name */
    private int f7691d;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.expressad.exoplayer.d.e.a.1
            private static a a(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
                return new a[i10];
            }

            private static a[] a(int i10) {
                return new a[i10];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final String f7692a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7693b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7694c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7695d;

        /* renamed from: e, reason: collision with root package name */
        private int f7696e;
        private final UUID f;

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, (byte) 0);
        }

        private boolean b(a aVar) {
            if (a() && !aVar.a() && a(aVar.f)) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            if (!af.a((Object) this.f7692a, (Object) aVar.f7692a) || !af.a((Object) this.f7693b, (Object) aVar.f7693b) || !af.a(this.f, aVar.f) || !Arrays.equals(this.f7694c, aVar.f7694c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.f7696e == 0) {
                int hashCode2 = this.f.hashCode() * 31;
                String str = this.f7692a;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f7696e = Arrays.hashCode(this.f7694c) + e0.i.b(this.f7693b, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f7696e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f.getMostSignificantBits());
            parcel.writeLong(this.f.getLeastSignificantBits());
            parcel.writeString(this.f7692a);
            parcel.writeString(this.f7693b);
            parcel.writeByteArray(this.f7694c);
            parcel.writeByte(this.f7695d ? (byte) 1 : (byte) 0);
        }

        private a(UUID uuid, String str, byte[] bArr, byte b10) {
            this(uuid, (String) null, str, bArr);
        }

        public final boolean a(UUID uuid) {
            return com.anythink.expressad.exoplayer.b.bh.equals(this.f) || uuid.equals(this.f);
        }

        private a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f = (UUID) com.anythink.expressad.exoplayer.k.a.a(uuid);
            this.f7692a = str;
            this.f7693b = (String) com.anythink.expressad.exoplayer.k.a.a(str2);
            this.f7694c = bArr;
            this.f7695d = false;
        }

        public final boolean a() {
            return this.f7694c != null;
        }

        public a(Parcel parcel) {
            this.f = new UUID(parcel.readLong(), parcel.readLong());
            this.f7692a = parcel.readString();
            this.f7693b = parcel.readString();
            this.f7694c = parcel.createByteArray();
            this.f7695d = parcel.readByte() != 0;
        }
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public static e a(e eVar, e eVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f7688a;
            for (a aVar : eVar.f7690c) {
                if (aVar.a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f7688a;
            }
            int size = arrayList.size();
            for (a aVar2 : eVar2.f7690c) {
                if (aVar2.a() && !a(arrayList, size, aVar2.f)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e(str, arrayList);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        UUID uuid = com.anythink.expressad.exoplayer.b.bh;
        if (uuid.equals(aVar3.f)) {
            if (uuid.equals(aVar4.f)) {
                return 0;
            }
            return 1;
        }
        return aVar3.f.compareTo(aVar4.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f7688a, (Object) eVar.f7688a) && Arrays.equals(this.f7690c, eVar.f7690c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f7691d == 0) {
            String str = this.f7688a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f7691d = (hashCode * 31) + Arrays.hashCode(this.f7690c);
        }
        return this.f7691d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7688a);
        parcel.writeTypedArray(this.f7690c, 0);
    }

    private e(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    private e(a... aVarArr) {
        this((String) null, aVarArr);
    }

    private e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private e(String str, boolean z10, a... aVarArr) {
        this.f7688a = str;
        aVarArr = z10 ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f7690c = aVarArr;
        this.f7689b = aVarArr.length;
    }

    public e(Parcel parcel) {
        this.f7688a = parcel.readString();
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f7690c = aVarArr;
        this.f7689b = aVarArr.length;
    }

    @Deprecated
    private a a(UUID uuid) {
        for (a aVar : this.f7690c) {
            if (aVar.a(uuid)) {
                return aVar;
            }
        }
        return null;
    }

    public final a a(int i10) {
        return this.f7690c[i10];
    }

    public final e a(String str) {
        return af.a((Object) this.f7688a, (Object) str) ? this : new e(str, false, this.f7690c);
    }

    private static int a(a aVar, a aVar2) {
        UUID uuid = com.anythink.expressad.exoplayer.b.bh;
        if (uuid.equals(aVar.f)) {
            return uuid.equals(aVar2.f) ? 0 : 1;
        }
        return aVar.f.compareTo(aVar2.f);
    }

    private static boolean a(ArrayList<a> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
