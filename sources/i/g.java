package i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import n0.l0;
import n0.m0;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f29023c;

    /* renamed from: d, reason: collision with root package name */
    public m0 f29024d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29025e;

    /* renamed from: b, reason: collision with root package name */
    public long f29022b = -1;
    public final a f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<l0> f29021a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends a0.a {
        public boolean I0 = false;
        public int J0 = 0;

        public a() {
        }

        @Override // n0.m0
        public final void a() {
            int i10 = this.J0 + 1;
            this.J0 = i10;
            g gVar = g.this;
            if (i10 == gVar.f29021a.size()) {
                m0 m0Var = gVar.f29024d;
                if (m0Var != null) {
                    m0Var.a();
                }
                this.J0 = 0;
                this.I0 = false;
                gVar.f29025e = false;
            }
        }

        @Override // a0.a, n0.m0
        public final void c() {
            if (this.I0) {
                return;
            }
            this.I0 = true;
            m0 m0Var = g.this.f29024d;
            if (m0Var != null) {
                m0Var.c();
            }
        }
    }

    public final void a() {
        if (!this.f29025e) {
            return;
        }
        Iterator<l0> it = this.f29021a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f29025e = false;
    }

    public final void b() {
        View view;
        if (this.f29025e) {
            return;
        }
        Iterator<l0> it = this.f29021a.iterator();
        while (it.hasNext()) {
            l0 next = it.next();
            long j10 = this.f29022b;
            if (j10 >= 0) {
                next.c(j10);
            }
            Interpolator interpolator = this.f29023c;
            if (interpolator != null && (view = next.f33092a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f29024d != null) {
                next.d(this.f);
            }
            View view2 = next.f33092a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f29025e = true;
    }
}
