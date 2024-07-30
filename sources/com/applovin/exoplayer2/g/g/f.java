package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.applovin.exoplayer2.g.g.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.applovin.exoplayer2.g.g.f.1
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
    public final List<b> f15223a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15224a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15225b;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f15224a);
            parcel.writeLong(this.f15225b);
        }

        private a(int i10, long j10) {
            this.f15224a = i10;
            this.f15225b = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f15226a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15227b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15228c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15229d;

        /* renamed from: e, reason: collision with root package name */
        public final long f15230e;
        public final List<a> f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f15231g;

        /* renamed from: h, reason: collision with root package name */
        public final long f15232h;

        /* renamed from: i, reason: collision with root package name */
        public final int f15233i;

        /* renamed from: j, reason: collision with root package name */
        public final int f15234j;

        /* renamed from: k, reason: collision with root package name */
        public final int f15235k;

        private b(long j10, boolean z10, boolean z11, boolean z12, List<a> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f15226a = j10;
            this.f15227b = z10;
            this.f15228c = z11;
            this.f15229d = z12;
            this.f = Collections.unmodifiableList(list);
            this.f15230e = j11;
            this.f15231g = z13;
            this.f15232h = j12;
            this.f15233i = i10;
            this.f15234j = i11;
            this.f15235k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(y yVar) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long o = yVar.o();
            boolean z14 = (yVar.h() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = com.anythink.expressad.exoplayer.b.f7291b;
                z11 = false;
                j11 = com.anythink.expressad.exoplayer.b.f7291b;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int h10 = yVar.h();
                boolean z15 = (h10 & 128) != 0;
                boolean z16 = (h10 & 64) != 0;
                boolean z17 = (h10 & 32) != 0;
                long o6 = z16 ? yVar.o() : com.anythink.expressad.exoplayer.b.f7291b;
                if (!z16) {
                    int h11 = yVar.h();
                    ArrayList arrayList3 = new ArrayList(h11);
                    for (int i13 = 0; i13 < h11; i13++) {
                        arrayList3.add(new a(yVar.h(), yVar.o()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long h12 = yVar.h();
                    boolean z18 = (128 & h12) != 0;
                    j12 = ((((h12 & 1) << 32) | yVar.o()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = com.anythink.expressad.exoplayer.b.f7291b;
                }
                int i14 = yVar.i();
                int h13 = yVar.h();
                z12 = z16;
                i12 = yVar.h();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = o6;
                i10 = i14;
                i11 = h13;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new b(o, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel);
        }

        private b(Parcel parcel) {
            this.f15226a = parcel.readLong();
            this.f15227b = parcel.readByte() == 1;
            this.f15228c = parcel.readByte() == 1;
            this.f15229d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(a.b(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f15230e = parcel.readLong();
            this.f15231g = parcel.readByte() == 1;
            this.f15232h = parcel.readLong();
            this.f15233i = parcel.readInt();
            this.f15234j = parcel.readInt();
            this.f15235k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Parcel parcel) {
            parcel.writeLong(this.f15226a);
            parcel.writeByte(this.f15227b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f15228c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f15229d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f.get(i10).c(parcel);
            }
            parcel.writeLong(this.f15230e);
            parcel.writeByte(this.f15231g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f15232h);
            parcel.writeInt(this.f15233i);
            parcel.writeInt(this.f15234j);
            parcel.writeInt(this.f15235k);
        }
    }

    public static f a(y yVar) {
        int h10 = yVar.h();
        ArrayList arrayList = new ArrayList(h10);
        for (int i10 = 0; i10 < h10; i10++) {
            arrayList.add(b.b(yVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f15223a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f15223a.get(i11).b(parcel);
        }
    }

    private f(List<b> list) {
        this.f15223a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.c(parcel));
        }
        this.f15223a = Collections.unmodifiableList(arrayList);
    }
}
