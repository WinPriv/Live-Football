package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import d6.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public final SchemeData[] f19905s;

    /* renamed from: t, reason: collision with root package name */
    public int f19906t;

    /* renamed from: u, reason: collision with root package name */
    public final String f19907u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19908v;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData() {
        throw null;
    }

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public final DrmInitData a(String str) {
        if (g0.a(this.f19907u, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f19905s);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = k4.g.f30463a;
        if (uuid.equals(schemeData3.f19910t)) {
            if (uuid.equals(schemeData4.f19910t)) {
                return 0;
            }
            return 1;
        }
        return schemeData3.f19910t.compareTo(schemeData4.f19910t);
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
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (g0.a(this.f19907u, drmInitData.f19907u) && Arrays.equals(this.f19905s, drmInitData.f19905s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f19906t == 0) {
            String str = this.f19907u;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f19906t = (hashCode * 31) + Arrays.hashCode(this.f19905s);
        }
        return this.f19906t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19907u);
        parcel.writeTypedArray(this.f19905s, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f19907u = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f19905s = schemeDataArr;
        this.f19908v = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* loaded from: classes2.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f19909s;

        /* renamed from: t, reason: collision with root package name */
        public final UUID f19910t;

        /* renamed from: u, reason: collision with root package name */
        public final String f19911u;

        /* renamed from: v, reason: collision with root package name */
        public final String f19912v;

        /* renamed from: w, reason: collision with root package name */
        public final byte[] f19913w;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData() {
            throw null;
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f19910t = uuid;
            this.f19911u = str;
            str2.getClass();
            this.f19912v = str2;
            this.f19913w = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = k4.g.f30463a;
            UUID uuid3 = this.f19910t;
            if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!g0.a(this.f19911u, schemeData.f19911u) || !g0.a(this.f19912v, schemeData.f19912v) || !g0.a(this.f19910t, schemeData.f19910t) || !Arrays.equals(this.f19913w, schemeData.f19913w)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.f19909s == 0) {
                int hashCode2 = this.f19910t.hashCode() * 31;
                String str = this.f19911u;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f19909s = Arrays.hashCode(this.f19913w) + e0.i.b(this.f19912v, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f19909s;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f19910t;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f19911u);
            parcel.writeString(this.f19912v);
            parcel.writeByteArray(this.f19913w);
        }

        public SchemeData(Parcel parcel) {
            this.f19910t = new UUID(parcel.readLong(), parcel.readLong());
            this.f19911u = parcel.readString();
            String readString = parcel.readString();
            int i10 = g0.f27302a;
            this.f19912v = readString;
            this.f19913w = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f19907u = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i10 = g0.f27302a;
        this.f19905s = schemeDataArr;
        this.f19908v = schemeDataArr.length;
    }
}
