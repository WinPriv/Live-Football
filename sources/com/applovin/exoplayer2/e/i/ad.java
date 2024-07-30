package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.ag;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface ad {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f14582a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14583b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f14584c;

        public a(String str, int i10, byte[] bArr) {
            this.f14582a = str;
            this.f14583b = i10;
            this.f14584c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14585a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14586b;

        /* renamed from: c, reason: collision with root package name */
        public final List<a> f14587c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f14588d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.f14585a = i10;
            this.f14586b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f14587c = unmodifiableList;
            this.f14588d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray<ad> a();

        ad a(int i10, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f14589a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14590b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14591c;

        /* renamed from: d, reason: collision with root package name */
        private int f14592d;

        /* renamed from: e, reason: collision with root package name */
        private String f14593e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f14592d != Integer.MIN_VALUE) {
            } else {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10;
            int i11 = this.f14592d;
            if (i11 == Integer.MIN_VALUE) {
                i10 = this.f14590b;
            } else {
                i10 = i11 + this.f14591c;
            }
            this.f14592d = i10;
            this.f14593e = this.f14589a + this.f14592d;
        }

        public int b() {
            d();
            return this.f14592d;
        }

        public String c() {
            d();
            return this.f14593e;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f14589a = str;
            this.f14590b = i11;
            this.f14591c = i12;
            this.f14592d = Integer.MIN_VALUE;
            this.f14593e = "";
        }
    }

    void a();

    void a(ag agVar, com.applovin.exoplayer2.e.j jVar, d dVar);

    void a(com.applovin.exoplayer2.l.y yVar, int i10) throws ai;
}
