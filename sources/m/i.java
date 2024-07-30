package m;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f32621a;

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static class a {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public i(Intent intent) {
        this.f32621a = intent;
    }

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f32622a;

        /* renamed from: b, reason: collision with root package name */
        public final m.a f32623b;

        /* renamed from: c, reason: collision with root package name */
        public int f32624c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f32625d;

        public b() {
            this.f32622a = new Intent("android.intent.action.VIEW");
            this.f32623b = new m.a();
            this.f32624c = 0;
            this.f32625d = true;
        }

        public final i a() {
            Bundle bundle;
            Intent intent = this.f32622a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle2 = new Bundle();
                b0.i.b(bundle2, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle2);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f32625d);
            Integer num = this.f32623b.f32606a;
            Bundle bundle3 = new Bundle();
            if (num != null) {
                bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
            }
            intent.putExtras(bundle3);
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f32624c);
            String a10 = a.a();
            if (!TextUtils.isEmpty(a10)) {
                if (intent.hasExtra("com.android.browser.headers")) {
                    bundle = intent.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", a10);
                    intent.putExtra("com.android.browser.headers", bundle);
                }
            }
            return new i(intent);
        }

        public b(l lVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f32622a = intent;
            this.f32623b = new m.a();
            this.f32624c = 0;
            this.f32625d = true;
            if (lVar != null) {
                intent.setPackage(lVar.f32631c.getPackageName());
                IBinder asBinder = lVar.f32630b.asBinder();
                Bundle bundle = new Bundle();
                b0.i.b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
                PendingIntent pendingIntent = lVar.f32632d;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }
    }
}
