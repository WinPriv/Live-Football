package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.m;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    private static volatile j f4927b;

    /* renamed from: e, reason: collision with root package name */
    private long f4931e;

    /* renamed from: a, reason: collision with root package name */
    final String f4928a = "j";
    private long f = 0;

    /* renamed from: c, reason: collision with root package name */
    private m f4929c = m.a(com.anythink.core.common.c.c.a(n.a().g()));

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f4930d = new HashMap();

    /* renamed from: com.anythink.core.common.a.j$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f4933a;

        public AnonymousClass2(i iVar) {
            this.f4933a = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                File file = new File(this.f4933a.b());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            j.this.f4929c.c(this.f4933a.a());
        }
    }

    private j() {
        this.f4931e = 209715200L;
        this.f4931e = n.a().d(4);
    }

    public final void b() {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.j.1
            @Override // java.lang.Runnable
            public final void run() {
                new ArrayList();
                j jVar = j.this;
                jVar.f = jVar.f4929c.c();
                long unused = j.this.f;
                long unused2 = j.this.f4931e;
                if (j.this.f > j.this.f4931e) {
                    List<i> d10 = j.this.f4929c.d();
                    d10.size();
                    for (i iVar : d10) {
                        try {
                            File file = new File(iVar.b());
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Throwable unused3) {
                        }
                        try {
                            if (!TextUtils.isEmpty(iVar.a())) {
                                String a10 = iVar.a();
                                j.this.f4930d.remove(a10);
                                com.anythink.core.common.res.a.c.a().b(a10);
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
        });
    }

    public final long c() {
        return this.f4931e;
    }

    public final long d() {
        return this.f;
    }

    public static j a() {
        if (f4927b == null) {
            synchronized (j.class) {
                if (f4927b == null) {
                    f4927b = new j();
                }
            }
        }
        return f4927b;
    }

    public final synchronized int b(String str) {
        if (this.f4930d.containsKey(str) && this.f4930d.get(str) != null) {
            return this.f4930d.get(str).intValue();
        }
        i a10 = this.f4929c.a(str);
        if (a10 == null || a10.c() <= 0) {
            return 0;
        }
        File file = new File(a10.b());
        if (file.exists() && file.length() >= a10.e()) {
            this.f4930d.put(str, Integer.valueOf(a10.c()));
            this.f4929c.b(str);
            return a10.c();
        }
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass2(a10));
        return 0;
    }

    private void a(i iVar) {
        if (iVar == null) {
            return;
        }
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass2(iVar));
    }

    public final void a(final String str, final String str2, final long j10, final long j11, final int i10, boolean z10) {
        this.f4930d.put(str, Integer.valueOf(i10));
        if (z10) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.j.3
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f4929c.a(str, str2, j10, j11, i10);
                }
            });
        }
    }

    public final i a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f4929c.a(str);
    }

    public final synchronized boolean a(String str, int i10) {
        return b(str) >= i10;
    }
}
