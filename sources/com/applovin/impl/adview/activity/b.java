package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f16977a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16978b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16979c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16980d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16981e;

    public b(Activity activity) {
        boolean z10;
        this.f16977a = activity;
        int rotation = Utils.getRotation(activity);
        this.f16979c = rotation;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f16980d = isTablet;
        this.f16978b = a(rotation, isTablet);
        if (isTablet && 2 == a(activity)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16981e = z10;
    }

    public void a(e eVar) {
        int i10;
        if (eVar.F() && (i10 = this.f16978b) != -1) {
            a(i10);
        } else {
            a(eVar.p());
        }
    }

    private int a(int i10, boolean z10) {
        if (z10 && this.f16981e) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return 9;
            }
            if (i10 == 2) {
                return 8;
            }
            return i10 == 3 ? 1 : -1;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 9;
        }
        return i10 == 3 ? 8 : -1;
    }

    private void a(e.b bVar) {
        if (bVar == e.b.ACTIVITY_PORTRAIT) {
            if (this.f16980d && this.f16981e) {
                int i10 = this.f16979c;
                if (i10 != 1 && i10 != 3) {
                    a(1);
                    return;
                } else if (i10 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i11 = this.f16979c;
            if (i11 != 0 && i11 != 2) {
                a(1);
                return;
            } else {
                a(i11 != 0 ? 9 : 1);
                return;
            }
        }
        if (bVar == e.b.ACTIVITY_LANDSCAPE) {
            if (this.f16980d && this.f16981e) {
                int i12 = this.f16979c;
                if (i12 != 0 && i12 != 2) {
                    a(0);
                    return;
                } else {
                    a(i12 != 2 ? 0 : 8);
                    return;
                }
            }
            int i13 = this.f16979c;
            if (i13 != 1 && i13 != 3) {
                a(0);
            } else {
                a(i13 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i10) {
        try {
            this.f16977a.setRequestedOrientation(i10);
        } catch (Throwable unused) {
        }
    }
}
