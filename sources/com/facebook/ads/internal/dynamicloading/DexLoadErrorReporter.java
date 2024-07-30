package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DexLoadErrorReporter {
    private static final String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final AtomicBoolean sAlreadyReported = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f19853s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f19854t;

        public a(Context context, String str) {
            this.f19853s = context;
            this.f19854t = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 437
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addEnvFields(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d10) {
        AtomicBoolean atomicBoolean = sAlreadyReported;
        if (!atomicBoolean.get() && Math.random() < d10) {
            atomicBoolean.set(true);
            new a(context, str).start();
        }
    }
}
