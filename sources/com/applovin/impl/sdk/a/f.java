package com.applovin.impl.sdk.a;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final p f18509a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18510b = p.y();

    /* renamed from: c, reason: collision with root package name */
    private String f18511c;

    public f(p pVar) {
        this.f18509a = pVar;
    }

    public String c() {
        return Omid.getVersion();
    }

    public Partner d() {
        return Partner.createPartner((String) this.f18509a.a(com.applovin.impl.sdk.c.b.aE), AppLovinSdk.VERSION);
    }

    public String e() {
        return this.f18511c;
    }

    public boolean b() {
        return Omid.isActive();
    }

    public void a() {
        if (((Boolean) this.f18509a.a(com.applovin.impl.sdk.c.b.aD)).booleanValue()) {
            this.f18509a.L();
            if (y.a()) {
                this.f18509a.L().b("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(f.this.f18510b);
                    f.this.f18509a.L();
                    if (y.a()) {
                        y L = f.this.f18509a.L();
                        StringBuilder sb2 = new StringBuilder("Init ");
                        if (f.this.b()) {
                            str = "succeeded";
                        } else {
                            str = "failed";
                        }
                        sb2.append(str);
                        sb2.append(" and took ");
                        sb2.append(System.currentTimeMillis() - currentTimeMillis);
                        sb2.append("ms");
                        L.b("OpenMeasurementService", sb2.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f.this.f18510b.getResources().openRawResource(R.raw.omsdk_v_1_0)));
                        try {
                            try {
                                StringBuilder sb3 = new StringBuilder();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine != null) {
                                        sb3.append(readLine);
                                    } else {
                                        f.this.f18511c = sb3.toString();
                                        bufferedReader.close();
                                        return;
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (IOException e11) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
                        }
                    } catch (Throwable th3) {
                        f.this.f18509a.L();
                        if (y.a()) {
                            f.this.f18509a.L().b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th3);
                        }
                    }
                }
            });
        }
    }

    public String a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f18511c, str);
        } catch (Throwable th) {
            this.f18509a.L();
            if (y.a()) {
                this.f18509a.L().b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
