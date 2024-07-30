package com.anythink.expressad.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.expressad.exoplayer.h.a.c;
import com.anythink.expressad.exoplayer.h.n;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.j.h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends com.anythink.expressad.exoplayer.h.c implements n.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8457a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8458b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8459c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8460d = 1048576;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f8461e;
    private final h.a f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.e.h f8462g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8463h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8464i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8465j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f8466k;

    /* renamed from: l, reason: collision with root package name */
    private long f8467l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8468m;

    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c implements c.e {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f8470a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.e.h f8471b;

        /* renamed from: c, reason: collision with root package name */
        private String f8472c;

        /* renamed from: d, reason: collision with root package name */
        private Object f8473d;

        /* renamed from: e, reason: collision with root package name */
        private int f8474e = -1;
        private int f = o.f8460d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8475g;

        public c(h.a aVar) {
            this.f8470a = aVar;
        }

        @Override // com.anythink.expressad.exoplayer.h.a.c.e
        public final int[] a() {
            return new int[]{3};
        }

        private c a(com.anythink.expressad.exoplayer.e.h hVar) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8475g);
            this.f8471b = hVar;
            return this;
        }

        private c b(int i10) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8475g);
            this.f = i10;
            return this;
        }

        private c a(String str) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8475g);
            this.f8472c = str;
            return this;
        }

        private c a(Object obj) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8475g);
            this.f8473d = obj;
            return this;
        }

        private c a(int i10) {
            com.anythink.expressad.exoplayer.k.a.b(!this.f8475g);
            this.f8474e = i10;
            return this;
        }

        @Override // com.anythink.expressad.exoplayer.h.a.c.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o b(Uri uri) {
            this.f8475g = true;
            if (this.f8471b == null) {
                this.f8471b = new com.anythink.expressad.exoplayer.e.c();
            }
            return new o(uri, this.f8470a, this.f8471b, this.f8474e, this.f8472c, this.f, this.f8473d, (byte) 0);
        }

        @Deprecated
        private o a(Uri uri, Handler handler, t tVar) {
            o b10 = b(uri);
            if (handler != null && tVar != null) {
                b10.a(handler, tVar);
            }
            return b10;
        }
    }

    public /* synthetic */ o(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.e.h hVar, int i10, String str, int i11, Object obj, byte b10) {
        this(uri, aVar, hVar, i10, str, i11, obj);
    }

    @Override // com.anythink.expressad.exoplayer.h.c
    public final void a() {
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void b() {
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.e.h hVar, Handler handler, a aVar2) {
        this(uri, aVar, hVar, handler, aVar2, null);
    }

    private void b(long j10, boolean z10) {
        this.f8467l = j10;
        this.f8468m = z10;
        a(new ab(this.f8467l, this.f8468m, false, this.f8466k), (Object) null);
    }

    @Override // com.anythink.expressad.exoplayer.h.c
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        b(this.f8467l, false);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.e.h hVar, Handler handler, a aVar2, String str) {
        this(uri, aVar, hVar, handler, aVar2, str, (byte) 0);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        com.anythink.expressad.exoplayer.k.a.a(aVar.f8484a == 0);
        return new n(this.f8461e, this.f.a(), this.f8462g.a(), this.f8463h, a(aVar), this, bVar, this.f8464i, this.f8465j);
    }

    @Deprecated
    private o(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.e.h hVar, Handler handler, a aVar2, String str, byte b10) {
        this(uri, aVar, hVar, -1, str, f8460d, (Object) null);
        if (aVar2 == null || handler == null) {
            return;
        }
        a(handler, new b(aVar2));
    }

    private o(Uri uri, h.a aVar, com.anythink.expressad.exoplayer.e.h hVar, int i10, String str, int i11, Object obj) {
        this.f8461e = uri;
        this.f = aVar;
        this.f8462g = hVar;
        this.f8463h = i10;
        this.f8464i = str;
        this.f8465j = i11;
        this.f8467l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f8466k = obj;
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        ((n) rVar).f();
    }

    @Override // com.anythink.expressad.exoplayer.h.n.c
    public final void a(long j10, boolean z10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = this.f8467l;
        }
        if (this.f8467l == j10 && this.f8468m == z10) {
            return;
        }
        b(j10, z10);
    }

    /* loaded from: classes.dex */
    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f8469a;

        public b(a aVar) {
            this.f8469a = (a) com.anythink.expressad.exoplayer.k.a.a(aVar);
        }

        @Override // com.anythink.expressad.exoplayer.h.k, com.anythink.expressad.exoplayer.h.t
        public final void a(int i10, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z10) {
        }
    }
}
