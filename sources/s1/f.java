package s1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r1.n;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class f extends c5.e {
    public static final String E = r1.h.e("WorkContinuationImpl");
    public final ArrayList A;
    public final List<f> B;
    public boolean C;
    public b D;

    /* renamed from: v, reason: collision with root package name */
    public final j f35062v;

    /* renamed from: w, reason: collision with root package name */
    public final String f35063w;

    /* renamed from: x, reason: collision with root package name */
    public final int f35064x;
    public final List<? extends n> y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f35065z;

    public f() {
        throw null;
    }

    public f(j jVar, String str, List list) {
        this.f35062v = jVar;
        this.f35063w = str;
        this.f35064x = 2;
        this.y = list;
        this.B = null;
        this.f35065z = new ArrayList(list.size());
        this.A = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((n) list.get(i10)).f34834a.toString();
            this.f35065z.add(uuid);
            this.A.add(uuid);
        }
    }

    public static boolean j(f fVar, HashSet hashSet) {
        hashSet.addAll(fVar.f35065z);
        HashSet k10 = k(fVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (k10.contains((String) it.next())) {
                return true;
            }
        }
        List<f> list = fVar.B;
        if (list != null && !list.isEmpty()) {
            Iterator<f> it2 = list.iterator();
            while (it2.hasNext()) {
                if (j(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(fVar.f35065z);
        return false;
    }

    public static HashSet k(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> list = fVar.B;
        if (list != null && !list.isEmpty()) {
            Iterator<f> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f35065z);
            }
        }
        return hashSet;
    }

    public final r1.k i() {
        if (!this.C) {
            b2.e eVar = new b2.e(this);
            ((d2.b) this.f35062v.f35075d).a(eVar);
            this.D = eVar.f2813t;
        } else {
            r1.h.c().f(E, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f35065z)), new Throwable[0]);
        }
        return this.D;
    }
}
