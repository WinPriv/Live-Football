package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.g.d.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f15208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15210c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15211d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15212e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15213g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f15214h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15215i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15216j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15217k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15218l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15219m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15220a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15221b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15222c;

        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void a(Parcel parcel) {
            parcel.writeInt(this.f15220a);
            parcel.writeLong(this.f15221b);
            parcel.writeLong(this.f15222c);
        }

        private a(int i10, long j10, long j11) {
            this.f15220a = i10;
            this.f15221b = j10;
            this.f15222c = j11;
        }
    }

    public static d a(y yVar, long j10, ag agVar) {
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
        long o = yVar.o();
        if ((yVar.h() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z10) {
            int h10 = yVar.h();
            if ((h10 & 128) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((h10 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((h10 & 32) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((h10 & 16) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z16 && !z18) {
                j13 = g.a(yVar, j10);
            } else {
                j13 = com.anythink.expressad.exoplayer.b.f7291b;
            }
            if (!z16) {
                int h11 = yVar.h();
                ArrayList arrayList = new ArrayList(h11);
                for (int i13 = 0; i13 < h11; i13++) {
                    int h12 = yVar.h();
                    if (!z18) {
                        j15 = g.a(yVar, j10);
                    } else {
                        j15 = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                    arrayList.add(new a(h12, j15, agVar.b(j15)));
                }
                emptyList = arrayList;
            }
            if (z17) {
                long h13 = yVar.h();
                if ((128 & h13) != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                j14 = ((((h13 & 1) << 32) | yVar.o()) * 1000) / 90;
                z19 = z20;
            } else {
                z19 = false;
                j14 = com.anythink.expressad.exoplayer.b.f7291b;
            }
            i10 = yVar.i();
            z14 = z16;
            i11 = yVar.h();
            i12 = yVar.h();
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
        return new d(o, z10, z11, z14, z12, j11, agVar.b(j11), list, z13, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15208a);
        parcel.writeByte(this.f15209b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15210c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15211d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15212e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.f15213g);
        int size = this.f15214h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f15214h.get(i11).a(parcel);
        }
        parcel.writeByte(this.f15215i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15216j);
        parcel.writeInt(this.f15217k);
        parcel.writeInt(this.f15218l);
        parcel.writeInt(this.f15219m);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<a> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f15208a = j10;
        this.f15209b = z10;
        this.f15210c = z11;
        this.f15211d = z12;
        this.f15212e = z13;
        this.f = j11;
        this.f15213g = j12;
        this.f15214h = Collections.unmodifiableList(list);
        this.f15215i = z14;
        this.f15216j = j13;
        this.f15217k = i10;
        this.f15218l = i11;
        this.f15219m = i12;
    }

    private d(Parcel parcel) {
        this.f15208a = parcel.readLong();
        this.f15209b = parcel.readByte() == 1;
        this.f15210c = parcel.readByte() == 1;
        this.f15211d = parcel.readByte() == 1;
        this.f15212e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.f15213g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(a.b(parcel));
        }
        this.f15214h = Collections.unmodifiableList(arrayList);
        this.f15215i = parcel.readByte() == 1;
        this.f15216j = parcel.readLong();
        this.f15217k = parcel.readInt();
        this.f15218l = parcel.readInt();
        this.f15219m = parcel.readInt();
    }
}
