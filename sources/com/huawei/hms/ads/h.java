package com.huawei.hms.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public class h {
    private Context I;
    private com.huawei.openalliance.ad.inter.data.j V;

    public h(Context context, com.huawei.openalliance.ad.inter.data.j jVar) {
        this.V = jVar;
        this.I = context;
    }

    public void Code() {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jh.Code(this.I, jVar.m());
        }
    }

    public void V(List<String> list) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jh.Code(this.I, jVar.m(), 0, 0, list);
        }
    }

    public void Code(long j10, int i10) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jh.Code(this.I, jVar.m(), j10, i10);
        }
    }

    public void Code(Long l10, Integer num, Integer num2, String str) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jh.Code(this.I, jVar.m(), l10, num, num2, str);
        }
    }

    public void Code(String str) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar == null) {
            ex.V("AdEventProcessor", " native ad is empty");
        } else {
            jh.Code(this.I, jVar.m(), 0, 0, (String) null, str);
        }
    }

    public void Code(String str, String str2) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jh.Code(this.I, jVar.m(), 0, 0, str, str2);
        }
    }

    public void Code(List<String> list) {
        com.huawei.openalliance.ad.inter.data.j jVar = this.V;
        if (jVar != null) {
            jh.Code(this.I, jVar.m(), 0, 0, list);
        }
    }
}
