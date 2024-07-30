package com.huawei.openalliance.ad.ppskit.utils;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.utils.v;
import com.huawei.openalliance.ad.ppskit.views.PPSWebView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.n7;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q2 {

    /* renamed from: g, reason: collision with root package name */
    public static Location f22974g;

    /* renamed from: j, reason: collision with root package name */
    public static LocationManager f22977j;

    /* renamed from: k, reason: collision with root package name */
    public static String f22978k;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<PPSWebView> f22982a;

    /* renamed from: b, reason: collision with root package name */
    public String f22983b;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference<Context> f22985d;
    public final String f;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f22975h = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f22976i = {"android.permission.MODIFY_PHONE_STATE"};

    /* renamed from: l, reason: collision with root package name */
    public static boolean f22979l = true;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f22980m = true;

    /* renamed from: n, reason: collision with root package name */
    public static String f22981n = "";

    /* renamed from: c, reason: collision with root package name */
    public String f22984c = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22986e = false;

    /* loaded from: classes2.dex */
    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            q2 q2Var = q2.this;
            if (location != null) {
                n7.e("AGSIJS", "loc not null");
                n7.c("AGSIJS", "loc_tag getLocationByNative Listener lat = %s, lon = %s", y1.j(String.valueOf(location.getLatitude())), y1.j(String.valueOf(location.getLongitude())));
                q2.f22974g = location;
                q2Var.d(0);
            } else {
                n7.g("AGSIJS", "loc_tag getLocationByNative Listener, but location is null");
                q2Var.d(1);
            }
            q2.c(q2Var, this);
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            n7.b("AGSIJS", "loc_tag getLocationByNative onProviderDisabled");
            q2.c(q2.this, this);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            n7.b("AGSIJS", "loc_tag getLocationByNative onProviderEnabled");
            q2.c(q2.this, this);
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i10, Bundle bundle) {
            n7.b("AGSIJS", "loc_tag getLocationByNative onStatusChanged");
            q2.c(q2.this, this);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LocationListener f22988s;

        public b(a aVar) {
            this.f22988s = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q2 q2Var = q2.this;
            try {
                Location lastKnownLocation = q2.f22977j.getLastKnownLocation(q2Var.f22984c);
                q2.f22974g = lastKnownLocation;
                if (lastKnownLocation != null) {
                    n7.e("AGSIJS", "last loc not null");
                    q2Var.d(0);
                    q2.c(q2Var, this.f22988s);
                }
            } catch (Throwable th) {
                e0.i.p(th, "get last loc err, ", "AGSIJS");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LocationListener f22990s;

        public c(a aVar) {
            this.f22990s = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q2 q2Var = q2.this;
            try {
                n7.g("AGSIJS", "remove loc list finally");
                q2Var.d(1);
                q2.c(q2Var, this.f22990s);
            } catch (Throwable th) {
                e0.i.p(th, "get last loc err, ", "AGSIJS");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f22992a;

        public d(Context context) {
            this.f22992a = context;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return j7.r.p(this.f22992a);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f22993s;

        public e(JSONObject jSONObject) {
            this.f22993s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean matches;
            try {
                PPSWebView pPSWebView = q2.this.f22982a.get();
                if (pPSWebView != null) {
                    String str = q2.f22978k;
                    if (y1.h(str)) {
                        matches = false;
                    } else {
                        matches = str.matches("^[0-9a-zA-Z_]+$");
                    }
                    if (matches) {
                        pPSWebView.getWebView().loadUrl("javascript:" + q2.f22978k + "(" + this.f22993s.toString() + ")");
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "call wenus err, ", "AGSIJS");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f22995s;

        public f(JSONObject jSONObject) {
            this.f22995s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean matches;
            q2 q2Var = q2.this;
            try {
                PPSWebView pPSWebView = q2Var.f22982a.get();
                if (pPSWebView != null) {
                    String str = q2Var.f22983b;
                    if (y1.h(str)) {
                        matches = false;
                    } else {
                        matches = str.matches("^[0-9a-zA-Z_]+$");
                    }
                    if (matches) {
                        pPSWebView.getWebView().loadUrl("javascript:" + q2Var.f22983b + "(" + this.f22995s.toString() + ")");
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "call wenus err, ", "AGSIJS");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements v.d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22997a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<q2> f22998b;

        public g(Context context, q2 q2Var) {
            this.f22997a = context;
            this.f22998b = new WeakReference<>(q2Var);
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void a() {
            n7.e("AGSIJS", "accept loc auth");
            try {
                q2 q2Var = this.f22998b.get();
                if (q2Var == null) {
                    n7.g("AGSIJS", "object is null");
                } else {
                    q2Var.b(this.f22997a);
                }
            } catch (Throwable unused) {
                n7.g("AGSIJS", "loc diag err");
            }
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void b() {
            n7.e("AGSIJS", "refuse loc auth");
            try {
                q2 q2Var = this.f22998b.get();
                if (q2Var == null) {
                    n7.g("AGSIJS", "object is null");
                } else {
                    q2Var.d(2);
                }
            } catch (Throwable unused) {
                n7.g("AGSIJS", "loc diag err");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements v.d {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22999a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<q2> f23000b;

        /* loaded from: classes2.dex */
        public class a implements Callable<String> {
            public a() {
            }

            @Override // java.util.concurrent.Callable
            public final String call() {
                return j7.r.p(h.this.f22999a);
            }
        }

        public h(Context context, q2 q2Var) {
            this.f22999a = context;
            this.f23000b = new WeakReference<>(q2Var);
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void a() {
            n7.e("AGSIJS", "accept pn auth");
            n7.c("AGSIJS", "get num, start time:%s", Long.valueOf(System.currentTimeMillis()));
            try {
                q2 q2Var = this.f23000b.get();
                if (q2Var == null) {
                    n7.g("AGSIJS", "object is null");
                    return;
                }
                a aVar = new a();
                int i10 = c5.e.f3284t;
                q2.f22981n = (String) c5.e.b(aVar, "", 2000L, TimeUnit.MILLISECONDS);
                n7.c("AGSIJS", "get num, end time:%s", Long.valueOf(System.currentTimeMillis()));
                q2Var.e(0);
            } catch (Throwable unused) {
                n7.g("AGSIJS", "pn diag err");
            }
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.v.d
        public final void b() {
            n7.e("AGSIJS", "refuse num auth");
            try {
                q2 q2Var = this.f23000b.get();
                if (q2Var == null) {
                    n7.g("AGSIJS", "object is null");
                } else {
                    q2Var.e(2);
                }
            } catch (Throwable unused) {
                n7.g("AGSIJS", "pn diag err");
            }
        }
    }

    public q2(Context context, PPSWebView pPSWebView, String str) {
        this.f22985d = new WeakReference<>(context);
        this.f22982a = new WeakReference<>(pPSWebView);
        this.f = str;
    }

    public static void c(q2 q2Var, LocationListener locationListener) {
        q2Var.getClass();
        try {
            if (f22977j != null && locationListener != null) {
                n7.e("AGSIJS", "loc_tag remove native location updates");
                f22977j.removeUpdates(locationListener);
            }
        } catch (Throwable unused) {
            n7.g("AGSIJS", "remv loc err");
        }
    }

    public final void a(int i10) {
        try {
            Context context = this.f22985d.get();
            if (i10 == 0 && context != null) {
                b(context);
                return;
            }
            if (i10 == 2) {
                d(2);
            } else {
                d(3);
            }
            n7.g("AGSIJS", "loc per denied");
        } catch (Throwable unused) {
            n7.g("AGSIJS", "loc result del err");
        }
    }

    public final void b(Context context) {
        n7.b("AGSIJS", "loc_tag getLocationByNative");
        LocationManager locationManager = (LocationManager) context.getApplicationContext().getSystemService(av.at);
        f22977j = locationManager;
        if (locationManager == null) {
            n7.i("AGSIJS", "loc_tag getLocationByNative, nativeLocationManager is null, return");
        } else {
            List<String> providers = locationManager.getProviders(true);
            String str = "network";
            if (!providers.contains("network")) {
                str = "gps";
                if (!providers.contains("gps")) {
                    n7.g("AGSIJS", "loc_tag nativeLocationProvider wrong, return");
                }
            }
            this.f22984c = str;
            if (n7.d()) {
                n7.c("AGSIJS", "loc_tag native location provider is: %s", this.f22984c);
            }
            try {
                n7.e("AGSIJS", "loc_tag getLocationByNative requestLocationUpdates");
                a aVar = new a();
                f22977j.requestSingleUpdate(this.f22984c, aVar, Looper.getMainLooper());
                d2.b(new b(aVar), 1000L);
                d2.b(new c(aVar), com.anythink.expressad.exoplayer.f.f7962a);
                return;
            } catch (Throwable th) {
                n7.i("AGSIJS", "loc_tag getLocationByNative, exception = ".concat(th.getClass().getSimpleName()));
                return;
            }
        }
        d(1);
    }

    public final void d(int i10) {
        try {
            if (this.f22986e) {
                return;
            }
            n7.e("AGSIJS", "loc code: " + i10);
            this.f22986e = true;
            JSONObject jSONObject = new JSONObject();
            if (i10 == 0) {
                Location location = f22974g;
                if (location != null) {
                    jSONObject.put(av.av, location.getLongitude());
                    jSONObject.put(av.au, f22974g.getLatitude());
                } else {
                    n7.g("AGSIJS", "get loc err");
                    i10 = 1;
                }
            }
            jSONObject.put("resultCode", i10);
            d2.a(new e(jSONObject));
        } catch (Throwable th) {
            e0.i.p(th, "location callback err: ", "AGSIJS");
        }
    }

    public final void e(int i10) {
        try {
            n7.e("AGSIJS", "pn code: " + i10);
            JSONObject jSONObject = new JSONObject();
            if (i10 == 0) {
                if (!y1.h(f22981n)) {
                    jSONObject.put("phoneNumber", f22981n);
                } else {
                    n7.g("AGSIJS", "get pn err");
                    i10 = 1;
                }
            }
            jSONObject.put("resultCode", i10);
            d2.a(new f(jSONObject));
        } catch (Throwable th) {
            e0.i.p(th, "num callback err: ", "AGSIJS");
        }
    }

    public final void f() {
        boolean z10;
        boolean z11;
        Context context = this.f22985d.get();
        if (context == null) {
            n7.b("AGSIJS", "pn context null");
            return;
        }
        if (!p1.b(context, f22976i)) {
            n7.e("AGSIJS", "no ph per");
            e(2);
            return;
        }
        String str = this.f;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f22985d.get());
        synchronized (d10.f22585a) {
            Map<String, String> K = d10.K(str, true);
            if (!a0.a.e0(K)) {
                z10 = !TextUtils.equals("1", K.get("landPagePerDialogSwitch"));
            } else {
                z10 = true;
            }
        }
        if (z10 && f22980m) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            v.b(context, context.getString(R.string.hiad_phone_num_title), context.getString(R.string.hiad_phone_message), context.getString(R.string.hiad_dialog_allow), context.getString(R.string.hiad_dialog_deny), new h(context.getApplicationContext(), this));
        } else {
            d dVar = new d(context);
            int i10 = c5.e.f3284t;
            f22981n = (String) c5.e.b(dVar, "", 2000L, TimeUnit.MILLISECONDS);
            e(0);
        }
        f22980m = true;
    }

    public final void g() {
        this.f22986e = false;
        Context context = this.f22985d.get();
        if (context != null) {
            String[] strArr = f22975h;
            if (!p1.b(context, strArr)) {
                n7.e("AGSIJS", "request loc permissions");
                ((Activity) context).requestPermissions(strArr, 21);
            } else if (f22979l) {
                v.b(context, context.getString(R.string.hiad_loc_title), context.getString(R.string.hiad_loc_message), context.getString(R.string.hiad_dialog_allow_tmp), context.getString(R.string.hiad_dialog_deny), new g(context.getApplicationContext(), this));
            } else {
                b(context);
            }
            f22979l = true;
        }
    }

    @JavascriptInterface
    public void getGeolocation(String str) {
        try {
            n7.e("AGSIJS", "get loc");
            n7.f("AGSIJS", "loc switch: %s", Boolean.valueOf(f22979l));
            if (y1.h(str)) {
                n7.g("AGSIJS", "location recall funcName is empty.");
            }
            f22978k = str;
            g();
        } catch (Throwable unused) {
            n7.g("AGSIJS", "get geo err");
        }
    }

    @JavascriptInterface
    public void getGeolocationV2(String str, boolean z10) {
        f22979l = z10;
        getGeolocation(str);
    }

    @JavascriptInterface
    public void getPhoneNumber(String str) {
        try {
            n7.e("AGSIJS", "get nu");
            n7.f("AGSIJS", "phn switch: %s", Boolean.valueOf(f22980m));
            if (y1.h(str)) {
                n7.g("AGSIJS", "pn recall funcName is empty.");
            }
            this.f22983b = str;
            f();
        } catch (Throwable unused) {
            n7.g("AGSIJS", "get num err");
        }
    }

    @JavascriptInterface
    public void getPhoneNumberV2(String str, boolean z10) {
        f22980m = z10;
        getPhoneNumber(str);
    }
}
