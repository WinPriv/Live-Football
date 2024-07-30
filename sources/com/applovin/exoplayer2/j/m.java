package com.applovin.exoplayer2.j;

import b6.e;
import j7.u1;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Comparator {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16026s;

    public /* synthetic */ m(int i10) {
        this.f16026s = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16026s) {
            case 0:
                return c.c((Integer) obj, (Integer) obj2);
            case 1:
                return Long.compare(((a6.e) obj).f321b, ((a6.e) obj2).f321b);
            case 2:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                u1<Integer> u1Var = b6.e.f3021i;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            default:
                return e.h.c((e.h) obj, (e.h) obj2);
        }
    }
}
