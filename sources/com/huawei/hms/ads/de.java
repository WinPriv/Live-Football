package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import gb.w0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class de extends fz<z9.a> implements df<z9.a> {
    private static final String V = "com.huawei.hms.ads.de";
    private Context I;

    public de(Context context, z9.a aVar) {
        this.I = context;
        Code((de) aVar);
    }

    private void V(com.huawei.openalliance.ad.inter.data.h hVar, gb.j jVar) {
        String str;
        String str2;
        if (hVar == null) {
            ex.I(V, "loadImage imageInfo is null");
            jVar.Code();
            return;
        }
        SourceParam sourceParam = new SourceParam();
        sourceParam.i(hVar.f22260s);
        sourceParam.b();
        sourceParam.k(hVar.f22263v);
        sourceParam.l(hVar.f22264w);
        sourceParam.h();
        AdContentData adContentData = this.Code;
        if (adContentData != null) {
            str = adContentData.L();
            str2 = this.Code.D();
        } else {
            str = null;
            str2 = null;
        }
        w0.f(this.I, sourceParam, jVar, str, str2);
    }

    @Override // com.huawei.hms.ads.df
    public void Code(AdContentData adContentData) {
        if (adContentData == null) {
            return;
        }
        this.Code = adContentData;
    }

    @Override // com.huawei.hms.ads.df
    public void Code(com.huawei.openalliance.ad.inter.data.h hVar, gb.j jVar) {
        String str = V;
        ex.V(str, "checkArImageHashAndLoad " + hVar);
        if (hVar == null) {
            ex.I(str, "checkArImageHashAndLoad imageInfo is null");
        } else {
            V(hVar, jVar);
        }
    }

    private void V(String str) {
        AdContentData adContentData = this.Code;
        if (adContentData == null) {
            return;
        }
        jh.Code(this.I, adContentData, (String) null, 0, 0, str, 1, a0.a.l(I()), (MaterialClickInfo) null);
    }

    @Override // com.huawei.hms.ads.df
    public boolean Code() {
        fb.m k10 = androidx.activity.n.k(this.I, this.Code, new HashMap(0));
        if (!k10.a()) {
            return true;
        }
        V(k10.c());
        return true;
    }

    @Override // com.huawei.hms.ads.df
    public boolean V() {
        return false;
    }
}
