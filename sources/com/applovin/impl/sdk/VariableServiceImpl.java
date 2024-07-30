package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a, reason: collision with root package name */
    private final p f18476a;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinVariableService.OnVariablesUpdateListener f18479d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f18480e;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f18477b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18478c = new AtomicBoolean();
    private final Object f = new Object();

    public VariableServiceImpl(p pVar) {
        this.f18476a = pVar;
        String str = (String) pVar.a(com.applovin.impl.sdk.c.d.f18745m);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void loadVariables() {
        if (this.f18476a.d()) {
            if (this.f18477b.compareAndSet(false, true)) {
                this.f18476a.M().a(new com.applovin.impl.sdk.e.m(this.f18476a, new m.a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                    @Override // com.applovin.impl.sdk.e.m.a
                    public void a() {
                        VariableServiceImpl.this.f18477b.set(false);
                    }
                }), o.a.BACKGROUND);
                return;
            } else {
                y.i("AppLovinVariableService", "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.");
                return;
            }
        }
        y.i("AppLovinVariableService", "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.");
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f18479d = onVariablesUpdateListener;
        synchronized (this.f) {
            if (onVariablesUpdateListener != null) {
                if (this.f18480e != null && this.f18478c.compareAndSet(false, true)) {
                    this.f18476a.L();
                    if (y.a()) {
                        this.f18476a.L().b("AppLovinVariableService", "Setting initial listener");
                    }
                    a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f18480e + ", listener=" + this.f18479d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        this.f18476a.L();
        if (y.a()) {
            this.f18476a.L().b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        }
        synchronized (this.f) {
            this.f18480e = JsonUtils.toBundle(jSONObject);
            a();
            this.f18476a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f18745m, (com.applovin.impl.sdk.c.d<String>) jSONObject.toString());
        }
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.f18476a.d()) {
            y.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f) {
            if (this.f18480e == null) {
                y.i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            }
            if (cls.equals(String.class)) {
                return this.f18480e.getString(str, (String) obj);
            }
            if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.f18480e.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            throw new IllegalStateException("Unable to retrieve variable value for " + str);
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z10) {
        return ((Boolean) a(str, Boolean.valueOf(z10), Boolean.class)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str, String str2) {
        return (String) a(str, str2, String.class);
    }

    private void a() {
        Bundle bundle;
        synchronized (this.f) {
            if (this.f18479d != null && (bundle = this.f18480e) != null) {
                final Bundle bundle2 = (Bundle) bundle.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.f18479d.onVariablesUpdate(bundle2);
                    }
                });
            }
        }
    }
}
