package com.ironsource.mediationsdk.integration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.exoplayer.b;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class IntegrationHelper {

    /* loaded from: classes2.dex */
    public static class a extends Thread {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Activity f25506s;

        public a(Activity activity) {
            this.f25506s = activity;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Activity activity = this.f25506s;
            try {
                Log.w("IntegrationHelper", "--------------- Google Play Services --------------");
                if (activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i("IntegrationHelper", "Google Play Services - VERIFIED");
                    L.a();
                    String a10 = L.a(activity);
                    if (!TextUtils.isEmpty(a10)) {
                        Log.i("IntegrationHelper", "GAID is: " + a10 + " (use this for test devices)");
                        return;
                    }
                    return;
                }
                Log.e("IntegrationHelper", "Google Play Services - MISSING");
            } catch (Exception unused) {
                Log.e("IntegrationHelper", "Google Play Services - MISSING");
            }
        }
    }

    public static boolean a(Activity activity, String[] strArr) {
        boolean z10 = true;
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Services ***");
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (packageManager.queryIntentServices(new Intent(activity, Class.forName(str)), b.aX).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z10 = false;
            }
        }
        return z10;
    }

    public static boolean b(Context context, String[] strArr) {
        boolean z10;
        String str;
        List<PackageInfo> installedPackages;
        ArrayList arrayList = new ArrayList();
        if (context != null && (installedPackages = context.getPackageManager().getInstalledPackages(8)) != null) {
            Iterator<PackageInfo> it = installedPackages.iterator();
            while (it.hasNext()) {
                ProviderInfo[] providerInfoArr = it.next().providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        arrayList.add(providerInfo.name);
                    }
                }
            }
        }
        boolean z11 = true;
        if (strArr != null) {
            Log.i("IntegrationHelper", "*** Content Providers ***");
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                if (!arrayList.contains(str2)) {
                    str = "- MISSING";
                    z10 = false;
                } else {
                    z10 = z11;
                    str = "- VERIFIED";
                }
                Log.d("IntegrationHelper", str2 + str);
                i10++;
                z11 = z10;
            }
        }
        return z11;
    }

    public static boolean c(ArrayList<Pair<String, String>> arrayList) {
        boolean z10 = true;
        if (arrayList == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** External Libraries ***");
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                Class.forName((String) next.first);
                Log.i("IntegrationHelper", ((String) next.second) + " - VERIFIED");
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", ((String) next.second) + " - MISSING");
                z10 = false;
            }
        }
        return z10;
    }

    public static IntegrationData d(Activity activity, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Activity.class).invoke(null, activity);
            Log.i("IntegrationHelper", "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e("IntegrationHelper", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e("IntegrationHelper", str2);
            return null;
        }
    }

    public static boolean e(Activity activity, String[] strArr) {
        boolean z10 = true;
        if (strArr == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** Activities ***");
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(str)), b.aX).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
    
        if (r0 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019b, code lost:
    
        if (b(r26, r13.providers) == false) goto L64;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0234. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fd A[Catch: Exception -> 0x019f, TryCatch #0 {Exception -> 0x019f, blocks: (B:12:0x007e, B:23:0x00b7, B:24:0x00d3, B:69:0x00fd, B:71:0x0105, B:73:0x010f, B:76:0x011a, B:78:0x0146, B:91:0x0176, B:82:0x017d, B:85:0x018c, B:88:0x0195, B:95:0x0098, B:98:0x00a0, B:101:0x00a8, B:81:0x014f), top: B:11:0x007e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void validateIntegration(android.app.Activity r26) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.app.Activity):void");
    }
}
