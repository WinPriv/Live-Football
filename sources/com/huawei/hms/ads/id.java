package com.huawei.hms.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class id extends io {
    public id(ec ecVar, ko koVar) {
        super(ecVar, koVar);
    }

    @Override // com.huawei.hms.ads.io
    public void V() {
        long longValue = ((Long) gb.q.a(new Callable<Long>() { // from class: com.huawei.hms.ads.id.1
            @Override // java.util.concurrent.Callable
            /* renamed from: Code, reason: merged with bridge method [inline-methods] */
            public Long call() {
                return Long.valueOf(id.this.Code.b());
            }
        }, 300L)).longValue();
        int intValue = ((Integer) gb.q.a(new Callable<Integer>() { // from class: com.huawei.hms.ads.id.2
            @Override // java.util.concurrent.Callable
            /* renamed from: Code, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                return Integer.valueOf(id.this.Code.a());
            }
        }, 2000)).intValue();
        V(longValue);
        Code(intValue);
    }
}
