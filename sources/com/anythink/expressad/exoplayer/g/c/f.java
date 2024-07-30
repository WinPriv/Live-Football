package com.anythink.expressad.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.anythink.expressad.exoplayer.g.c.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.expressad.exoplayer.g.c.f.1
        private static f a(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i10) {
            return new f[i10];
        }

        private static f[] a(int i10) {
            return new f[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f8111a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8112a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8113b;

        public /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }

        public static /* synthetic */ a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private void c(Parcel parcel) {
            parcel.writeInt(this.f8112a);
            parcel.writeLong(this.f8113b);
        }

        private a(int i10, long j10) {
            this.f8112a = i10;
            this.f8113b = j10;
        }

        public static /* synthetic */ void a(a aVar, Parcel parcel) {
            parcel.writeInt(aVar.f8112a);
            parcel.writeLong(aVar.f8113b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f8114a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8115b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8116c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8117d;

        /* renamed from: e, reason: collision with root package name */
        public final long f8118e;
        public final List<a> f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f8119g;

        /* renamed from: h, reason: collision with root package name */
        public final long f8120h;

        /* renamed from: i, reason: collision with root package name */
        public final int f8121i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8122j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8123k;

        private b(long j10, boolean z10, boolean z11, boolean z12, List<a> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f8114a = j10;
            this.f8115b = z10;
            this.f8116c = z11;
            this.f8117d = z12;
            this.f = Collections.unmodifiableList(list);
            this.f8118e = j11;
            this.f8119g = z13;
            this.f8120h = j12;
            this.f8121i = i10;
            this.f8122j = i11;
            this.f8123k = i12;
        }

        public static /* synthetic */ b a(Parcel parcel) {
            return new b(parcel);
        }

        private static b b(s sVar) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            int i10;
            int i11;
            int i12;
            long j10;
            long j11;
            long j12;
            long h10 = sVar.h();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = (sVar.d() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                j10 = com.anythink.expressad.exoplayer.b.f7291b;
                j11 = com.anythink.expressad.exoplayer.b.f7291b;
            } else {
                int d10 = sVar.d();
                boolean z15 = (d10 & 128) != 0;
                z11 = (d10 & 64) != 0;
                boolean z16 = (d10 & 32) != 0;
                long h11 = z11 ? sVar.h() : com.anythink.expressad.exoplayer.b.f7291b;
                if (!z11) {
                    int d11 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d11);
                    for (int i13 = 0; i13 < d11; i13++) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z12 ? (byte) 1 : (byte) 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long d12 = sVar.d();
                    boolean z17 = (128 & d12) != 0;
                    j12 = ((((d12 & 1) << 32) | sVar.h()) * 1000) / 90;
                    z13 = z17;
                } else {
                    j12 = com.anythink.expressad.exoplayer.b.f7291b;
                }
                int e10 = sVar.e();
                int d13 = sVar.d();
                j11 = j12;
                i12 = sVar.d();
                arrayList = arrayList2;
                long j13 = h11;
                i10 = e10;
                i11 = d13;
                j10 = j13;
                boolean z18 = z15;
                z10 = z13;
                z12 = z18;
            }
            return new b(h10, z14, z12, z11, arrayList, j10, z10, j11, i10, i11, i12);
        }

        private static b c(Parcel parcel) {
            return new b(parcel);
        }

        public static /* synthetic */ b a(s sVar) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            int i10;
            int i11;
            int i12;
            long j10;
            long j11;
            long j12;
            long h10 = sVar.h();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = (sVar.d() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                j10 = com.anythink.expressad.exoplayer.b.f7291b;
                j11 = com.anythink.expressad.exoplayer.b.f7291b;
            } else {
                int d10 = sVar.d();
                boolean z15 = (d10 & 128) != 0;
                z11 = (d10 & 64) != 0;
                boolean z16 = (d10 & 32) != 0;
                long h11 = z11 ? sVar.h() : com.anythink.expressad.exoplayer.b.f7291b;
                if (!z11) {
                    int d11 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d11);
                    for (int i13 = 0; i13 < d11; i13++) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z12 ? (byte) 1 : (byte) 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long d12 = sVar.d();
                    boolean z17 = (128 & d12) != 0;
                    j12 = ((((d12 & 1) << 32) | sVar.h()) * 1000) / 90;
                    z13 = z17;
                } else {
                    j12 = com.anythink.expressad.exoplayer.b.f7291b;
                }
                int e10 = sVar.e();
                int d13 = sVar.d();
                j11 = j12;
                i12 = sVar.d();
                arrayList = arrayList2;
                long j13 = h11;
                i10 = e10;
                i11 = d13;
                j10 = j13;
                boolean z18 = z15;
                z10 = z13;
                z12 = z18;
            }
            return new b(h10, z14, z12, z11, arrayList, j10, z10, j11, i10, i11, i12);
        }

        private b(Parcel parcel) {
            this.f8114a = parcel.readLong();
            this.f8115b = parcel.readByte() == 1;
            this.f8116c = parcel.readByte() == 1;
            this.f8117d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(a.a(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f8118e = parcel.readLong();
            this.f8119g = parcel.readByte() == 1;
            this.f8120h = parcel.readLong();
            this.f8121i = parcel.readInt();
            this.f8122j = parcel.readInt();
            this.f8123k = parcel.readInt();
        }

        private void b(Parcel parcel) {
            parcel.writeLong(this.f8114a);
            parcel.writeByte(this.f8115b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8116c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8117d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                a.a(this.f.get(i10), parcel);
            }
            parcel.writeLong(this.f8118e);
            parcel.writeByte(this.f8119g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f8120h);
            parcel.writeInt(this.f8121i);
            parcel.writeInt(this.f8122j);
            parcel.writeInt(this.f8123k);
        }

        private static /* synthetic */ void a(b bVar, Parcel parcel) {
            parcel.writeLong(bVar.f8114a);
            parcel.writeByte(bVar.f8115b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8116c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8117d ? (byte) 1 : (byte) 0);
            int size = bVar.f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                a.a(bVar.f.get(i10), parcel);
            }
            parcel.writeLong(bVar.f8118e);
            parcel.writeByte(bVar.f8119g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f8120h);
            parcel.writeInt(bVar.f8121i);
            parcel.writeInt(bVar.f8122j);
            parcel.writeInt(bVar.f8123k);
        }
    }

    public /* synthetic */ f(Parcel parcel, byte b10) {
        this(parcel);
    }

    public static f a(s sVar) {
        int d10 = sVar.d();
        ArrayList arrayList = new ArrayList(d10);
        for (int i10 = 0; i10 < d10; i10++) {
            arrayList.add(b.a(sVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f8111a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f8111a.get(i11);
            parcel.writeLong(bVar.f8114a);
            parcel.writeByte(bVar.f8115b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8116c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8117d ? (byte) 1 : (byte) 0);
            int size2 = bVar.f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                a.a(bVar.f.get(i12), parcel);
            }
            parcel.writeLong(bVar.f8118e);
            parcel.writeByte(bVar.f8119g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f8120h);
            parcel.writeInt(bVar.f8121i);
            parcel.writeInt(bVar.f8122j);
            parcel.writeInt(bVar.f8123k);
        }
    }

    private f(List<b> list) {
        this.f8111a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f8111a = Collections.unmodifiableList(arrayList);
    }
}
