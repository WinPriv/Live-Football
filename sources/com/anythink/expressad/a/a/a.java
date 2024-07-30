package com.anythink.expressad.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.h.x;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f6598a = "mtg_retry_report=1";

    /* renamed from: b, reason: collision with root package name */
    public static int f6599b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6600c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6601d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f6602e = 3;
    public static int f = 50;

    /* renamed from: g, reason: collision with root package name */
    public static int f6603g = 600000;

    /* renamed from: h, reason: collision with root package name */
    public static int f6604h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f6605i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f6606j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static int f6607k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static int f6608l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static int f6609m = 5;

    /* renamed from: n, reason: collision with root package name */
    private static String f6610n = "RetryReportControl";

    /* renamed from: q, reason: collision with root package name */
    private static int f6611q;

    /* renamed from: r, reason: collision with root package name */
    private static int f6612r;
    private ConcurrentHashMap<String, com.anythink.expressad.a.a.b> o;

    /* renamed from: p, reason: collision with root package name */
    private c f6613p;

    /* renamed from: s, reason: collision with root package name */
    private BroadcastReceiver f6614s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f6615t;

    /* renamed from: com.anythink.expressad.a.a.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f6615t.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: com.anythink.expressad.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0087a {

        /* renamed from: a, reason: collision with root package name */
        private static a f6617a = new a(0);

        private C0087a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    a.a(a.a());
                }
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.a().a((String) obj, com.anythink.expressad.a.a.b.f6618a);
                }
            }
        }
    }

    public /* synthetic */ a(byte b10) {
        this();
    }

    private void c() {
        try {
            if (this.f6614s == null) {
                this.f6614s = new AnonymousClass1();
                Context g6 = n.a().g();
                if (g6 != null) {
                    g6.registerReceiver(this.f6614s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        Context g6;
        if (this.f6614s != null && (g6 = n.a().g()) != null) {
            g6.unregisterReceiver(this.f6614s);
        }
    }

    private a() {
        this.o = new ConcurrentHashMap<>();
        this.f6613p = new c(f);
        this.f6615t = new b(Looper.getMainLooper());
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
        f6602e = b10.U();
        f6599b = b10.W() * 1000;
        f6603g = b10.V() * 1000;
        f6611q = b10.T();
        f6612r = b10.S();
        try {
            if (this.f6614s == null) {
                this.f6614s = new AnonymousClass1();
                Context g6 = n.a().g();
                if (g6 != null) {
                    g6.registerReceiver(this.f6614s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static a a() {
        return C0087a.f6617a;
    }

    private void b() {
        c cVar = this.f6613p;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.anythink.expressad.a.a.b.f6619b);
            }
        }
    }

    private void a(String str, com.anythink.expressad.a.a.b bVar) {
        if (this.f6613p == null) {
            this.f6613p = new c(f);
        }
        this.f6613p.a(str, bVar);
    }

    private static boolean b(int i10) {
        return i10 == f6605i || i10 == f6606j;
    }

    private void a(String str) {
        Message obtainMessage = this.f6615t.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f6615t.sendMessageDelayed(obtainMessage, f6599b);
    }

    private static boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f6609m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String sb2;
        c cVar = this.f6613p;
        if (cVar != null) {
            com.anythink.expressad.a.a.b b10 = cVar.b(str);
            this.f6613p.a(str);
            if (b10 == null) {
                com.anythink.expressad.a.a.b bVar = this.o.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.h() + f6603g || bVar.g() >= f6602e || i10 == com.anythink.expressad.a.a.b.f6619b) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= b10.h() + f6603g) {
                b10.a(i10);
                this.o.put(str, b10);
                if (x.b(str) == 0) {
                    StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "?");
                    l10.append(f6598a);
                    sb2 = l10.toString();
                } else {
                    StringBuilder l11 = com.ironsource.adapters.facebook.a.l(str, ContainerUtils.FIELD_DELIMITER);
                    l11.append(f6598a);
                    sb2 = l11.toString();
                }
                com.anythink.expressad.a.a.a(n.a().g(), b10.f(), b10.e(), sb2, b10.a(), b10.b(), b10.d());
            }
        }
    }

    private static boolean a(int i10) {
        return i10 == f6608l || i10 == f6607k;
    }

    public final void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, String str3, boolean z10, boolean z11, int i10) {
        if (!(a(i10) || b(i10) || i10 == f6609m) || TextUtils.isEmpty(str)) {
            return;
        }
        String replace = str.replace("?" + f6598a, "").replace(ContainerUtils.FIELD_DELIMITER + f6598a, "");
        if (this.o == null) {
            this.o = new ConcurrentHashMap<>();
        }
        com.anythink.expressad.a.a.b remove = this.o.remove(replace);
        if (remove == null) {
            remove = new com.anythink.expressad.a.a.b(str, str2);
            remove.b(i10);
            remove.a(z10);
            remove.b(z11);
            remove.a(cVar);
            remove.a(str3);
        } else if (remove.c() != com.anythink.expressad.a.a.b.f6619b) {
            remove.b(str2);
        }
        if ((a(i10) && f6611q != 0) || (b(i10) && f6612r != 0) || i10 == f6609m) {
            if (System.currentTimeMillis() < remove.h() + f6603g) {
                if (this.f6613p == null) {
                    this.f6613p = new c(f);
                }
                this.f6613p.a(replace, remove);
                if (remove.c() != com.anythink.expressad.a.a.b.f6618a || remove.g() > f6602e) {
                    return;
                }
                a(replace);
                return;
            }
            remove.c();
        }
    }

    public static /* synthetic */ void a(a aVar) {
        c cVar = aVar.f6613p;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), com.anythink.expressad.a.a.b.f6619b);
            }
        }
    }
}
