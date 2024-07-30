package com.applovin.exoplayer2.g.f;

import a6.f;
import b6.e;
import c6.f0;
import com.applovin.exoplayer2.g.f.c;
import com.applovin.exoplayer2.v;
import com.google.android.exoplayer2.ui.e;
import java.util.Comparator;
import s5.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15201s;

    public /* synthetic */ e(int i10) {
        this.f15201s = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10;
        switch (this.f15201s) {
            case 0:
                return c.a.c((c.a) obj, (c.a) obj2);
            case 1:
                a10 = com.applovin.exoplayer2.j.b.a((v) obj, (v) obj2);
                return a10;
            case 2:
                return Integer.compare(((b.a) obj2).f35176b, ((b.a) obj).f35176b);
            case 3:
                return Integer.compare(((f.a) obj).f328a.f331b, ((f.a) obj2).f328a.f331b);
            case 4:
                return e.h.c((e.h) obj, (e.h) obj2);
            case 5:
                return e.h.d((e.h) obj, (e.h) obj2);
            case 6:
                e.b bVar = (e.b) obj;
                e.b bVar2 = (e.b) obj2;
                int compare = Integer.compare(bVar2.f20349b, bVar.f20349b);
                if (compare == 0) {
                    int compareTo = bVar.f20350c.compareTo(bVar2.f20350c);
                    if (compareTo == 0) {
                        return bVar.f20351d.compareTo(bVar2.f20351d);
                    }
                    return compareTo;
                }
                return compare;
            default:
                return ((f0.a) obj).f3346a - ((f0.a) obj2).f3346a;
        }
    }
}
