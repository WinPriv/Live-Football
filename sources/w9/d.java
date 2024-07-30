package w9;

import java.util.ArrayList;
import java.util.Iterator;
import v9.Task;

/* loaded from: classes2.dex */
public final class d<TResult> extends Task<TResult> {

    /* renamed from: b, reason: collision with root package name */
    public boolean f36176b;

    /* renamed from: c, reason: collision with root package name */
    public TResult f36177c;

    /* renamed from: d, reason: collision with root package name */
    public Exception f36178d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f36175a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f36179e = new ArrayList();

    @Override // v9.Task
    public final d a(v9.b bVar) {
        boolean z10;
        b bVar2 = new b(v9.d.f35997c.f35999b, bVar);
        synchronized (this.f36175a) {
            synchronized (this.f36175a) {
                z10 = this.f36176b;
            }
            if (!z10) {
                this.f36179e.add(bVar2);
            }
        }
        if (z10) {
            bVar2.a(this);
        }
        return this;
    }

    @Override // v9.Task
    public final d b(v9.c cVar) {
        boolean z10;
        c cVar2 = new c(v9.d.f35997c.f35999b, cVar);
        synchronized (this.f36175a) {
            synchronized (this.f36175a) {
                z10 = this.f36176b;
            }
            if (!z10) {
                this.f36179e.add(cVar2);
            }
        }
        if (z10) {
            cVar2.a(this);
        }
        return this;
    }

    @Override // v9.Task
    public final TResult c() {
        TResult tresult;
        synchronized (this.f36175a) {
            if (this.f36178d == null) {
                tresult = this.f36177c;
            } else {
                throw new RuntimeException(this.f36178d);
            }
        }
        return tresult;
    }

    @Override // v9.Task
    public final boolean d() {
        boolean z10;
        synchronized (this.f36175a) {
            if (this.f36176b && this.f36178d == null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e() {
        synchronized (this.f36175a) {
            Iterator it = this.f36179e.iterator();
            while (it.hasNext()) {
                try {
                    ((v9.a) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f36179e = null;
        }
    }
}
