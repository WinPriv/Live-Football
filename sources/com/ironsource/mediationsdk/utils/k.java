package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f25925a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25926b;

    /* renamed from: c, reason: collision with root package name */
    public final com.ironsource.mediationsdk.model.h f25927c;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f25928a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f25929b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f25930c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f25931d = 4;

        /* renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int[] f25932s = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) f25932s.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25933a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.model.o.values().length];
            f25933a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.model.o.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25933a[com.ironsource.mediationsdk.model.o.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public k(String str, String str2, com.ironsource.mediationsdk.model.h hVar) {
        this.f25925a = str;
        this.f25926b = str2;
        this.f25927c = hVar;
    }

    public static int a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, b(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return a.f25928a;
        }
        if (IronSourceUtils.a(context, b(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(b(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0L) < IronSourceUtils.e(context, b(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2)) * 1000) {
                return a.f25930c;
            }
        }
        if (IronSourceUtils.a(context, b(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int e10 = IronSourceUtils.e(context, b(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2));
            String b10 = b(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int e11 = IronSourceUtils.e(context, b10);
            String b11 = b(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= context.getSharedPreferences("Mediation_Shared_Preferences", 0).getLong(b11, 0L)) {
                IronSourceUtils.g(context, 0, b10);
                IronSourceUtils.h(0L, context, b11);
            } else if (e11 >= e10) {
                return a.f25929b;
            }
        }
        return a.f25931d;
    }

    public static String b(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public static void c(Context context, String str, String str2, com.ironsource.mediationsdk.model.n nVar) {
        boolean z10 = nVar.f25697a;
        IronSourceUtils.f(context, b(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z10);
        if (z10) {
            boolean z11 = nVar.f25698b;
            IronSourceUtils.f(context, b(str, "CappingManager.IS_CAPPING_ENABLED", str2), z11);
            if (z11) {
                IronSourceUtils.g(context, nVar.f25701e, b(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2));
                IronSourceUtils.i(context, b(str, "CappingManager.CAPPING_TYPE", str2), nVar.f25700d.toString());
            }
            boolean z12 = nVar.f25699c;
            IronSourceUtils.f(context, b(str, "CappingManager.IS_PACING_ENABLED", str2), z12);
            if (z12) {
                IronSourceUtils.g(context, nVar.f, b(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2));
            }
        }
    }

    public static void d(Context context, String str, String str2) {
        com.ironsource.mediationsdk.model.o oVar;
        if (IronSourceUtils.a(context, b(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.h(System.currentTimeMillis(), context, b(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2));
        }
        if (IronSourceUtils.a(context, b(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.e(context, b(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2));
            String b10 = b(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int e10 = IronSourceUtils.e(context, b10);
            if (e10 == 0) {
                String string = context.getSharedPreferences("Mediation_Shared_Preferences", 0).getString(b(str, "CappingManager.CAPPING_TYPE", str2), com.ironsource.mediationsdk.model.o.PER_DAY.toString());
                com.ironsource.mediationsdk.model.o[] values = com.ironsource.mediationsdk.model.o.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        oVar = null;
                        break;
                    }
                    oVar = values[i10];
                    if (oVar.f25710c.equals(string)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                int i11 = b.f25933a[oVar.ordinal()];
                if (i11 == 1) {
                    calendar.set(14, 0);
                    calendar.set(13, 0);
                    calendar.set(12, 0);
                    calendar.set(11, 0);
                    calendar.add(6, 1);
                } else if (i11 == 2) {
                    calendar.set(14, 0);
                    calendar.set(13, 0);
                    calendar.set(12, 0);
                    calendar.add(11, 1);
                }
                IronSourceUtils.h(calendar.getTimeInMillis(), context, b(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2));
            }
            IronSourceUtils.g(context, e10 + 1, b10);
        }
    }

    public int e() {
        return this.f25927c.f;
    }

    public long f() {
        return this.f25927c.f25666b;
    }

    public int g() {
        return this.f25927c.f25669e;
    }

    public c h() {
        return this.f25927c.f25670g;
    }

    public boolean i() {
        return this.f25927c.f25672i;
    }

    public long j() {
        return this.f25927c.f25673j;
    }

    public static synchronized int b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (context != null && interstitialPlacement != null) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    return a(context, "Interstitial", interstitialPlacement.getPlacementName());
                }
            }
            return a.f25931d;
        }
    }

    public static synchronized void c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (interstitialPlacement != null) {
                d(context, "Interstitial", interstitialPlacement.getPlacementName());
            }
        }
    }

    public static synchronized void e(Context context, String str) {
        synchronized (k.class) {
            d(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    public static synchronized void f(Context context, String str) {
        synchronized (k.class) {
            if (!TextUtils.isEmpty(str)) {
                d(context, "Banner", str);
            }
        }
    }

    public static synchronized int b(Context context, Placement placement) {
        synchronized (k.class) {
            if (context != null && placement != null) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    return a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                }
            }
            return a.f25931d;
        }
    }

    public static synchronized void c(Context context, Placement placement) {
        synchronized (k.class) {
            if (placement != null) {
                d(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    public String b() {
        return this.f25926b;
    }

    public boolean c() {
        return this.f25927c.f25670g.f > 0;
    }

    public static synchronized void b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (k.class) {
            d(context, ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit.toString(), str);
        }
    }

    public static synchronized boolean c(Context context, String str) {
        int a10;
        int i10;
        synchronized (k.class) {
            a10 = a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
            i10 = a.f25931d;
        }
        return a10 != i10;
    }

    public String a() {
        return this.f25925a;
    }

    public long d() {
        return this.f25927c.f25670g.f25896j;
    }

    public static synchronized void a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.n placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            c(context, "Interstitial", interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized void d(Context context, String str) {
        synchronized (k.class) {
            d(context, "Interstitial", str);
        }
    }

    public static synchronized void a(Context context, Placement placement) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.n placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            c(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized boolean b(Context context, String str) {
        int a10;
        int i10;
        synchronized (k.class) {
            a10 = a(context, "Banner", str);
            i10 = a.f25931d;
        }
        return a10 != i10;
    }

    public static synchronized void a(Context context, com.ironsource.mediationsdk.model.i iVar) {
        synchronized (k.class) {
            if (context == null) {
                return;
            }
            com.ironsource.mediationsdk.model.n placementAvailabilitySettings = iVar.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            c(context, "Banner", iVar.getPlacementName(), placementAvailabilitySettings);
        }
    }

    public static synchronized boolean a(Context context, String str) {
        int a10;
        int i10;
        synchronized (k.class) {
            a10 = a(context, "Interstitial", str);
            i10 = a.f25931d;
        }
        return a10 != i10;
    }

    public static synchronized boolean a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        int a10;
        int i10;
        synchronized (k.class) {
            a10 = a(context, ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit.toString(), str);
            i10 = a.f25931d;
        }
        return a10 != i10;
    }
}
