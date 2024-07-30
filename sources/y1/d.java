package y1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import r1.h;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {
    public static final String f = h.e("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final d2.a f36530a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f36531b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36532c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f36533d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public T f36534e;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f36535s;

        public a(ArrayList arrayList) {
            this.f36535s = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f36535s.iterator();
            while (it.hasNext()) {
                ((w1.a) it.next()).a(d.this.f36534e);
            }
        }
    }

    public d(Context context, d2.a aVar) {
        this.f36531b = context.getApplicationContext();
        this.f36530a = aVar;
    }

    public abstract T a();

    public final void b(T t10) {
        synchronized (this.f36532c) {
            T t11 = this.f36534e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f36534e = t10;
                ((d2.b) this.f36530a).f27267c.execute(new a(new ArrayList(this.f36533d)));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
