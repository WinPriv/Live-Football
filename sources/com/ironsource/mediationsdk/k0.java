package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: b, reason: collision with root package name */
    public int f25552b;

    /* renamed from: d, reason: collision with root package name */
    public ag f25554d;

    /* renamed from: e, reason: collision with root package name */
    public ag f25555e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f25556g;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f25559j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25560k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25558i = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25561l = true;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<AbstractC1414b> f25553c = new CopyOnWriteArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public final IronSourceLoggerManager f25557h = IronSourceLoggerManager.getLogger();

    /* renamed from: a, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.e f25551a = null;

    public final void a(AbstractC1414b abstractC1414b) {
        this.f25553c.add(abstractC1414b);
        com.ironsource.mediationsdk.utils.e eVar = this.f25551a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (abstractC1414b.f25331m != 99) {
                        eVar.f25906a.put(eVar.d(abstractC1414b), Integer.valueOf(abstractC1414b.f25331m));
                    }
                } catch (Exception e10) {
                    eVar.f25908c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e10);
                }
            }
        }
    }

    public final void b(AbstractC1414b abstractC1414b) {
        try {
            String str = L.a().f24866s;
            if (!TextUtils.isEmpty(str) && abstractC1414b.f25321b != null) {
                abstractC1414b.f25336s.log(IronSourceLogger.IronSourceTag.ADAPTER_API, abstractC1414b.j() + ":setMediationSegment(segment:" + str + ")", 1);
                abstractC1414b.f25321b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                AbstractAdapter abstractAdapter = abstractC1414b.f25321b;
                if (abstractAdapter != null) {
                    abstractAdapter.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e10) {
            this.f25557h.log(IronSourceLogger.IronSourceTag.INTERNAL, ":setCustomParams():" + e10.toString(), 3);
        }
    }
}
