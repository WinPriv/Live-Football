package com.huawei.hms.ads;

import android.content.Context;
import android.os.CountDownTimer;
import com.huawei.hms.ads.kc;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import gb.a0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ig<V extends kc> extends fz<V> implements iw<V> {
    private CountDownTimer B;
    protected Context V;
    private boolean Z = false;
    private boolean C = false;

    public ig(Context context, V v3) {
        this.V = context.getApplicationContext();
        Code((ig<V>) v3);
    }

    private void I(String str) {
        if (this.Z) {
            ex.V("PPSBaseViewPresenter", str);
            return;
        }
        this.Z = true;
        C();
        Code();
    }

    @Override // com.huawei.hms.ads.iw
    public void C() {
        if (this.C) {
            ex.V("PPSBaseViewPresenter", "already reset");
        }
        this.C = true;
        if (I() != 0) {
            ((kc) I()).destroyView();
        }
    }

    public void Code() {
        ex.V("PPSBaseViewPresenter", "cancelDisplayDurationCountTask");
        CountDownTimer countDownTimer = this.B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.B = null;
        }
    }

    @Override // com.huawei.hms.ads.iw
    public void V() {
        ex.V("PPSBaseViewPresenter", "onDisplayTimeUp hasShowFinish: %s", Boolean.valueOf(this.Z));
        if (this.Z) {
            return;
        }
        this.Z = true;
        C();
        fs adMediator = ((kc) I()).getAdMediator();
        if (adMediator != null) {
            adMediator.j();
        }
    }

    public abstract void V(String str);

    @Override // com.huawei.hms.ads.iw
    public void Code(int i10) {
        ex.V("PPSBaseViewPresenter", "startDisplayDurationCountTask duration: %d", Integer.valueOf(i10));
        CountDownTimer countDownTimer = this.B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = new CountDownTimer(i10, 500L) { // from class: com.huawei.hms.ads.ig.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                ((kc) ig.this.I()).I(1);
                ig.this.V();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                int max = Math.max(1, (int) Math.ceil((((float) j10) * 1.0f) / 1000.0f));
                ex.Code("PPSBaseViewPresenter", "count down time: %d seconds: %d", Long.valueOf(j10), Integer.valueOf(max));
                ((kc) ig.this.I()).I(max);
            }
        };
        this.B = countDownTimer2;
        countDownTimer2.start();
    }

    public void V(AdContentData adContentData) {
        fs adMediator = ((kc) I()).getAdMediator();
        if (adMediator != null) {
            adMediator.Z(adContentData);
        }
    }

    @Override // com.huawei.hms.ads.iw
    public void Code(int i10, int i11, AdContentData adContentData, Long l10, MaterialClickInfo materialClickInfo, int i12) {
        ex.V("PPSBaseViewPresenter", "onTouch");
        fs adMediator = ((kc) I()).getAdMediator();
        if (adMediator == null || !adMediator.Code(i10, i11, adContentData, l10, materialClickInfo, i12)) {
            return;
        }
        if (this.Z) {
            ex.V("PPSBaseViewPresenter", "onDoActionSucc hasShowFinish");
            return;
        }
        this.Z = true;
        C();
        Code();
    }

    @Override // com.huawei.hms.ads.iw
    public void V(Long l10) {
        I("feedback hasShowFinish");
    }

    @Override // com.huawei.hms.ads.iw
    public void Code(int i10, int i11, Long l10) {
        ex.V("PPSBaseViewPresenter", "skip ad - hasShowFinish: %s", Boolean.valueOf(this.Z));
        if (this.Z) {
            return;
        }
        this.Z = true;
        C();
        Code();
    }

    @Override // com.huawei.hms.ads.iw
    public void Code(AdContentData adContentData) {
        AdSource a10;
        this.Code = adContentData;
        Object valueOf = Long.valueOf(System.currentTimeMillis());
        Code(valueOf instanceof String ? (String) valueOf : valueOf != null ? String.valueOf(valueOf) : null);
        if (adContentData == null) {
            ex.I("PPSBaseViewPresenter", "loadAdMaterial contentRecord is null");
            ((kc) I()).Code(-7);
            return;
        }
        ex.V("PPSBaseViewPresenter", "loadAdMaterial");
        V(adContentData.L0());
        Context context = this.V;
        try {
            if (adContentData.K() == null || adContentData.K().W() == null || (a10 = AdSource.a(adContentData.K().W())) == null || a10.p() == null) {
                return;
            }
            ex.V("AdSourceUtil", "preloadDspLogo");
            String p10 = a10.p();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.huawei.openalliance.ad.constant.ba.f22075z, p10);
            ha.i.e(context).d(com.huawei.openalliance.ad.constant.s.f22113h, jSONObject.toString(), new a0(context), String.class);
        } catch (Throwable unused) {
            ex.I("AdSourceUtil", "preloadDspLogo error");
        }
    }

    @Override // com.huawei.hms.ads.iw
    public void Code(AdContentData adContentData, long j10, int i10) {
        fs adMediator = ((kc) I()).getAdMediator();
        if (adMediator != null) {
            adMediator.Code(adContentData, j10, i10);
        }
    }

    @Override // com.huawei.hms.ads.iw
    public void Code(Long l10) {
        I("onWhyThisAd hasShowFinish");
    }
}
