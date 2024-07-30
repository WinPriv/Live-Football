package com.anythink.expressad.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.anythink.expressad.exoplayer.m.1
        private static m a(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ m[] newArray(int i10) {
            return new m[i10];
        }

        private static m[] a(int i10) {
            return new m[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final int f9251a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9252b = Long.MAX_VALUE;
    public final String A;
    public final int B;
    private int C;

    /* renamed from: c, reason: collision with root package name */
    public final String f9253c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9254d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9255e;
    public final com.anythink.expressad.exoplayer.g.a f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9256g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9257h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9258i;

    /* renamed from: j, reason: collision with root package name */
    public final List<byte[]> f9259j;

    /* renamed from: k, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.d.e f9260k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9261l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9262m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9263n;
    public final float o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9264p;

    /* renamed from: q, reason: collision with root package name */
    public final float f9265q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9266r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f9267s;

    /* renamed from: t, reason: collision with root package name */
    public final com.anythink.expressad.exoplayer.l.b f9268t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9269u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9270v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9271w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9272x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9273z;

    private m(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f, int i14, float f10, byte[] bArr, int i15, com.anythink.expressad.exoplayer.l.b bVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List<byte[]> list, com.anythink.expressad.exoplayer.d.e eVar, com.anythink.expressad.exoplayer.g.a aVar) {
        this.f9253c = str;
        this.f9256g = str2;
        this.f9257h = str3;
        this.f9255e = str4;
        this.f9254d = i10;
        this.f9258i = i11;
        this.f9262m = i12;
        this.f9263n = i13;
        this.o = f;
        int i23 = i14;
        this.f9264p = i23 == -1 ? 0 : i23;
        this.f9265q = f10 == -1.0f ? 1.0f : f10;
        this.f9267s = bArr;
        this.f9266r = i15;
        this.f9268t = bVar;
        this.f9269u = i16;
        this.f9270v = i17;
        this.f9271w = i18;
        int i24 = i19;
        this.f9272x = i24 == -1 ? 0 : i24;
        this.y = i20 != -1 ? i20 : 0;
        this.f9273z = i21;
        this.A = str5;
        this.B = i22;
        this.f9261l = j10;
        this.f9259j = list == null ? Collections.emptyList() : list;
        this.f9260k = eVar;
        this.f = aVar;
    }

    private static m a(String str, String str2, String str3, String str4, int i10, int i11, int i12, float f, List<byte[]> list, int i13) {
        return new m(str, str2, str3, str4, i10, -1, i11, i12, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i13, null, -1, Long.MAX_VALUE, list, null, null);
    }

    private static m b(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f, List<byte[]> list, com.anythink.expressad.exoplayer.d.e eVar) {
        return a(str, str2, str3, i10, i11, i12, i13, f, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m c(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        return new m(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f9254d == mVar.f9254d && this.f9258i == mVar.f9258i && this.f9262m == mVar.f9262m && this.f9263n == mVar.f9263n && this.o == mVar.o && this.f9264p == mVar.f9264p && this.f9265q == mVar.f9265q && this.f9266r == mVar.f9266r && this.f9269u == mVar.f9269u && this.f9270v == mVar.f9270v && this.f9271w == mVar.f9271w && this.f9272x == mVar.f9272x && this.y == mVar.y && this.f9261l == mVar.f9261l && this.f9273z == mVar.f9273z && af.a((Object) this.f9253c, (Object) mVar.f9253c) && af.a((Object) this.A, (Object) mVar.A) && this.B == mVar.B && af.a((Object) this.f9256g, (Object) mVar.f9256g) && af.a((Object) this.f9257h, (Object) mVar.f9257h) && af.a((Object) this.f9255e, (Object) mVar.f9255e) && af.a(this.f9260k, mVar.f9260k) && af.a(this.f, mVar.f) && af.a(this.f9268t, mVar.f9268t) && Arrays.equals(this.f9267s, mVar.f9267s) && b(mVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.C == 0) {
            String str = this.f9253c;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f9256g;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            String str3 = this.f9257h;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            String str4 = this.f9255e;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i14 = (((((((((((i13 + hashCode4) * 31) + this.f9254d) * 31) + this.f9262m) * 31) + this.f9263n) * 31) + this.f9269u) * 31) + this.f9270v) * 31;
            String str5 = this.A;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i15 = (((i14 + hashCode5) * 31) + this.B) * 31;
            com.anythink.expressad.exoplayer.d.e eVar = this.f9260k;
            if (eVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = eVar.hashCode();
            }
            int i16 = (i15 + hashCode6) * 31;
            com.anythink.expressad.exoplayer.g.a aVar = this.f;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            this.C = i16 + i10;
        }
        return this.C;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f9253c);
        sb2.append(", ");
        sb2.append(this.f9256g);
        sb2.append(", ");
        sb2.append(this.f9257h);
        sb2.append(", ");
        sb2.append(this.f9254d);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", [");
        sb2.append(this.f9262m);
        sb2.append(", ");
        sb2.append(this.f9263n);
        sb2.append(", ");
        sb2.append(this.o);
        sb2.append("], [");
        sb2.append(this.f9269u);
        sb2.append(", ");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f9270v, "])");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10;
        parcel.writeString(this.f9253c);
        parcel.writeString(this.f9256g);
        parcel.writeString(this.f9257h);
        parcel.writeString(this.f9255e);
        parcel.writeInt(this.f9254d);
        parcel.writeInt(this.f9258i);
        parcel.writeInt(this.f9262m);
        parcel.writeInt(this.f9263n);
        parcel.writeFloat(this.o);
        parcel.writeInt(this.f9264p);
        parcel.writeFloat(this.f9265q);
        if (this.f9267s != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        af.a(parcel, z10);
        byte[] bArr = this.f9267s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f9266r);
        parcel.writeParcelable(this.f9268t, i10);
        parcel.writeInt(this.f9269u);
        parcel.writeInt(this.f9270v);
        parcel.writeInt(this.f9271w);
        parcel.writeInt(this.f9272x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.f9273z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeLong(this.f9261l);
        int size = this.f9259j.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f9259j.get(i11));
        }
        parcel.writeParcelable(this.f9260k, 0);
        parcel.writeParcelable(this.f, 0);
    }

    public static m a(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f, List<byte[]> list, int i14, float f10, byte[] bArr, int i15, com.anythink.expressad.exoplayer.l.b bVar, com.anythink.expressad.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i10, i11, i12, i13, f, i14, f10, bArr, i15, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, eVar, null);
    }

    private static m b(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        return new m(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static String c(m mVar) {
        if (mVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder("id=");
        sb2.append(mVar.f9253c);
        sb2.append(", mimeType=");
        sb2.append(mVar.f9257h);
        if (mVar.f9254d != -1) {
            sb2.append(", bitrate=");
            sb2.append(mVar.f9254d);
        }
        if (mVar.f9262m != -1 && mVar.f9263n != -1) {
            sb2.append(", res=");
            sb2.append(mVar.f9262m);
            sb2.append("x");
            sb2.append(mVar.f9263n);
        }
        if (mVar.o != -1.0f) {
            sb2.append(", fps=");
            sb2.append(mVar.o);
        }
        if (mVar.f9269u != -1) {
            sb2.append(", channels=");
            sb2.append(mVar.f9269u);
        }
        if (mVar.f9270v != -1) {
            sb2.append(", sample_rate=");
            sb2.append(mVar.f9270v);
        }
        if (mVar.A != null) {
            sb2.append(", language=");
            sb2.append(mVar.A);
        }
        return sb2.toString();
    }

    private static m a(String str, String str2, String str3, String str4, int i10, int i11, int i12, List<byte[]> list, int i13, String str5) {
        return new m(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i11, i12, -1, -1, -1, i13, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    private m b(int i10) {
        return new m(this.f9253c, this.f9256g, this.f9257h, this.f9255e, this.f9254d, this.f9258i, this.f9262m, this.f9263n, this.o, i10, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, this.f9273z, this.A, this.B, this.f9261l, this.f9259j, this.f9260k, this.f);
    }

    public static m a(String str, String str2, String str3, int i10, int i11, int i12, List<byte[]> list, com.anythink.expressad.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i10, i11, i12, -1, list, eVar, str4);
    }

    public final boolean b(m mVar) {
        if (this.f9259j.size() != mVar.f9259j.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f9259j.size(); i10++) {
            if (!Arrays.equals(this.f9259j.get(i10), mVar.f9259j.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static m a(String str, String str2, String str3, int i10, int i11, int i12, int i13, List<byte[]> list, com.anythink.expressad.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i10, i11, i12, i13, list, eVar, str4, null);
    }

    private static m a(String str, String str2, String str3, int i10, int i11, int i12, int i13, List<byte[]> list, com.anythink.expressad.exoplayer.d.e eVar, String str4, com.anythink.expressad.exoplayer.g.a aVar) {
        return new m(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i11, i12, i13, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, eVar, aVar);
    }

    private static m a(String str, String str2, int i10, String str3, com.anythink.expressad.exoplayer.d.e eVar) {
        return a(str, str2, (String) null, -1, i10, str3, -1, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    private static m a(String str, String str2, String str3, int i10, int i11, String str4, int i12, com.anythink.expressad.exoplayer.d.e eVar) {
        return a(str, str2, str3, i10, i11, str4, i12, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }

    private static m a(String str, String str2, String str3, int i10, int i11, String str4, com.anythink.expressad.exoplayer.d.e eVar, long j10) {
        return a(str, str2, str3, i10, i11, str4, -1, eVar, j10, (List<byte[]>) Collections.emptyList());
    }

    public static m a(String str, String str2, String str3, int i10, int i11, String str4, int i12, com.anythink.expressad.exoplayer.d.e eVar, long j10, List<byte[]> list) {
        return new m(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, i12, j10, list, eVar, null);
    }

    private static m a(String str, String str2, String str3, int i10, int i11, List<byte[]> list, String str4, com.anythink.expressad.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, -1, Long.MAX_VALUE, list, eVar, null);
    }

    public static m a(String str, String str2) {
        return new m(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static m a(String str, String str2, String str3, com.anythink.expressad.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, eVar, null);
    }

    public final m a(int i10) {
        return new m(this.f9253c, this.f9256g, this.f9257h, this.f9255e, this.f9254d, i10, this.f9262m, this.f9263n, this.o, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, this.f9273z, this.A, this.B, this.f9261l, this.f9259j, this.f9260k, this.f);
    }

    public final m a(long j10) {
        return new m(this.f9253c, this.f9256g, this.f9257h, this.f9255e, this.f9254d, this.f9258i, this.f9262m, this.f9263n, this.o, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, this.f9273z, this.A, this.B, j10, this.f9259j, this.f9260k, this.f);
    }

    private m a(String str, String str2, String str3, int i10, int i11, int i12, int i13, String str4) {
        return new m(str, this.f9256g, str2, str3, i10, this.f9258i, i11, i12, this.o, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, i13, str4, this.B, this.f9261l, this.f9259j, this.f9260k, this.f);
    }

    public final m a(m mVar) {
        if (this == mVar) {
            return this;
        }
        String str = mVar.f9253c;
        String str2 = this.f9255e;
        if (str2 == null) {
            str2 = mVar.f9255e;
        }
        String str3 = str2;
        int i10 = this.f9254d;
        if (i10 == -1) {
            i10 = mVar.f9254d;
        }
        int i11 = i10;
        float f = this.o;
        if (f == -1.0f) {
            f = mVar.o;
        }
        float f10 = f;
        int i12 = this.f9273z | mVar.f9273z;
        String str4 = this.A;
        if (str4 == null) {
            str4 = mVar.A;
        }
        return new m(str, this.f9256g, this.f9257h, str3, i11, this.f9258i, this.f9262m, this.f9263n, f10, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, i12, str4, this.B, this.f9261l, this.f9259j, com.anythink.expressad.exoplayer.d.e.a(mVar.f9260k, this.f9260k), this.f);
    }

    public m(Parcel parcel) {
        this.f9253c = parcel.readString();
        this.f9256g = parcel.readString();
        this.f9257h = parcel.readString();
        this.f9255e = parcel.readString();
        this.f9254d = parcel.readInt();
        this.f9258i = parcel.readInt();
        this.f9262m = parcel.readInt();
        this.f9263n = parcel.readInt();
        this.o = parcel.readFloat();
        this.f9264p = parcel.readInt();
        this.f9265q = parcel.readFloat();
        this.f9267s = af.a(parcel) ? parcel.createByteArray() : null;
        this.f9266r = parcel.readInt();
        this.f9268t = (com.anythink.expressad.exoplayer.l.b) parcel.readParcelable(com.anythink.expressad.exoplayer.l.b.class.getClassLoader());
        this.f9269u = parcel.readInt();
        this.f9270v = parcel.readInt();
        this.f9271w = parcel.readInt();
        this.f9272x = parcel.readInt();
        this.y = parcel.readInt();
        this.f9273z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readInt();
        this.f9261l = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9259j = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f9259j.add(parcel.createByteArray());
        }
        this.f9260k = (com.anythink.expressad.exoplayer.d.e) parcel.readParcelable(com.anythink.expressad.exoplayer.d.e.class.getClassLoader());
        this.f = (com.anythink.expressad.exoplayer.g.a) parcel.readParcelable(com.anythink.expressad.exoplayer.g.a.class.getClassLoader());
    }

    public final m a(int i10, int i11) {
        return new m(this.f9253c, this.f9256g, this.f9257h, this.f9255e, this.f9254d, this.f9258i, this.f9262m, this.f9263n, this.o, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, i10, i11, this.f9273z, this.A, this.B, this.f9261l, this.f9259j, this.f9260k, this.f);
    }

    public final m a(com.anythink.expressad.exoplayer.d.e eVar) {
        return new m(this.f9253c, this.f9256g, this.f9257h, this.f9255e, this.f9254d, this.f9258i, this.f9262m, this.f9263n, this.o, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, this.f9273z, this.A, this.B, this.f9261l, this.f9259j, eVar, this.f);
    }

    public final m a(com.anythink.expressad.exoplayer.g.a aVar) {
        return new m(this.f9253c, this.f9256g, this.f9257h, this.f9255e, this.f9254d, this.f9258i, this.f9262m, this.f9263n, this.o, this.f9264p, this.f9265q, this.f9267s, this.f9266r, this.f9268t, this.f9269u, this.f9270v, this.f9271w, this.f9272x, this.y, this.f9273z, this.A, this.B, this.f9261l, this.f9259j, this.f9260k, aVar);
    }

    public final int a() {
        int i10;
        int i11 = this.f9262m;
        if (i11 == -1 || (i10 = this.f9263n) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    private static m a(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f, List<byte[]> list, com.anythink.expressad.exoplayer.d.e eVar) {
        return a(str, str2, str3, i10, i11, i12, i13, f, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m a(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        return new m(str, str2, str3, str4, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    private static m a(String str, String str2, int i10, String str3) {
        return a(str, str2, (String) null, -1, i10, str3, -1, (com.anythink.expressad.exoplayer.d.e) null, Long.MAX_VALUE, (List<byte[]>) Collections.emptyList());
    }
}
