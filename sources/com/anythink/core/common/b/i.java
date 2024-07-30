package com.anythink.core.common.b;

import android.text.TextUtils;
import com.reyun.mobdna.MobClientInfo;
import com.reyun.mobdna.MobDNA;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static volatile i f5158b;

    /* renamed from: a, reason: collision with root package name */
    private final String f5159a = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private String f5160c;

    /* renamed from: d, reason: collision with root package name */
    private String f5161d;

    /* renamed from: e, reason: collision with root package name */
    private String f5162e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5163g;

    private boolean e() {
        if (!TextUtils.isEmpty(this.f5160c) && !TextUtils.isEmpty(this.f5161d) && !TextUtils.isEmpty(this.f5162e)) {
            return true;
        }
        return false;
    }

    public final void a(int i10, com.anythink.core.common.e.e eVar) {
        if (eVar != null) {
            if (i10 == 4 || i10 == 6) {
                com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
                if (n.a().H()) {
                    a(h10);
                    if (e()) {
                        String str = "";
                        try {
                            Map<String, Object> m10 = n.a().m();
                            if (m10 != null) {
                                str = m10.get("user_id").toString();
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            if (h10.h() == 1 && i10 == 4) {
                                MobDNA.dna_event_ad(str, eVar.H(), eVar.k(), String.valueOf(eVar.w()), 2);
                            } else if (h10.f() == 1 && i10 == 6) {
                                MobDNA.dna_event_ad(str, eVar.H(), eVar.k(), String.valueOf(eVar.w()), 3);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
    }

    public final String b() {
        return this.f5160c;
    }

    public final String c() {
        return this.f5161d;
    }

    public final String d() {
        return this.f5162e;
    }

    public static i a() {
        if (f5158b == null) {
            synchronized (i.class) {
                if (f5158b == null) {
                    f5158b = new i();
                }
            }
        }
        return f5158b;
    }

    public final synchronized boolean a(com.anythink.core.c.a aVar) {
        if (this.f5163g) {
            return true;
        }
        if (aVar == null || aVar.d() != 1) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(this.f5160c) || TextUtils.isEmpty(this.f5161d) || TextUtils.isEmpty(this.f5162e)) {
                MobClientInfo clientInfo = MobDNA.getClientInfo(n.a().g());
                if (clientInfo == null) {
                    return false;
                }
                this.f5160c = clientInfo.oid;
                this.f5161d = clientInfo.appkey;
                this.f5162e = clientInfo.rdid;
            }
        } catch (Throwable unused) {
        }
        boolean e10 = e();
        this.f5163g = e10;
        if (!this.f && e10) {
            this.f = true;
            com.anythink.core.common.j.c.b(this.f5160c, this.f5161d, this.f5162e);
        }
        return this.f5163g;
    }
}
