package com.anythink.expressad.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends f {
    public static final int V = 2;

    /* renamed from: a, reason: collision with root package name */
    public static final int f11886a = 1;
    private static final String ag = "camp_position";
    protected boolean W;
    protected com.anythink.expressad.foundation.d.c X;
    protected List<com.anythink.expressad.foundation.d.c> Y;
    protected boolean Z;

    /* renamed from: aa, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.b.c f11887aa;

    /* renamed from: ab, reason: collision with root package name */
    protected com.anythink.expressad.videocommon.c.c f11888ab;

    /* renamed from: ac, reason: collision with root package name */
    protected String f11889ac;

    /* renamed from: ad, reason: collision with root package name */
    protected String f11890ad;
    protected com.anythink.expressad.video.module.a.a ae;
    protected int af;
    private boolean ah = false;
    private boolean ai = false;
    private boolean aj = false;

    public k(com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.b.c cVar2, com.anythink.expressad.videocommon.c.c cVar3, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i10, boolean z10) {
        this.Z = false;
        this.ae = new f();
        this.af = 1;
        if (!z10 && cVar != null && w.b(str2) && cVar2 != null && aVar != null) {
            this.X = cVar;
            this.f11890ad = str;
            this.f11889ac = str2;
            this.f11887aa = cVar2;
            this.f11888ab = cVar3;
            this.ae = aVar;
            this.W = true;
            this.af = i10;
            this.Z = false;
            return;
        }
        if (z10 && cVar != null && w.b(str2) && aVar != null) {
            this.X = cVar;
            this.f11890ad = str;
            this.f11889ac = str2;
            this.f11887aa = cVar2;
            this.f11888ab = cVar3;
            this.ae = aVar;
            this.W = true;
            this.af = i10;
            this.Z = true;
        }
    }

    private static void i() {
        com.anythink.expressad.videocommon.b.e.a().a(false);
    }

    private void k() {
        if (this.W && com.anythink.expressad.foundation.g.a.f.f9822k != null && !TextUtils.isEmpty(this.X.aZ())) {
            com.anythink.expressad.foundation.g.a.f.a(this.f11889ac, this.X, "reward");
        }
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        this.X = cVar;
    }

    public final void b(int i10) {
        com.anythink.expressad.foundation.d.c cVar = this.X;
        if (cVar != null) {
            String ah = cVar.ah();
            if (TextUtils.isEmpty(ah)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!ah.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(ah);
                    if (ah.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    ah = sb2.toString();
                } else if (i10 == 2) {
                    if (ah.contains("endscreen_type=1")) {
                        ah = ah.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (ah.contains("endscreen_type=2")) {
                    ah = ah.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.X.q(ah);
            }
        }
    }

    public final void c() {
        Map<String, Long> map;
        String str;
        try {
            com.anythink.expressad.foundation.d.c cVar = this.X;
            if (cVar != null && cVar.j() && this.Z && !this.X.l()) {
                this.ai = true;
                return;
            }
            if (this.W && !TextUtils.isEmpty(this.X.ai()) && (map = com.anythink.expressad.foundation.g.a.f.f9819h) != null && !map.containsKey(this.X.ai()) && !this.ai) {
                com.anythink.expressad.foundation.g.a.f.f9819h.put(this.X.ai(), Long.valueOf(System.currentTimeMillis()));
                String ai = this.X.ai();
                if (this.X.n() == 1) {
                    str = ai + "&to=1&cbt=" + this.X.az() + "&tmorl=" + this.af;
                } else {
                    str = ai + "&to=0&cbt=" + this.X.az() + "&tmorl=" + this.af;
                }
                String str2 = str;
                if (this.Z) {
                    if (this.X.l()) {
                        com.anythink.expressad.a.a.a(com.anythink.core.common.b.n.a().g(), this.X, this.f11889ac, str2, false, true, com.anythink.expressad.a.a.a.f6606j);
                    }
                } else {
                    com.anythink.expressad.a.a.a(com.anythink.core.common.b.n.a().g(), this.X, this.f11889ac, str2, true);
                }
                this.ai = true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void d() {
        String str;
        try {
            if (this.W && !this.ah && !TextUtils.isEmpty(this.X.ag())) {
                this.ah = true;
                this.X.A();
                String ag2 = this.X.ag();
                if (this.X.n() == 1) {
                    str = ag2 + "&to=1&cbt=" + this.X.az() + "&tmorl=" + this.af;
                } else {
                    str = ag2 + "&to=0&cbt=" + this.X.az() + "&tmorl=" + this.af;
                }
                com.anythink.expressad.a.a.a(com.anythink.core.common.b.n.a().g(), this.X, this.f11889ac, str, false, true, com.anythink.expressad.a.a.a.f6605i);
                com.anythink.expressad.video.module.b.a.a(com.anythink.core.common.b.n.a().g(), this.X);
                if (this.W && com.anythink.expressad.foundation.g.a.f.f9822k != null && !TextUtils.isEmpty(this.X.aZ())) {
                    com.anythink.expressad.foundation.g.a.f.a(this.f11889ac, this.X, "reward");
                }
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.b("NotifyListener", th.getMessage(), th);
        }
    }

    public final void e() {
        com.anythink.expressad.foundation.d.c cVar;
        List<String> e10;
        try {
            if (this.W && !this.aj && (cVar = this.X) != null) {
                this.aj = true;
                if ((!cVar.j() || !this.Z || this.X.l()) && !this.Z && (e10 = this.X.e()) != null && e10.size() > 0) {
                    Iterator<String> it = e10.iterator();
                    while (it.hasNext()) {
                        com.anythink.expressad.a.a.a(com.anythink.core.common.b.n.a().g(), this.X, this.f11889ac, it.next(), true);
                    }
                }
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.o.d("NotifyListener", th.getMessage());
        }
    }

    public final void f() {
        com.anythink.expressad.foundation.d.c cVar = this.X;
        if (cVar != null && !TextUtils.isEmpty(cVar.K()) && this.X.L() != null && this.X.L().n() != null) {
            Context g6 = com.anythink.core.common.b.n.a().g();
            com.anythink.expressad.foundation.d.c cVar2 = this.X;
            com.anythink.expressad.a.a.a(g6, cVar2, cVar2.K(), this.X.L().n(), false);
        }
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.Y = list;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.ae.a(i10, obj);
    }

    public final void a(int i10) {
        if (this.X != null) {
            if (i10 == 1 || i10 == 2) {
                com.anythink.expressad.video.module.b.a.a(com.anythink.core.common.b.n.a().g(), this.X, i10, this.af);
            }
        }
    }

    public final void a() {
        if (!this.W || this.X == null) {
            return;
        }
        com.anythink.core.common.b.n.a().g();
        new r(r.f9714q, this.X.aZ(), this.X.Z(), this.X.aa(), this.f11889ac, com.anythink.expressad.foundation.h.k.a()).a(this.X.H() ? r.aQ : r.aR);
    }

    public final void a(int i10, String str) {
        if (this.X != null) {
            com.anythink.core.common.b.n.a().g();
            new r(r.f9715r, this.X.aZ(), this.X.Z(), this.X.aa(), this.f11889ac, com.anythink.expressad.foundation.h.k.a(), i10, str);
        }
    }

    public final void b() {
        com.anythink.expressad.videocommon.b.c cVar = this.f11887aa;
        if (cVar != null) {
            cVar.b(true);
        }
    }

    public final void a(String str) {
        List<com.anythink.expressad.foundation.d.c> list;
        if (this.X == null || (list = this.Y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ag)) {
                this.X = this.Y.get(jSONObject.getInt(ag));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static void g() {
    }

    private static void h() {
    }

    private static void j() {
    }

    private static void l() {
    }

    private static void m() {
    }

    private static void n() {
    }
}
