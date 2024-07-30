package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.k;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private j f9948a;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<a> f9950c = new LinkedList<>();

    /* renamed from: b, reason: collision with root package name */
    private int f9949b = 3;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9951a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9952b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9953c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9954d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9955e = 4;

        /* renamed from: g, reason: collision with root package name */
        private String f9956g;

        /* renamed from: h, reason: collision with root package name */
        private File f9957h;

        /* renamed from: i, reason: collision with root package name */
        private com.anythink.expressad.foundation.g.f.e<Void> f9958i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.expressad.foundation.g.f.d.a f9959j;

        /* renamed from: k, reason: collision with root package name */
        private int f9960k;

        public /* synthetic */ a(b bVar, File file, String str, com.anythink.expressad.foundation.g.f.e eVar, byte b10) {
            this(file, str, (com.anythink.expressad.foundation.g.f.e<Void>) eVar);
        }

        public static /* synthetic */ int c(a aVar) {
            aVar.f9960k = 3;
            return 3;
        }

        private int d() {
            return this.f9960k;
        }

        private boolean e() {
            int i10 = this.f9960k;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                this.f9959j.e();
                this.f9960k = 2;
                b.this.b();
                return true;
            }
            this.f9960k = 2;
            b.this.b();
            return true;
        }

        private boolean f() {
            if (this.f9960k != 2) {
                return false;
            }
            this.f9960k = 0;
            b.this.b();
            return true;
        }

        public final boolean a() {
            return this.f9960k == 1;
        }

        private a(b bVar, String str, String str2, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
            this(new File(str), str2, eVar);
        }

        public static /* synthetic */ boolean a(a aVar) {
            if (aVar.f9960k != 0) {
                return false;
            }
            com.anythink.expressad.foundation.g.f.d.a aVar2 = new com.anythink.expressad.foundation.g.f.d.a(aVar.f9957h, aVar.f9956g);
            aVar.f9959j = aVar2;
            aVar2.a((com.anythink.expressad.foundation.g.f.e) new AnonymousClass1());
            aVar.f9960k = 1;
            b.this.f9948a.a((i) aVar.f9959j);
            return true;
        }

        private boolean c() {
            if (this.f9960k != 0) {
                return false;
            }
            com.anythink.expressad.foundation.g.f.d.a aVar = new com.anythink.expressad.foundation.g.f.d.a(this.f9957h, this.f9956g);
            this.f9959j = aVar;
            aVar.a((com.anythink.expressad.foundation.g.f.e) new AnonymousClass1());
            this.f9960k = 1;
            b.this.f9948a.a((i) this.f9959j);
            return true;
        }

        public final boolean b() {
            int i10 = this.f9960k;
            if (i10 == 4 || i10 == 3) {
                return false;
            }
            if (i10 == 1) {
                this.f9959j.e();
            }
            this.f9960k = 4;
            b.a(b.this, this);
            return true;
        }

        private a(File file, String str, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
            this.f9957h = file;
            this.f9958i = eVar;
            this.f9956g = str;
        }

        /* renamed from: com.anythink.expressad.foundation.g.f.d.b$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 extends com.anythink.expressad.foundation.g.f.f<Void> {

            /* renamed from: a, reason: collision with root package name */
            boolean f9961a;

            public AnonymousClass1() {
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a() {
                if (this.f9961a) {
                    return;
                }
                a.c(a.this);
                a.this.f9958i.a();
                a aVar = a.this;
                b.a(b.this, aVar);
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void b() {
                a.this.f9958i.b();
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void c() {
                a.this.f9958i.c();
                this.f9961a = true;
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a(k kVar) {
                if (this.f9961a) {
                    return;
                }
                a.this.f9958i.a(kVar);
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                if (this.f9961a) {
                    return;
                }
                a.this.f9958i.a(aVar);
            }

            @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
            public final void a(long j10, long j11) {
                a.this.f9958i.a(j10, j11);
            }
        }
    }

    public b(j jVar) {
        this.f9948a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this) {
            Iterator<a> it = this.f9950c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (it.next().a()) {
                    i10++;
                }
            }
            if (i10 >= this.f9949b) {
                return;
            }
            Iterator<a> it2 = this.f9950c.iterator();
            while (it2.hasNext()) {
                if (a.a(it2.next()) && (i10 = i10 + 1) == this.f9949b) {
                    return;
                }
            }
        }
    }

    public final a a(File file, String str, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
        a aVar = new a(this, file, str, eVar, (byte) 0);
        synchronized (this) {
            this.f9950c.add(aVar);
        }
        b();
        return aVar;
    }

    private a a(String str, String str2, com.anythink.expressad.foundation.g.f.e<Void> eVar) {
        return a(new File(str), str2, eVar);
    }

    private void a(a aVar) {
        synchronized (this) {
            this.f9950c.remove(aVar);
        }
        b();
    }

    public final void a() {
        synchronized (this) {
            while (!this.f9950c.isEmpty()) {
                this.f9950c.get(0).b();
            }
        }
    }

    private static com.anythink.expressad.foundation.g.f.d.a a(File file, String str) {
        return new com.anythink.expressad.foundation.g.f.d.a(file, str);
    }

    public static /* synthetic */ void a(b bVar, a aVar) {
        synchronized (bVar) {
            bVar.f9950c.remove(aVar);
        }
        bVar.b();
    }
}
