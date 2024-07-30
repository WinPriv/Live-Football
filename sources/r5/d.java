package r5;

import android.os.Bundle;
import android.os.Parcel;
import j7.j0;
import j7.v1;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExoplayerCuesDecoder.java */
/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final r5.b f34918a = new r5.b();

    /* renamed from: b, reason: collision with root package name */
    public final k f34919b = new k();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f34920c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f34921d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34922e;

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes2.dex */
    public class a extends l {
        public a() {
        }

        @Override // n4.h
        public final void h() {
            boolean z10;
            ArrayDeque arrayDeque = d.this.f34920c;
            if (arrayDeque.size() < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.d(z10);
            d6.a.a(!arrayDeque.contains(this));
            this.f33298s = 0;
            this.f34928u = null;
            arrayDeque.addFirst(this);
        }
    }

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b implements g {

        /* renamed from: s, reason: collision with root package name */
        public final long f34924s;

        /* renamed from: t, reason: collision with root package name */
        public final j0<r5.a> f34925t;

        public b(long j10, v1 v1Var) {
            this.f34924s = j10;
            this.f34925t = v1Var;
        }

        @Override // r5.g
        public final int a(long j10) {
            if (this.f34924s > j10) {
                return 0;
            }
            return -1;
        }

        @Override // r5.g
        public final long b(int i10) {
            boolean z10;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.a(z10);
            return this.f34924s;
        }

        @Override // r5.g
        public final List<r5.a> c(long j10) {
            if (j10 >= this.f34924s) {
                return this.f34925t;
            }
            j0.b bVar = j0.f30006t;
            return v1.f30113w;
        }

        @Override // r5.g
        public final int d() {
            return 1;
        }
    }

    public d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f34920c.addFirst(new a());
        }
        this.f34921d = 0;
    }

    @Override // n4.d
    public final l b() throws n4.f {
        d6.a.d(!this.f34922e);
        if (this.f34921d == 2) {
            ArrayDeque arrayDeque = this.f34920c;
            if (!arrayDeque.isEmpty()) {
                l lVar = (l) arrayDeque.removeFirst();
                k kVar = this.f34919b;
                if (kVar.f(4)) {
                    lVar.e(4);
                } else {
                    long j10 = kVar.f33324w;
                    ByteBuffer byteBuffer = kVar.f33322u;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    this.f34918a.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    lVar.i(kVar.f33324w, new b(j10, d6.b.a(r5.a.f34893d0, parcelableArrayList)), 0L);
                }
                kVar.h();
                this.f34921d = 0;
                return lVar;
            }
        }
        return null;
    }

    @Override // n4.d
    public final k c() throws n4.f {
        d6.a.d(!this.f34922e);
        if (this.f34921d != 0) {
            return null;
        }
        this.f34921d = 1;
        return this.f34919b;
    }

    @Override // n4.d
    public final void d(k kVar) throws n4.f {
        boolean z10;
        boolean z11 = true;
        d6.a.d(!this.f34922e);
        if (this.f34921d == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (this.f34919b != kVar) {
            z11 = false;
        }
        d6.a.a(z11);
        this.f34921d = 2;
    }

    @Override // n4.d
    public final void flush() {
        d6.a.d(!this.f34922e);
        this.f34919b.h();
        this.f34921d = 0;
    }

    @Override // n4.d
    public final void release() {
        this.f34922e = true;
    }

    @Override // r5.h
    public final void a(long j10) {
    }
}
