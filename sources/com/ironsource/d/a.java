package com.ironsource.d;

import a3.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C1416d;
import com.ironsource.mediationsdk.C1420h;
import com.ironsource.mediationsdk.C1431v;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.a.d;
import com.ironsource.mediationsdk.i;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.h;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, C1431v> f24595a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24596b;

    public a(List<NetworkSettings> list, h hVar, String str, String str2) {
        HashMap t10 = l.t(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        t10.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (hVar.f25671h) {
            t10.put("isOneFlow", 1);
        }
        this.f24596b = t10;
        String sessionId = IronSourceUtils.getSessionId();
        boolean z10 = hVar.f25671h;
        C1420h c1420h = new C1420h(new i(hVar.f25670g, z10, sessionId));
        for (NetworkSettings networkSettings : list) {
            if (!networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) && !networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            } else {
                AbstractAdapter a10 = C1416d.a().a(networkSettings, networkSettings.getBannerSettings(), true, false);
                if (a10 != null) {
                    C1431v c1431v = new C1431v(str, str2, networkSettings, hVar.f25666b, a10);
                    c1431v.f25959b = c1420h;
                    c1431v.a(z10);
                    this.f24595a.put(c1431v.g(), c1431v);
                }
            }
        }
    }

    public static String a(Context context) {
        return a(b(context), context);
    }

    public static boolean c(Context context) {
        NetworkCapabilities networkCapabilities;
        Network b10 = b(context);
        String str = "";
        if (b10 != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(b10)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        str = "wifi";
                    } else if (networkCapabilities.hasTransport(0)) {
                        str = "cellular";
                    } else if (networkCapabilities.hasTransport(4)) {
                        str = "vpn";
                    } else if (networkCapabilities.hasTransport(3)) {
                        str = "ethernet";
                    } else if (networkCapabilities.hasTransport(5)) {
                        str = "wifiAware";
                    } else if (networkCapabilities.hasTransport(6)) {
                        str = "lowpan";
                    } else if (networkCapabilities.hasTransport(2)) {
                        str = "bluetooth";
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return str.equals("vpn");
    }

    public final void b(int i10, String str) {
        HashMap hashMap = new HashMap(this.f24596b);
        if (str == null) {
            str = "";
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(hashMap)));
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        String a10;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                String a11 = a.AnonymousClass1.a(context);
                return TextUtils.isEmpty(a11) ? "none" : a11;
            }
            if (networkCapabilities.hasTransport(1)) {
                a10 = "wifi";
            } else if (networkCapabilities.hasTransport(0)) {
                a10 = "3g";
            } else {
                a10 = a.AnonymousClass1.a(context);
                if (TextUtils.isEmpty(a10)) {
                    return "none";
                }
            }
            return a10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static Network b(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", c(context));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C1431v c1431v = this.f24595a.get(str);
        if (c1431v != null) {
            c1431v.a(iSDemandOnlyBannerLayout);
            return;
        }
        b(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.mListenerWrapper.a(str, buildNonExistentInstanceError);
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C1431v c1431v = this.f24595a.get(str);
        if (c1431v != null) {
            c1431v.a(iSDemandOnlyBannerLayout, str2);
            return;
        }
        b(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.mListenerWrapper.a(str, buildNonExistentInstanceError);
    }

    public synchronized void a(String str) {
        C1431v c1431v = this.f24595a.get(str);
        if (c1431v != null) {
            c1431v.b();
            return;
        }
        b(IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_DESTROY, str);
        IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
    }
}
