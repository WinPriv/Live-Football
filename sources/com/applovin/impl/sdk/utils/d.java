package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19384a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f19385b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection<CountDownLatch> f19386c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f19387d = false;

    /* renamed from: e, reason: collision with root package name */
    private static a f19388e = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f19389a;

        /* renamed from: b, reason: collision with root package name */
        private String f19390b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0223a f19391c = EnumC0223a.NOT_SET;

        /* renamed from: com.applovin.impl.sdk.utils.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0223a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* renamed from: d, reason: collision with root package name */
            private final String f19396d;

            EnumC0223a(String str) {
                this.f19396d = str;
            }

            public String a() {
                return this.f19396d;
            }
        }

        public void a(EnumC0223a enumC0223a) {
            this.f19391c = enumC0223a;
        }

        public String b() {
            return this.f19390b;
        }

        public EnumC0223a c() {
            return this.f19391c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || a() != aVar.a()) {
                return false;
            }
            String b10 = b();
            String b11 = aVar.b();
            if (b10 != null ? !b10.equals(b11) : b11 != null) {
                return false;
            }
            EnumC0223a c10 = c();
            EnumC0223a c11 = aVar.c();
            if (c10 != null ? c10.equals(c11) : c11 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode;
            if (a()) {
                i10 = 79;
            } else {
                i10 = 97;
            }
            String b10 = b();
            int i11 = (i10 + 59) * 59;
            int i12 = 43;
            if (b10 == null) {
                hashCode = 43;
            } else {
                hashCode = b10.hashCode();
            }
            int i13 = i11 + hashCode;
            EnumC0223a c10 = c();
            int i14 = i13 * 59;
            if (c10 != null) {
                i12 = c10.hashCode();
            }
            return i14 + i12;
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + a() + ", advertisingId=" + b() + ", dntCode=" + c() + ")";
        }

        public void a(String str) {
            this.f19390b = str;
        }

        public void a(boolean z10) {
            this.f19389a = z10;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean a() {
            return this.f19389a;
        }
    }

    public static a a(Context context) {
        return b(context);
    }

    private static a b(Context context) {
        a aVar;
        HashSet hashSet;
        Object obj = f19385b;
        synchronized (obj) {
            if (f19387d) {
                return f19388e;
            }
            Collection<CountDownLatch> collection = f19386c;
            boolean isEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (isEmpty) {
                a c10 = c(context);
                synchronized (obj) {
                    f19387d = true;
                    f19388e = c10;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    y.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e10) {
                y.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
            }
            synchronized (f19385b) {
                aVar = f19388e;
            }
            return aVar;
        }
    }

    private static a c(Context context) {
        a d10 = d(context);
        if (d10 == null) {
            d10 = e(context);
        }
        if (d10 == null) {
            return new a();
        }
        return d10;
    }

    private static a d(Context context) {
        a.EnumC0223a enumC0223a;
        if (a()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.a(isLimitAdTrackingEnabled);
                if (isLimitAdTrackingEnabled) {
                    enumC0223a = a.EnumC0223a.ON;
                } else {
                    enumC0223a = a.EnumC0223a.OFF;
                }
                aVar.a(enumC0223a);
                aVar.a(advertisingIdInfo.getId());
                return aVar;
            } catch (Throwable th) {
                if (!AppLovinSdkUtils.isFireOS(context)) {
                    y.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                    return null;
                }
                return null;
            }
        }
        if (!AppLovinSdkUtils.isFireOS(context)) {
            y.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        return null;
    }

    private static a e(Context context) {
        boolean z10;
        a.EnumC0223a enumC0223a;
        if (f19384a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10);
                if (z10) {
                    enumC0223a = a.EnumC0223a.ON;
                } else {
                    enumC0223a = a.EnumC0223a.OFF;
                }
                aVar.a(enumC0223a);
                return aVar;
            } catch (Settings.SettingNotFoundException e10) {
                y.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th) {
                y.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f19384a = false;
        return null;
    }

    public static boolean a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
