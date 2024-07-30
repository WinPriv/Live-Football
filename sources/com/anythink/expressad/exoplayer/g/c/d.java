package com.anythink.expressad.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.ac;
import com.anythink.expressad.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.expressad.exoplayer.g.c.d.1
        private static d a(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i10) {
            return new d[i10];
        }

        private static d[] a(int i10) {
            return new d[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f8096a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8098c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8099d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8100e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8101g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f8102h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8103i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8104j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8105k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8106l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8107m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8108a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8109b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8110c;

        public /* synthetic */ a(int i10, long j10, long j11, byte b10) {
            this(i10, j10, j11);
        }

        public static a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private void b(Parcel parcel) {
            parcel.writeInt(this.f8108a);
            parcel.writeLong(this.f8109b);
            parcel.writeLong(this.f8110c);
        }

        private a(int i10, long j10, long j11) {
            this.f8108a = i10;
            this.f8109b = j10;
            this.f8110c = j11;
        }
    }

    public /* synthetic */ d(Parcel parcel, byte b10) {
        this(parcel);
    }

    public static d a(s sVar, long j10, ac acVar) {
        boolean z10;
        List list;
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j13;
        boolean z19;
        long j14;
        boolean z20;
        long j15;
        long h10 = sVar.h();
        if ((sVar.d() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z10) {
            int d10 = sVar.d();
            if ((d10 & 128) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((d10 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((d10 & 32) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((d10 & 16) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z16 && !z18) {
                j13 = g.a(sVar, j10);
            } else {
                j13 = com.anythink.expressad.exoplayer.b.f7291b;
            }
            if (!z16) {
                int d11 = sVar.d();
                ArrayList arrayList = new ArrayList(d11);
                for (int i13 = 0; i13 < d11; i13++) {
                    int d12 = sVar.d();
                    if (!z18) {
                        j15 = g.a(sVar, j10);
                    } else {
                        j15 = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                    arrayList.add(new a(d12, j15, acVar.a(j15), (byte) 0));
                }
                emptyList = arrayList;
            }
            if (z17) {
                long d13 = sVar.d();
                if ((128 & d13) != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                j14 = ((((d13 & 1) << 32) | sVar.h()) * 1000) / 90;
                z19 = z20;
            } else {
                z19 = false;
                j14 = com.anythink.expressad.exoplayer.b.f7291b;
            }
            i10 = sVar.e();
            z14 = z16;
            i11 = sVar.d();
            i12 = sVar.d();
            list = emptyList;
            long j16 = j13;
            z13 = z19;
            j12 = j14;
            z12 = z18;
            z11 = z15;
            j11 = j16;
        } else {
            list = emptyList;
            z11 = false;
            z12 = false;
            j11 = com.anythink.expressad.exoplayer.b.f7291b;
            z13 = false;
            j12 = com.anythink.expressad.exoplayer.b.f7291b;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z14 = false;
        }
        return new d(h10, z10, z11, z14, z12, j11, acVar.a(j11), list, z13, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f8096a);
        parcel.writeByte(this.f8097b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8098c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8099d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8100e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.f8101g);
        int size = this.f8102h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = this.f8102h.get(i11);
            parcel.writeInt(aVar.f8108a);
            parcel.writeLong(aVar.f8109b);
            parcel.writeLong(aVar.f8110c);
        }
        parcel.writeByte(this.f8103i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8104j);
        parcel.writeInt(this.f8105k);
        parcel.writeInt(this.f8106l);
        parcel.writeInt(this.f8107m);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<a> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f8096a = j10;
        this.f8097b = z10;
        this.f8098c = z11;
        this.f8099d = z12;
        this.f8100e = z13;
        this.f = j11;
        this.f8101g = j12;
        this.f8102h = Collections.unmodifiableList(list);
        this.f8103i = z14;
        this.f8104j = j13;
        this.f8105k = i10;
        this.f8106l = i11;
        this.f8107m = i12;
    }

    private d(Parcel parcel) {
        this.f8096a = parcel.readLong();
        this.f8097b = parcel.readByte() == 1;
        this.f8098c = parcel.readByte() == 1;
        this.f8099d = parcel.readByte() == 1;
        this.f8100e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.f8101g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(a.a(parcel));
        }
        this.f8102h = Collections.unmodifiableList(arrayList);
        this.f8103i = parcel.readByte() == 1;
        this.f8104j = parcel.readLong();
        this.f8105k = parcel.readInt();
        this.f8106l = parcel.readInt();
        this.f8107m = parcel.readInt();
    }
}
