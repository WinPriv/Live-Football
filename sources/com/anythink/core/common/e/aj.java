package com.anythink.core.common.e;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    public int f5512a;

    /* renamed from: b, reason: collision with root package name */
    public String f5513b;

    /* renamed from: c, reason: collision with root package name */
    private List<b> f5514c;

    public final synchronized void a(List<b> list) {
        synchronized (this) {
            this.f5514c = list;
        }
    }

    public final synchronized List<b> b() {
        List<b> list = this.f5514c;
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        for (b bVar : list) {
            if (bVar.d() <= 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final synchronized void c() {
        List<b> list = this.f5514c;
        if (list != null) {
            list.clear();
            this.f5514c = null;
        }
    }

    public final boolean d() {
        List<b> list = this.f5514c;
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    public final synchronized b a() {
        List<b> list = this.f5514c;
        if (list != null) {
            for (b bVar : list) {
                if (bVar.d() <= 0) {
                    boolean z10 = true;
                    if (this.f5514c.indexOf(bVar) < this.f5514c.size() - 1) {
                        z10 = false;
                    }
                    bVar.a(z10);
                    return bVar;
                }
            }
        }
        return null;
    }

    public final synchronized void a(b bVar) {
        List<b> list = this.f5514c;
        if (list != null && list.size() > 0) {
            this.f5514c.remove(bVar);
        }
    }

    public final void a(e eVar) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            this.f5512a = -1;
            this.f5513b = eVar.X();
            List<b> list = this.f5514c;
            if (list != null) {
                for (b bVar : list) {
                    if (bVar.j()) {
                        ATBaseAdAdapter e10 = bVar.e();
                        e10.setTrackingInfo(eVar);
                        eVar.g(e10.getNetworkPlacementId());
                        bVar.b(-1);
                        BaseAd f = bVar.f();
                        if (f != null) {
                            f.setTrackingInfo(eVar.N());
                        }
                        arrayList.add(bVar);
                    }
                }
            }
            this.f5514c = arrayList;
        }
    }
}
