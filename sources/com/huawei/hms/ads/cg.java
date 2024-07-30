package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.ads.uiengine.ISplashApi;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import gb.r0;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class cg extends ISplashApi.b {

    /* renamed from: l, reason: collision with root package name */
    private fs f21582l;

    /* renamed from: m, reason: collision with root package name */
    private AdContentData f21583m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f21584n;
    private Context o;

    public cg(Context context, fs fsVar, AdContentData adContentData) {
        this.o = context.getApplicationContext();
        this.f21584n = new WeakReference<>(context);
        this.f21582l = fsVar;
        this.f21583m = adContentData;
    }

    private int Code(int i10) {
        Integer o = r0.o(this.o);
        if (r0.f()) {
            return i10;
        }
        if (o != null && o.intValue() >= 30454100) {
            return i10;
        }
        ex.V("SplashProxy", "HMS version is low, interactMode is %s", Integer.valueOf(i10));
        if (i10 == 4) {
            i10 = 1;
        }
        if (i10 == 3) {
            return 2;
        }
        return i10;
    }

    private void I(Bundle bundle) {
        jh.Code(this.o, this.f21583m, com.huawei.openalliance.ad.constant.ah.Z, Long.valueOf(bundle.getLong("startTime")), Long.valueOf(bundle.getLong("endTime")), Integer.valueOf((int) bundle.getLong(bj.f.f22083i)), Integer.valueOf((int) bundle.getLong(bj.f.f22084j)));
    }

    private void V(Bundle bundle) {
        jh.Code(this.o, this.f21583m, com.huawei.openalliance.ad.constant.ah.B, (Long) null, (Long) null, (Integer) null, (Integer) null);
    }

    private void Z(Bundle bundle) {
        cz.Code(this.o, bundle.getInt(bj.f.f22087m), bundle.getString("reason"), this.f21583m);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean isDestroyed() {
        Context context = this.f21584n.get();
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).isDestroyed();
        }
        return false;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean isFinishing() {
        Context context = this.f21584n.get();
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).isFinishing();
        }
        return false;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void notifyAdDismissed() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.a();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void notifyAdFailedToLoad(int i10) {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.I(i10);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public String notifyAdLoaded() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.Code(this.f21583m);
            return null;
        }
        return null;
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onAdFailToDisplay() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.m();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onAdShowEnd(long j10, int i10) {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.Code(this.f21583m, j10, i10);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onDisplayTimeUp() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.j();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onEasterEggPrepare() {
        jk.Code(this.o).Code(this.f21583m);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onFeedback(int i10) {
        ex.V("SplashProxy", "onFeedback");
        dj.Code(this.o).Code();
        cz.Code(this.o);
        Intent intent = new Intent();
        intent.setAction(com.huawei.openalliance.ad.constant.w.ag);
        intent.setPackage(r0.n(this.o));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.ah, Code(i10));
        if (!(this.o instanceof Activity)) {
            intent.addFlags(268435456);
        }
        gb.u.f(this.o, intent);
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.C();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onMaterialLoadFailed() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.Z(this.f21583m);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onMaterialLoaded() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.F();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onSkipAd(int i10, int i11) {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.Code(i10, i11);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void onStartEasterEggFailed(Bundle bundle) {
        jk.Code(this.o).I(this.f21583m, bundle);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public boolean onTouch(int i10, int i11, long j10, String str, int i12) {
        ex.V("SplashProxy", "onTouch");
        fs fsVar = this.f21582l;
        if (fsVar == null) {
            return false;
        }
        return fsVar.Code(i10, i11, this.f21583m, Long.valueOf(j10), (MaterialClickInfo) gb.b.o(MaterialClickInfo.class, str, new Class[0]), i12);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void removeExSplashBlock() {
        gb.r.b(this.o);
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void reportEvents(String str, Bundle bundle) {
        if (gb.p.f(str)) {
            return;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1888605810:
                if (str.equals(com.huawei.openalliance.ad.constant.ah.B)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1694029870:
                if (str.equals(com.huawei.openalliance.ad.constant.s.f22121q)) {
                    c10 = 1;
                    break;
                }
                break;
            case -493598457:
                if (str.equals(com.huawei.openalliance.ad.constant.ah.Z)) {
                    c10 = 2;
                    break;
                }
                break;
            case 886907255:
                if (str.equals(com.huawei.openalliance.ad.constant.s.f22114i)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                V(bundle);
                return;
            case 1:
                Z(bundle);
                return;
            case 2:
                I(bundle);
                return;
            case 3:
                Code(bundle);
                return;
            default:
                return;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void reportShowStartEvent() {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.L();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void toShowSpare(int i10) {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.V(i10);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.ISplashApi
    public void updatePhyShowStart(long j10) {
        fs fsVar = this.f21582l;
        if (fsVar != null) {
            fsVar.Code(j10);
        }
    }

    private void Code(Bundle bundle) {
        boolean z10 = bundle.getBoolean(bj.f.f22086l);
        AdEventReport Code = jh.Code(this.f21583m);
        Code.y(z10);
        ha.i.e(this.o).d(com.huawei.openalliance.ad.constant.s.f22114i, gb.b.p(Code), null, null);
    }
}
