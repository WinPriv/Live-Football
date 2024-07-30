package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1416d {

    /* renamed from: j, reason: collision with root package name */
    public static final C1416d f25377j = new C1416d();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f25378k = new Object();

    /* renamed from: c, reason: collision with root package name */
    public String f25381c;

    /* renamed from: d, reason: collision with root package name */
    public String f25382d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f25383e;
    public Boolean f;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f25386i = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, AbstractAdapter> f25379a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<String, AdapterBaseWrapper> f25380b = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<String, List<String>> f25384g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f25385h = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25387a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f25387a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25387a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25387a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C1416d() {
    }

    public static AbstractAdapter b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            f(str3);
            return null;
        }
    }

    public static void c(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, jSONObject));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void f(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    public static void h(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    public final AbstractAdapter a(NetworkSettings networkSettings) {
        String providerDefaultInstance = networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f25379a.get(providerDefaultInstance) : b(providerDefaultInstance, networkSettings.getProviderTypeForReflection());
    }

    public final void d(AbstractAdapter abstractAdapter) {
        try {
            Boolean bool = this.f25383e;
            if (bool != null) {
                abstractAdapter.setConsent(bool.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            h(str);
            th.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!this.f25379a.isEmpty()) {
                    for (AbstractAdapter abstractAdapter : this.f25379a.values()) {
                        if (abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                            return;
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.f25380b.values()) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterAPSDataInterface)) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
                synchronized (f25378k) {
                    this.f25385h.put(ad_unit, jSONObject2);
                }
                return;
            } catch (Exception e10) {
                String str = "error while setting APSData: " + e10.getLocalizedMessage();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                f(str);
                e10.printStackTrace();
                return;
            }
        }
        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, "APSData is empty");
        f("APSData is empty");
    }

    public final void g(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                h(str);
                th.printStackTrace();
            }
        }
    }

    public final void i(AbstractAdapter abstractAdapter) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.f25384g;
        for (String str : concurrentHashMap.keySet()) {
            try {
                List<String> list = concurrentHashMap.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                h(str2);
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(AbstractAdapter abstractAdapter) {
        if (abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps")) {
            ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> concurrentHashMap = this.f25385h;
            if (concurrentHashMap.size() != 0) {
                for (IronSource.AD_UNIT ad_unit : concurrentHashMap.keySet()) {
                    try {
                        JSONObject jSONObject = concurrentHashMap.get(ad_unit);
                        if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                        }
                    } catch (Exception e10) {
                        String str = "error while setting aps data: " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                        h(str);
                        e10.printStackTrace();
                    }
                }
                concurrentHashMap.clear();
            }
        }
    }

    public final BaseAdAdapter<?, ?> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> baseAdAdapter;
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String f = e0.i.f(networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters", ".", networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
            try {
                baseAdAdapter = (BaseAdAdapter) Class.forName(f).getConstructor(NetworkSettings.class).newInstance(networkSettings);
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String b10 = s.f.b("failed to load ", f);
                    IronLog.INTERNAL.error(b10);
                    c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, b10);
                }
            }
            if (baseAdAdapter == null || networkSettings.isCustomNetwork()) {
                return baseAdAdapter;
            }
            AbstractAdapter a10 = a(networkSettings);
            if (a10 == null || (ad_unit != IronSource.AD_UNIT.INTERSTITIAL && ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO)) {
                String str = "error creating ad adapter " + networkSettings.getProviderName();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                IronLog.INTERNAL.error(str);
                return null;
            }
            return new R(a10, networkSettings, ad_unit);
        }
        IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
        baseAdAdapter = null;
        if (baseAdAdapter == null) {
        }
        return baseAdAdapter;
    }

    public final AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10, boolean z11) {
        String str;
        String providerDefaultInstance = networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
        String providerTypeForReflection = z10 ? IronSourceConstants.IRONSOURCE_CONFIG_NAME : networkSettings.getProviderTypeForReflection();
        synchronized (f25378k) {
            if (!z11) {
                if (this.f25379a.containsKey(providerDefaultInstance)) {
                    return this.f25379a.get(providerDefaultInstance);
                }
            }
            AbstractAdapter b10 = b(providerDefaultInstance, providerTypeForReflection);
            if (b10 == null) {
                f(providerDefaultInstance + " adapter was not loaded");
                return null;
            }
            try {
                str = b10.getCoreSDKVersion();
            } catch (Exception e10) {
                String str2 = "error while retrieving coreSDKVersion " + b10.getProviderName() + ": " + e10.getLocalizedMessage();
                c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
                str = "Unknown";
            }
            h(providerDefaultInstance + " was allocated (adapter version: " + b10.getVersion() + ", sdk version: " + str + ")");
            b10.setLogListener(IronSourceLoggerManager.getLogger());
            i(b10);
            j(b10);
            d(b10);
            g(b10);
            if ((providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) && this.f25386i.compareAndSet(false, true)) {
                h("SDK5 earlyInit  <" + providerTypeForReflection + ">");
                try {
                    b10.earlyInit(this.f25381c, this.f25382d, jSONObject);
                } catch (Exception e11) {
                    String str3 = "error while calling early init for " + b10.getProviderName() + ": " + e11.getLocalizedMessage();
                    c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                    IronLog.INTERNAL.error(str3);
                }
            }
            if (!z11) {
                this.f25379a.put(providerDefaultInstance, b10);
            }
            return b10;
        }
    }

    public final AdapterBaseInterface a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdapter baseAdapter;
        String providerDefaultInstance = networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
        ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMap = this.f25380b;
        if (concurrentHashMap.containsKey(providerDefaultInstance)) {
            AdapterBaseInterface adapterBaseInterface = concurrentHashMap.get(providerDefaultInstance).getAdapterBaseInterface();
            if (adapterBaseInterface instanceof R) {
                ((R) adapterBaseInterface).f24949d = ad_unit;
            }
            return adapterBaseInterface;
        }
        String customNetworkAdapterName = networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection();
        if (!networkSettings.isCustomNetwork() || !TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            String f = e0.i.f(networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters", ".", customNetworkAdapterName);
            try {
                baseAdapter = (BaseAdapter) Class.forName(f).newInstance();
                IronLog.INTERNAL.info(f + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
                Boolean bool = this.f;
                if (bool != null) {
                    try {
                        baseAdapter.setAdapterDebug(bool.booleanValue());
                    } catch (Exception e10) {
                        String str = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        h(str);
                        e10.printStackTrace();
                    }
                }
                concurrentHashMap.put(providerDefaultInstance, new AdapterBaseWrapper(baseAdapter, networkSettings));
            } catch (Exception unused) {
                if (networkSettings.isCustomNetwork()) {
                    String b10 = s.f.b("failed to load ", f);
                    IronLog.INTERNAL.error(b10);
                    c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, b10);
                }
            }
            if (baseAdapter == null || networkSettings.isCustomNetwork()) {
                concurrentHashMap.put(providerDefaultInstance, new AdapterBaseWrapper(baseAdapter, networkSettings));
                return baseAdapter;
            }
            int i10 = a.f25387a[ad_unit.ordinal()];
            AbstractAdapter a10 = a(networkSettings, i10 != 1 ? i10 != 2 ? i10 != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
            if (a10 != null) {
                R r10 = new R(a10, networkSettings, ad_unit);
                concurrentHashMap.put(providerDefaultInstance, new AdapterBaseWrapper(r10, networkSettings));
                return r10;
            }
            String str2 = "error creating network adapter " + networkSettings.getProviderName();
            c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            IronLog.INTERNAL.error(str2);
            return null;
        }
        IronLog.INTERNAL.error("missing package definition for " + providerDefaultInstance);
        baseAdapter = null;
        if (baseAdapter == null) {
        }
        concurrentHashMap.put(providerDefaultInstance, new AdapterBaseWrapper(baseAdapter, networkSettings));
        return baseAdapter;
    }

    public final void b(boolean z10) {
        synchronized (f25378k) {
            this.f = Boolean.valueOf(z10);
            Iterator<AbstractAdapter> it = this.f25379a.values().iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    public static C1416d a() {
        return f25377j;
    }

    public final void a(String str, List<String> list) {
        synchronized (f25378k) {
            this.f25384g.put(str, list);
            if (!this.f25379a.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter abstractAdapter : this.f25379a.values()) {
                    try {
                        abstractAdapter.setMetaData(str, list);
                    } catch (Throwable th) {
                        String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        h(str2);
                        th.printStackTrace();
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f25380b.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                    try {
                        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                    } catch (Exception e10) {
                        String str3 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                        h(str3);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Calling setNetworkData on an empty network";
        } else if (jSONObject == null || jSONObject.length() == 0) {
            str2 = "Calling setNetworkData with empty networkData";
        } else {
            if (str.toLowerCase(Locale.ENGLISH).equals("aps")) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Locale locale = Locale.ENGLISH;
                    String lowerCase = next.toLowerCase(locale);
                    IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
                    if (lowerCase.equals(ad_unit.toString())) {
                        e(ad_unit, jSONObject.optJSONObject(next));
                    } else {
                        String lowerCase2 = next.toLowerCase(locale);
                        IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                        if (lowerCase2.equals(ad_unit2.toString())) {
                            e(ad_unit2, jSONObject.optJSONObject(next));
                        }
                    }
                }
                return;
            }
            str2 = "Calling setNetworkData on an unsupported network: ".concat(str);
        }
        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str2);
        f(str2);
    }

    public final void a(boolean z10) {
        synchronized (f25378k) {
            this.f25383e = Boolean.valueOf(z10);
            Iterator<AbstractAdapter> it = this.f25379a.values().iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f25380b.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z10);
                    } catch (Exception e10) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        c(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        h(str);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }
}
