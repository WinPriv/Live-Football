package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.gb;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class fz<V extends gb> implements ga<V> {
    protected AdContentData Code;
    private Map<String, Boolean> I = new HashMap();
    private V V;

    private boolean V(String str) {
        if (this.I.containsKey(str) && this.I.get(str).booleanValue()) {
            return true;
        }
        return false;
    }

    public String B() {
        return gb.u.c(I());
    }

    public void Code(long j10) {
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            adContentData.b0(j10);
        }
    }

    @Override // com.huawei.hms.ads.ga
    public V I() {
        return this.V;
    }

    public void Z() {
        Map<String, Boolean> map = this.I;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public void Code(Context context, long j10, long j11) {
        String str;
        if (j10 >= j11) {
            str = "complete";
            if (V("complete")) {
                return;
            }
        } else {
            long j12 = j11 / 4;
            if (j10 > 3 * j12) {
                str = com.huawei.openalliance.ad.constant.cp.Z;
                if (V(com.huawei.openalliance.ad.constant.cp.Z)) {
                    return;
                }
            } else if (j10 > j11 / 2) {
                str = "midpoint";
                if (V("midpoint")) {
                    return;
                }
            } else if (j10 > j12) {
                str = com.huawei.openalliance.ad.constant.cp.V;
                if (V(com.huawei.openalliance.ad.constant.cp.V)) {
                    return;
                }
            } else {
                if (j10 <= 0) {
                    return;
                }
                str = "start";
                if (V("start")) {
                    return;
                }
            }
        }
        jh.V(context, this.Code, str);
        this.I.put(str, Boolean.TRUE);
    }

    @Override // com.huawei.hms.ads.ga
    public void Code(V v3) {
        this.V = v3;
    }

    public void Code(String str) {
        AdContentData adContentData = this.Code;
        if (adContentData == null) {
            return;
        }
        adContentData.y(str);
        Z();
    }
}
