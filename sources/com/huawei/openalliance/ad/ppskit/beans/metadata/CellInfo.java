package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class CellInfo {

    @a
    private String mcc;

    @a
    private String mnc;

    @a
    private int networkType;

    public final void a(Pair<Integer, Pair<String, String>> pair) {
        if (pair == null) {
            return;
        }
        Object obj = pair.first;
        if (obj != null) {
            this.networkType = ((Integer) obj).intValue();
        }
        Pair pair2 = (Pair) pair.second;
        if (pair2 != null) {
            this.mcc = (String) pair2.first;
            this.mnc = (String) pair2.second;
        }
    }
}
