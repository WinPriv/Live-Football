package com.anythink.basead.a;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.core.common.m;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f3655b;

    /* renamed from: a, reason: collision with root package name */
    g f3656a;

    /* renamed from: c, reason: collision with root package name */
    private Context f3657c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.core.common.e.i> f3658d = new ConcurrentHashMap<>();

    private h(Context context) {
        this.f3657c = context;
    }

    public static h a(Context context) {
        if (f3655b == null) {
            synchronized (h.class) {
                if (f3655b == null) {
                    f3655b = new h(context);
                }
            }
        }
        return f3655b;
    }

    private void b() {
        if (this.f3656a != null) {
            m.a(this.f3657c).a(this.f3656a);
            this.f3656a = null;
        }
    }

    public final void c(String str, String str2) {
        com.anythink.core.common.e.i iVar = this.f3658d.get(str);
        if (iVar != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar2.f3790i = bVar;
            bVar.f3734a = str2;
            b.a(20, iVar, iVar2);
        }
    }

    public final void d(String str, String str2) {
        com.anythink.core.common.e.i remove = this.f3658d.remove(str);
        if (remove != null) {
            com.anythink.basead.c.i iVar = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar.f3790i = bVar;
            bVar.f3734a = str2;
            b.a(21, remove, iVar);
        }
        if (this.f3658d.size() == 0 && this.f3656a != null) {
            m.a(this.f3657c).a(this.f3656a);
            this.f3656a = null;
        }
    }

    public final void b(String str, String str2) {
        com.anythink.core.common.e.i iVar = this.f3658d.get(str);
        if (iVar != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar2.f3790i = bVar;
            bVar.f3734a = str2;
            b.a(19, iVar, iVar2);
        }
    }

    public final void a() {
        if (this.f3657c != null && this.f3656a == null) {
            this.f3656a = new g();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("action_offer_download_start");
            intentFilter.addAction("action_offer_download_end");
            intentFilter.addAction("action_offer_install_start");
            intentFilter.addAction("action_offer_install_successful");
            m.a(this.f3657c).a(this.f3656a, intentFilter);
        }
    }

    public final void a(String str, com.anythink.core.common.e.i iVar) {
        this.f3658d.put(str, iVar);
    }

    public final void a(String str, String str2) {
        com.anythink.core.common.e.i iVar = this.f3658d.get(str);
        if (iVar != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar2.f3790i = bVar;
            bVar.f3734a = str2;
            b.a(18, iVar, iVar2);
        }
    }
}
