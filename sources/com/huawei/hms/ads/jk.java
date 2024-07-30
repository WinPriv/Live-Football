package com.huawei.hms.ads;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.ads.jg;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class jk {
    private static final String Code = "TemplateActionProcessor";
    private static jk I;
    private static final byte[] V = new byte[0];
    private String B = null;
    private String C = null;
    private Context Z;

    private jk(Context context) {
        this.Z = context.getApplicationContext();
    }

    public static jk Code(Context context) {
        return V(context);
    }

    private static jk V(Context context) {
        jk jkVar;
        synchronized (V) {
            if (I == null) {
                I = new jk(context);
            }
            jkVar = I;
        }
        return jkVar;
    }

    public void I(AdContentData adContentData, Bundle bundle) {
        int i10;
        try {
            i10 = bundle.getInt(bj.f.f22087m);
        } catch (Throwable th) {
            ex.V(Code, "get errCode err: %s", th.getClass().getSimpleName());
            i10 = -1;
        }
        Code(adContentData, i10);
    }

    private void Code(Context context, AdContentData adContentData) {
        jg.a aVar = new jg.a();
        aVar.Code((Long) null).Code((Integer) null).V((Integer) 14).Code(a0.a.k(context)).I(String.format("%s,%s", 0, 0));
        jh.Code(this.Z, adContentData, aVar.Code());
    }

    public void V(AdContentData adContentData) {
        if (HiAd.getInstance(this.Z).getExtensionActionListener() != null && adContentData != null) {
            String str = this.B;
            if (str != null && str.equals(adContentData.Y())) {
                return;
            }
            ex.V(Code, "onDismiss");
            this.B = adContentData.Y();
        } else if (adContentData != null || HiAd.getInstance(this.Z).getExtensionActionListener() == null) {
            return;
        }
        HiAd.getInstance(this.Z).getExtensionActionListener().V();
    }

    public void Code(AdContentData adContentData) {
        ex.V(Code, "onPrepare");
        if (HiAd.getInstance(this.Z).getExtensionActionListener() == null || adContentData == null) {
            return;
        }
        HiAd.getInstance(this.Z).getExtensionActionListener().Code();
    }

    public void V(AdContentData adContentData, Bundle bundle) {
        ex.V(Code, "onClose");
        jh.Code(this.Z, adContentData, bundle.getInt(bj.f.f22080e), bundle.getInt(bj.f.f), com.huawei.openalliance.ad.constant.ah.f22014a);
        V(adContentData);
    }

    public void Code(AdContentData adContentData, int i10) {
        if (HiAd.getInstance(this.Z).getExtensionActionListener() == null || adContentData == null) {
            return;
        }
        String str = this.C;
        if (str == null || !str.equals(adContentData.Y())) {
            ex.V(Code, "onFail");
            this.C = adContentData.Y();
            HiAd.getInstance(this.Z).getExtensionActionListener().b();
        }
    }

    public void Code(AdContentData adContentData, Bundle bundle) {
        ex.V(Code, "onEnd");
        jh.Code(this.Z, adContentData, com.huawei.openalliance.ad.constant.ah.L, Long.valueOf(bundle.getLong("startTime")), Long.valueOf(bundle.getLong("endTime")), Integer.valueOf(bundle.getInt(bj.f.f22083i)), Integer.valueOf(bundle.getInt(bj.f.f22084j)));
        V(adContentData);
    }

    public void Code(AdContentData adContentData, String str) {
        ex.V(Code, "onShow");
        jg.a aVar = new jg.a();
        aVar.Code(str);
        aVar.I(com.huawei.openalliance.ad.constant.w.dm);
        jh.Code(this.Z, adContentData, aVar.Code(), com.huawei.openalliance.ad.constant.ah.f22015b);
        if (HiAd.getInstance(this.Z).getExtensionActionListener() == null || adContentData == null) {
            return;
        }
        HiAd.getInstance(this.Z).getExtensionActionListener().I();
    }

    public boolean Code(Context context, AdContentData adContentData, Bundle bundle, String str) {
        ex.V(Code, "onClick");
        try {
            int i10 = bundle.getInt(bj.f.f22080e);
            int i11 = bundle.getInt(bj.f.f);
            int i12 = bundle.getInt(bj.f.f22085k);
            MaterialClickInfo materialClickInfo = (MaterialClickInfo) gb.b.o(MaterialClickInfo.class, bundle.getString(bj.c.V), new Class[0]);
            fb.m k10 = androidx.activity.n.k(context, adContentData, new HashMap(0));
            if (k10.a()) {
                Code(context, adContentData);
                jh.Code(this.Z, adContentData, i10, i11, k10.c(), i12, materialClickInfo, str, (int[]) null);
                if (HiAd.getInstance(this.Z).getExtensionActionListener() != null && adContentData != null) {
                    HiAd.getInstance(this.Z).getExtensionActionListener().Z();
                }
                return true;
            }
        } catch (Throwable th) {
            ex.V(Code, "deal with click err: %s", th.getClass().getSimpleName());
        }
        return false;
    }
}
