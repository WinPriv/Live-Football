package com.huawei.hms.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.android.app.HwMultiWindowEx;
import com.huawei.android.content.pm.ApplicationInfoEx;
import com.huawei.android.fsm.HwFoldScreenManagerEx;
import com.huawei.android.view.DisplaySideRegionEx;
import com.huawei.android.view.WindowManagerEx;
import com.huawei.hms.framework.common.EmuiUtil;

/* loaded from: classes2.dex */
public class cu extends cp {
    private static cx Code;
    private static final byte[] V = new byte[0];

    private cu(Context context) {
    }

    private static cx V(Context context) {
        cx cxVar;
        synchronized (V) {
            if (Code == null) {
                Code = new cu(context);
            }
            cxVar = Code;
        }
        return cxVar;
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public String B() {
        return "com.huawei.android.os.BuildEx";
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public String C() {
        return "com.huawei.android.os.SystemPropertiesEx";
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public int Code(ApplicationInfo applicationInfo) {
        return new ApplicationInfoEx(applicationInfo).getHwFlags();
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public String I() {
        return "com.huawei.android.net.wifi.WifiManagerCommonEx";
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public int S() {
        return HwFoldScreenManagerEx.getDisplayMode();
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public String Z() {
        return EmuiUtil.BUILDEX_VERSION;
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public Rect Code(WindowInsets windowInsets) {
        DisplaySideRegionEx displaySideRegion = WindowManagerEx.LayoutParamsEx.getDisplaySideRegion(windowInsets);
        if (displaySideRegion != null) {
            return displaySideRegion.getSafeInsets();
        }
        return null;
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public boolean V() {
        return HwFoldScreenManagerEx.isFoldable();
    }

    public static cx Code(Context context) {
        return V(context);
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public void Code(WindowManager.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        new WindowManagerEx.LayoutParamsEx(layoutParams).setDisplaySideMode(1);
    }

    @Override // com.huawei.hms.ads.cp, com.huawei.hms.ads.cx
    public boolean Code() {
        return HwMultiWindowEx.isInMultiWindowMode();
    }
}
