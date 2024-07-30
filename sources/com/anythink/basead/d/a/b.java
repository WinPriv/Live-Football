package com.anythink.basead.d.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.basead.c.e;
import com.anythink.basead.c.f;
import com.anythink.core.common.a.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ac;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.h;
import com.anythink.expressad.out.i;
import com.anythink.expressad.out.o;
import com.anythink.expressad.splash.d.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f3838c;

    /* renamed from: b, reason: collision with root package name */
    private final String f3840b = getClass().getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, g> f3839a = new ConcurrentHashMap<>(2);

    /* renamed from: com.anythink.basead.d.a.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.e.g f3841a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f3842b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f3843c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f3844d;

        public AnonymousClass1(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
            this.f3841a = gVar;
            this.f3842b = jVar;
            this.f3843c = dVar;
            this.f3844d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String S;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            Context g6 = n.a().g();
            if (TextUtils.isEmpty(this.f3841a.S())) {
                S = this.f3842b.f5655c;
            } else {
                S = this.f3841a.S();
            }
            c cVar = new c(g6, "", S);
            if (this.f3842b.f5664m.p() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            cVar.b(z10);
            int n10 = ((int) this.f3842b.f5664m.n()) / 1000;
            if (n10 <= 2) {
                cVar.a(2);
            } else if (n10 >= 10) {
                cVar.a(10);
            } else {
                cVar.a(n10);
            }
            if (this.f3842b.f5664m.x() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            cVar.a(z11);
            cVar.f();
            ArrayList<com.anythink.expressad.foundation.d.c> arrayList = this.f3843c.J;
            if (arrayList != null && arrayList.size() > 0) {
                for (com.anythink.expressad.foundation.d.c cVar2 : arrayList) {
                    if (cVar2 != null) {
                        String c10 = cVar2.c();
                        if (!TextUtils.isEmpty(c10)) {
                            if (this.f3842b.f5664m.x() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (com.anythink.expressad.shake.a.a().b() && this.f3842b.f5664m.M() == 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c10 = b.b(b.c(c10, z12), z13, this.f3842b.f5664m.N(), this.f3842b.f5664m.O());
                            if (!z13 && !z12) {
                                c10 = b.b(c10, true);
                            } else if (z13) {
                                c10 = b.b(c10, false);
                            }
                        }
                        cVar2.a(c10);
                    }
                }
            }
            cVar.a(new com.anythink.expressad.out.d() { // from class: com.anythink.basead.d.a.b.1.1
                @Override // com.anythink.expressad.out.d
                public final void a() {
                    c cVar3 = (c) b.this.f3839a.remove(AnonymousClass1.this.f3842b.f5654b + AnonymousClass1.this.f3842b.f5653a);
                    if (cVar3 != null) {
                        a aVar = AnonymousClass1.this.f3844d;
                        if (aVar != null) {
                            aVar.a(cVar3);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass1.this.f3844d != null) {
                        AnonymousClass1.this.f3844d.a(f.a(f.f3755l, "Resource download fail."));
                    }
                }

                @Override // com.anythink.expressad.out.d
                public final void a(String str) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    b.a(b.this, str, anonymousClass1.f3842b, anonymousClass1.f3844d);
                }

                @Override // com.anythink.expressad.out.d
                public final void b() {
                }
            });
            b.this.f3839a.put(this.f3842b.f5654b + this.f3842b.f5653a, cVar);
            cVar.a(this.f3843c);
        }
    }

    /* renamed from: com.anythink.basead.d.a.b$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f3847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f3848b;

        public AnonymousClass2(j jVar, a aVar) {
            this.f3847a = jVar;
            this.f3848b = aVar;
        }

        @Override // com.anythink.expressad.out.h
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
        }

        @Override // com.anythink.expressad.out.h
        public final void a(String str) {
            b.a(b.this, str, this.f3847a, this.f3848b);
        }

        @Override // com.anythink.expressad.out.h
        public final void a() {
            TemplateBannerView templateBannerView = (TemplateBannerView) b.this.f3839a.remove(this.f3847a.f5654b + this.f3847a.f5653a);
            if (templateBannerView != null) {
                a aVar = this.f3848b;
                if (aVar != null) {
                    aVar.a(templateBannerView);
                    return;
                }
                return;
            }
            if (this.f3848b != null) {
                this.f3848b.a(f.a(f.f3755l, "Resource download fail."));
            }
        }

        @Override // com.anythink.expressad.out.h
        public final void b() {
        }

        @Override // com.anythink.expressad.out.h
        public final void c() {
        }

        @Override // com.anythink.expressad.out.h
        public final void d() {
        }

        @Override // com.anythink.expressad.out.h
        public final void e() {
        }

        @Override // com.anythink.expressad.out.h
        public final void f() {
        }
    }

    /* renamed from: com.anythink.basead.d.a.b$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.e.g f3853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f3854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f3855c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f3856d;

        public AnonymousClass4(com.anythink.core.common.e.g gVar, j jVar, a aVar, d dVar) {
            this.f3853a = gVar;
            this.f3854b = jVar;
            this.f3855c = aVar;
            this.f3856d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String S;
            if (TextUtils.isEmpty(this.f3853a.S())) {
                S = this.f3854b.f5655c;
            } else {
                S = this.f3853a.S();
            }
            com.anythink.expressad.advanced.d.c cVar = new com.anythink.expressad.advanced.d.c("", S, n.a().g());
            cVar.a(new o() { // from class: com.anythink.basead.d.a.b.4.1
                @Override // com.anythink.expressad.out.o
                public final void a(com.anythink.expressad.foundation.d.c cVar2) {
                }

                @Override // com.anythink.expressad.out.o
                public final void a(String str) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    b.a(b.this, str, anonymousClass4.f3854b, anonymousClass4.f3855c);
                }

                @Override // com.anythink.expressad.out.o
                public final void a() {
                    com.anythink.expressad.advanced.d.c cVar2 = (com.anythink.expressad.advanced.d.c) b.this.f3839a.remove(AnonymousClass4.this.f3854b.f5654b + AnonymousClass4.this.f3854b.f5653a);
                    if (cVar2 != null) {
                        a aVar = AnonymousClass4.this.f3855c;
                        if (aVar != null) {
                            aVar.a(cVar2);
                            return;
                        }
                        return;
                    }
                    if (AnonymousClass4.this.f3855c != null) {
                        AnonymousClass4.this.f3855c.a(f.a(f.f3756m, f.H));
                    }
                }

                @Override // com.anythink.expressad.out.o
                public final void b() {
                }

                @Override // com.anythink.expressad.out.o
                public final void c() {
                }

                @Override // com.anythink.expressad.out.o
                public final void d() {
                }

                @Override // com.anythink.expressad.out.o
                public final void e() {
                }

                @Override // com.anythink.expressad.out.o
                public final void f() {
                }
            });
            b.this.f3839a.put(this.f3854b.f5654b + this.f3854b.f5653a, cVar);
            cVar.a(this.f3856d);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);

        void a(g gVar);
    }

    private b() {
    }

    private void b(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        n.a().a(new AnonymousClass1(gVar, jVar, dVar, aVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void c(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        boolean z10;
        int i10;
        k kVar = jVar.f5664m;
        int a10 = com.anythink.core.common.k.h.a(n.a().g(), 50.0f);
        if (kVar.b() > 0) {
            a10 = kVar.b();
            i10 = 5;
        } else {
            String r10 = kVar.r();
            r10.getClass();
            switch (r10.hashCode()) {
                case -559799608:
                    if (r10.equals(k.f5668c)) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case 1507809854:
                    if (r10.equals(k.f5667b)) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case 1622564786:
                    if (r10.equals(k.f5669d)) {
                        z10 = 2;
                        break;
                    }
                    z10 = -1;
                    break;
                default:
                    z10 = -1;
                    break;
            }
            switch (z10) {
                case false:
                    a10 = com.anythink.core.common.k.h.a(n.a().g(), 250.0f);
                    i10 = 2;
                    break;
                case true:
                case true:
                    a10 = com.anythink.core.common.k.h.a(n.a().g(), 90.0f);
                    i10 = 1;
                    break;
                default:
                    i10 = 4;
                    break;
            }
        }
        TemplateBannerView templateBannerView = new TemplateBannerView(n.a().g());
        templateBannerView.init(new i(i10, kVar.b()), "", TextUtils.isEmpty(gVar.S()) ? jVar.f5655c : gVar.S());
        templateBannerView.setAllowShowCloseBtn(kVar.s() == 0);
        if (a10 > 0) {
            templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a10));
        }
        templateBannerView.setBannerAdListener(new AnonymousClass2(jVar, aVar));
        this.f3839a.put(jVar.f5654b + jVar.f5653a, templateBannerView);
        templateBannerView.load(dVar);
    }

    private void d(com.anythink.core.common.e.g gVar, final j jVar, d dVar, final a aVar) {
        com.anythink.expressad.reward.b.a aVar2 = new com.anythink.expressad.reward.b.a();
        String S = TextUtils.isEmpty(gVar.S()) ? jVar.f5655c : gVar.S();
        int i10 = jVar.f5661j;
        if (i10 == 1) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), S, false);
            aVar2.a(false);
        } else if (i10 == 3) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), S, true);
            aVar2.a(true);
        }
        aVar2.a(jVar.f5664m.y() == 0 ? 1 : 2);
        aVar2.a("", S);
        com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), S, false);
        if (jVar.f5664m.z() >= 0) {
            a10.a(jVar.f5664m.z());
        }
        if (jVar.f5661j == 1) {
            a10.l();
        }
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList = dVar.J;
        if (arrayList != null && arrayList.size() > 0) {
            for (com.anythink.expressad.foundation.d.c cVar : arrayList) {
                if (cVar != null) {
                    boolean z10 = com.anythink.expressad.shake.a.a().b() && jVar.f5664m.M() == 1;
                    boolean z11 = jVar.f5664m.x() == 0;
                    String I = cVar.I();
                    if (!TextUtils.isEmpty(I)) {
                        cVar.k(b(c(I, z11), z10, jVar.f5664m.N(), jVar.f5664m.O()));
                    }
                    String P = cVar.P();
                    if (!TextUtils.isEmpty(P)) {
                        cVar.n(b(c(P, z11), z10, jVar.f5664m.N(), jVar.f5664m.O()));
                    }
                    c.C0119c M = cVar.M();
                    boolean z12 = jVar.f5664m.u() == 1;
                    if (M != null) {
                        String e10 = M.e();
                        if (!TextUtils.isEmpty(e10)) {
                            M.a(c(e10, z12));
                        }
                    }
                }
            }
        }
        aVar2.a(new com.anythink.expressad.videocommon.d.a() { // from class: com.anythink.basead.d.a.b.3
            @Override // com.anythink.expressad.videocommon.d.a
            public final void a() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void b(String str) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(com.anythink.expressad.foundation.d.c cVar2) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void b() {
                com.anythink.expressad.reward.b.a aVar3 = (com.anythink.expressad.reward.b.a) b.this.f3839a.remove(jVar.f5654b + jVar.f5653a);
                if (aVar3 != null && aVar3.isReady()) {
                    a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.a(aVar3);
                        return;
                    }
                    return;
                }
                if (aVar != null) {
                    aVar.a(f.a(f.f3755l, "Resource download fail."));
                }
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(boolean z13, String str, float f) {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void a(String str) {
                b.a(b.this, str, jVar, aVar);
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void c() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void d() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void e() {
            }

            @Override // com.anythink.expressad.videocommon.d.a
            public final void f() {
            }
        });
        this.f3839a.put(jVar.f5654b + jVar.f5653a, aVar2);
        aVar2.a(dVar);
    }

    private void e(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        n.a().a(new AnonymousClass4(gVar, jVar, aVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z10, int i10, long j10) {
        String concat;
        String sb2;
        if (z10) {
            if (str.contains("shake_show")) {
                concat = str.replace("shake_show=0", "shake_show=1");
            } else {
                concat = str.concat("&shake_show=1");
            }
        } else if (str.contains("shake_show")) {
            concat = str.replace("shake_show=1", "shake_show=0");
        } else {
            concat = str.concat("&shake_show=0");
        }
        if (concat.contains("shake_time")) {
            sb2 = concat.replaceAll("(shake_time=[^&]*)", "shake_time=" + (j10 / 1000));
        } else {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(concat, "&shake_time=");
            l10.append(j10 / 1000);
            sb2 = l10.toString();
        }
        if (sb2.contains("shake_strength")) {
            return sb2.replaceAll("(shake_strength=[^&]*)", "shake_strength=".concat(String.valueOf(i10)));
        }
        return sb2 + "&shake_strength=" + i10;
    }

    public static b a() {
        if (f3838c == null) {
            synchronized (b.class) {
                if (f3838c == null) {
                    f3838c = new b();
                }
            }
        }
        return f3838c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        boolean z10;
        int i10;
        if (!TextUtils.isEmpty(gVar.l())) {
            com.anythink.expressad.out.b.f10461a = gVar.l();
        }
        if (com.anythink.expressad.foundation.b.a.b().d() == null) {
            com.anythink.expressad.foundation.b.a.b().a(n.a().g());
            com.anythink.expressad.e.a a10 = com.anythink.expressad.out.g.a();
            HashMap hashMap = new HashMap(3);
            hashMap.put(com.anythink.expressad.a.f6559d, gVar.Q());
            hashMap.put(com.anythink.expressad.a.f6560e, gVar.R());
            a10.a(hashMap, n.a().g());
        }
        if (String.valueOf(jVar.f5661j).equals("0")) {
            n.a().a(new AnonymousClass4(gVar, jVar, aVar, dVar));
            return;
        }
        if (String.valueOf(jVar.f5661j).equals("2")) {
            k kVar = jVar.f5664m;
            int a11 = com.anythink.core.common.k.h.a(n.a().g(), 50.0f);
            if (kVar.b() > 0) {
                a11 = kVar.b();
                i10 = 5;
            } else {
                String r10 = kVar.r();
                r10.getClass();
                switch (r10.hashCode()) {
                    case -559799608:
                        if (r10.equals(k.f5668c)) {
                            z10 = false;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 1507809854:
                        if (r10.equals(k.f5667b)) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 1622564786:
                        if (r10.equals(k.f5669d)) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                switch (z10) {
                    case false:
                        a11 = com.anythink.core.common.k.h.a(n.a().g(), 250.0f);
                        i10 = 2;
                        break;
                    case true:
                    case true:
                        a11 = com.anythink.core.common.k.h.a(n.a().g(), 90.0f);
                        i10 = 1;
                        break;
                    default:
                        i10 = 4;
                        break;
                }
            }
            TemplateBannerView templateBannerView = new TemplateBannerView(n.a().g());
            templateBannerView.init(new i(i10, kVar.b()), "", TextUtils.isEmpty(gVar.S()) ? jVar.f5655c : gVar.S());
            templateBannerView.setAllowShowCloseBtn(kVar.s() == 0);
            if (a11 > 0) {
                templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a11));
            }
            templateBannerView.setBannerAdListener(new AnonymousClass2(jVar, aVar));
            this.f3839a.put(jVar.f5654b + jVar.f5653a, templateBannerView);
            templateBannerView.load(dVar);
            return;
        }
        if (String.valueOf(jVar.f5661j).equals("4")) {
            n.a().a(new AnonymousClass1(gVar, jVar, dVar, aVar));
        } else {
            d(gVar, jVar, dVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, boolean z10) {
        if (z10) {
            if (str.contains(com.anythink.expressad.video.dynview.a.a.Q)) {
                return str.replace("alecfc=0", "alecfc=1");
            }
            return str.concat("&alecfc=1");
        }
        if (str.contains(com.anythink.expressad.video.dynview.a.a.Q)) {
            return str.replace("alecfc=1", "alecfc=0");
        }
        return str.concat("&alecfc=0");
    }

    public static /* synthetic */ String b(String str, boolean z10) {
        if (z10) {
            if (str.contains("hdbtn")) {
                return str.replace("hdbtn=1", "hdbtn=0");
            }
            return str.concat("&hdbtn=0");
        }
        if (str.contains("hdbtn")) {
            return str.replace("hdbtn=0", "hdbtn=1");
        }
        return str.concat("&hdbtn=1");
    }

    private void a(String str, j jVar, a aVar) {
        this.f3839a.remove(jVar.f5654b + jVar.f5653a);
        if (aVar != null) {
            aVar.a(f.a(f.f3755l, str));
        }
    }

    private static String d(String str, boolean z10) {
        if (z10) {
            if (str.contains("hdbtn")) {
                return str.replace("hdbtn=1", "hdbtn=0");
            }
            return str.concat("&hdbtn=0");
        }
        if (str.contains("hdbtn")) {
            return str.replace("hdbtn=0", "hdbtn=1");
        }
        return str.concat("&hdbtn=1");
    }

    public static void a(com.anythink.core.common.e.g gVar, com.anythink.expressad.foundation.d.c cVar) {
        gVar.w(cVar.ba());
        gVar.n(cVar.bd());
        gVar.l(cVar.bb());
        gVar.m(cVar.bc());
        gVar.v(cVar.ad());
        gVar.u(cVar.af());
        ac X = gVar.X();
        if (X == null) {
            X = new ac();
            gVar.a(X);
        }
        com.anythink.expressad.foundation.d.n L = cVar.L();
        if (L != null) {
            X.b(L.a());
            X.c(L.b());
            X.d(L.c());
        }
        a((com.anythink.core.common.e.i) gVar, cVar);
    }

    public static void a(com.anythink.core.common.e.g gVar, List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<com.anythink.expressad.foundation.d.c> it = list.iterator();
        while (it.hasNext()) {
            it.next().t(gVar.v());
        }
    }

    public static void a(j jVar, List<com.anythink.expressad.foundation.d.c> list) {
        int i10 = jVar.f5661j;
        if (i10 == 1 || i10 == 3) {
            list.get(0).a(jVar.f5664m.z());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.basead.a.c a(com.anythink.basead.a.c r6, com.anythink.expressad.foundation.d.c r7) {
        /*
            com.anythink.core.common.e.i r0 = r6.b()
            com.anythink.core.common.e.k r0 = r0.k()
            com.anythink.core.common.e.i r1 = r6.b()
            java.lang.String r1 = r1.p()
            java.lang.String r2 = r7.aZ()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            com.anythink.core.common.e.i r0 = r6.b()
            a(r0, r7)
            return r6
        L22:
            com.anythink.core.common.e.g r1 = new com.anythink.core.common.e.g
            r1.<init>()
            a(r1, r7)
            java.lang.String r2 = r7.aZ()
            r1.j(r2)
            int r2 = r7.Q()
            r3 = 2
            if (r2 == 0) goto L64
            r4 = 1
            if (r2 == r4) goto L60
            if (r2 == r3) goto L60
            r4 = 4
            r5 = 3
            if (r2 == r5) goto L5c
            if (r2 == r4) goto L58
            r4 = 5
            if (r2 == r4) goto L64
            r4 = 8
            if (r2 == r4) goto L58
            r4 = 9
            if (r2 == r4) goto L64
            r3 = 12
            if (r2 == r3) goto L53
            goto L67
        L53:
            r2 = 6
            r1.e(r2)
            goto L67
        L58:
            r1.e(r5)
            goto L67
        L5c:
            r1.e(r4)
            goto L67
        L60:
            r1.e(r4)
            goto L67
        L64:
            r1.e(r3)
        L67:
            com.anythink.expressad.foundation.d.a r7 = r7.aG()
            if (r7 == 0) goto L90
            java.lang.String r2 = r7.b()
            r1.N(r2)
            java.lang.String r2 = r7.f()
            r1.y(r2)
            java.lang.String r2 = r7.e()
            r1.z(r2)
            java.lang.String r2 = r7.c()
            r1.A(r2)
            java.lang.String r7 = r7.a()
            r1.B(r7)
        L90:
            com.anythink.core.common.e.j r6 = r6.c()
            com.anythink.basead.a.c r7 = new com.anythink.basead.a.c
            com.anythink.core.common.b.n r2 = com.anythink.core.common.b.n.a()
            android.content.Context r2 = r2.g()
            r7.<init>(r2, r6, r1)
            r1.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.d.a.b.a(com.anythink.basead.a.c, com.anythink.expressad.foundation.d.c):com.anythink.basead.a.c");
    }

    public static void a(com.anythink.core.common.e.i iVar, com.anythink.expressad.foundation.d.c cVar) {
        String[] l10;
        com.anythink.core.common.e.g gVar = iVar instanceof com.anythink.core.common.e.g ? (com.anythink.core.common.e.g) iVar : null;
        if (iVar == null || cVar == null) {
            return;
        }
        iVar.v(cVar.ad());
        iVar.d(cVar.aO());
        iVar.c(cVar.aN());
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.ah() + "&opdptype={opdptype}&apk_ptype={apk_ptype}");
        com.anythink.expressad.foundation.d.n L = cVar.L();
        if (L != null && (l10 = L.l()) != null) {
            for (String str : l10) {
                arrayList.add(str);
            }
        }
        ac X = gVar.X();
        if (X == null) {
            X = new ac();
            gVar.a(X);
        }
        X.a((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public static /* synthetic */ void a(b bVar, String str, j jVar, a aVar) {
        bVar.f3839a.remove(jVar.f5654b + jVar.f5653a);
        if (aVar != null) {
            aVar.a(f.a(f.f3755l, str));
        }
    }
}
