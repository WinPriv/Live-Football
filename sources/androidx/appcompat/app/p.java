package androidx.appcompat.app;

import android.net.Uri;
import android.util.Pair;
import androidx.appcompat.app.q;
import com.applovin.exoplayer2.b0;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.m.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import d6.g0;
import e6.m;
import j5.u;
import k4.f0;
import k4.f1;
import k4.y0;
import k5.b;
import m4.k;
import p5.b;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f675s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f676t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f677u;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f675s = i10;
        this.f676t = obj;
        this.f677u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var;
        switch (this.f675s) {
            case 0:
                q.a aVar = (q.a) this.f676t;
                Runnable runnable = (Runnable) this.f677u;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                ((g.a) this.f676t).b((com.applovin.exoplayer2.d.g) this.f677u);
                return;
            case 2:
                ((n.a) this.f676t).b((com.applovin.exoplayer2.m.o) this.f677u);
                return;
            case 3:
                ((n.a) this.f676t).d((com.applovin.exoplayer2.c.e) this.f677u);
                return;
            case 4:
                f0 f0Var = (f0) this.f676t;
                f1 f1Var = (f1) this.f677u;
                f0Var.getClass();
                try {
                    synchronized (f1Var) {
                    }
                    try {
                        f1Var.f30455a.p(f1Var.f30458d, f1Var.f30459e);
                        return;
                    } finally {
                        f1Var.b(true);
                    }
                } catch (k4.m e10) {
                    d6.p.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 5:
                y0.a aVar2 = (y0.a) this.f676t;
                Pair pair = (Pair) this.f677u;
                aVar2.f30846t.f30840h.I(((Integer) pair.first).intValue(), (u.b) pair.second);
                return;
            case 6:
                k.a aVar3 = (k.a) this.f676t;
                Exception exc = (Exception) this.f677u;
                aVar3.getClass();
                int i10 = g0.f27302a;
                aVar3.f32748b.m(exc);
                return;
            case 7:
                ((b.a) this.f676t).getClass();
                int i11 = k5.b.C;
                throw null;
            case 8:
                b.C0459b c0459b = (b.C0459b) this.f676t;
                Uri uri = (Uri) this.f677u;
                c0459b.A = false;
                c0459b.b(uri);
                return;
            case 9:
                m.a aVar4 = (m.a) this.f676t;
                n4.e eVar = (n4.e) this.f677u;
                aVar4.getClass();
                int i12 = g0.f27302a;
                aVar4.f27841b.f(eVar);
                return;
            case 10:
                s7.t tVar = (s7.t) this.f676t;
                c8.a<T> aVar5 = (c8.a) this.f677u;
                if (tVar.f35257b == s7.t.f35255d) {
                    synchronized (tVar) {
                        b0Var = tVar.f35256a;
                        tVar.f35256a = null;
                        tVar.f35257b = aVar5;
                    }
                    b0Var.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 11:
                Runnable runnable2 = (Runnable) this.f677u;
                h.b bVar = (h.b) this.f676t;
                try {
                    runnable2.run();
                    return;
                } catch (Exception e11) {
                    ((h.a) bVar).a(e11);
                    throw e11;
                }
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f676t;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f677u;
                com.google.firebase.messaging.a aVar6 = FirebaseMessaging.f21279n;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
        }
    }

    public /* synthetic */ p(Runnable runnable, h.b bVar) {
        this.f675s = 11;
        this.f677u = runnable;
        this.f676t = bVar;
    }
}
