package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.splash.SplashView;
import gb.r0;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ip extends fz<ka> implements jb<ka> {
    private Context B;
    private SplashView.SplashAdLoadListener C;
    private ec I;
    private ga.b Z;

    public ip(Context context, ka kaVar) {
        Code((ip) kaVar);
        this.B = context.getApplicationContext();
        this.I = ec.Code(context);
    }

    private void F() {
        ex.I("SplashPresenter", "notifyNotSupport");
        ga.b bVar = this.Z;
        if (bVar != null) {
            bVar.Code();
        }
        SplashView.SplashAdLoadListener splashAdLoadListener = this.C;
        if (splashAdLoadListener != null) {
            splashAdLoadListener.onAdFailedToLoad(ci.Code(1001));
        }
    }

    @Override // com.huawei.hms.ads.jb
    public boolean C() {
        if (gb.z.g(this.B)) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.jb
    public void S() {
        ex.Code("SplashPresenter", "notifyAdDismissed");
        ga.b bVar = this.Z;
        if (bVar != null) {
            bVar.V();
        }
        SplashView.SplashAdLoadListener splashAdLoadListener = this.C;
        if (splashAdLoadListener != null) {
            splashAdLoadListener.onAdDismissed();
        }
        gb.r.b(this.B);
    }

    @Override // com.huawei.hms.ads.jb
    public boolean V() {
        if (!r0.c(this.B)) {
            F();
            S();
            return false;
        }
        return true;
    }

    @Override // com.huawei.hms.ads.jb
    public void Code() {
        I().Code(((Integer) gb.q.a(new Callable<Integer>() { // from class: com.huawei.hms.ads.ip.1
            @Override // java.util.concurrent.Callable
            /* renamed from: Code, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                return Integer.valueOf(ip.this.I.I());
            }
        }, 1)).intValue());
    }

    @Override // com.huawei.hms.ads.jb
    public void Code(SplashView.SplashAdLoadListener splashAdLoadListener) {
        this.C = splashAdLoadListener;
    }

    @Override // com.huawei.hms.ads.jb
    public void Code(ga.b bVar) {
        this.Z = bVar;
    }

    @Override // com.huawei.hms.ads.jb
    public void Code(String str, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("slotid", str);
            jSONObject.put("adType", i10);
            ha.i.e(this.B).d("rptSplashDismissForExSplash", jSONObject.toString(), null, null);
        } catch (JSONException unused) {
            ex.I("SplashPresenter", "onSplashDismissForExsplash JSONException");
        }
    }
}
