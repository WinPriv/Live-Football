package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final p f18960a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18961b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap<String, Bundle> f18962c = new LinkedHashMap<String, Bundle>() { // from class: com.applovin.impl.sdk.g.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Bundle> entry) {
            if (size() > 16) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final Set<a> f18963d = Collections.synchronizedSet(new HashSet());

    /* loaded from: classes.dex */
    public interface a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public g(p pVar) {
        this.f18960a = pVar;
        if (StringUtils.isValidString(a())) {
            AppLovinCommunicator.getInstance(p.y()).subscribe(this, "safedk_ad_info");
        }
    }

    private static String c(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f18961b) {
            bundle = this.f18962c.get(str);
        }
        return bundle;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f18961b) {
            this.f18962c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "g";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f18960a.L();
                if (y.a()) {
                    this.f18960a.L().d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f18960a.L();
                if (y.a()) {
                    this.f18960a.L().d("AppLovinSdk", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT)) == null) {
                this.f18960a.L();
                if (y.a()) {
                    this.f18960a.L().d("AppLovinSdk", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f18960a.L();
                if (y.a()) {
                    this.f18960a.L().d("AppLovinSdk", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f18961b) {
                this.f18960a.L();
                if (y.a()) {
                    this.f18960a.L().b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                }
                this.f18962c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            if (StringUtils.isValidString(string2) && !this.f18963d.isEmpty()) {
                Iterator it = new HashSet(this.f18963d).iterator();
                while (it.hasNext()) {
                    final a aVar = (a) it.next();
                    this.f18960a.M().a(new com.applovin.impl.sdk.e.z(this.f18960a, new Runnable() { // from class: com.applovin.impl.sdk.g.2
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.onCreativeIdGenerated(string, string2);
                        }
                    }), o.a.BACKGROUND);
                }
            }
        }
    }

    public void a(a aVar) {
        this.f18963d.add(aVar);
    }

    public void b(a aVar) {
        this.f18963d.remove(aVar);
    }

    public static String a() {
        return c("getVersion");
    }

    public static String b() {
        return c("getSdkKey");
    }
}
