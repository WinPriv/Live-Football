package com.anythink.basead.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.c.c;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.e.s;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f3968a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3969b;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, c> f3971d = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private SimpleDateFormat f3970c = new SimpleDateFormat("yyyyMMdd");

    private b(Context context) {
        this.f3969b = context.getApplicationContext();
    }

    public final boolean b(s sVar) {
        c d10 = d(sVar);
        int i10 = sVar.R;
        if (i10 == -1 || d10.f3738d < i10) {
            return false;
        }
        return true;
    }

    public final boolean c(s sVar) {
        if (System.currentTimeMillis() - d(sVar).f3739e <= sVar.S) {
            return true;
        }
        return false;
    }

    public final c d(s sVar) {
        String format = this.f3970c.format(new Date(System.currentTimeMillis()));
        c cVar = this.f3971d.get(sVar.p());
        if (cVar == null) {
            cVar = com.anythink.basead.b.c.a(this.f3969b).a(sVar.p());
            if (cVar == null) {
                cVar = new c();
                cVar.f3735a = sVar.p();
                cVar.f3736b = sVar.R;
                cVar.f3737c = sVar.S;
                cVar.f3739e = 0L;
                cVar.f3738d = 0;
                cVar.f = format;
            }
            this.f3971d.put(sVar.p(), cVar);
        }
        if (!TextUtils.equals(format, cVar.f)) {
            cVar.f = format;
            cVar.f3738d = 0;
        }
        return cVar;
    }

    public static b a(Context context) {
        if (f3968a == null) {
            f3968a = new b(context);
        }
        return f3968a;
    }

    public final void a(s sVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String format = this.f3970c.format(new Date(currentTimeMillis));
        final c d10 = d(sVar);
        if (d10.f.equals(format)) {
            d10.f3738d++;
        } else {
            d10.f3738d = 1;
            d10.f = format;
        }
        d10.f3739e = currentTimeMillis;
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.basead.f.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.basead.b.c.a(b.this.f3969b).c(d10.f);
                com.anythink.basead.b.c.a(b.this.f3969b).a(d10);
            }
        });
    }

    public final String a() {
        List<c> b10 = com.anythink.basead.b.c.a(this.f3969b).b(this.f3970c.format(new Date(System.currentTimeMillis())));
        JSONArray jSONArray = new JSONArray();
        if (b10 != null) {
            Iterator<c> it = b10.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f3735a);
            }
        }
        return jSONArray.toString();
    }

    public final boolean a(String str) {
        List<s> E;
        d a10 = e.a(this.f3969b).a(str);
        if (a10 == null || (E = a10.E()) == null || E.size() <= 0) {
            return false;
        }
        Iterator<s> it = E.iterator();
        while (it.hasNext()) {
            if (!b(it.next())) {
                return false;
            }
        }
        return true;
    }
}
