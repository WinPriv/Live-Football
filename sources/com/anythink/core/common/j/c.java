package com.anythink.core.common.j;

import android.os.PowerManager;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.an;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.g;
import com.anythink.core.common.e.h;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.z;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6049a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6050b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6051c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6052d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6053e = 5;
    public static final int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6054g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6055h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6056i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6057j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6058k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6059l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6060m = 3;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6061n = 4;
    public static final int o = 5;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6062p = 0;

    public static void b(String str, String str2, String str3) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004666";
        hVar.f5620m = str;
        hVar.f5621n = str2;
        hVar.o = str3;
        a(hVar);
    }

    public static void a(e eVar, AdError adError) {
        try {
            h hVar = new h(eVar.Y(), null);
            hVar.f5609a = "1004630";
            hVar.f5610b = eVar.X();
            hVar.f5612d = eVar.W();
            hVar.f5619l = String.valueOf(eVar.U());
            hVar.f5614g = String.valueOf(eVar.I());
            hVar.f5618k = String.valueOf(eVar.F());
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(eVar.W());
            hVar.f5617j = a10 != null ? a10.U() : "";
            if (adError != null) {
                hVar.f5620m = adError.printStackTrace();
                hVar.f5621n = adError.getCode();
            }
            hVar.C = eVar.P();
            hVar.D = eVar.Q();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(h hVar, String str) {
        String str2 = hVar.B;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (TextUtils.equals(str2, jSONArray.optString(i10))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static /* synthetic */ boolean b(h hVar, com.anythink.core.c.a aVar) {
        Map<String, String> e10;
        if (TextUtils.isEmpty(hVar.f5609a) || TextUtils.isEmpty(hVar.B) || TextUtils.isEmpty(hVar.A) || (e10 = aVar.e(hVar.f5609a)) == null) {
            return false;
        }
        if (e10.containsKey("0")) {
            String str = e10.get("0");
            if (TextUtils.isEmpty(str) || !str.contains(hVar.A)) {
                return false;
            }
        } else {
            if (!e10.containsKey(hVar.B)) {
                return false;
            }
            String str2 = e10.get(hVar.B);
            if (TextUtils.isEmpty(str2) || !str2.contains(hVar.A)) {
                return false;
            }
        }
        return true;
    }

    private static void a(String str, String str2, int i10, int i11, int i12, String str3, String str4, int i13, int i14, AdError adError, int i15, double d10, long j10, int i16, int i17, int i18, String str5, String str6) {
        h hVar = new h(str4, String.valueOf(i12));
        hVar.f5609a = "1004631";
        hVar.f5610b = str;
        hVar.f5612d = str2;
        hVar.f5614g = String.valueOf(i10);
        hVar.f5618k = String.valueOf(i11);
        hVar.f5619l = String.valueOf(i16);
        hVar.f5620m = String.valueOf(i12);
        hVar.f5621n = str3;
        hVar.o = String.valueOf(i13);
        hVar.f5622p = String.valueOf(i14);
        hVar.f5623q = adError != null ? adError.getPlatformCode() : "";
        hVar.f5624r = adError != null ? adError.getPlatformMSG() : "";
        hVar.f5625s = String.valueOf(i15);
        hVar.f5626t = String.valueOf(d10);
        if (i14 == 0) {
            hVar.f5627u = String.valueOf(j10);
        }
        hVar.f5628v = String.valueOf(i17);
        hVar.f5629w = String.valueOf(i18);
        com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(str2);
        hVar.f5617j = a10 != null ? a10.U() : "";
        hVar.C = str5;
        hVar.D = str6;
        a(hVar);
    }

    public static void a(e eVar, int i10, AdError adError) {
        try {
            a(eVar.X(), eVar.W(), eVar.I(), eVar.F(), eVar.H(), eVar.x(), eVar.Y(), -1, i10, adError, eVar.v(), eVar.w(), 0L, eVar.U(), eVar.L(), eVar.f5595q, eVar.P(), eVar.Q());
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, int i10, AdError adError, long j10) {
        try {
            a(eVar.X(), eVar.W(), eVar.I(), eVar.F(), eVar.H(), eVar.x(), eVar.Y(), eVar.z(), i10, adError, eVar.v(), eVar.w(), j10, eVar.U(), eVar.L(), eVar.f5595q, eVar.P(), eVar.Q());
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, int i10, String str, String str2) {
        try {
            h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
            hVar.f5609a = "1004633";
            hVar.f5610b = eVar.X();
            hVar.f5612d = eVar.W();
            hVar.f5614g = String.valueOf(eVar.I());
            hVar.f5618k = String.valueOf(eVar.F());
            hVar.f5619l = String.valueOf(eVar.U());
            hVar.f5620m = String.valueOf(i10);
            hVar.f5621n = str;
            hVar.f5623q = str2;
            if (TextUtils.equals(str2, eVar.X())) {
                hVar.f5624r = "0";
            } else {
                hVar.f5624r = "1";
            }
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(eVar.W());
            hVar.f5617j = a10 != null ? a10.U() : "";
            hVar.C = eVar.P();
            hVar.D = eVar.Q();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, boolean z10) {
        h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
        hVar.f5609a = "1004634";
        hVar.f5610b = eVar.X();
        hVar.f5612d = eVar.W();
        hVar.f5614g = String.valueOf(eVar.I());
        hVar.f5618k = String.valueOf(eVar.F());
        hVar.f5619l = String.valueOf(eVar.U());
        hVar.f5620m = String.valueOf(eVar.H());
        hVar.f5621n = eVar.x();
        hVar.o = String.valueOf(eVar.A());
        hVar.f5622p = z10 ? "1" : "0";
        hVar.f5623q = String.valueOf(eVar.f5603z);
        com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(eVar.W());
        hVar.f5617j = a10 != null ? a10.U() : "";
        hVar.A = eVar.Y();
        hVar.C = eVar.P();
        hVar.D = eVar.Q();
        a(hVar);
    }

    public static void a(final e eVar, final boolean z10, final int i10, final int i11, final String str, final int i12, final String str2, final String str3, final String str4, final boolean z11, final String str5) {
        try {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str6;
                    String str7;
                    h hVar = new h(e.this.Y(), String.valueOf(e.this.H()));
                    hVar.f5609a = "1004632";
                    hVar.f5610b = e.this.X();
                    hVar.f5612d = e.this.W();
                    hVar.f5614g = String.valueOf(e.this.I());
                    hVar.f5618k = String.valueOf(e.this.F());
                    hVar.f5619l = String.valueOf(e.this.U());
                    if (z10) {
                        str6 = "1";
                    } else {
                        str6 = "0";
                    }
                    hVar.f5620m = str6;
                    hVar.f5621n = String.valueOf(i10);
                    hVar.o = String.valueOf(i11);
                    hVar.f5622p = str;
                    hVar.f5623q = String.valueOf(i12);
                    hVar.f5624r = str2;
                    hVar.f5625s = str3;
                    String str8 = str4;
                    hVar.f5626t = str8;
                    if (TextUtils.equals(str8, e.this.X())) {
                        hVar.f5627u = "0";
                    } else {
                        hVar.f5627u = "1";
                    }
                    if (z11) {
                        hVar.f5628v = "1";
                    } else {
                        hVar.f5628v = "0";
                    }
                    hVar.f5629w = str5;
                    com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(e.this.W());
                    if (a10 != null) {
                        str7 = a10.U();
                    } else {
                        str7 = "";
                    }
                    hVar.f5617j = str7;
                    hVar.A = e.this.Y();
                    hVar.C = e.this.P();
                    hVar.D = e.this.Q();
                    c.a(hVar);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void a(e eVar, AdError adError, Map<String, Object> map) {
        h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
        hVar.f5609a = "1004636";
        hVar.f5610b = eVar.X();
        hVar.f5612d = eVar.W();
        hVar.f5614g = String.valueOf(eVar.I());
        hVar.f5618k = String.valueOf(eVar.F());
        hVar.f5619l = String.valueOf(eVar.U());
        hVar.f5620m = String.valueOf(eVar.H());
        hVar.f5621n = eVar.x();
        hVar.o = String.valueOf(eVar.A());
        hVar.f5622p = adError.getCode();
        hVar.f5623q = adError.getPlatformCode();
        hVar.f5624r = adError.getPlatformMSG();
        com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(eVar.W());
        hVar.f5617j = a10 != null ? a10.U() : "";
        hVar.A = eVar.Y();
        if (map != null) {
            try {
                if (map.containsKey("offer_id")) {
                    hVar.f5625s = map.get("offer_id").toString();
                }
            } catch (Throwable unused) {
            }
        }
        hVar.C = eVar.P();
        hVar.D = eVar.Q();
        a(hVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004616";
        hVar.f5612d = str5;
        hVar.f5620m = str;
        hVar.f5621n = str2;
        hVar.o = str3;
        hVar.f5622p = str4;
        hVar.f5623q = str6;
        hVar.f5624r = str7;
        a(hVar);
    }

    public static void a(String str, String str2, long j10, long j11, long j12) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004635";
        if (!TextUtils.isEmpty(str2)) {
            hVar.f5612d = str2;
        }
        hVar.f5620m = str;
        hVar.f5621n = String.valueOf(j10);
        hVar.o = String.valueOf(j11);
        hVar.f5622p = String.valueOf(j12);
        a(hVar);
    }

    public static void a(String str, String str2, String str3, String str4) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004637";
        hVar.f5612d = str;
        hVar.f5620m = str2;
        hVar.f5621n = str3;
        hVar.o = str4;
        a(hVar);
    }

    public static void a(String str, String str2, String str3, String str4, long j10, String str5, long j11, long j12, int i10, long j13) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004638";
        hVar.f5612d = str;
        hVar.f5620m = str2;
        hVar.f5621n = str3;
        hVar.o = str4;
        hVar.f5622p = String.valueOf(j10);
        hVar.f5623q = str5;
        hVar.f5624r = String.valueOf(j11);
        hVar.f5625s = String.valueOf(j12);
        hVar.f5626t = "1".equals(str4) ? String.valueOf(j13) : null;
        hVar.f5627u = String.valueOf(i10);
        a(hVar);
    }

    public static void a(e eVar) {
        try {
            h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
            hVar.f5609a = "1004640";
            hVar.f5610b = eVar.X();
            hVar.f5614g = String.valueOf(eVar.I());
            hVar.f5619l = String.valueOf(eVar.U());
            hVar.f5612d = eVar.W();
            hVar.f5620m = String.valueOf(eVar.H());
            hVar.f5621n = eVar.x();
            hVar.o = String.valueOf(eVar.z());
            hVar.f5622p = String.valueOf(eVar.J());
            hVar.f5623q = String.valueOf(eVar.K());
            hVar.C = eVar.P();
            hVar.D = eVar.Q();
            hVar.A = eVar.Y();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, String str) {
        try {
            h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
            hVar.f5609a = "1004639";
            hVar.f5610b = eVar.X();
            hVar.f5612d = eVar.W();
            hVar.f5619l = String.valueOf(eVar.U());
            hVar.f5614g = String.valueOf(eVar.I());
            hVar.f5620m = String.valueOf(eVar.H());
            hVar.f5621n = eVar.x();
            hVar.o = String.valueOf(eVar.z());
            hVar.f5622p = str;
            hVar.A = eVar.Y();
            hVar.C = eVar.P();
            hVar.D = eVar.Q();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(int i10, int i11, int i12, int i13) {
        h hVar = new h(null, String.valueOf(i13));
        hVar.f5609a = "1004641";
        hVar.f5620m = String.valueOf(i10);
        hVar.f5621n = String.valueOf(i11);
        hVar.o = String.valueOf(i12);
        hVar.f5622p = String.valueOf(i13);
        a(hVar);
    }

    public static void a(String str, String str2, String str3, int i10, String str4, long j10, long j11) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004642";
        hVar.f5610b = str;
        hVar.f5620m = str2;
        hVar.f5621n = str3;
        hVar.o = String.valueOf(i10);
        if (i10 == 3 || i10 == 10) {
            hVar.f5622p = str4;
        } else if (i10 == 2) {
            hVar.f5623q = String.valueOf(j10);
            hVar.f5624r = String.valueOf(((float) j11) / 1024.0f);
        }
        a(hVar);
    }

    public static void a(int i10, long j10, long j11, String str) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004644";
        hVar.f5613e = str;
        hVar.f5620m = String.valueOf(i10);
        hVar.f5621n = String.valueOf(j10);
        hVar.o = String.valueOf(j11);
        hVar.f5622p = String.valueOf(j11 - j10);
        a(hVar);
    }

    private static void a(int i10, long j10, long j11, String str, String str2) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004651";
        hVar.f5613e = str;
        hVar.f5620m = String.valueOf(i10);
        hVar.f5621n = String.valueOf(j11 - j10);
        hVar.o = str2;
        a(hVar);
    }

    public static void a(e eVar, boolean z10, long j10, long j11, long j12) {
        try {
            h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
            hVar.f5609a = "1004643";
            hVar.f5610b = eVar.X();
            hVar.f5612d = eVar.W();
            hVar.f5614g = String.valueOf(eVar.I());
            hVar.f5618k = String.valueOf(eVar.F());
            hVar.f5619l = String.valueOf(eVar.U());
            hVar.f5620m = eVar.Y();
            hVar.f5621n = String.valueOf(j10);
            hVar.o = String.valueOf(j11);
            hVar.f5622p = String.valueOf(j12);
            hVar.f5623q = String.valueOf(eVar.H());
            hVar.f5624r = eVar.x();
            hVar.f5625s = String.valueOf(eVar.A());
            hVar.f5626t = String.valueOf(eVar.f5603z);
            hVar.f5627u = z10 ? "1" : "0";
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(eVar.W());
            hVar.f5617j = a10 != null ? a10.U() : "";
            hVar.A = eVar.Y();
            hVar.C = eVar.P();
            hVar.D = eVar.Q();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(e eVar, com.anythink.core.c.d dVar, String str, String str2) {
        try {
            h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
            hVar.f5609a = "1004658";
            hVar.f5610b = eVar.X();
            hVar.f5612d = eVar.W();
            hVar.f5614g = String.valueOf(eVar.I());
            hVar.f5618k = String.valueOf(eVar.F());
            hVar.f5619l = String.valueOf(eVar.U());
            hVar.f5617j = dVar != null ? dVar.U() : "";
            hVar.f5620m = String.valueOf(eVar.H());
            hVar.f5621n = eVar.x();
            hVar.o = eVar.l();
            hVar.f5622p = eVar.e();
            hVar.f5623q = eVar.C;
            hVar.f5624r = str;
            hVar.f5625s = str2;
            hVar.C = eVar.P();
            hVar.D = eVar.Q();
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(j jVar, i iVar, int i10) {
        try {
            h hVar = new h(String.valueOf(jVar.f5661j), String.valueOf(jVar.f));
            hVar.f5609a = "1004679";
            hVar.f5610b = jVar.f5656d;
            hVar.f5612d = jVar.f5654b;
            if (iVar instanceof g) {
                hVar.f5620m = ((g) iVar).T();
            }
            hVar.f5621n = jVar.f5655c;
            hVar.o = iVar.p();
            hVar.f5622p = String.valueOf(iVar.d());
            hVar.f5623q = iVar.e();
            hVar.f5624r = iVar.f();
            hVar.f5625s = String.valueOf(i10);
            a(hVar);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, com.anythink.core.c.d dVar, String str3) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004646";
        hVar.f5610b = str;
        hVar.f5612d = str2;
        hVar.f5614g = String.valueOf(dVar.ae());
        hVar.f5619l = String.valueOf(dVar.O());
        hVar.f5617j = dVar.U();
        hVar.f5626t = String.valueOf(str3);
        a(hVar);
    }

    public static void a(String str, String str2, String str3) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004647";
        hVar.f5613e = str3;
        hVar.f5620m = str2;
        hVar.f5621n = str;
        a(hVar);
    }

    public static void a(j jVar, i iVar, String str, String str2, String str3, String str4) {
        if (jVar == null || iVar == null) {
            return;
        }
        h hVar = new h(null, null);
        hVar.f5609a = "1004648";
        hVar.f5612d = jVar.f5654b;
        hVar.f5620m = iVar.p();
        hVar.f5621n = String.valueOf(iVar.d());
        hVar.o = str;
        hVar.f5622p = str2;
        hVar.f5623q = str3;
        hVar.f5624r = str4;
        hVar.f5610b = jVar.f5656d;
        a(hVar);
    }

    public static void a(j jVar, i iVar, String str, String str2, int i10) {
        if (jVar == null || iVar == null) {
            return;
        }
        h hVar = new h(String.valueOf(jVar.f5661j), String.valueOf(jVar.f));
        hVar.f5609a = "1004650";
        hVar.f5612d = jVar.f5654b;
        hVar.f5620m = iVar.p();
        hVar.f5621n = String.valueOf(iVar.d());
        hVar.o = str;
        hVar.f5622p = str2;
        hVar.f5623q = String.valueOf(i10);
        hVar.f5610b = jVar.f5656d;
        hVar.f5626t = String.valueOf(jVar.f5661j);
        a(hVar);
    }

    public static void a(i iVar, j jVar, String str, String str2) {
        if (iVar == null || jVar == null) {
            return;
        }
        h hVar = new h(String.valueOf(jVar.f5661j), String.valueOf(jVar.f));
        hVar.f5609a = "1004652";
        hVar.f5612d = jVar.f5654b;
        hVar.f5620m = String.valueOf(jVar.f);
        hVar.f5621n = jVar.f5655c;
        hVar.f5610b = jVar.f5656d;
        if (iVar instanceof s) {
            hVar.o = "1";
        } else if (iVar instanceof g) {
            hVar.o = "2";
        } else if (iVar instanceof z) {
            hVar.o = "3";
        }
        hVar.f5622p = str;
        if (TextUtils.equals("0", str)) {
            hVar.f5623q = str2;
        }
        hVar.f5624r = iVar.p();
        hVar.f5625s = iVar.q();
        hVar.f5626t = iVar.B();
        hVar.f5627u = iVar.r();
        hVar.f5628v = iVar.s();
        hVar.f5629w = iVar.t();
        hVar.f5630x = iVar.u();
        hVar.y = iVar.x();
        try {
            if (iVar instanceof aa) {
                StringBuilder sb2 = new StringBuilder();
                String Z = ((aa) iVar).Z();
                if (!TextUtils.isEmpty(Z)) {
                    JSONArray jSONArray = new JSONArray(Z);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        sb2.append(jSONArray.optString(i10));
                        sb2.append(",");
                    }
                    if (sb2.length() > 1) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    hVar.f5631z = sb2.toString();
                }
            }
        } catch (Throwable unused) {
        }
        a(hVar);
    }

    public static void a() {
        h hVar = new h(null, null);
        hVar.f5609a = "1004657";
        a(hVar);
    }

    public static void a(e eVar, ai aiVar, double d10, String str) {
        h hVar = new h(String.valueOf(eVar.Y()), String.valueOf(aiVar.c()));
        hVar.f5609a = "1004659";
        hVar.f5610b = eVar.X();
        hVar.f5612d = eVar.W();
        hVar.f5614g = String.valueOf(eVar.I());
        hVar.f5619l = String.valueOf(eVar.U());
        hVar.f5617j = eVar.V();
        hVar.f5620m = String.valueOf(aiVar.c());
        hVar.f5621n = aiVar.t();
        hVar.o = String.valueOf(d10);
        hVar.f5622p = str;
        hVar.C = eVar.P();
        hVar.D = eVar.Q();
        a(hVar);
    }

    public static void a(ai aiVar, com.anythink.core.common.e.a aVar, long j10, boolean z10, boolean z11) {
        h hVar = new h(String.valueOf(aVar.f5391e), String.valueOf(aiVar.c()));
        hVar.f5609a = "1004660";
        com.anythink.core.c.d dVar = aVar.f5399n;
        hVar.f5610b = aVar.f5389c;
        hVar.f5612d = aVar.f5390d;
        String str = "";
        hVar.f5614g = String.valueOf(dVar != null ? Integer.valueOf(dVar.ae()) : "");
        hVar.f5619l = String.valueOf(dVar != null ? Integer.valueOf(dVar.O()) : "");
        hVar.f5617j = dVar != null ? dVar.U() : "";
        hVar.f5620m = String.valueOf(aiVar.c());
        hVar.f5621n = aiVar.t();
        hVar.o = z10 ? "1" : "2";
        hVar.f5622p = String.valueOf(j10);
        hVar.f5623q = z11 ? "1" : "2";
        if (dVar != null) {
            try {
                str = dVar.c();
            } catch (Throwable unused) {
            }
        }
        hVar.C = str;
        try {
            Object obj = aVar.f5388b.f6025g.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                hVar.D = obj.toString();
            }
        } catch (Throwable unused2) {
        }
        a(hVar);
    }

    public static void a(String str, ai aiVar, boolean z10, long j10, com.anythink.core.common.e.a aVar) {
        com.anythink.core.c.d dVar = aVar != null ? aVar.f5399n : null;
        h hVar = new h(String.valueOf(aVar.f5391e), String.valueOf(aiVar.c()));
        hVar.f5609a = "1004665";
        hVar.f5612d = str;
        String str2 = "";
        hVar.f5617j = dVar != null ? dVar.U() : "";
        hVar.f5620m = String.valueOf(aiVar.c());
        hVar.f5621n = aiVar.t();
        hVar.o = String.valueOf(z10 ? 1 : 2);
        hVar.f5622p = String.valueOf(j10);
        if (dVar != null) {
            try {
                str2 = dVar.c();
            } catch (Throwable unused) {
            }
        }
        hVar.C = str2;
        try {
            Object obj = aVar.f5388b.f6025g.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                hVar.D = obj.toString();
            }
        } catch (Throwable unused2) {
        }
        a(hVar);
    }

    public static void a(an anVar) {
        if (anVar == null) {
            return;
        }
        h hVar = new h(null, String.valueOf(anVar.a()));
        hVar.f5609a = "1004667";
        hVar.f5620m = String.valueOf(anVar.a());
        hVar.f5621n = anVar.b();
        hVar.o = anVar.c();
        hVar.f5622p = anVar.d();
        hVar.f5623q = anVar.f();
        hVar.f5624r = anVar.g();
        hVar.f5625s = String.valueOf(anVar.h());
        hVar.f5626t = anVar.i();
        hVar.f5610b = anVar.e();
        hVar.f5614g = anVar.j();
        hVar.f5619l = anVar.k();
        hVar.f5612d = anVar.l();
        String l10 = anVar.l();
        if (!TextUtils.isEmpty(l10)) {
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(l10);
            hVar.f5617j = a10 != null ? a10.U() : "";
        }
        a(hVar);
    }

    public static void a(e eVar, int i10, String str, double d10, String str2, String str3) {
        h hVar = new h(eVar.Y(), String.valueOf(i10));
        hVar.f5609a = "1004668";
        hVar.f5612d = eVar.W();
        hVar.f5620m = String.valueOf(i10);
        hVar.f5621n = str;
        hVar.o = String.valueOf(d10);
        hVar.f5622p = str2;
        hVar.f5623q = str3;
        hVar.f5617j = eVar.V();
        hVar.f5614g = String.valueOf(eVar.I());
        hVar.f5619l = String.valueOf(eVar.U());
        hVar.C = eVar.P();
        hVar.D = eVar.Q();
        a(hVar);
    }

    public static void a(e eVar, String str, String str2) {
        h hVar = new h(eVar.Y(), String.valueOf(eVar.H()));
        hVar.f5609a = "1004669";
        hVar.f5610b = eVar.X();
        hVar.f5612d = eVar.W();
        hVar.f5620m = String.valueOf(eVar.H());
        hVar.f5621n = str;
        hVar.o = str2;
        hVar.f5617j = eVar.V();
        hVar.f5614g = String.valueOf(eVar.I());
        hVar.f5619l = String.valueOf(eVar.U());
        hVar.C = eVar.P();
        hVar.D = eVar.Q();
        a(hVar);
    }

    public static void a(String str, String str2, int i10, String str3, JSONArray jSONArray, int i11, int i12, int i13, String str4, int i14) {
        h hVar = new h(null, null);
        hVar.f5609a = "1004675";
        hVar.f5610b = str2;
        hVar.f5612d = str;
        hVar.f5620m = str3;
        hVar.f5621n = String.valueOf(i10);
        hVar.o = jSONArray != null ? jSONArray.toString() : "";
        hVar.f5622p = String.valueOf(i11);
        hVar.f5623q = String.valueOf(i12);
        hVar.f5624r = String.valueOf(i13);
        hVar.f5625s = str4;
        hVar.f5626t = String.valueOf(i14);
        a(hVar);
    }

    private static void a(final String str, final String str2, final String str3, final String str4, final String str5, final int i10, final boolean z10, final String str6, final String str7) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.c.2
            @Override // java.lang.Runnable
            public final void run() {
                String str8;
                boolean z11;
                String str9;
                h hVar = new h(str4, str5);
                hVar.f5609a = "1004680";
                hVar.f5610b = str;
                hVar.f5612d = str2;
                hVar.f5620m = str3;
                hVar.f5621n = String.valueOf(i10);
                String str10 = "1";
                if (z10) {
                    str8 = "1";
                } else {
                    str8 = "0";
                }
                hVar.o = str8;
                try {
                    z11 = ((PowerManager) n.a().g().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                    z11 = true;
                }
                if (z11) {
                    str9 = "1";
                } else {
                    str9 = "0";
                }
                hVar.f5622p = str9;
                if (!com.anythink.core.common.k.h.a(n.a().g())) {
                    str10 = "0";
                }
                hVar.f5623q = str10;
                hVar.f5624r = str7;
                hVar.f5625s = str6;
                c.a(hVar);
            }
        });
    }

    public static void a(final h hVar) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.c.3
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
            
                if (r3.contains(r2.A) != false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
            
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x00a4, code lost:
            
                if (r3.contains(r2.A) != false) goto L32;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 348
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.j.c.AnonymousClass3.run():void");
            }
        });
    }

    private static boolean a(h hVar, com.anythink.core.c.a aVar) {
        Map<String, String> e10;
        if (TextUtils.isEmpty(hVar.f5609a) || TextUtils.isEmpty(hVar.B) || TextUtils.isEmpty(hVar.A) || (e10 = aVar.e(hVar.f5609a)) == null) {
            return false;
        }
        if (e10.containsKey("0")) {
            String str = e10.get("0");
            if (TextUtils.isEmpty(str) || !str.contains(hVar.A)) {
                return false;
            }
        } else {
            if (!e10.containsKey(hVar.B)) {
                return false;
            }
            String str2 = e10.get(hVar.B);
            if (TextUtils.isEmpty(str2) || !str2.contains(hVar.A)) {
                return false;
            }
        }
        return true;
    }

    public static void a(final String str) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.c.4
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                h a10 = h.a(str);
                if (!TextUtils.isEmpty(a10.f5609a)) {
                    c.a(a10);
                }
            }
        });
    }
}
