package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.uiengine.b;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ce extends b.AbstractBinderC0282b {
    private static final byte[] D = new byte[0];
    private static ce F = null;
    private static final String S = "MultiMPlayingManagerPro";
    private Context L;

    /* renamed from: a, reason: collision with root package name */
    private IMultiMediaPlayingManager f21576a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Long, cd> f21577b = new HashMap();

    private ce(Context context) {
        this.L = context;
    }

    public static ce Code(Context context) {
        return V(context);
    }

    private Long I(com.huawei.hms.ads.uiengine.a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            return Long.valueOf(aVar.Code());
        } catch (Throwable th) {
            ex.V(S, "get id err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    private static ce V(Context context) {
        ce ceVar;
        synchronized (D) {
            if (F == null) {
                F = new ce(context);
            }
            ceVar = F;
        }
        return ceVar;
    }

    private cd Z(com.huawei.hms.ads.uiengine.a aVar) {
        cd cdVar;
        try {
            long Code = aVar.Code();
            if (this.f21577b.containsKey(Long.valueOf(Code))) {
                cdVar = this.f21577b.get(Long.valueOf(Code));
            } else {
                cd cdVar2 = new cd(this.L, aVar);
                this.f21577b.put(Long.valueOf(Code), cdVar2);
                cdVar = cdVar2;
            }
            if (ex.Code()) {
                ex.Code(S, "getProxy = %s, proxy = %s", Long.valueOf(Code), cdVar);
            }
            return cdVar;
        } catch (Throwable th) {
            ex.V(S, "getProxy err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void Code(com.huawei.hms.ads.uiengine.a aVar) {
        Long I = I(aVar);
        ex.V(S, "removeAgent %s", I);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.f21576a;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.c(Z(aVar));
        }
        if (I != null) {
            this.f21577b.remove(I);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void I(String str, com.huawei.hms.ads.uiengine.a aVar) {
        ex.V(S, "stop %s", I(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.f21576a;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.f(Z(aVar), str);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void V(com.huawei.hms.ads.uiengine.a aVar) {
        ex.V(S, "removeListeners %s", I(aVar));
        cd Z = Z(aVar);
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.f21576a;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.a(Z);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void Z(String str, com.huawei.hms.ads.uiengine.a aVar) {
        ex.V(S, "pause %s", I(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.f21576a;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.e(Z(aVar), str);
        }
    }

    public void Code(IMultiMediaPlayingManager iMultiMediaPlayingManager) {
        this.f21576a = iMultiMediaPlayingManager;
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void V(String str, com.huawei.hms.ads.uiengine.a aVar) {
        ex.V(S, "manualPlay %s", I(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.f21576a;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.b(Z(aVar), str);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.b
    public void Code(String str, com.huawei.hms.ads.uiengine.a aVar) {
        ex.V(S, "autoPlay %s", I(aVar));
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.f21576a;
        if (iMultiMediaPlayingManager != null) {
            iMultiMediaPlayingManager.d(Z(aVar), str);
        }
    }
}
