package com.anythink.basead.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.anythink.basead.handler.OfferClickHandler;
import com.anythink.core.api.IExHandler;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.ui.web.WebLandPageActivity;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.ak;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.z;
import com.anythink.core.common.k.l;
import com.anythink.core.common.p;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3609a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3610b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3611c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3612d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3613e = 6;
    public static final int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f3614g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3615h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f3616i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f3617j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f3618k = 4;

    /* renamed from: l, reason: collision with root package name */
    com.anythink.core.common.e.i f3619l;

    /* renamed from: m, reason: collision with root package name */
    boolean f3620m;

    /* renamed from: n, reason: collision with root package name */
    boolean f3621n;
    Context o;

    /* renamed from: p, reason: collision with root package name */
    boolean f3622p;

    /* renamed from: q, reason: collision with root package name */
    com.anythink.core.common.e.j f3623q;

    /* renamed from: r, reason: collision with root package name */
    b f3624r;

    /* renamed from: s, reason: collision with root package name */
    IOfferClickHandler f3625s;

    /* renamed from: t, reason: collision with root package name */
    a f3626t;

    /* renamed from: u, reason: collision with root package name */
    boolean f3627u;

    /* renamed from: w, reason: collision with root package name */
    private final String f3629w = "c";

    /* renamed from: x, reason: collision with root package name */
    private final int f3630x = 0;
    private final int y = 1;

    /* renamed from: z, reason: collision with root package name */
    private final int f3631z = 2;
    private final int A = 10;

    /* renamed from: v, reason: collision with root package name */
    boolean f3628v = false;

    /* renamed from: com.anythink.basead.a.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.c.i f3632a;

        public AnonymousClass1(com.anythink.basead.c.i iVar) {
            this.f3632a = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c.a(c.this, this.f3632a)) {
                return;
            }
            final int i10 = 2;
            if (c.this.f3623q.f5664m.l() != 2) {
                if (c.this.b(this.f3632a, false)) {
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            if (i10 == 1 && c.this.f3623q.f5664m.l() == 1) {
                return;
            }
            IExHandler b10 = n.a().b();
            if (c.this.f3619l.D() == 4 && 1 == c.this.f3623q.f5664m.o() && b10 != null && i10 != 1) {
                c cVar = c.this;
                b10.openApkConfirmDialog(cVar.o, cVar.f3619l, cVar.f3623q, new com.anythink.core.common.f.a() { // from class: com.anythink.basead.a.c.1.1
                    @Override // com.anythink.core.common.f.a
                    public final void a(boolean z10) {
                        if (z10) {
                            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.basead.a.c.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C00501 c00501 = C00501.this;
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    c.a(c.this, i10, anonymousClass1.f3632a);
                                }
                            });
                        } else {
                            c.this.f3620m = false;
                        }
                    }
                });
            } else {
                c.a(c.this, i10, this.f3632a);
            }
        }
    }

    /* renamed from: com.anythink.basead.a.c$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3637a;

        public AnonymousClass2(boolean z10) {
            this.f3637a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = c.this.f3624r;
            if (bVar != null && !this.f3637a) {
                bVar.a();
            }
            b bVar2 = c.this.f3624r;
            if (bVar2 != null) {
                bVar2.b();
            }
            b bVar3 = c.this.f3624r;
            if (bVar3 != null) {
                bVar3.a(true);
            }
        }
    }

    /* renamed from: com.anythink.basead.a.c$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = c.this.f3624r;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f3647a;

        /* renamed from: b, reason: collision with root package name */
        long f3648b;

        /* renamed from: c, reason: collision with root package name */
        String f3649c;

        public final boolean a() {
            if (System.currentTimeMillis() - this.f3647a <= this.f3648b) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(boolean z10);

        void b();
    }

    public c(Context context, com.anythink.core.common.e.j jVar, com.anythink.core.common.e.i iVar) {
        boolean z10;
        this.f3619l = iVar;
        this.f3623q = jVar;
        this.o = context.getApplicationContext();
        k kVar = jVar.f5664m;
        if (!(iVar instanceof com.anythink.core.common.e.g) ? !(!(iVar instanceof s) || ((s) iVar).O() != 1) : !(!(kVar instanceof ab) || ((ab) kVar).Y() != 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3622p = z10;
        this.f3619l.g(jVar.f5656d);
        this.f3625s = new OfferClickHandler();
        this.f3627u = this.f3623q.f5664m.Q() != 2;
    }

    private com.anythink.basead.c.d e() {
        return d.a().a(this.f3619l.d(), this.f3619l.p());
    }

    private boolean f() {
        boolean z10;
        boolean z11;
        ak L = n.a().L();
        if (L.b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (L.a() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        String l10 = com.anythink.core.common.k.d.l();
        if (TextUtils.isEmpty(l10)) {
            com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, 5);
            return false;
        }
        if (!z10) {
            com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, 3);
            return false;
        }
        if (!z11) {
            com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, 1);
            return false;
        }
        String e10 = this.f3619l.e();
        String f10 = this.f3619l.f();
        if (!TextUtils.isEmpty(e10) && !TextUtils.isEmpty(f10)) {
            try {
                Object c10 = com.anythink.core.common.k.d.c(l10);
                Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                Object newInstance = cls.newInstance();
                cls.getField("userName").set(newInstance, e10);
                cls.getField("path").set(newInstance, f10);
                cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(c10, newInstance);
                com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, 0);
                return true;
            } catch (Throwable th) {
                com.anythink.core.common.e.j jVar = this.f3623q;
                com.anythink.core.common.e.i iVar = this.f3619l;
                th.getMessage();
                com.anythink.core.common.j.c.a(jVar, iVar, 2);
                return false;
            }
        }
        com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, 4);
        return false;
    }

    private boolean g() {
        if (this.f3619l.n() != 42) {
            com.anythink.core.common.e.i iVar = this.f3619l;
            if (!(iVar instanceof z) || ((z) iVar).a() != 42) {
                return false;
            }
            return true;
        }
        return true;
    }

    private void h() {
        this.f3621n = true;
    }

    public final void a(b bVar) {
        this.f3624r = bVar;
    }

    public final com.anythink.core.common.e.j c() {
        return this.f3623q;
    }

    public final void d() {
        this.f3624r = null;
    }

    private void b(com.anythink.basead.c.i iVar) {
        if (this.f3627u || !this.f3628v) {
            this.f3628v = true;
            com.anythink.basead.a.b.a(9, this.f3619l, iVar);
        }
    }

    public final boolean a() {
        return this.f3620m;
    }

    public final void a(com.anythink.basead.c.i iVar) {
        if (this.f3620m) {
            return;
        }
        this.f3620m = true;
        this.f3621n = false;
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass1(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(com.anythink.basead.c.i iVar, final boolean z10) {
        iVar.f3790i = new com.anythink.basead.c.b();
        com.anythink.basead.c.d e10 = e();
        iVar.f3790i.f3734a = e10 != null ? e10.f3742c : "";
        com.anythink.basead.a.b.a(23, this.f3619l, iVar);
        if (!TextUtils.isEmpty(this.f3619l.z())) {
            String z11 = this.f3619l.z();
            String str = this.f3623q.f5656d;
            String replaceAll = z11.replaceAll("\\{req_id\\}", str != null ? str : "");
            p.a().a(this.f3619l);
            if (com.anythink.core.basead.a.a.a(this.o, replaceAll, false)) {
                com.anythink.basead.c.a aVar = iVar.f3788g;
                if (aVar != null) {
                    aVar.f3732i = true;
                }
                b(iVar);
                com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, replaceAll, "1", 0);
                this.f3620m = false;
                n.a().a(new Runnable() { // from class: com.anythink.basead.a.c.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar = c.this.f3624r;
                        if (bVar != null && !z10) {
                            bVar.a();
                        }
                        b bVar2 = c.this.f3624r;
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                        b bVar3 = c.this.f3624r;
                        if (bVar3 != null) {
                            bVar3.a(true);
                        }
                    }
                });
                com.anythink.basead.a.b.a(24, this.f3619l, iVar);
                return true;
            }
            p.a().b(this.f3619l);
            if (com.anythink.basead.a.b.a(this.o, this.f3619l.B())) {
                com.anythink.basead.a.b.a(28, this.f3619l, iVar);
            } else {
                com.anythink.basead.a.b.a(29, this.f3619l, iVar);
            }
            com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, replaceAll, "0", 0);
        }
        return false;
    }

    private boolean a(com.anythink.basead.c.i iVar, boolean z10) {
        iVar.f3790i = new com.anythink.basead.c.b();
        com.anythink.basead.c.d e10 = e();
        iVar.f3790i.f3734a = e10 != null ? e10.f3742c : "";
        if (!TextUtils.isEmpty(this.f3619l.o())) {
            String o = this.f3619l.o();
            String str = this.f3623q.f5656d;
            String replaceAll = o.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.a.a(this.o, replaceAll, false)) {
                com.anythink.basead.c.a aVar = iVar.f3788g;
                if (aVar != null) {
                    aVar.f3732i = true;
                }
                b(iVar);
                com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, replaceAll, "1", 1);
                this.f3620m = false;
                n.a().a(new AnonymousClass2(z10));
                return true;
            }
            com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, replaceAll, "0", 1);
        }
        return false;
    }

    private void a(int i10, com.anythink.basead.c.i iVar) {
        String str;
        com.anythink.basead.c.d dVar;
        String b10;
        String b11;
        com.anythink.basead.c.d a10;
        boolean z10 = true;
        if (i10 != 1) {
            n.a().a(new AnonymousClass4());
        }
        str = "";
        String A = this.f3619l.A() != null ? this.f3619l.A() : "";
        String str2 = this.f3623q.f5656d;
        if (str2 == null) {
            str2 = "";
        }
        String a11 = j.a(A.replaceAll("\\{req_id\\}", str2), iVar, System.currentTimeMillis());
        if (g() && this.f3619l.D() == 4) {
            dVar = new com.anythink.basead.c.d("", "", "");
        } else {
            dVar = new com.anythink.basead.c.d(a11, "", "");
        }
        a(dVar);
        int D = this.f3619l.D();
        if (D == 1) {
            if (!a11.startsWith("http")) {
                a(a11, i10, iVar);
                return;
            }
            a aVar = this.f3626t;
            boolean z11 = aVar != null && aVar.a();
            if (this.f3622p) {
                String y = this.f3619l.y();
                if (z11) {
                    y = this.f3626t.f3649c;
                }
                if (!TextUtils.isEmpty(y)) {
                    a(y, i10, iVar);
                    z10 = false;
                }
            }
            if (z11) {
                b10 = this.f3626t.f3649c;
            } else {
                b10 = b(a11);
                if (!TextUtils.isEmpty(b10)) {
                    a(b10);
                }
            }
            if (z10) {
                if (TextUtils.isEmpty(b10)) {
                    b10 = dVar.f3740a;
                }
                a(b10, i10, iVar);
                return;
            }
            return;
        }
        if (D == 2 || D == 3) {
            if (g() && !TextUtils.isEmpty(this.f3619l.z())) {
                str = b(a11);
                String a12 = com.anythink.basead.d.b.a.a.a(str);
                dVar.f3741b = str;
                dVar.f3742c = a12;
                a(dVar);
            }
            if (TextUtils.isEmpty(str)) {
                str = dVar.f3740a;
            }
            a(str, i10, iVar);
            return;
        }
        if (D != 4) {
            a(TextUtils.isEmpty("") ? dVar.f3740a : "", i10, iVar);
            return;
        }
        if (g() && TextUtils.isEmpty(dVar.f3740a) && (a10 = com.anythink.basead.d.b.a.a.a(this.f3623q, this.f3619l, a11)) != null) {
            dVar.f3740a = a10.f3740a;
            dVar.f3742c = a10.f3742c;
        }
        a aVar2 = this.f3626t;
        if (aVar2 != null && aVar2.a()) {
            b11 = this.f3626t.f3649c;
        } else {
            b11 = b(dVar.f3740a);
            if (!TextUtils.isEmpty(b11)) {
                a(b11);
            }
        }
        dVar.f3741b = b11;
        a(dVar);
        if (TextUtils.isEmpty(b11)) {
            b11 = dVar.f3740a;
        } else {
            iVar.f3791j = true;
        }
        a(b11, i10, iVar);
    }

    private String b(String str) {
        String str2;
        HttpURLConnection httpURLConnection;
        boolean z10 = false;
        String str3 = str;
        for (int i10 = 0; i10 < 10; i10++) {
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
                } catch (Exception e10) {
                    e = e10;
                    str2 = str3;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setInstanceFollowRedirects(false);
                k kVar = this.f3623q.f5664m;
                if (kVar != null && com.anythink.basead.a.b.a(9, kVar)) {
                    String i11 = com.anythink.core.common.k.d.i();
                    if (!TextUtils.isEmpty(i11)) {
                        httpURLConnection.addRequestProperty("User-Agent", i11);
                    }
                }
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    str3 = httpURLConnection.getHeaderField("Location");
                    if (!com.anythink.core.basead.a.a.b(str3) && !str3.contains(".apk") && str3.startsWith("http")) {
                        httpURLConnection.disconnect();
                        httpURLConnection.disconnect();
                    }
                    z10 = true;
                }
                if (z10 || responseCode == 200) {
                    httpURLConnection.disconnect();
                    return str3;
                }
                com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, str, str3, String.valueOf(responseCode), "");
                httpURLConnection.disconnect();
                return "";
            } catch (Exception e11) {
                e = e11;
                str2 = str3;
                httpURLConnection2 = httpURLConnection;
                com.anythink.core.common.j.c.a(this.f3623q, this.f3619l, str, str2, "", e.getMessage());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        }
        return "";
    }

    public final com.anythink.core.common.e.i b() {
        return this.f3619l;
    }

    private synchronized void a(String str) {
        if (this.f3626t == null) {
            this.f3626t = new a();
        }
        a aVar = this.f3626t;
        aVar.f3649c = str;
        aVar.f3648b = this.f3623q.f5664m.P();
        this.f3626t.f3647a = System.currentTimeMillis();
    }

    private void a(com.anythink.basead.c.d dVar) {
        d.a().a(this.f3619l.d(), this.f3619l.p(), dVar);
    }

    private void a(String str, int i10, com.anythink.basead.c.i iVar) {
        b bVar;
        b bVar2;
        if (i10 == 1) {
            return;
        }
        if (this.f3621n) {
            this.f3620m = false;
            if ((!TextUtils.isEmpty(this.f3619l.o()) || !TextUtils.isEmpty(this.f3619l.z())) && (bVar2 = this.f3624r) != null) {
                bVar2.a(false);
            }
            b(iVar);
            n.a().a(new Runnable() { // from class: com.anythink.basead.a.c.5
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar3 = c.this.f3624r;
                    if (bVar3 != null) {
                        bVar3.b();
                    }
                }
            });
            return;
        }
        if (i10 == 0 && b(iVar, true)) {
            return;
        }
        if ((!TextUtils.isEmpty(this.f3619l.o()) || !TextUtils.isEmpty(this.f3619l.z())) && (bVar = this.f3624r) != null) {
            bVar.a(false);
        }
        if (!TextUtils.isEmpty(this.f3619l.B()) && (this.f3619l.D() == 1 || this.f3619l.D() == 4)) {
            boolean a10 = a(this.o, this.f3619l.B());
            iVar.f3790i = new com.anythink.basead.c.b();
            com.anythink.basead.c.d e10 = e();
            iVar.f3790i.f3734a = e10 != null ? e10.f3742c : "";
            com.anythink.basead.c.a aVar = iVar.f3788g;
            if (aVar != null) {
                aVar.f3733j = a10 ? 5 : aVar.f3733j;
            }
            if (a10) {
                b(iVar);
                com.anythink.basead.a.b.a(25, this.f3619l, iVar);
                this.f3620m = false;
                n.a().a(new Runnable() { // from class: com.anythink.basead.a.c.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar3 = c.this.f3624r;
                        if (bVar3 != null) {
                            bVar3.b();
                        }
                    }
                });
                return;
            }
            com.anythink.basead.a.b.a(26, this.f3619l, iVar);
        }
        if (iVar.f3788g != null && this.f3619l.D() == 4) {
            if (iVar.f3791j) {
                IExHandler b10 = n.a().b();
                com.anythink.basead.c.a aVar2 = iVar.f3788g;
                aVar2.f3733j = b10 != null ? b10.checkDownloadType(this.f3619l, this.f3623q) : aVar2.f3733j;
            } else {
                iVar.f3788g.f3733j = 3;
            }
        }
        b(iVar);
        if (TextUtils.isEmpty(str)) {
            str = this.f3619l.y();
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "Offer click result is null.");
            n.a().a(new Runnable() { // from class: com.anythink.basead.a.c.7
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (TextUtils.isEmpty(c.this.f3619l.A())) {
                            Context context = c.this.o;
                            Toast.makeText(context, com.anythink.core.common.k.h.a(context, "basead_click_empty", com.anythink.expressad.foundation.h.i.f10128g), 0).show();
                        } else {
                            Context context2 = c.this.o;
                            Toast.makeText(context2, com.anythink.core.common.k.h.a(context2, "basead_click_fail", com.anythink.expressad.foundation.h.i.f10128g), 0).show();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            this.f3620m = false;
            n.a().a(new Runnable() { // from class: com.anythink.basead.a.c.8
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar3 = c.this.f3624r;
                    if (bVar3 != null) {
                        bVar3.b();
                    }
                }
            });
            return;
        }
        int D = this.f3619l.D();
        if (D == 1) {
            boolean z10 = (str == null || str.startsWith("http")) ? false : true;
            if (!com.anythink.core.basead.a.a.a(this.o, str, z10) && !z10) {
                if (this.f3623q.f5664m.k() == 2) {
                    com.anythink.core.basead.b.a aVar3 = new com.anythink.core.basead.b.a();
                    aVar3.f4692c = this.f3619l;
                    aVar3.f4696h = this.f3623q;
                    aVar3.f = str;
                    aVar3.f4695g = this.f3625s;
                    WebLandPageActivity.a(this.o, aVar3);
                } else {
                    l.a(this.o, str);
                }
            }
        } else if (D == 2) {
            l.a(this.o, str);
        } else if (D == 3) {
            com.anythink.core.basead.b.a aVar4 = new com.anythink.core.basead.b.a();
            aVar4.f4692c = this.f3619l;
            aVar4.f4696h = this.f3623q;
            aVar4.f = str;
            aVar4.f4695g = this.f3625s;
            WebLandPageActivity.a(this.o, aVar4);
        } else if (D == 4) {
            a(str, iVar);
        } else if (D != 6) {
            if (this.f3623q.f5664m.k() == 2) {
                com.anythink.core.basead.b.a aVar5 = new com.anythink.core.basead.b.a();
                aVar5.f4692c = this.f3619l;
                aVar5.f4696h = this.f3623q;
                aVar5.f = str;
                aVar5.f4695g = this.f3625s;
                WebLandPageActivity.a(this.o, aVar5);
            } else {
                l.a(this.o, str);
            }
        } else if (!f()) {
            com.anythink.core.basead.b.a aVar6 = new com.anythink.core.basead.b.a();
            aVar6.f4692c = this.f3619l;
            aVar6.f4696h = this.f3623q;
            aVar6.f = str;
            aVar6.f4695g = this.f3625s;
            WebLandPageActivity.a(this.o, aVar6);
        }
        this.f3620m = false;
        n.a().a(new Runnable() { // from class: com.anythink.basead.a.c.9
            @Override // java.lang.Runnable
            public final void run() {
                b bVar3 = c.this.f3624r;
                if (bVar3 != null) {
                    bVar3.b();
                }
            }
        });
    }

    private void a(String str, com.anythink.basead.c.i iVar) {
        if (iVar.f3791j) {
            if (!TextUtils.isEmpty(str)) {
                if (com.anythink.basead.a.b.a(this.o, this.f3623q, this.f3619l, e(), str, new i())) {
                    return;
                }
            } else {
                l.a(this.o, str);
                return;
            }
        }
        l.a(this.o, str);
    }

    public static boolean a(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static /* synthetic */ boolean a(c cVar, com.anythink.basead.c.i iVar) {
        iVar.f3790i = new com.anythink.basead.c.b();
        com.anythink.basead.c.d e10 = cVar.e();
        iVar.f3790i.f3734a = e10 != null ? e10.f3742c : "";
        if (!TextUtils.isEmpty(cVar.f3619l.o())) {
            String o = cVar.f3619l.o();
            String str = cVar.f3623q.f5656d;
            String replaceAll = o.replaceAll("\\{req_id\\}", str != null ? str : "");
            if (com.anythink.core.basead.a.a.a(cVar.o, replaceAll, false)) {
                com.anythink.basead.c.a aVar = iVar.f3788g;
                if (aVar != null) {
                    aVar.f3732i = true;
                }
                cVar.b(iVar);
                com.anythink.core.common.j.c.a(cVar.f3623q, cVar.f3619l, replaceAll, "1", 1);
                cVar.f3620m = false;
                n.a().a(new AnonymousClass2(false));
                return true;
            }
            com.anythink.core.common.j.c.a(cVar.f3623q, cVar.f3619l, replaceAll, "0", 1);
        }
        return false;
    }

    public static /* synthetic */ void a(c cVar, int i10, com.anythink.basead.c.i iVar) {
        String str;
        com.anythink.basead.c.d dVar;
        String b10;
        String b11;
        com.anythink.basead.c.d a10;
        boolean z10 = true;
        if (i10 != 1) {
            n.a().a(new AnonymousClass4());
        }
        str = "";
        String A = cVar.f3619l.A() != null ? cVar.f3619l.A() : "";
        String str2 = cVar.f3623q.f5656d;
        if (str2 == null) {
            str2 = "";
        }
        String a11 = j.a(A.replaceAll("\\{req_id\\}", str2), iVar, System.currentTimeMillis());
        if (cVar.g() && cVar.f3619l.D() == 4) {
            dVar = new com.anythink.basead.c.d("", "", "");
        } else {
            dVar = new com.anythink.basead.c.d(a11, "", "");
        }
        cVar.a(dVar);
        int D = cVar.f3619l.D();
        if (D == 1) {
            if (!a11.startsWith("http")) {
                cVar.a(a11, i10, iVar);
                return;
            }
            a aVar = cVar.f3626t;
            boolean z11 = aVar != null && aVar.a();
            if (cVar.f3622p) {
                String y = cVar.f3619l.y();
                if (z11) {
                    y = cVar.f3626t.f3649c;
                }
                if (!TextUtils.isEmpty(y)) {
                    cVar.a(y, i10, iVar);
                    z10 = false;
                }
            }
            if (z11) {
                b10 = cVar.f3626t.f3649c;
            } else {
                b10 = cVar.b(a11);
                if (!TextUtils.isEmpty(b10)) {
                    cVar.a(b10);
                }
            }
            if (z10) {
                if (TextUtils.isEmpty(b10)) {
                    b10 = dVar.f3740a;
                }
                cVar.a(b10, i10, iVar);
                return;
            }
            return;
        }
        if (D == 2 || D == 3) {
            if (cVar.g() && !TextUtils.isEmpty(cVar.f3619l.z())) {
                str = cVar.b(a11);
                String a12 = com.anythink.basead.d.b.a.a.a(str);
                dVar.f3741b = str;
                dVar.f3742c = a12;
                cVar.a(dVar);
            }
            if (TextUtils.isEmpty(str)) {
                str = dVar.f3740a;
            }
            cVar.a(str, i10, iVar);
            return;
        }
        if (D != 4) {
            cVar.a(TextUtils.isEmpty("") ? dVar.f3740a : "", i10, iVar);
            return;
        }
        if (cVar.g() && TextUtils.isEmpty(dVar.f3740a) && (a10 = com.anythink.basead.d.b.a.a.a(cVar.f3623q, cVar.f3619l, a11)) != null) {
            dVar.f3740a = a10.f3740a;
            dVar.f3742c = a10.f3742c;
        }
        a aVar2 = cVar.f3626t;
        if (aVar2 != null && aVar2.a()) {
            b11 = cVar.f3626t.f3649c;
        } else {
            b11 = cVar.b(dVar.f3740a);
            if (!TextUtils.isEmpty(b11)) {
                cVar.a(b11);
            }
        }
        dVar.f3741b = b11;
        cVar.a(dVar);
        if (TextUtils.isEmpty(b11)) {
            b11 = dVar.f3740a;
        } else {
            iVar.f3791j = true;
        }
        cVar.a(b11, i10, iVar);
    }
}
