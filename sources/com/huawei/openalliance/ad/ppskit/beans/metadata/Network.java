package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import java.util.ArrayList;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class Network {

    @a
    private List<CellInfo> cellInfo;
    private int type;

    public Network() {
        this.type = 0;
        this.cellInfo = new ArrayList(4);
    }

    public final List<CellInfo> a() {
        return this.cellInfo;
    }

    public Network(Context context, boolean z10) {
        Pair<Integer, Pair<String, String>> h10;
        this.type = 0;
        this.cellInfo = new ArrayList(4);
        this.type = k1.f(context);
        if (!z10 || (h10 = k1.h(context)) == null) {
            return;
        }
        CellInfo cellInfo = new CellInfo();
        cellInfo.a(h10);
        this.cellInfo.add(cellInfo);
    }
}
