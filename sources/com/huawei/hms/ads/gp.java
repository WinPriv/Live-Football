package com.huawei.hms.ads;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.iab.omid.library.huawei.Omid;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.AdSessionConfiguration;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import com.iab.omid.library.huawei.publisher.AdSessionStatePublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class gp implements gx, hl {
    public static final String Code = "1.2.4";
    private static boolean I = hb.Code(hb.f);
    private static final String V = "AdsessionAgent";
    private Context B;
    private final List<AdSession> Z = new ArrayList();

    private static AdSessionStatePublisher Code(AdSession adSession) {
        if (adSession != null) {
            return adSession.getAdSessionStatePublisher();
        }
        return null;
    }

    private static String V(AdSession adSession) {
        if (adSession != null) {
            return adSession.getAdSessionId();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.hl
    public void B() {
        if (!this.Z.isEmpty()) {
            try {
                Iterator<AdSession> it = this.Z.iterator();
                while (it.hasNext()) {
                    it.next().finish();
                    ex.Code(V, " adSession finish");
                }
            } catch (Throwable unused) {
                ex.V(V, "finish, fail");
            }
        }
        this.Z.clear();
    }

    @Override // com.huawei.hms.ads.hl
    public void C() {
        if (!this.Z.isEmpty()) {
            try {
                Iterator<AdSession> it = this.Z.iterator();
                while (it.hasNext()) {
                    it.next().removeAllFriendlyObstructions();
                }
            } catch (Throwable unused) {
                ex.V(V, "removeAllFriendlyObstructions, fail");
            }
        }
    }

    @Override // com.huawei.hms.ads.hl
    public String F() {
        if (!this.Z.isEmpty()) {
            return V(this.Z.get(0));
        }
        return null;
    }

    public Context I() {
        return this.B;
    }

    @Override // com.huawei.hms.ads.hl
    public hh S() {
        if (!this.Z.isEmpty() && hh.Code()) {
            return new hh(Code(this.Z.get(0)));
        }
        return null;
    }

    @Override // com.huawei.hms.ads.hl
    public void Z() {
        if (!this.Z.isEmpty()) {
            try {
                for (AdSession adSession : this.Z) {
                    ex.Code(V, "adsession start");
                    adSession.start();
                }
            } catch (Throwable unused) {
                ex.V(V, "start, fail");
            }
        }
    }

    public void Code(Context context, List<Om> list, hf hfVar) {
        if (!Code() || context == null || list == null) {
            ex.V(V, "not available, not init");
            return;
        }
        if (list.isEmpty() || hfVar == null) {
            ex.V(V, "oms is empty or sessionWrapper is null, not init");
            return;
        }
        ex.V(V, "init");
        this.B = context;
        Code(list, hfVar);
    }

    @Override // com.huawei.hms.ads.hl
    public void I(View view) {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            Iterator<AdSession> it = this.Z.iterator();
            while (it.hasNext()) {
                it.next().removeFriendlyObstruction(view);
            }
        } catch (Throwable unused) {
            ex.V(V, "addFriendlyObstruction, fail");
        }
    }

    public List<AdSession> V() {
        return this.Z;
    }

    @Override // com.huawei.hms.ads.hl
    public void Code(View view) {
        if (this.Z.isEmpty()) {
            return;
        }
        try {
            Iterator<AdSession> it = this.Z.iterator();
            while (it.hasNext()) {
                it.next().registerAdView(view);
            }
        } catch (Throwable unused) {
            ex.V(V, "registerAdView, fail");
        }
    }

    @Override // com.huawei.hms.ads.hl
    public void V(View view) {
    }

    @Override // com.huawei.hms.ads.hl
    public void Code(View view, hk hkVar, String str) {
        if (this.Z.isEmpty() || hkVar == null || !hk.Code()) {
            return;
        }
        try {
            Iterator<AdSession> it = this.Z.iterator();
            while (it.hasNext()) {
                it.next().addFriendlyObstruction(view, hk.Code(hkVar), str);
            }
        } catch (Throwable unused) {
            ex.V(V, "addFriendlyObstruction-f, fail");
        }
    }

    private void Code(hf hfVar, hp hpVar) {
        String str;
        if (hpVar == null) {
            str = "init AdSessionContext failed";
        } else {
            if (!hg.Code()) {
                return;
            }
            AdSessionContext Code2 = new hg(this.B).Code(hpVar, null);
            if (Code2 != null) {
                Code(Code2, hfVar);
                return;
            }
            str = "adSessionContext is null";
        }
        ex.V(V, str);
    }

    @Override // com.huawei.hms.ads.hl
    public void Code(hj hjVar, String str) {
        if (this.Z.isEmpty() || hjVar == null || !hj.Code()) {
            return;
        }
        try {
            Iterator<AdSession> it = this.Z.iterator();
            while (it.hasNext()) {
                it.next().error(hj.Code(hjVar), str);
            }
        } catch (Throwable unused) {
            ex.V(V, "error, fail");
        }
    }

    private void Code(AdSessionContext adSessionContext, hf hfVar) {
        try {
            if (hf.Code() && hfVar != null) {
                AdSessionConfiguration V2 = hfVar.V();
                if (V2 == null) {
                    ex.V(V, "adSessionConfiguration is null");
                    return;
                }
                ex.V(V, "initAdSession");
                AdSession createAdSession = Code(this.B) ? AdSession.createAdSession(V2, adSessionContext) : null;
                if (createAdSession == null) {
                    ex.V(V, "adSession is null");
                    return;
                } else {
                    this.Z.add(createAdSession);
                    return;
                }
            }
            ex.V(V, "init AdSession failed");
        } catch (Throwable unused) {
            ex.I(V, "initAdSession error");
        }
    }

    private void Code(List<Om> list, hf hfVar) {
        if (!hp.Code()) {
            ex.V(V, "init VerficationScriptResourceWrapper failed");
            return;
        }
        for (Om om : list) {
            ex.V(V, "Init Verfication Script");
            hp hpVar = new hp();
            hpVar.Code(om);
            Code(hfVar, hpVar);
        }
    }

    public static boolean Code() {
        return I;
    }

    private static boolean Code(Context context) {
        Omid.activate(context);
        return true;
    }
}
