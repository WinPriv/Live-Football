package com.applovin.exoplayer2.k;

import android.content.Context;
import android.os.Handler;
import com.anythink.core.common.b.g;
import com.applovin.exoplayer2.common.a.t;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.w;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements aa, d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.t<String, Integer> f16121a = b();

    /* renamed from: b, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.s<Long> f16122b = com.applovin.exoplayer2.common.a.s.a(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* renamed from: c, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.s<Long> f16123c = com.applovin.exoplayer2.common.a.s.a(248000L, 160000L, 142000L, 127000L, 113000L);

    /* renamed from: d, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.s<Long> f16124d = com.applovin.exoplayer2.common.a.s.a(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* renamed from: e, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.s<Long> f16125e = com.applovin.exoplayer2.common.a.s.a(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
    public static final com.applovin.exoplayer2.common.a.s<Long> f = com.applovin.exoplayer2.common.a.s.a(10000000L, Long.valueOf(g.e.f5059a), 5000000L, 2700000L, 1600000L);

    /* renamed from: g, reason: collision with root package name */
    public static final com.applovin.exoplayer2.common.a.s<Long> f16126g = com.applovin.exoplayer2.common.a.s.a(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    /* renamed from: h, reason: collision with root package name */
    private static n f16127h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.common.a.u<Integer, Long> f16128i;

    /* renamed from: j, reason: collision with root package name */
    private final d.a.C0184a f16129j;

    /* renamed from: k, reason: collision with root package name */
    private final y f16130k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f16131l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f16132m;

    /* renamed from: n, reason: collision with root package name */
    private int f16133n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private long f16134p;

    /* renamed from: q, reason: collision with root package name */
    private int f16135q;

    /* renamed from: r, reason: collision with root package name */
    private long f16136r;

    /* renamed from: s, reason: collision with root package name */
    private long f16137s;

    /* renamed from: t, reason: collision with root package name */
    private long f16138t;

    /* renamed from: u, reason: collision with root package name */
    private long f16139u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16140v;

    /* renamed from: w, reason: collision with root package name */
    private int f16141w;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16142a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Integer, Long> f16143b;

        /* renamed from: c, reason: collision with root package name */
        private int f16144c;

        /* renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.l.d f16145d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16146e;

        public a(Context context) {
            Context applicationContext;
            if (context == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.f16142a = applicationContext;
            this.f16143b = a(ai.b(context));
            this.f16144c = 2000;
            this.f16145d = com.applovin.exoplayer2.l.d.f16291a;
            this.f16146e = true;
        }

        private static com.applovin.exoplayer2.common.a.s<Integer> b(String str) {
            com.applovin.exoplayer2.common.a.s<Integer> b10 = n.f16121a.b(str);
            if (b10.isEmpty()) {
                return com.applovin.exoplayer2.common.a.s.a(2, 2, 2, 2, 2, 2);
            }
            return b10;
        }

        public n a() {
            return new n(this.f16142a, this.f16143b, this.f16144c, this.f16145d, this.f16146e);
        }

        private static Map<Integer, Long> a(String str) {
            com.applovin.exoplayer2.common.a.s<Integer> b10 = b(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            com.applovin.exoplayer2.common.a.s<Long> sVar = n.f16122b;
            hashMap.put(2, sVar.get(b10.get(0).intValue()));
            hashMap.put(3, n.f16123c.get(b10.get(1).intValue()));
            hashMap.put(4, n.f16124d.get(b10.get(2).intValue()));
            hashMap.put(5, n.f16125e.get(b10.get(3).intValue()));
            hashMap.put(10, n.f.get(b10.get(4).intValue()));
            hashMap.put(9, n.f16126g.get(b10.get(5).intValue()));
            hashMap.put(7, sVar.get(b10.get(0).intValue()));
            return hashMap;
        }
    }

    @Override // com.applovin.exoplayer2.k.aa
    public synchronized void b(i iVar, l lVar, boolean z10) {
        if (a(lVar, z10)) {
            if (this.f16133n == 0) {
                this.o = this.f16131l.a();
            }
            this.f16133n++;
        }
    }

    @Override // com.applovin.exoplayer2.k.aa
    public synchronized void c(i iVar, l lVar, boolean z10) {
        boolean z11;
        if (!a(lVar, z10)) {
            return;
        }
        if (this.f16133n > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        com.applovin.exoplayer2.l.a.b(z11);
        long a10 = this.f16131l.a();
        int i10 = (int) (a10 - this.o);
        this.f16136r += i10;
        long j10 = this.f16137s;
        long j11 = this.f16134p;
        this.f16137s = j10 + j11;
        if (i10 > 0) {
            this.f16130k.a((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
            if (this.f16136r >= 2000 || this.f16137s >= 524288) {
                this.f16138t = this.f16130k.a(0.5f);
            }
            a(i10, this.f16134p, this.f16138t);
            this.o = a10;
            this.f16134p = 0L;
        }
        this.f16133n--;
    }

    @Deprecated
    public n() {
        this(null, com.applovin.exoplayer2.common.a.u.a(), 2000, com.applovin.exoplayer2.l.d.f16291a, false);
    }

    @Override // com.applovin.exoplayer2.k.d
    public aa a() {
        return this;
    }

    @Override // com.applovin.exoplayer2.k.aa
    public void a(i iVar, l lVar, boolean z10) {
    }

    private n(Context context, Map<Integer, Long> map, int i10, com.applovin.exoplayer2.l.d dVar, boolean z10) {
        this.f16128i = com.applovin.exoplayer2.common.a.u.a(map);
        this.f16129j = new d.a.C0184a();
        this.f16130k = new y(i10);
        this.f16131l = dVar;
        this.f16132m = z10;
        if (context != null) {
            com.applovin.exoplayer2.l.w a10 = com.applovin.exoplayer2.l.w.a(context);
            int a11 = a10.a();
            this.f16135q = a11;
            this.f16138t = b(a11);
            a10.a(new w.b() { // from class: com.applovin.exoplayer2.k.b0
                @Override // com.applovin.exoplayer2.l.w.b
                public final void onNetworkTypeChanged(int i11) {
                    n.this.a(i11);
                }
            });
            return;
        }
        this.f16135q = 0;
        this.f16138t = b(0);
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (f16127h == null) {
                f16127h = new a(context).a();
            }
            nVar = f16127h;
        }
        return nVar;
    }

    private long b(int i10) {
        Long l10 = this.f16128i.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f16128i.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    @Override // com.applovin.exoplayer2.k.d
    public void a(Handler handler, d.a aVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(aVar);
        this.f16129j.a(handler, aVar);
    }

    @Override // com.applovin.exoplayer2.k.d
    public void a(d.a aVar) {
        this.f16129j.a(aVar);
    }

    private static com.applovin.exoplayer2.common.a.t<String, Integer> b() {
        return com.applovin.exoplayer2.common.a.t.c().a((t.a) "AD", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "AE", (Object[]) new Integer[]{1, 4, 4, 4, 2, 2}).a((t.a) "AF", (Object[]) new Integer[]{4, 4, 3, 4, 2, 2}).a((t.a) "AG", (Object[]) new Integer[]{4, 2, 1, 4, 2, 2}).a((t.a) "AI", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "AL", (Object[]) new Integer[]{1, 1, 1, 1, 2, 2}).a((t.a) "AM", (Object[]) new Integer[]{2, 2, 1, 3, 2, 2}).a((t.a) "AO", (Object[]) new Integer[]{3, 4, 3, 1, 2, 2}).a((t.a) "AR", (Object[]) new Integer[]{2, 4, 2, 1, 2, 2}).a((t.a) "AS", (Object[]) new Integer[]{2, 2, 3, 3, 2, 2}).a((t.a) "AT", (Object[]) new Integer[]{0, 1, 0, 0, 0, 2}).a((t.a) "AU", (Object[]) new Integer[]{0, 2, 0, 1, 1, 2}).a((t.a) "AW", (Object[]) new Integer[]{1, 2, 0, 4, 2, 2}).a((t.a) "AX", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).a((t.a) "AZ", (Object[]) new Integer[]{3, 3, 3, 4, 4, 2}).a((t.a) "BA", (Object[]) new Integer[]{1, 1, 0, 1, 2, 2}).a((t.a) "BB", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).a((t.a) "BD", (Object[]) new Integer[]{2, 0, 3, 3, 2, 2}).a((t.a) "BE", (Object[]) new Integer[]{0, 0, 2, 3, 2, 2}).a((t.a) "BF", (Object[]) new Integer[]{4, 4, 4, 2, 2, 2}).a((t.a) "BG", (Object[]) new Integer[]{0, 1, 0, 0, 2, 2}).a((t.a) "BH", (Object[]) new Integer[]{1, 0, 2, 4, 2, 2}).a((t.a) "BI", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "BJ", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "BL", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "BM", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).a((t.a) "BN", (Object[]) new Integer[]{3, 2, 1, 0, 2, 2}).a((t.a) "BO", (Object[]) new Integer[]{1, 2, 4, 2, 2, 2}).a((t.a) "BQ", (Object[]) new Integer[]{1, 2, 1, 2, 2, 2}).a((t.a) "BR", (Object[]) new Integer[]{2, 4, 3, 2, 2, 2}).a((t.a) "BS", (Object[]) new Integer[]{2, 2, 1, 3, 2, 2}).a((t.a) "BT", (Object[]) new Integer[]{3, 0, 3, 2, 2, 2}).a((t.a) "BW", (Object[]) new Integer[]{3, 4, 1, 1, 2, 2}).a((t.a) "BY", (Object[]) new Integer[]{1, 1, 1, 2, 2, 2}).a((t.a) "BZ", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).a((t.a) "CA", (Object[]) new Integer[]{0, 3, 1, 2, 4, 2}).a((t.a) "CD", (Object[]) new Integer[]{4, 2, 2, 1, 2, 2}).a((t.a) "CF", (Object[]) new Integer[]{4, 2, 3, 2, 2, 2}).a((t.a) "CG", (Object[]) new Integer[]{3, 4, 2, 2, 2, 2}).a((t.a) "CH", (Object[]) new Integer[]{0, 0, 0, 0, 1, 2}).a((t.a) "CI", (Object[]) new Integer[]{3, 3, 3, 3, 2, 2}).a((t.a) "CK", (Object[]) new Integer[]{2, 2, 3, 0, 2, 2}).a((t.a) "CL", (Object[]) new Integer[]{1, 1, 2, 2, 2, 2}).a((t.a) "CM", (Object[]) new Integer[]{3, 4, 3, 2, 2, 2}).a((t.a) "CN", (Object[]) new Integer[]{2, 2, 2, 1, 3, 2}).a((t.a) "CO", (Object[]) new Integer[]{2, 3, 4, 2, 2, 2}).a((t.a) "CR", (Object[]) new Integer[]{2, 3, 4, 4, 2, 2}).a((t.a) "CU", (Object[]) new Integer[]{4, 4, 2, 2, 2, 2}).a((t.a) "CV", (Object[]) new Integer[]{2, 3, 1, 0, 2, 2}).a((t.a) "CW", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "CY", (Object[]) new Integer[]{1, 1, 0, 0, 2, 2}).a((t.a) "CZ", (Object[]) new Integer[]{0, 1, 0, 0, 1, 2}).a((t.a) "DE", (Object[]) new Integer[]{0, 0, 1, 1, 0, 2}).a((t.a) "DJ", (Object[]) new Integer[]{4, 0, 4, 4, 2, 2}).a((t.a) "DK", (Object[]) new Integer[]{0, 0, 1, 0, 0, 2}).a((t.a) "DM", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "DO", (Object[]) new Integer[]{3, 4, 4, 4, 2, 2}).a((t.a) "DZ", (Object[]) new Integer[]{3, 3, 4, 4, 2, 4}).a((t.a) "EC", (Object[]) new Integer[]{2, 4, 3, 1, 2, 2}).a((t.a) "EE", (Object[]) new Integer[]{0, 1, 0, 0, 2, 2}).a((t.a) "EG", (Object[]) new Integer[]{3, 4, 3, 3, 2, 2}).a((t.a) "EH", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).a((t.a) "ER", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).a((t.a) "ES", (Object[]) new Integer[]{0, 1, 1, 1, 2, 2}).a((t.a) "ET", (Object[]) new Integer[]{4, 4, 4, 1, 2, 2}).a((t.a) "FI", (Object[]) new Integer[]{0, 0, 0, 0, 0, 2}).a((t.a) "FJ", (Object[]) new Integer[]{3, 0, 2, 3, 2, 2}).a((t.a) "FK", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).a((t.a) "FM", (Object[]) new Integer[]{3, 2, 4, 4, 2, 2}).a((t.a) "FO", (Object[]) new Integer[]{1, 2, 0, 1, 2, 2}).a((t.a) "FR", (Object[]) new Integer[]{1, 1, 2, 0, 1, 2}).a((t.a) "GA", (Object[]) new Integer[]{3, 4, 1, 1, 2, 2}).a((t.a) "GB", (Object[]) new Integer[]{0, 0, 1, 1, 1, 2}).a((t.a) "GD", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "GE", (Object[]) new Integer[]{1, 1, 1, 2, 2, 2}).a((t.a) "GF", (Object[]) new Integer[]{2, 2, 2, 3, 2, 2}).a((t.a) "GG", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "GH", (Object[]) new Integer[]{3, 1, 3, 2, 2, 2}).a((t.a) "GI", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).a((t.a) "GL", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "GM", (Object[]) new Integer[]{4, 3, 2, 4, 2, 2}).a((t.a) "GN", (Object[]) new Integer[]{4, 3, 4, 2, 2, 2}).a((t.a) "GP", (Object[]) new Integer[]{2, 1, 2, 3, 2, 2}).a((t.a) "GQ", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).a((t.a) "GR", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "GT", (Object[]) new Integer[]{3, 2, 3, 1, 2, 2}).a((t.a) "GU", (Object[]) new Integer[]{1, 2, 3, 4, 2, 2}).a((t.a) "GW", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "GY", (Object[]) new Integer[]{3, 3, 3, 4, 2, 2}).a((t.a) com.anythink.expressad.video.dynview.a.a.ae, (Object[]) new Integer[]{0, 1, 2, 3, 2, 0}).a((t.a) "HN", (Object[]) new Integer[]{3, 1, 3, 3, 2, 2}).a((t.a) "HR", (Object[]) new Integer[]{1, 1, 0, 0, 3, 2}).a((t.a) "HT", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "HU", (Object[]) new Integer[]{0, 0, 0, 0, 0, 2}).a((t.a) "ID", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).a((t.a) "IE", (Object[]) new Integer[]{0, 0, 1, 1, 3, 2}).a((t.a) "IL", (Object[]) new Integer[]{1, 0, 2, 3, 4, 2}).a((t.a) "IM", (Object[]) new Integer[]{0, 2, 0, 1, 2, 2}).a((t.a) "IN", (Object[]) new Integer[]{2, 1, 3, 3, 2, 2}).a((t.a) "IO", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).a((t.a) "IQ", (Object[]) new Integer[]{3, 3, 4, 4, 2, 2}).a((t.a) "IR", (Object[]) new Integer[]{3, 2, 3, 2, 2, 2}).a((t.a) IronSourceConstants.INTERSTITIAL_EVENT_TYPE, (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).a((t.a) "IT", (Object[]) new Integer[]{0, 4, 0, 1, 2, 2}).a((t.a) "JE", (Object[]) new Integer[]{2, 2, 1, 2, 2, 2}).a((t.a) "JM", (Object[]) new Integer[]{3, 3, 4, 4, 2, 2}).a((t.a) "JO", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).a((t.a) "JP", (Object[]) new Integer[]{0, 0, 0, 0, 2, 1}).a((t.a) "KE", (Object[]) new Integer[]{3, 4, 2, 2, 2, 2}).a((t.a) "KG", (Object[]) new Integer[]{2, 0, 1, 1, 2, 2}).a((t.a) "KH", (Object[]) new Integer[]{1, 0, 4, 3, 2, 2}).a((t.a) "KI", (Object[]) new Integer[]{4, 2, 4, 3, 2, 2}).a((t.a) "KM", (Object[]) new Integer[]{4, 3, 2, 3, 2, 2}).a((t.a) "KN", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "KP", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).a((t.a) "KR", (Object[]) new Integer[]{0, 0, 1, 3, 1, 2}).a((t.a) "KW", (Object[]) new Integer[]{1, 3, 1, 1, 1, 2}).a((t.a) "KY", (Object[]) new Integer[]{1, 2, 0, 2, 2, 2}).a((t.a) "KZ", (Object[]) new Integer[]{2, 2, 2, 3, 2, 2}).a((t.a) "LA", (Object[]) new Integer[]{1, 2, 1, 1, 2, 2}).a((t.a) "LB", (Object[]) new Integer[]{3, 2, 0, 0, 2, 2}).a((t.a) "LC", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "LI", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).a((t.a) "LK", (Object[]) new Integer[]{2, 0, 2, 3, 2, 2}).a((t.a) "LR", (Object[]) new Integer[]{3, 4, 4, 3, 2, 2}).a((t.a) "LS", (Object[]) new Integer[]{3, 3, 2, 3, 2, 2}).a((t.a) "LT", (Object[]) new Integer[]{0, 0, 0, 0, 2, 2}).a((t.a) "LU", (Object[]) new Integer[]{1, 0, 1, 1, 2, 2}).a((t.a) "LV", (Object[]) new Integer[]{0, 0, 0, 0, 2, 2}).a((t.a) "LY", (Object[]) new Integer[]{4, 2, 4, 3, 2, 2}).a((t.a) "MA", (Object[]) new Integer[]{3, 2, 2, 1, 2, 2}).a((t.a) "MC", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).a((t.a) "MD", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "ME", (Object[]) new Integer[]{1, 2, 0, 1, 2, 2}).a((t.a) "MF", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).a((t.a) "MG", (Object[]) new Integer[]{3, 4, 2, 2, 2, 2}).a((t.a) "MH", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).a((t.a) "MK", (Object[]) new Integer[]{1, 1, 0, 0, 2, 2}).a((t.a) "ML", (Object[]) new Integer[]{4, 4, 2, 2, 2, 2}).a((t.a) "MM", (Object[]) new Integer[]{2, 3, 3, 3, 2, 2}).a((t.a) "MN", (Object[]) new Integer[]{2, 4, 2, 2, 2, 2}).a((t.a) "MO", (Object[]) new Integer[]{0, 2, 4, 4, 2, 2}).a((t.a) "MP", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).a((t.a) "MQ", (Object[]) new Integer[]{2, 2, 2, 3, 2, 2}).a((t.a) "MR", (Object[]) new Integer[]{3, 0, 4, 3, 2, 2}).a((t.a) "MS", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "MT", (Object[]) new Integer[]{0, 2, 0, 0, 2, 2}).a((t.a) "MU", (Object[]) new Integer[]{2, 1, 1, 2, 2, 2}).a((t.a) "MV", (Object[]) new Integer[]{4, 3, 2, 4, 2, 2}).a((t.a) "MW", (Object[]) new Integer[]{4, 2, 1, 0, 2, 2}).a((t.a) "MX", (Object[]) new Integer[]{2, 4, 4, 4, 4, 2}).a((t.a) "MY", (Object[]) new Integer[]{1, 0, 3, 2, 2, 2}).a((t.a) "MZ", (Object[]) new Integer[]{3, 3, 2, 1, 2, 2}).a((t.a) "NA", (Object[]) new Integer[]{4, 3, 3, 2, 2, 2}).a((t.a) "NC", (Object[]) new Integer[]{3, 0, 4, 4, 2, 2}).a((t.a) "NE", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "NF", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).a((t.a) "NG", (Object[]) new Integer[]{3, 3, 2, 3, 2, 2}).a((t.a) "NI", (Object[]) new Integer[]{2, 1, 4, 4, 2, 2}).a((t.a) "NL", (Object[]) new Integer[]{0, 2, 3, 2, 0, 2}).a((t.a) "NO", (Object[]) new Integer[]{0, 1, 2, 0, 0, 2}).a((t.a) "NP", (Object[]) new Integer[]{2, 0, 4, 2, 2, 2}).a((t.a) "NR", (Object[]) new Integer[]{3, 2, 3, 1, 2, 2}).a((t.a) "NU", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).a((t.a) "NZ", (Object[]) new Integer[]{0, 2, 1, 2, 4, 2}).a((t.a) "OM", (Object[]) new Integer[]{2, 2, 1, 3, 3, 2}).a((t.a) "PA", (Object[]) new Integer[]{1, 3, 3, 3, 2, 2}).a((t.a) "PE", (Object[]) new Integer[]{2, 3, 4, 4, 2, 2}).a((t.a) "PF", (Object[]) new Integer[]{2, 2, 2, 1, 2, 2}).a((t.a) "PG", (Object[]) new Integer[]{4, 4, 3, 2, 2, 2}).a((t.a) "PH", (Object[]) new Integer[]{2, 1, 3, 3, 3, 2}).a((t.a) "PK", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).a((t.a) "PL", (Object[]) new Integer[]{1, 0, 1, 2, 3, 2}).a((t.a) "PM", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).a((t.a) "PR", (Object[]) new Integer[]{2, 1, 2, 2, 4, 3}).a((t.a) "PS", (Object[]) new Integer[]{3, 3, 2, 2, 2, 2}).a((t.a) "PT", (Object[]) new Integer[]{0, 1, 1, 0, 2, 2}).a((t.a) "PW", (Object[]) new Integer[]{1, 2, 4, 1, 2, 2}).a((t.a) "PY", (Object[]) new Integer[]{2, 0, 3, 2, 2, 2}).a((t.a) "QA", (Object[]) new Integer[]{2, 3, 1, 2, 3, 2}).a((t.a) "RE", (Object[]) new Integer[]{1, 0, 2, 2, 2, 2}).a((t.a) "RO", (Object[]) new Integer[]{0, 1, 0, 1, 0, 2}).a((t.a) "RS", (Object[]) new Integer[]{1, 2, 0, 0, 2, 2}).a((t.a) "RU", (Object[]) new Integer[]{0, 1, 0, 1, 4, 2}).a((t.a) "RW", (Object[]) new Integer[]{3, 3, 3, 1, 2, 2}).a((t.a) "SA", (Object[]) new Integer[]{2, 2, 2, 1, 1, 2}).a((t.a) "SB", (Object[]) new Integer[]{4, 2, 3, 2, 2, 2}).a((t.a) "SC", (Object[]) new Integer[]{4, 2, 1, 3, 2, 2}).a((t.a) "SD", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "SE", (Object[]) new Integer[]{0, 0, 0, 0, 0, 2}).a((t.a) "SG", (Object[]) new Integer[]{1, 0, 1, 2, 3, 2}).a((t.a) "SH", (Object[]) new Integer[]{4, 2, 2, 2, 2, 2}).a((t.a) "SI", (Object[]) new Integer[]{0, 0, 0, 0, 2, 2}).a((t.a) "SJ", (Object[]) new Integer[]{2, 2, 2, 2, 2, 2}).a((t.a) "SK", (Object[]) new Integer[]{0, 1, 0, 0, 2, 2}).a((t.a) "SL", (Object[]) new Integer[]{4, 3, 4, 0, 2, 2}).a((t.a) "SM", (Object[]) new Integer[]{0, 2, 2, 2, 2, 2}).a((t.a) "SN", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "SO", (Object[]) new Integer[]{3, 3, 3, 4, 2, 2}).a((t.a) "SR", (Object[]) new Integer[]{3, 2, 2, 2, 2, 2}).a((t.a) "SS", (Object[]) new Integer[]{4, 4, 3, 3, 2, 2}).a((t.a) "ST", (Object[]) new Integer[]{2, 2, 1, 2, 2, 2}).a((t.a) "SV", (Object[]) new Integer[]{2, 1, 4, 3, 2, 2}).a((t.a) "SX", (Object[]) new Integer[]{2, 2, 1, 0, 2, 2}).a((t.a) "SY", (Object[]) new Integer[]{4, 3, 3, 2, 2, 2}).a((t.a) "SZ", (Object[]) new Integer[]{3, 3, 2, 4, 2, 2}).a((t.a) "TC", (Object[]) new Integer[]{2, 2, 2, 0, 2, 2}).a((t.a) "TD", (Object[]) new Integer[]{4, 3, 4, 4, 2, 2}).a((t.a) "TG", (Object[]) new Integer[]{3, 2, 2, 4, 2, 2}).a((t.a) "TH", (Object[]) new Integer[]{0, 3, 2, 3, 2, 2}).a((t.a) "TJ", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "TL", (Object[]) new Integer[]{4, 0, 4, 4, 2, 2}).a((t.a) "TM", (Object[]) new Integer[]{4, 2, 4, 3, 2, 2}).a((t.a) "TN", (Object[]) new Integer[]{2, 1, 1, 2, 2, 2}).a((t.a) "TO", (Object[]) new Integer[]{3, 3, 4, 3, 2, 2}).a((t.a) "TR", (Object[]) new Integer[]{1, 2, 1, 1, 2, 2}).a((t.a) "TT", (Object[]) new Integer[]{1, 4, 0, 1, 2, 2}).a((t.a) "TV", (Object[]) new Integer[]{3, 2, 2, 4, 2, 2}).a((t.a) com.anythink.expressad.video.dynview.a.a.f11380ad, (Object[]) new Integer[]{0, 0, 0, 0, 1, 0}).a((t.a) "TZ", (Object[]) new Integer[]{3, 3, 3, 2, 2, 2}).a((t.a) "UA", (Object[]) new Integer[]{0, 3, 1, 1, 2, 2}).a((t.a) "UG", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).a((t.a) "US", (Object[]) new Integer[]{1, 1, 2, 2, 4, 2}).a((t.a) "UY", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).a((t.a) "UZ", (Object[]) new Integer[]{2, 1, 3, 4, 2, 2}).a((t.a) "VC", (Object[]) new Integer[]{1, 2, 2, 2, 2, 2}).a((t.a) "VE", (Object[]) new Integer[]{4, 4, 4, 4, 2, 2}).a((t.a) "VG", (Object[]) new Integer[]{2, 2, 1, 1, 2, 2}).a((t.a) "VI", (Object[]) new Integer[]{1, 2, 1, 2, 2, 2}).a((t.a) "VN", (Object[]) new Integer[]{0, 1, 3, 4, 2, 2}).a((t.a) "VU", (Object[]) new Integer[]{4, 0, 3, 1, 2, 2}).a((t.a) "WF", (Object[]) new Integer[]{4, 2, 2, 4, 2, 2}).a((t.a) "WS", (Object[]) new Integer[]{3, 1, 3, 1, 2, 2}).a((t.a) "XK", (Object[]) new Integer[]{0, 1, 1, 0, 2, 2}).a((t.a) "YE", (Object[]) new Integer[]{4, 4, 4, 3, 2, 2}).a((t.a) "YT", (Object[]) new Integer[]{4, 2, 2, 3, 2, 2}).a((t.a) "ZA", (Object[]) new Integer[]{3, 3, 2, 1, 2, 2}).a((t.a) "ZM", (Object[]) new Integer[]{3, 2, 3, 3, 2, 2}).a((t.a) "ZW", (Object[]) new Integer[]{3, 2, 4, 3, 2, 2}).b();
    }

    @Override // com.applovin.exoplayer2.k.aa
    public synchronized void a(i iVar, l lVar, boolean z10, int i10) {
        if (a(lVar, z10)) {
            this.f16134p += i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i10) {
        int i11 = this.f16135q;
        if (i11 == 0 || this.f16132m) {
            if (this.f16140v) {
                i10 = this.f16141w;
            }
            if (i11 == i10) {
                return;
            }
            this.f16135q = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f16138t = b(i10);
                long a10 = this.f16131l.a();
                a(this.f16133n > 0 ? (int) (a10 - this.o) : 0, this.f16134p, this.f16138t);
                this.o = a10;
                this.f16134p = 0L;
                this.f16137s = 0L;
                this.f16136r = 0L;
                this.f16130k.a();
            }
        }
    }

    private void a(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f16139u) {
            return;
        }
        this.f16139u = j11;
        this.f16129j.a(i10, j10, j11);
    }

    private static boolean a(l lVar, boolean z10) {
        return z10 && !lVar.b(8);
    }
}
