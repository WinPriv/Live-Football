package com.applovin.exoplayer2.j;

import b6.e;
import c6.f0;
import com.google.android.exoplayer2.ui.e;
import j7.v;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okhttp3.CipherSuite;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Comparator {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16025s;

    public /* synthetic */ l(int i10) {
        this.f16025s = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        switch (this.f16025s) {
            case 0:
                return c.e((Integer) obj, (Integer) obj2);
            case 1:
                return ((e.f) ((List) obj).get(0)).compareTo((e.f) ((List) obj2).get(0));
            case 2:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i10 = 4;
                int i11 = 3;
                return v.a.f(new m(i11).compare((e.h) Collections.max(list, new com.applovin.exoplayer2.g.f.e(i10)), (e.h) Collections.max(list2, new l(i11)))).a(list.size(), list2.size()).b((e.h) Collections.max(list, new k0.d(6)), (e.h) Collections.max(list2, new com.applovin.exoplayer2.g.f.e(5)), new l(i10)).e();
            case 3:
                return e.h.c((e.h) obj, (e.h) obj2);
            case 4:
                return e.h.d((e.h) obj, (e.h) obj2);
            case 5:
                e.b bVar = (e.b) obj;
                e.b bVar2 = (e.b) obj2;
                int compare = Integer.compare(bVar2.f20348a, bVar.f20348a);
                if (compare == 0) {
                    int compareTo = bVar2.f20350c.compareTo(bVar.f20350c);
                    if (compareTo == 0) {
                        return bVar2.f20351d.compareTo(bVar.f20351d);
                    }
                    return compareTo;
                }
                return compare;
            case 6:
                return Float.compare(((f0.a) obj).f3348c, ((f0.a) obj2).f3348c);
            case 7:
                lambda$static$0 = CipherSuite.lambda$static$0((String) obj, (String) obj2);
                return lambda$static$0;
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
