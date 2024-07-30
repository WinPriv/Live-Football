package com.huawei.openalliance.ad.ppskit.handlers;

import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CellInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Network;
import com.huawei.openalliance.ad.ppskit.utils.k1;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f22510s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f22511t;

    public c(d dVar, String str) {
        this.f22511t = dVar;
        this.f22510s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        App app = new App(this.f22511t.f, this.f22510s);
        d dVar = this.f22511t;
        synchronized (dVar.f22516a) {
            dVar.f22518c = app;
        }
        Pair<Integer, Pair<String, String>> h10 = k1.h(this.f22511t.f);
        d dVar2 = this.f22511t;
        synchronized (dVar2.f22516a) {
            dVar2.f22520e = h10;
        }
        Network network = new Network(this.f22511t.f, false);
        if (this.f22511t.f22521g.k() && h10 != null) {
            CellInfo cellInfo = new CellInfo();
            cellInfo.a(h10);
            network.a().add(cellInfo);
        }
        d dVar3 = this.f22511t;
        synchronized (dVar3.f22516a) {
            dVar3.f22517b = network;
        }
        d dVar4 = this.f22511t;
        Device device = new Device(dVar4.f, dVar4.f22521g.k());
        d dVar5 = this.f22511t;
        synchronized (dVar5.f22516a) {
            dVar5.f22519d = device;
        }
    }
}
