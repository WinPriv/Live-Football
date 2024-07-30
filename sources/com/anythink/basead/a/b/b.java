package com.anythink.basead.a.b;

import android.text.TextUtils;
import com.anythink.basead.a.b.d;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.mraid.d;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3564a = "b";

    /* renamed from: b, reason: collision with root package name */
    i f3565b;

    /* renamed from: c, reason: collision with root package name */
    k f3566c;

    /* renamed from: d, reason: collision with root package name */
    j f3567d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f3568e = new Runnable() { // from class: com.anythink.basead.a.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b.this.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3748d, com.anythink.basead.c.f.f3758p));
        }
    };
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3569g;

    /* renamed from: h, reason: collision with root package name */
    private int f3570h;

    /* renamed from: i, reason: collision with root package name */
    private String f3571i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f3572j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC0049b f3573k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.basead.a.a.c<Void, com.anythink.basead.c.e> f3574l;

    /* renamed from: m, reason: collision with root package name */
    private MraidWebView f3575m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f3576n;

    /* renamed from: com.anythink.basead.a.b.b$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3578a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3579b;

        public AnonymousClass2(String str, String str2) {
            this.f3578a = str;
            this.f3579b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f3575m = new MraidWebView(n.a().g());
            com.anythink.basead.mraid.d.a(this.f3578a, this.f3579b, b.this.f3575m, new d.a() { // from class: com.anythink.basead.a.b.b.2.1
                @Override // com.anythink.basead.mraid.d.a
                public final void a() {
                    b.this.b();
                }

                @Override // com.anythink.basead.mraid.d.a
                public final void a(com.anythink.basead.c.e eVar) {
                    b.this.a(eVar);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class a implements com.anythink.basead.a.a.b<Void, com.anythink.basead.c.e> {
        private a() {
        }

        private void b() {
            if (b.this.f3573k != null) {
                String unused = b.this.f3571i;
                b.this.f3573k.a();
            }
            b.e(b.this);
        }

        @Override // com.anythink.basead.a.a.b
        public final /* synthetic */ void a(com.anythink.basead.c.e eVar) {
            com.anythink.basead.c.e eVar2 = eVar;
            if (b.this.f3573k != null) {
                String unused = b.this.f3571i;
                b.this.f3573k.a(eVar2);
            }
            b.e(b.this);
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(com.anythink.basead.c.e eVar) {
            if (b.this.f3573k != null) {
                String unused = b.this.f3571i;
                b.this.f3573k.a(eVar);
            }
            b.e(b.this);
        }

        @Override // com.anythink.basead.a.a.b
        public final /* synthetic */ void a() {
            if (b.this.f3573k != null) {
                String unused = b.this.f3571i;
                b.this.f3573k.a();
            }
            b.e(b.this);
        }
    }

    /* renamed from: com.anythink.basead.a.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0049b {
        void a();

        void a(com.anythink.basead.c.e eVar);
    }

    public b(String str, boolean z10, i iVar, j jVar) {
        this.f = str;
        this.f3569g = z10;
        this.f3565b = iVar;
        this.f3567d = jVar;
        k kVar = jVar.f5664m;
        this.f3566c = kVar;
        this.f3570h = kVar.m();
        com.anythink.basead.a.b.a aVar = new com.anythink.basead.a.b.a();
        this.f3574l = aVar;
        aVar.a((com.anythink.basead.a.a.b) new a(this, (byte) 0));
    }

    public static /* synthetic */ void e(b bVar) {
        d.a().b(bVar);
        n.a().c(bVar.f3568e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.anythink.basead.a.a.c<Void, com.anythink.basead.c.e> cVar = this.f3574l;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void c() {
        d.a().b(this);
        n.a().c(this.f3568e);
    }

    private void d() {
        n.a().a(this.f3568e, this.f3570h);
    }

    public final void a(InterfaceC0049b interfaceC0049b) {
        i iVar = this.f3565b;
        if (iVar != null && this.f3574l != null) {
            this.f3571i = iVar.p();
            this.f3573k = interfaceC0049b;
            n.a().a(this.f3568e, this.f3570h);
            if (!this.f3565b.g()) {
                this.f3574l.a(1);
                a();
                return;
            }
            this.f3576n = false;
            k kVar = this.f3566c;
            if (kVar != null) {
                String valueOf = String.valueOf(kVar.t());
                boolean z10 = valueOf.equals("1") || valueOf.equals("3");
                this.f3574l.a(1);
                if (z10) {
                    this.f3574l.a(2);
                    a();
                }
                if (this.f3576n) {
                    return;
                }
                boolean V = this.f3566c.V();
                String a10 = com.anythink.basead.mraid.d.a(this.f3567d, this.f3565b);
                if (TextUtils.isEmpty(a10)) {
                    a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.F, com.anythink.basead.c.f.L));
                    return;
                } else if (!V) {
                    b();
                    return;
                } else {
                    n.a().a(new AnonymousClass2(c.a(this.f3567d, this.f3565b), a10));
                    return;
                }
            }
            return;
        }
        a(com.anythink.basead.c.f.a("-9999", com.anythink.basead.c.f.f3765w));
    }

    private void a() {
        List<String> b10 = this.f3565b.b((i) this.f3566c);
        if (b10 == null) {
            a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3755l, "Incomplete resource allocation! MissResource: ".concat(String.valueOf(this.f3565b.m()))));
            return;
        }
        int size = b10.size();
        if (size == 0) {
            b();
            return;
        }
        this.f3572j = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = b10.get(i10);
            if (!TextUtils.isEmpty(str)) {
                if (this.f3565b.D(str)) {
                    if (!c.b(str, this.f3566c.S()) && !this.f3572j.contains(str)) {
                        this.f3566c.S();
                        this.f3572j.add(str);
                    }
                } else if (!c.c(str) && !this.f3572j.contains(str)) {
                    this.f3572j.add(str);
                }
            }
        }
        int size2 = this.f3572j.size();
        if (size2 == 0) {
            b();
            return;
        }
        d.a().a(this);
        synchronized (this) {
            for (int i11 = 0; i11 < size2; i11++) {
                String str2 = this.f3572j.get(i11);
                boolean D = this.f3565b.D(str2);
                int S = this.f3566c.S();
                if (D) {
                    if (c.b(str2, S)) {
                        d.a().a(str2, S);
                    } else {
                        new f(this.f, this.f3565b, this.f3566c).a();
                    }
                } else if (!c.a(str2)) {
                    if (c.c(str2)) {
                        c.a(str2, 100);
                        d.a().a(str2, 100);
                    } else {
                        c.a(str2, 0);
                        new e(this.f, this.f3569g, this.f3565b, str2).d();
                    }
                }
            }
        }
    }

    private void a(boolean z10) {
        String a10 = com.anythink.basead.mraid.d.a(this.f3567d, this.f3565b);
        if (TextUtils.isEmpty(a10)) {
            a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.F, com.anythink.basead.c.f.L));
        } else if (!z10) {
            b();
        } else {
            n.a().a(new AnonymousClass2(c.a(this.f3567d, this.f3565b), a10));
        }
    }

    @Override // com.anythink.basead.a.b.d.a
    public final void a(String str, int i10) {
        List<String> list;
        synchronized (this) {
            c.a(str, i10);
            if (this.f3572j.contains(str) && ((!this.f3565b.D(str) || this.f3566c.S() <= i10) && (list = this.f3572j) != null)) {
                list.remove(str);
                this.f3572j.size();
                if (this.f3572j.size() == 0) {
                    b();
                }
            }
        }
    }

    @Override // com.anythink.basead.a.b.d.a
    public final void a(String str, com.anythink.basead.c.e eVar) {
        synchronized (this) {
            c.a(str, -1);
            a(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.basead.c.e eVar) {
        this.f3576n = true;
        com.anythink.basead.a.a.c<Void, com.anythink.basead.c.e> cVar = this.f3574l;
        if (cVar != null) {
            cVar.a((com.anythink.basead.a.a.c<Void, com.anythink.basead.c.e>) eVar);
        }
    }
}
