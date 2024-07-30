package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.gb;

/* loaded from: classes2.dex */
public abstract class ib<V extends gb> extends fz<V> implements jc<V> {
    protected Context V;

    public abstract String C();

    @Override // com.huawei.hms.ads.jc
    public void Code() {
        jh.Code(this.V, this.Code, com.huawei.openalliance.ad.constant.ah.B, (Long) null, (Long) null, (Integer) null, (Integer) null);
    }

    @Override // com.huawei.hms.ads.jc
    public void V() {
        jh.Code(this.V, this.Code, com.huawei.openalliance.ad.constant.ah.S, (Long) null, (Long) null, (Integer) null, (Integer) null);
    }

    @Override // com.huawei.hms.ads.jc
    public void Code(long j10, long j11, long j12) {
        long j13 = 0;
        if (j10 == 0 || j10 >= j12) {
            return;
        }
        long j14 = j12 - j10;
        if (j11 != 0 && j11 < j12) {
            j13 = j12 - j11;
        }
        cz.Code(this.V, this.Code, j14, j13);
    }

    @Override // com.huawei.hms.ads.jc
    public void V(long j10, long j11, long j12, long j13) {
        jh.Code(this.V, this.Code, com.huawei.openalliance.ad.constant.ah.C, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf((int) j12), Integer.valueOf((int) j13));
    }

    @Override // com.huawei.hms.ads.jc
    public void Code(long j10, long j11, long j12, long j13) {
        jh.Code(this.V, this.Code, com.huawei.openalliance.ad.constant.ah.Z, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf((int) j12), Integer.valueOf((int) j13));
    }
}
