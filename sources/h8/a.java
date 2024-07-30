package h8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d0.a;
import z7.c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f28788a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28789b;

    public a(Context context, String str, c cVar) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = d0.a.f27248a;
        Context a10 = a.e.a(context);
        SharedPreferences sharedPreferences = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28788a = cVar;
        boolean z11 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a10.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a10.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z10 = z11;
        }
        this.f28789b = z10;
    }
}
