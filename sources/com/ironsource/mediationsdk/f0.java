package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f0 implements com.ironsource.mediationsdk.sdk.f {

    /* renamed from: b, reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.j f25437b;

    /* renamed from: c, reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.i f25438c;

    /* renamed from: g, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.l f25441g;

    /* renamed from: h, reason: collision with root package name */
    public NetworkSettings f25442h;

    /* renamed from: i, reason: collision with root package name */
    public String f25443i;

    /* renamed from: a, reason: collision with root package name */
    public final String f25436a = f0.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25440e = new AtomicBoolean(true);
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final IronSourceLoggerManager f25439d = IronSourceLoggerManager.getLogger();

    public final synchronized void a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.f25440e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            iVar.a(false, ironSourceError);
        }
    }

    public final AbstractAdapter b(String str) {
        try {
            L a10 = L.a();
            AbstractAdapter s10 = a10.s(str);
            if (s10 == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                s10 = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
                if (s10 == null) {
                    return null;
                }
            }
            synchronized (a10) {
                a10.f24840b = s10;
            }
            return s10;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f25439d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            this.f25439d.logException(ironSourceTag, a3.l.p(new StringBuilder(), this.f25436a, ":startOfferwallAdapter"), th);
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        this.f25439d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            iVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i10, int i11, boolean z10) {
        this.f25439d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            return iVar.onOfferwallAdCredited(i10, i11, z10);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z10) {
        a(z10, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        this.f25439d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            iVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        this.f25439d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b10 = com.ironsource.mediationsdk.utils.o.a().b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f25443i)) {
                mediationAdditionalData.put("placement", this.f25443i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        com.ironsource.mediationsdk.utils.o.a().a(0);
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            iVar.onOfferwallOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        this.f25439d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            iVar.onOfferwallShowFailed(ironSourceError);
        }
    }

    public final void a(String str) {
        com.ironsource.mediationsdk.sdk.j jVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.f25439d;
        String l10 = a3.k.l("OWManager:showOfferwall(", str, ")");
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f25438c.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.f25443i = str;
            com.ironsource.mediationsdk.model.m a10 = this.f25441g.f25936c.f25676c.a(str);
            if (a10 == null) {
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a10 = this.f25441g.f25936c.f25676c.a();
                if (a10 == null) {
                    ironSourceLoggerManager.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            ironSourceLoggerManager.log(IronSourceLogger.IronSourceTag.INTERNAL, l10, 1);
            AtomicBoolean atomicBoolean = this.f;
            if (atomicBoolean == null || !atomicBoolean.get() || (jVar = this.f25437b) == null) {
                return;
            }
            jVar.showOfferwall(String.valueOf(a10.f25694a), this.f25442h.getRewardedVideoSettings());
        } catch (Exception e10) {
            ironSourceLoggerManager.logException(IronSourceLogger.IronSourceTag.INTERNAL, l10, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x003e, B:12:0x0045, B:13:0x0050, B:15:0x0054, B:19:0x0061, B:21:0x006b, B:24:0x0078, B:26:0x007e, B:30:0x008b, B:32:0x0093, B:33:0x0096, B:35:0x009e, B:37:0x00db, B:41:0x00c1), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x003e, B:12:0x0045, B:13:0x0050, B:15:0x0054, B:19:0x0061, B:21:0x006b, B:24:0x0078, B:26:0x007e, B:30:0x008b, B:32:0x0093, B:33:0x0096, B:35:0x009e, B:37:0x00db, B:41:0x00c1), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.f0.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.ironsource.mediationsdk.sdk.f
    public final void a(boolean z10, IronSourceError ironSourceError) {
        this.f25439d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAvailable(isAvailable: " + z10 + ")", 1);
        if (!z10) {
            a(ironSourceError);
            return;
        }
        this.f.set(true);
        com.ironsource.mediationsdk.sdk.i iVar = this.f25438c;
        if (iVar != null) {
            iVar.onOfferwallAvailable(true);
        }
    }

    public final synchronized boolean a() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f;
        return atomicBoolean != null ? atomicBoolean.get() : false;
    }
}
