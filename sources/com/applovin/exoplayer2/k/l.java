package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16095a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16097c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16098d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f16099e;

    @Deprecated
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16100g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16101h;

    /* renamed from: i, reason: collision with root package name */
    public final String f16102i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16103j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f16104k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Uri f16105a;

        /* renamed from: b, reason: collision with root package name */
        private long f16106b;

        /* renamed from: c, reason: collision with root package name */
        private int f16107c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f16108d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f16109e;
        private long f;

        /* renamed from: g, reason: collision with root package name */
        private long f16110g;

        /* renamed from: h, reason: collision with root package name */
        private String f16111h;

        /* renamed from: i, reason: collision with root package name */
        private int f16112i;

        /* renamed from: j, reason: collision with root package name */
        private Object f16113j;

        public a a(String str) {
            this.f16105a = Uri.parse(str);
            return this;
        }

        public a b(String str) {
            this.f16111h = str;
            return this;
        }

        public a() {
            this.f16107c = 1;
            this.f16109e = Collections.emptyMap();
            this.f16110g = -1L;
        }

        public a a(Uri uri) {
            this.f16105a = uri;
            return this;
        }

        public a b(int i10) {
            this.f16112i = i10;
            return this;
        }

        public a a(int i10) {
            this.f16107c = i10;
            return this;
        }

        public a a(byte[] bArr) {
            this.f16108d = bArr;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f16109e = map;
            return this;
        }

        private a(l lVar) {
            this.f16105a = lVar.f16095a;
            this.f16106b = lVar.f16096b;
            this.f16107c = lVar.f16097c;
            this.f16108d = lVar.f16098d;
            this.f16109e = lVar.f16099e;
            this.f = lVar.f16100g;
            this.f16110g = lVar.f16101h;
            this.f16111h = lVar.f16102i;
            this.f16112i = lVar.f16103j;
            this.f16113j = lVar.f16104k;
        }

        public a a(long j10) {
            this.f = j10;
            return this;
        }

        public l a() {
            com.applovin.exoplayer2.l.a.a(this.f16105a, "The uri must be set.");
            return new l(this.f16105a, this.f16106b, this.f16107c, this.f16108d, this.f16109e, this.f, this.f16110g, this.f16111h, this.f16112i, this.f16113j);
        }
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return VersionInfo.GIT_BRANCH;
        }
        throw new IllegalStateException();
    }

    public boolean b(int i10) {
        return (this.f16103j & i10) == i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(a());
        sb2.append(" ");
        sb2.append(this.f16095a);
        sb2.append(", ");
        sb2.append(this.f16100g);
        sb2.append(", ");
        sb2.append(this.f16101h);
        sb2.append(", ");
        sb2.append(this.f16102i);
        sb2.append(", ");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f16103j, "]");
    }

    private l(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        com.applovin.exoplayer2.l.a.a(j13 >= 0);
        com.applovin.exoplayer2.l.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f16095a = uri;
        this.f16096b = j10;
        this.f16097c = i10;
        this.f16098d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f16099e = Collections.unmodifiableMap(new HashMap(map));
        this.f16100g = j11;
        this.f = j13;
        this.f16101h = j12;
        this.f16102i = str;
        this.f16103j = i11;
        this.f16104k = obj;
    }

    public final String a() {
        return a(this.f16097c);
    }

    public a b() {
        return new a();
    }
}
