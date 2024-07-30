package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ac implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractAdapter f25098a;

    /* renamed from: b, reason: collision with root package name */
    public final a f25099b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25100c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f25101d;

    /* renamed from: e, reason: collision with root package name */
    public String f25102e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Long f25103g = null;

    public ac(a aVar, AbstractAdapter abstractAdapter) {
        this.f25099b = aVar;
        this.f25098a = abstractAdapter;
        this.f25101d = aVar.f25631b;
    }

    public final void a(String str) {
        C1418f.a();
        this.f25102e = C1418f.d(str);
    }

    public void c() {
        try {
            AbstractAdapter abstractAdapter = this.f25098a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f25099b.f25632c, this.f25101d);
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("exception - " + e10.getMessage());
        }
        this.f25098a = null;
    }

    public int d() {
        return 1;
    }

    public final boolean g() {
        return this.f25099b.f25633d;
    }

    public final boolean h() {
        return this.f25099b.f25634e;
    }

    public final int i() {
        return this.f25099b.f;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final int j() {
        return this.f25099b.f25635g;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final String k() {
        return this.f25099b.f25630a.getProviderName();
    }

    public final String l() {
        return this.f25099b.f25630a.getProviderTypeForReflection();
    }

    public final int m() {
        return this.f;
    }

    public final Map<String, Object> n() {
        String str;
        int i10;
        a aVar = this.f25099b;
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f25098a;
            String str2 = "";
            if (abstractAdapter == null) {
                str = "";
            } else {
                str = abstractAdapter.getVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            AbstractAdapter abstractAdapter2 = this.f25098a;
            if (abstractAdapter2 != null) {
                str2 = abstractAdapter2.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, aVar.f25630a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, aVar.f25630a.getAdSourceNameForEvents());
            if (g()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hashMap.put("instanceType", Integer.valueOf(i10));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(d()));
            if (!TextUtils.isEmpty(this.f25102e)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f25102e);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + k() + ")", e10);
        }
        return hashMap;
    }

    public final Long o() {
        return this.f25103g;
    }

    public final String p() {
        String providerName;
        Object[] objArr = new Object[2];
        a aVar = this.f25099b;
        boolean isMultipleInstances = aVar.f25630a.isMultipleInstances();
        NetworkSettings networkSettings = aVar.f25630a;
        if (isMultipleInstances) {
            providerName = networkSettings.getProviderTypeForReflection();
        } else {
            providerName = networkSettings.getProviderName();
        }
        objArr[0] = providerName;
        objArr[1] = Integer.valueOf(hashCode());
        return String.format("%s %s", objArr);
    }
}
