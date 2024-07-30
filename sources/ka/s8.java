package ka;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class s8 {

    /* renamed from: g, reason: collision with root package name */
    public static s8 f31810g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f31811h = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public w7 f31813b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f31815d;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f31812a = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f31814c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public final a f31816e = new a();
    public final b f = new b();

    /* loaded from: classes2.dex */
    public class b implements f9 {
        public b() {
        }

        @Override // ka.f9
        public final void g(w7 w7Var, int i10, int i11, int i12) {
            if (n7.d()) {
                s8 s8Var = s8.f31810g;
                n7.c("s8", "onError: %s", w7Var);
            }
            synchronized (s8.this.f31812a) {
                w7Var.E.remove(this);
            }
            s8.b(s8.this);
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f31819a;

        /* renamed from: b, reason: collision with root package name */
        public final w7 f31820b;

        public c(w7 w7Var, String str) {
            this.f31819a = str;
            this.f31820b = w7Var;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            c cVar = (c) obj;
            if (!TextUtils.equals(this.f31819a, cVar.f31819a) || this.f31820b != cVar.f31820b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = -1;
            String str = this.f31819a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = -1;
            }
            w7 w7Var = this.f31820b;
            if (w7Var != null) {
                i11 = w7Var.hashCode();
            }
            return i11 & i10 & super.hashCode();
        }

        public final String toString() {
            return "Task [" + com.huawei.openalliance.ad.ppskit.utils.y1.j(this.f31819a) + "]";
        }
    }

    public s8(Context context) {
        this.f31815d = context.getApplicationContext();
    }

    public static void b(s8 s8Var) {
        if (com.huawei.openalliance.ad.ppskit.utils.k1.e(s8Var.f31815d)) {
            synchronized (s8Var.f31812a) {
                c cVar = (c) s8Var.f31814c.poll();
                if (n7.d()) {
                    n7.c("s8", "playNextTask - task: %s currentPlayer: %s", cVar, s8Var.f31813b);
                }
                if (cVar != null) {
                    if (n7.d()) {
                        n7.c("s8", "playNextTask - play: %s", cVar.f31820b);
                    }
                    w7 w7Var = cVar.f31820b;
                    a aVar = s8Var.f31816e;
                    if (aVar == null) {
                        w7Var.getClass();
                    } else {
                        w7Var.C.add(aVar);
                    }
                    w7 w7Var2 = cVar.f31820b;
                    b bVar = s8Var.f;
                    if (bVar == null) {
                        w7Var2.getClass();
                    } else {
                        w7Var2.E.add(bVar);
                    }
                    w7 w7Var3 = cVar.f31820b;
                    String str = cVar.f31819a;
                    w7Var3.getClass();
                    w7.k(new j8(w7Var3, str));
                    s8Var.f31813b = cVar.f31820b;
                } else {
                    s8Var.f31813b = null;
                }
            }
        }
    }

    public final void a(w7 w7Var) {
        synchronized (this.f31812a) {
            if (w7Var != null) {
                a aVar = this.f31816e;
                if (aVar != null) {
                    w7Var.C.remove(aVar);
                }
                b bVar = this.f;
                if (bVar != null) {
                    w7Var.E.remove(bVar);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a implements h9 {
        public a() {
        }

        public final void a() {
            synchronized (s8.this.f31812a) {
                if (n7.d()) {
                    s8 s8Var = s8.f31810g;
                    n7.c("s8", "checkAndPlayNext current player: %s", s8.this.f31813b);
                }
                s8 s8Var2 = s8.this;
                if (s8Var2.f31813b == null) {
                    s8.b(s8Var2);
                }
            }
        }

        @Override // ka.h9
        public final void h(w7 w7Var, int i10) {
            if (n7.d()) {
                s8 s8Var = s8.f31810g;
                n7.c("s8", "onMediaPause: %s", w7Var);
            }
            a();
        }

        @Override // ka.h9
        public final void m(w7 w7Var, int i10) {
            if (n7.d()) {
                s8 s8Var = s8.f31810g;
                n7.c("s8", "onMediaCompletion: %s", w7Var);
            }
            s8.b(s8.this);
        }

        @Override // ka.h9
        public final void o(w7 w7Var, int i10) {
            if (n7.d()) {
                s8 s8Var = s8.f31810g;
                n7.c("s8", "onMediaStop: %s", w7Var);
            }
            a();
        }

        @Override // ka.h9
        public final void a(int i10, int i11) {
        }

        @Override // ka.h9
        public final void j(w7 w7Var, int i10) {
        }
    }
}
