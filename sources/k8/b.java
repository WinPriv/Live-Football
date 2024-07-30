package k8;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f30893a;

    /* renamed from: b, reason: collision with root package name */
    public final c f30894b;

    public b(Set<d> set, c cVar) {
        this.f30893a = a(set);
        this.f30894b = cVar;
    }

    public static String a(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // k8.g
    public final String getUserAgent() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f30894b;
        synchronized (cVar.f30896a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f30896a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f30893a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (cVar.f30896a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar.f30896a);
        }
        sb2.append(a(unmodifiableSet2));
        return sb2.toString();
    }
}
