package com.anythink.core.common.j;

import a3.k;
import a3.l;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ah;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.f;
import com.anythink.core.common.e.m;
import com.anythink.core.common.g.a.c;
import com.anythink.core.common.g.i;
import com.anythink.core.common.k.g;
import com.anythink.core.common.o;
import com.anythink.core.common.q;
import com.anythink.core.common.r;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a extends o<f> {
    private static volatile a f;

    private a(Context context) {
        super(context);
    }

    private void b(int i10, ah ahVar, ai aiVar) {
        if (i10 == 4) {
            m N = aiVar != null ? aiVar.N() : null;
            if (N != null) {
                N.a(true, N.getSortPrice(), true);
            }
            if (ahVar instanceof e) {
                a((e) ahVar, aiVar);
            }
        }
    }

    private static boolean c(int i10, ah ahVar) {
        Map<String, String> a10;
        if (!(ahVar instanceof e)) {
            return false;
        }
        e eVar = (e) ahVar;
        if (eVar.H() == 67) {
            return true;
        }
        if (eVar.H() != 0 && !TextUtils.isEmpty(ahVar.Y()) && (a10 = k.e().b(n.a().p()).a(i10)) != null) {
            if (a10.containsKey("0")) {
                String str = a10.get("0");
                if (TextUtils.isEmpty(str) || !str.contains(ahVar.Y())) {
                    return false;
                }
                return true;
            }
            e eVar2 = (e) ahVar;
            if (a10.containsKey(String.valueOf(eVar2.H()))) {
                String str2 = a10.get(String.valueOf(eVar2.H()));
                if (!TextUtils.isEmpty(str2) && str2.contains(ahVar.Y())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void d(int i10, ah ahVar) {
        if (4 == i10 && (ahVar instanceof e)) {
            q.a();
            q.a((e) ahVar);
        }
    }

    private static void e(int i10, ah ahVar) {
        if (ahVar instanceof e) {
            if (i10 != 4) {
                if (i10 != 6) {
                    if (i10 == 21) {
                        n.a().M();
                        return;
                    }
                    return;
                }
                ((e) ahVar).d();
                return;
            }
            ((e) ahVar).c();
        }
    }

    @Override // com.anythink.core.common.o
    public final void a(List<f> list) {
        com.anythink.core.c.a h10 = l.h(k.e());
        if (h10 != null) {
            int u2 = h10.u();
            if (u2 == 1) {
                com.anythink.core.common.g.a.e eVar = new com.anythink.core.common.g.a.e(list);
                eVar.a(1, h10.t());
                eVar.a((c.a) null);
                return;
            } else {
                if (u2 != 2) {
                    new com.anythink.core.common.g.m(this.f6362e, h10.u(), list).a(0, (i) null);
                    return;
                }
                new com.anythink.core.common.g.m(this.f6362e, h10.u(), list).a(0, (i) null);
                com.anythink.core.common.g.a.e eVar2 = new com.anythink.core.common.g.a.e(list);
                eVar2.a(2, h10.t());
                eVar2.a((c.a) null);
                return;
            }
        }
        new com.anythink.core.common.g.m(this.f6362e, 0, list).a(0, (i) null);
    }

    private f b(int i10, ah ahVar, ai aiVar, long j10) {
        if (i10 == 13) {
            m N = aiVar != null ? aiVar.N() : null;
            if (N != null) {
                N.a(aiVar);
            }
        }
        if (i10 == 4) {
            m N2 = aiVar != null ? aiVar.N() : null;
            if (N2 != null) {
                N2.a(true, N2.getSortPrice(), true);
            }
            if (ahVar instanceof e) {
                a((e) ahVar, aiVar);
            }
        }
        com.anythink.core.c.a h10 = l.h(k.e());
        f fVar = new f();
        fVar.f5604a = i10;
        fVar.f5605b = ahVar;
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        fVar.f5606c = j10;
        r.a(n.a().g()).a(i10, fVar, h10);
        if (a(i10, ahVar, h10)) {
            return null;
        }
        if (4 == i10 && (ahVar instanceof e)) {
            q.a();
            q.a((e) ahVar);
        }
        return fVar;
    }

    public static a a(Context context) {
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a(context);
                }
            }
        }
        return f;
    }

    public final synchronized void a(int i10, ah ahVar) {
        a(i10, ahVar, null, -1L);
    }

    public static /* synthetic */ boolean b(int i10, ah ahVar) {
        Map<String, String> a10;
        if (ahVar instanceof e) {
            e eVar = (e) ahVar;
            if (eVar.H() == 67) {
                return true;
            }
            if (eVar.H() != 0 && !TextUtils.isEmpty(ahVar.Y()) && (a10 = k.e().b(n.a().p()).a(i10)) != null) {
                if (a10.containsKey("0")) {
                    String str = a10.get("0");
                    return !TextUtils.isEmpty(str) && str.contains(ahVar.Y());
                }
                e eVar2 = (e) ahVar;
                if (a10.containsKey(String.valueOf(eVar2.H()))) {
                    String str2 = a10.get(String.valueOf(eVar2.H()));
                    if (!TextUtils.isEmpty(str2) && str2.contains(ahVar.Y())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void a(int i10, ah ahVar, ai aiVar) {
        a(i10, ahVar, aiVar, -1L);
    }

    private static void a(int i10, ai aiVar) {
        if (i10 == 13) {
            m N = aiVar != null ? aiVar.N() : null;
            if (N != null) {
                N.a(aiVar);
            }
        }
    }

    private static boolean a(int i10, ah ahVar, com.anythink.core.c.a aVar) {
        String ak = aVar.ak();
        if (!TextUtils.isEmpty(ak) && (ahVar instanceof e)) {
            try {
                JSONArray jSONArray = new JSONArray(ak);
                int length = jSONArray.length();
                String valueOf = String.valueOf(((e) ahVar).H());
                for (int i11 = 0; i11 < length; i11++) {
                    if (TextUtils.equals(valueOf, jSONArray.optString(i11))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Map<String, String> ai = aVar.ai();
        if (ai != null && ai.containsKey(String.valueOf(i10))) {
            String str = ai.get(String.valueOf(i10));
            if (!TextUtils.isEmpty(str) && str.contains(ahVar.Y())) {
                return true;
            }
        }
        return false;
    }

    private void a(e eVar, ai aiVar) {
        List<String> w10;
        List<ai> G;
        com.anythink.core.common.e.b a10;
        m N;
        String W = eVar.W();
        com.anythink.core.c.d a11 = com.anythink.core.c.e.a(this.f6362e).a(W);
        if (a11 == null || (w10 = a11.w()) == null || w10.size() == 0 || (G = a11.G()) == null || G.size() == 0) {
            return;
        }
        for (ai aiVar2 : G) {
            try {
                if (w10.contains(String.valueOf(aiVar2.c())) && (a10 = com.anythink.core.common.a.a().a(W, aiVar2)) != null && (N = a10.e().getUnitGroupInfo().N()) != null) {
                    N.a(false, g.a(aiVar), aiVar.j());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final synchronized void a(final int i10, final ah ahVar, final ai aiVar, final long j10) {
        if (ahVar instanceof e) {
            if (i10 == 4) {
                ((e) ahVar).c();
            } else if (i10 == 6) {
                ((e) ahVar).d();
            } else if (i10 == 21) {
                n.a().M();
            }
        }
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if ((ahVar instanceof e) && n.a().H()) {
                    com.anythink.core.common.b.i.a().a(i10, (e) ahVar);
                }
                f a10 = a.a(a.this, i10, ahVar, aiVar, j10);
                if (a10 != null) {
                    a.super.a((a) a10, a.b(i10, ahVar));
                }
            }
        });
    }

    public static /* synthetic */ f a(a aVar, int i10, ah ahVar, ai aiVar, long j10) {
        if (i10 == 13) {
            m N = aiVar != null ? aiVar.N() : null;
            if (N != null) {
                N.a(aiVar);
            }
        }
        if (i10 == 4) {
            m N2 = aiVar != null ? aiVar.N() : null;
            if (N2 != null) {
                N2.a(true, N2.getSortPrice(), true);
            }
            if (ahVar instanceof e) {
                aVar.a((e) ahVar, aiVar);
            }
        }
        com.anythink.core.c.a h10 = l.h(k.e());
        f fVar = new f();
        fVar.f5604a = i10;
        fVar.f5605b = ahVar;
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        fVar.f5606c = j10;
        r.a(n.a().g()).a(i10, fVar, h10);
        if (a(i10, ahVar, h10)) {
            return null;
        }
        if (4 == i10 && (ahVar instanceof e)) {
            q.a();
            q.a((e) ahVar);
        }
        return fVar;
    }
}
