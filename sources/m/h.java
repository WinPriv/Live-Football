package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final a.b f32619a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f32620b;

    public h(a.b bVar, ComponentName componentName) {
        this.f32619a = bVar;
        this.f32620b = componentName;
    }

    public static String a(Context context, ArrayList arrayList) {
        PackageManager packageManager = context.getPackageManager();
        new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            intent.setPackage(str);
            if (packageManager.resolveService(intent, 0) != null) {
                return str;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }
}
