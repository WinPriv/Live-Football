package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.ep;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6367b = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f6368c = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";

    /* renamed from: d, reason: collision with root package name */
    public static final String f6369d = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6370e = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";
    private static final String f = "code";

    /* renamed from: g, reason: collision with root package name */
    private static final String f6371g = "packageName";

    /* renamed from: j, reason: collision with root package name */
    private static volatile String f6372j;

    /* renamed from: n, reason: collision with root package name */
    private static volatile p f6373n;

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f6374a;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<com.anythink.core.common.e.i> f6375h = new CopyOnWriteArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f6376i = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private volatile Boolean f6377k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.e.i f6378l;

    /* renamed from: m, reason: collision with root package name */
    private Context f6379m;

    /* renamed from: com.anythink.core.common.p$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends BroadcastReceiver {
        public AnonymousClass2() {
        }

        private com.anythink.core.common.e.i a(String str) {
            if (p.this.f6378l != null && TextUtils.equals(p.this.f6378l.B(), str)) {
                return p.this.f6378l;
            }
            if (p.this.f6375h != null && p.this.f6375h.size() > 0) {
                Iterator it = p.this.f6375h.iterator();
                while (it.hasNext()) {
                    com.anythink.core.common.e.i iVar = (com.anythink.core.common.e.i) it.next();
                    if (iVar != null && TextUtils.equals(iVar.B(), str)) {
                        return iVar;
                    }
                }
                return null;
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            com.anythink.core.common.e.i iVar;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(com.anythink.core.common.k.c.b(p.f6367b)) || action.equals(com.anythink.core.common.k.c.b(p.f6368c)) || !action.equals(com.anythink.core.common.k.c.b(p.f6369d)) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i10 = extras.getInt("code", -1);
            String string = extras.getString("packageName", "");
            if (i10 != -1 && !TextUtils.isEmpty(string)) {
                if (p.this.f6378l != null && TextUtils.equals(p.this.f6378l.B(), string)) {
                    iVar = p.this.f6378l;
                } else {
                    if (p.this.f6375h != null && p.this.f6375h.size() > 0) {
                        Iterator it = p.this.f6375h.iterator();
                        while (it.hasNext()) {
                            com.anythink.core.common.e.i iVar2 = (com.anythink.core.common.e.i) it.next();
                            if (iVar2 != null && TextUtils.equals(iVar2.B(), string)) {
                                iVar = iVar2;
                                break;
                            }
                        }
                    }
                    iVar = null;
                }
                if (iVar == null) {
                    return;
                }
                if (i10 == 4) {
                    p.this.b(iVar);
                }
                com.anythink.core.common.j.c.a(iVar.j(), iVar.p(), "", i10, "", 0L, 0L);
            }
        }
    }

    private p() {
    }

    public static /* synthetic */ Boolean d() {
        return g();
    }

    private com.anythink.core.common.e.i e() {
        return this.f6378l;
    }

    private void f() {
        if (this.f6377k != null && this.f6377k.booleanValue() && this.f6379m != null) {
            try {
                this.f6374a = new AnonymousClass2();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.anythink.core.common.k.c.b(f6367b));
                intentFilter.addAction(com.anythink.core.common.k.c.b(f6368c));
                intentFilter.addAction(com.anythink.core.common.k.c.b(f6369d));
                this.f6379m.registerReceiver(this.f6374a, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    private static Boolean g() {
        Cursor cursor;
        Context g6 = com.anythink.core.common.b.n.a().g();
        Boolean bool = null;
        if (g6 != null && g6.getContentResolver() != null) {
            try {
                cursor = g6.getContentResolver().query(Uri.parse(com.anythink.core.common.k.c.b(f6370e)), null, null, null, null);
            } catch (Throwable unused) {
                cursor = null;
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase(ep.V) || string.equalsIgnoreCase(ep.Code))) {
                            bool = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        f6372j = cursor.getString(cursor.getColumnIndex("detailStyle"));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    cursor.close();
                } catch (Throwable unused4) {
                }
            }
        }
        return bool;
    }

    public final void b(com.anythink.core.common.e.i iVar) {
        if (this.f6377k == null || iVar == null || !this.f6377k.booleanValue()) {
            return;
        }
        this.f6378l = null;
        try {
            this.f6375h.remove(iVar);
        } catch (Exception unused) {
        }
    }

    public final int c() {
        if (this.f6377k != null) {
            return this.f6377k.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static p a() {
        if (f6373n == null) {
            synchronized (p.class) {
                if (f6373n == null) {
                    f6373n = new p();
                }
            }
        }
        return f6373n;
    }

    private void b(Context context) {
        BroadcastReceiver broadcastReceiver = this.f6374a;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.f6378l = null;
        this.f6375h.clear();
        this.f6375h = null;
        this.f6374a = null;
        this.f6379m = null;
    }

    public final void a(com.anythink.core.common.e.i iVar) {
        if (this.f6377k == null || iVar == null || !this.f6377k.booleanValue()) {
            return;
        }
        this.f6378l = iVar;
        this.f6375h.add(iVar);
    }

    public static String b() {
        try {
            return f6372j == null ? "" : String.format("[%s]", f6372j);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ void b(p pVar) {
        if (pVar.f6377k == null || !pVar.f6377k.booleanValue() || pVar.f6379m == null) {
            return;
        }
        try {
            pVar.f6374a = new AnonymousClass2();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.anythink.core.common.k.c.b(f6367b));
            intentFilter.addAction(com.anythink.core.common.k.c.b(f6368c));
            intentFilter.addAction(com.anythink.core.common.k.c.b(f6369d));
            pVar.f6379m.registerReceiver(pVar.f6374a, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public final void a(Context context) {
        this.f6379m = context;
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.p.1
            @Override // java.lang.Runnable
            public final void run() {
                if (p.this.f6376i.compareAndSet(false, true)) {
                    try {
                        p.this.f6377k = p.d();
                        p.b(p.this);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }
}
