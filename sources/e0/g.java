package e0;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioTrack;
import com.applovin.exoplayer2.b.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.drm.e;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.g0;
import e0.f;
import e6.m;
import i8.p;
import j5.u;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import k4.a0;
import k4.c1;
import k4.f0;
import k4.g1;
import k4.q1;
import m4.k;
import m4.r;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27641s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f27642t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f27643u;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f27641s = i10;
        this.f27642t = obj;
        this.f27643u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f27641s) {
            case 0:
                ((f.e) this.f27642t).d((Typeface) this.f27643u);
                return;
            case 1:
                ((g.a) this.f27642t).d((com.applovin.exoplayer2.c.e) this.f27643u);
                return;
            case 2:
                ((g.a) this.f27642t).d((Exception) this.f27643u);
                return;
            case 3:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f27642t;
                JobParameters jobParameters = (JobParameters) this.f27643u;
                int i10 = JobInfoSchedulerService.f19904s;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 4:
                a0 a0Var = (a0) this.f27642t;
                f0.d dVar = (f0.d) this.f27643u;
                int i11 = a0Var.H - dVar.f30443c;
                a0Var.H = i11;
                boolean z12 = true;
                if (dVar.f30444d) {
                    a0Var.I = dVar.f30445e;
                    a0Var.J = true;
                }
                if (dVar.f) {
                    a0Var.K = dVar.f30446g;
                }
                if (i11 == 0) {
                    q1 q1Var = dVar.f30442b.f30382a;
                    if (!a0Var.f30333i0.f30382a.p() && q1Var.p()) {
                        a0Var.f30335j0 = -1;
                        a0Var.f30337k0 = 0L;
                    }
                    if (!q1Var.p()) {
                        List asList = Arrays.asList(((g1) q1Var).B);
                        if (asList.size() == a0Var.o.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        d6.a.d(z11);
                        for (int i12 = 0; i12 < asList.size(); i12++) {
                            ((a0.d) a0Var.o.get(i12)).f30357b = (q1) asList.get(i12);
                        }
                    }
                    boolean z13 = a0Var.J;
                    long j10 = com.anythink.expressad.exoplayer.b.f7291b;
                    if (z13) {
                        if (dVar.f30442b.f30383b.equals(a0Var.f30333i0.f30383b) && dVar.f30442b.f30385d == a0Var.f30333i0.f30397r) {
                            z12 = false;
                        }
                        if (z12) {
                            if (!q1Var.p() && !dVar.f30442b.f30383b.a()) {
                                c1 c1Var = dVar.f30442b;
                                u.b bVar = c1Var.f30383b;
                                long j11 = c1Var.f30385d;
                                Object obj = bVar.f29835a;
                                q1.b bVar2 = a0Var.f30340n;
                                q1Var.g(obj, bVar2);
                                j10 = j11 + bVar2.f30758w;
                            } else {
                                j10 = dVar.f30442b.f30385d;
                            }
                        }
                        z10 = z12;
                    } else {
                        z10 = false;
                    }
                    a0Var.J = false;
                    a0Var.r0(dVar.f30442b, 1, a0Var.K, false, z10, a0Var.I, j10, -1, false);
                    return;
                }
                return;
            case 5:
                k.a aVar = (k.a) this.f27642t;
                String str = (String) this.f27643u;
                aVar.getClass();
                int i13 = g0.f27302a;
                aVar.f32748b.g(str);
                return;
            case 6:
                k.a aVar2 = (k.a) this.f27642t;
                n4.e eVar = (n4.e) this.f27643u;
                aVar2.getClass();
                int i14 = g0.f27302a;
                aVar2.f32748b.o(eVar);
                return;
            case 7:
                AudioTrack audioTrack = (AudioTrack) this.f27642t;
                d6.e eVar2 = (d6.e) this.f27643u;
                Object obj2 = r.f32799d0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    eVar2.a();
                    synchronized (r.f32799d0) {
                        int i15 = r.f32801f0 - 1;
                        r.f32801f0 = i15;
                        if (i15 == 0) {
                            r.f32800e0.shutdown();
                            r.f32800e0 = null;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    eVar2.a();
                    synchronized (r.f32799d0) {
                        int i16 = r.f32801f0 - 1;
                        r.f32801f0 = i16;
                        if (i16 == 0) {
                            r.f32800e0.shutdown();
                            r.f32800e0 = null;
                        }
                        throw th;
                    }
                }
            case 8:
                e.a aVar3 = (e.a) this.f27642t;
                ((com.google.android.exoplayer2.drm.e) this.f27643u).B(aVar3.f19977a, aVar3.f19978b);
                return;
            case 9:
                i.k(this.f27642t);
                int i17 = k5.b.C;
                throw null;
            case 10:
                m.a aVar4 = (m.a) this.f27642t;
                n4.e eVar3 = (n4.e) this.f27643u;
                aVar4.getClass();
                synchronized (eVar3) {
                }
                e6.m mVar = aVar4.f27841b;
                int i18 = g0.f27302a;
                mVar.b(eVar3);
                return;
            case 11:
                Callable callable = (Callable) this.f27642t;
                h.b bVar3 = (h.b) this.f27643u;
                try {
                    Object call = callable.call();
                    t7.h hVar = t7.h.this;
                    hVar.getClass();
                    if (call == null) {
                        call = r.a.y;
                    }
                    if (r.a.f34756x.b(hVar, null, call)) {
                        r.a.d(hVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((h.a) bVar3).a(e10);
                    return;
                }
            case 12:
                i8.l lVar = (i8.l) this.f27642t;
                Intent intent = (Intent) this.f27643u;
                lVar.getClass();
                i8.l.a(intent);
                return;
            default:
                p pVar = (p) this.f27642t;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f27643u;
                pVar.getClass();
                try {
                    taskCompletionSource.setResult(pVar.b());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
        }
    }
}
