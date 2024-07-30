package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.AdContentData;

/* loaded from: classes2.dex */
public abstract class dk {
    protected Context Code;
    private dk I;
    private a V;

    /* loaded from: classes2.dex */
    public interface a {
        void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo);

        void V(com.huawei.openalliance.ad.inter.data.AppInfo appInfo);
    }

    public dk(Context context) {
        this.Code = context;
    }

    public Context Code() {
        return this.Code;
    }

    public abstract void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, long j10);

    public void V(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
        a aVar = this.V;
        if (aVar != null) {
            aVar.V(appInfo);
        }
    }

    public void Code(a aVar) {
        this.V = aVar;
    }

    public void V(com.huawei.openalliance.ad.inter.data.AppInfo appInfo, AdContentData adContentData, long j10) {
        dk dkVar = this.I;
        if (dkVar == null) {
            V(appInfo);
        } else {
            dkVar.Code(this.V);
            this.I.Code(appInfo, adContentData, j10);
        }
    }

    public void Code(dk dkVar) {
        this.I = dkVar;
    }

    public void Code(com.huawei.openalliance.ad.inter.data.AppInfo appInfo) {
        a aVar = this.V;
        if (aVar != null) {
            aVar.Code(appInfo);
        }
    }
}
