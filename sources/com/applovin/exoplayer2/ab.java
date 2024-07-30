package com.applovin.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ab implements g {

    /* renamed from: a */
    public static final ab f13024a = new b().a();

    /* renamed from: g */
    public static final g.a<ab> f13025g = new com.applovin.exoplayer2.a.l(1);

    /* renamed from: b */
    public final String f13026b;

    /* renamed from: c */
    public final f f13027c;

    /* renamed from: d */
    public final e f13028d;

    /* renamed from: e */
    public final ac f13029e;
    public final c f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f13030a;

        /* renamed from: b */
        public final Object f13031b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f13030a.equals(aVar.f13030a) && com.applovin.exoplayer2.l.ai.a(this.f13031b, aVar.f13031b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f13030a.hashCode() * 31;
            Object obj = this.f13031b;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode + i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private String f13032a;

        /* renamed from: b */
        private Uri f13033b;

        /* renamed from: c */
        private String f13034c;

        /* renamed from: d */
        private long f13035d;

        /* renamed from: e */
        private long f13036e;
        private boolean f;

        /* renamed from: g */
        private boolean f13037g;

        /* renamed from: h */
        private boolean f13038h;

        /* renamed from: i */
        private d.a f13039i;

        /* renamed from: j */
        private List<Object> f13040j;

        /* renamed from: k */
        private String f13041k;

        /* renamed from: l */
        private List<Object> f13042l;

        /* renamed from: m */
        private a f13043m;

        /* renamed from: n */
        private Object f13044n;
        private ac o;

        /* renamed from: p */
        private e.a f13045p;

        public /* synthetic */ b(ab abVar, AnonymousClass1 anonymousClass1) {
            this(abVar);
        }

        public b a(String str) {
            this.f13032a = (String) com.applovin.exoplayer2.l.a.b(str);
            return this;
        }

        public b b(String str) {
            this.f13041k = str;
            return this;
        }

        public b() {
            this.f13036e = Long.MIN_VALUE;
            this.f13039i = new d.a();
            this.f13040j = Collections.emptyList();
            this.f13042l = Collections.emptyList();
            this.f13045p = new e.a();
        }

        public b a(Uri uri) {
            this.f13033b = uri;
            return this;
        }

        public b a(Object obj) {
            this.f13044n = obj;
            return this;
        }

        public ab a() {
            f fVar;
            com.applovin.exoplayer2.l.a.b(this.f13039i.f13059b == null || this.f13039i.f13058a != null);
            Uri uri = this.f13033b;
            if (uri != null) {
                fVar = new f(uri, this.f13034c, this.f13039i.f13058a != null ? this.f13039i.a() : null, this.f13043m, this.f13040j, this.f13041k, this.f13042l, this.f13044n);
            } else {
                fVar = null;
            }
            String str = this.f13032a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            c cVar = new c(this.f13035d, this.f13036e, this.f, this.f13037g, this.f13038h);
            e a10 = this.f13045p.a();
            ac acVar = this.o;
            if (acVar == null) {
                acVar = ac.f13083a;
            }
            return new ab(str2, cVar, fVar, a10, acVar);
        }

        private b(ab abVar) {
            this();
            d.a aVar;
            c cVar = abVar.f;
            this.f13036e = cVar.f13047b;
            this.f = cVar.f13048c;
            this.f13037g = cVar.f13049d;
            this.f13035d = cVar.f13046a;
            this.f13038h = cVar.f13050e;
            this.f13032a = abVar.f13026b;
            this.o = abVar.f13029e;
            this.f13045p = abVar.f13028d.a();
            f fVar = abVar.f13027c;
            if (fVar != null) {
                this.f13041k = fVar.f;
                this.f13034c = fVar.f13077b;
                this.f13033b = fVar.f13076a;
                this.f13040j = fVar.f13080e;
                this.f13042l = fVar.f13081g;
                this.f13044n = fVar.f13082h;
                d dVar = fVar.f13078c;
                if (dVar != null) {
                    aVar = dVar.b();
                } else {
                    aVar = new d.a();
                }
                this.f13039i = aVar;
                this.f13043m = fVar.f13079d;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g {
        public static final g.a<c> f = new a0(0);

        /* renamed from: a */
        public final long f13046a;

        /* renamed from: b */
        public final long f13047b;

        /* renamed from: c */
        public final boolean f13048c;

        /* renamed from: d */
        public final boolean f13049d;

        /* renamed from: e */
        public final boolean f13050e;

        public /* synthetic */ c(long j10, long j11, boolean z10, boolean z11, boolean z12, AnonymousClass1 anonymousClass1) {
            this(j10, j11, z10, z11, z12);
        }

        public static /* synthetic */ c a(Bundle bundle) {
            return new c(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }

        public static /* synthetic */ c b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f13046a == cVar.f13046a && this.f13047b == cVar.f13047b && this.f13048c == cVar.f13048c && this.f13049d == cVar.f13049d && this.f13050e == cVar.f13050e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f13046a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f13047b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f13048c ? 1 : 0)) * 31) + (this.f13049d ? 1 : 0)) * 31) + (this.f13050e ? 1 : 0);
        }

        private c(long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f13046a = j10;
            this.f13047b = j11;
            this.f13048c = z10;
            this.f13049d = z11;
            this.f13050e = z12;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final UUID f13051a;

        /* renamed from: b */
        public final Uri f13052b;

        /* renamed from: c */
        public final com.applovin.exoplayer2.common.a.u<String, String> f13053c;

        /* renamed from: d */
        public final boolean f13054d;

        /* renamed from: e */
        public final boolean f13055e;
        public final boolean f;

        /* renamed from: g */
        public final com.applovin.exoplayer2.common.a.s<Integer> f13056g;

        /* renamed from: h */
        private final byte[] f13057h;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private UUID f13058a;

            /* renamed from: b */
            private Uri f13059b;

            /* renamed from: c */
            private com.applovin.exoplayer2.common.a.u<String, String> f13060c;

            /* renamed from: d */
            private boolean f13061d;

            /* renamed from: e */
            private boolean f13062e;
            private boolean f;

            /* renamed from: g */
            private com.applovin.exoplayer2.common.a.s<Integer> f13063g;

            /* renamed from: h */
            private byte[] f13064h;

            public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
                this();
            }

            public /* synthetic */ a(d dVar, AnonymousClass1 anonymousClass1) {
                this(dVar);
            }

            public d a() {
                return new d(this);
            }

            @Deprecated
            private a() {
                this.f13060c = com.applovin.exoplayer2.common.a.u.a();
                this.f13063g = com.applovin.exoplayer2.common.a.s.g();
            }

            private a(d dVar) {
                this.f13058a = dVar.f13051a;
                this.f13059b = dVar.f13052b;
                this.f13060c = dVar.f13053c;
                this.f13061d = dVar.f13054d;
                this.f13062e = dVar.f13055e;
                this.f = dVar.f;
                this.f13063g = dVar.f13056g;
                this.f13064h = dVar.f13057h;
            }
        }

        public /* synthetic */ d(a aVar, AnonymousClass1 anonymousClass1) {
            this(aVar);
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f13051a.equals(dVar.f13051a) && com.applovin.exoplayer2.l.ai.a(this.f13052b, dVar.f13052b) && com.applovin.exoplayer2.l.ai.a(this.f13053c, dVar.f13053c) && this.f13054d == dVar.f13054d && this.f == dVar.f && this.f13055e == dVar.f13055e && this.f13056g.equals(dVar.f13056g) && Arrays.equals(this.f13057h, dVar.f13057h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f13051a.hashCode() * 31;
            Uri uri = this.f13052b;
            if (uri != null) {
                i10 = uri.hashCode();
            } else {
                i10 = 0;
            }
            return Arrays.hashCode(this.f13057h) + ((this.f13056g.hashCode() + ((((((((this.f13053c.hashCode() + ((hashCode + i10) * 31)) * 31) + (this.f13054d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f13055e ? 1 : 0)) * 31)) * 31);
        }

        private d(a aVar) {
            com.applovin.exoplayer2.l.a.b((aVar.f && aVar.f13059b == null) ? false : true);
            this.f13051a = (UUID) com.applovin.exoplayer2.l.a.b(aVar.f13058a);
            this.f13052b = aVar.f13059b;
            this.f13053c = aVar.f13060c;
            this.f13054d = aVar.f13061d;
            this.f = aVar.f;
            this.f13055e = aVar.f13062e;
            this.f13056g = aVar.f13063g;
            this.f13057h = aVar.f13064h != null ? Arrays.copyOf(aVar.f13064h, aVar.f13064h.length) : null;
        }

        public byte[] a() {
            byte[] bArr = this.f13057h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements g {

        /* renamed from: a */
        public static final e f13065a = new a().a();

        /* renamed from: g */
        public static final g.a<e> f13066g = new b0(0);

        /* renamed from: b */
        public final long f13067b;

        /* renamed from: c */
        public final long f13068c;

        /* renamed from: d */
        public final long f13069d;

        /* renamed from: e */
        public final float f13070e;
        public final float f;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private long f13071a;

            /* renamed from: b */
            private long f13072b;

            /* renamed from: c */
            private long f13073c;

            /* renamed from: d */
            private float f13074d;

            /* renamed from: e */
            private float f13075e;

            public /* synthetic */ a(e eVar, AnonymousClass1 anonymousClass1) {
                this(eVar);
            }

            public a() {
                this.f13071a = com.anythink.expressad.exoplayer.b.f7291b;
                this.f13072b = com.anythink.expressad.exoplayer.b.f7291b;
                this.f13073c = com.anythink.expressad.exoplayer.b.f7291b;
                this.f13074d = -3.4028235E38f;
                this.f13075e = -3.4028235E38f;
            }

            public e a() {
                return new e(this);
            }

            private a(e eVar) {
                this.f13071a = eVar.f13067b;
                this.f13072b = eVar.f13068c;
                this.f13073c = eVar.f13069d;
                this.f13074d = eVar.f13070e;
                this.f13075e = eVar.f;
            }
        }

        public /* synthetic */ e(a aVar, AnonymousClass1 anonymousClass1) {
            this(aVar);
        }

        public static /* synthetic */ e b(Bundle bundle) {
            return a(bundle);
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f13067b == eVar.f13067b && this.f13068c == eVar.f13068c && this.f13069d == eVar.f13069d && this.f13070e == eVar.f13070e && this.f == eVar.f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            long j10 = this.f13067b;
            long j11 = this.f13068c;
            int i11 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f13069d;
            int i12 = (i11 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f = this.f13070e;
            int i13 = 0;
            if (f != gl.Code) {
                i10 = Float.floatToIntBits(f);
            } else {
                i10 = 0;
            }
            int i14 = (i12 + i10) * 31;
            float f10 = this.f;
            if (f10 != gl.Code) {
                i13 = Float.floatToIntBits(f10);
            }
            return i14 + i13;
        }

        private e(a aVar) {
            this(aVar.f13071a, aVar.f13072b, aVar.f13073c, aVar.f13074d, aVar.f13075e);
        }

        public static /* synthetic */ e a(Bundle bundle) {
            return new e(bundle.getLong(a(0), com.anythink.expressad.exoplayer.b.f7291b), bundle.getLong(a(1), com.anythink.expressad.exoplayer.b.f7291b), bundle.getLong(a(2), com.anythink.expressad.exoplayer.b.f7291b), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        @Deprecated
        public e(long j10, long j11, long j12, float f, float f10) {
            this.f13067b = j10;
            this.f13068c = j11;
            this.f13069d = j12;
            this.f13070e = f;
            this.f = f10;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final Uri f13076a;

        /* renamed from: b */
        public final String f13077b;

        /* renamed from: c */
        public final d f13078c;

        /* renamed from: d */
        public final a f13079d;

        /* renamed from: e */
        public final List<Object> f13080e;
        public final String f;

        /* renamed from: g */
        public final List<Object> f13081g;

        /* renamed from: h */
        public final Object f13082h;

        public /* synthetic */ f(Uri uri, String str, d dVar, a aVar, List list, String str2, List list2, Object obj, AnonymousClass1 anonymousClass1) {
            this(uri, str, dVar, aVar, list, str2, list2, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f13076a.equals(fVar.f13076a) && com.applovin.exoplayer2.l.ai.a((Object) this.f13077b, (Object) fVar.f13077b) && com.applovin.exoplayer2.l.ai.a(this.f13078c, fVar.f13078c) && com.applovin.exoplayer2.l.ai.a(this.f13079d, fVar.f13079d) && this.f13080e.equals(fVar.f13080e) && com.applovin.exoplayer2.l.ai.a((Object) this.f, (Object) fVar.f) && this.f13081g.equals(fVar.f13081g) && com.applovin.exoplayer2.l.ai.a(this.f13082h, fVar.f13082h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.f13076a.hashCode() * 31;
            String str = this.f13077b;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode5 + hashCode) * 31;
            d dVar = this.f13078c;
            if (dVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = dVar.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            a aVar = this.f13079d;
            if (aVar == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = aVar.hashCode();
            }
            int hashCode6 = (this.f13080e.hashCode() + ((i12 + hashCode3) * 31)) * 31;
            String str2 = this.f;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode7 = (this.f13081g.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
            Object obj = this.f13082h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode7 + i10;
        }

        private f(Uri uri, String str, d dVar, a aVar, List<Object> list, String str2, List<Object> list2, Object obj) {
            this.f13076a = uri;
            this.f13077b = str;
            this.f13078c = dVar;
            this.f13079d = aVar;
            this.f13080e = list;
            this.f = str2;
            this.f13081g = list2;
            this.f13082h = obj;
        }
    }

    public /* synthetic */ ab(String str, c cVar, f fVar, e eVar, ac acVar, AnonymousClass1 anonymousClass1) {
        this(str, cVar, fVar, eVar, acVar);
    }

    public static ab a(Uri uri) {
        return new b().a(uri).a();
    }

    public static /* synthetic */ ab b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (com.applovin.exoplayer2.l.ai.a((Object) this.f13026b, (Object) abVar.f13026b) && this.f.equals(abVar.f) && com.applovin.exoplayer2.l.ai.a(this.f13027c, abVar.f13027c) && com.applovin.exoplayer2.l.ai.a(this.f13028d, abVar.f13028d) && com.applovin.exoplayer2.l.ai.a(this.f13029e, abVar.f13029e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f13026b.hashCode() * 31;
        f fVar = this.f13027c;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        return this.f13029e.hashCode() + ((this.f.hashCode() + ((this.f13028d.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31);
    }

    private ab(String str, c cVar, f fVar, e eVar, ac acVar) {
        this.f13026b = str;
        this.f13027c = fVar;
        this.f13028d = eVar;
        this.f13029e = acVar;
        this.f = cVar;
    }

    public b a() {
        return new b();
    }

    public static ab a(Bundle bundle) {
        e fromBundle;
        ac fromBundle2;
        c fromBundle3;
        String str = (String) com.applovin.exoplayer2.l.a.b(bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fromBundle = e.f13065a;
        } else {
            fromBundle = e.f13066g.fromBundle(bundle2);
        }
        e eVar = fromBundle;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            fromBundle2 = ac.f13083a;
        } else {
            fromBundle2 = ac.H.fromBundle(bundle3);
        }
        ac acVar = fromBundle2;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            fromBundle3 = new c(0L, Long.MIN_VALUE, false, false, false);
        } else {
            fromBundle3 = c.f.fromBundle(bundle4);
        }
        return new ab(str, fromBundle3, null, eVar, acVar);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
