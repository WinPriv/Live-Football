package ka;

import android.app.ActionBar;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.hihonor.android.app.ActivityManagerEx;
import com.hihonor.android.content.pm.ApplicationInfoEx;
import com.hihonor.android.fsm.HwFoldScreenManagerEx;
import com.hihonor.android.provider.SettingsEx;
import com.hihonor.android.view.DisplaySideRegionEx;
import com.hihonor.android.view.WindowManagerEx;
import com.hihonor.android.widget.ActionBarEx;

/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public static e f31109a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31110b = new byte[0];

    @Override // ka.n
    public final int a(Context context) {
        return SettingsEx.getIntForUser(context.getContentResolver(), "accessibility_screenreader_enabled", -1, ActivityManagerEx.getCurrentUser());
    }

    @Override // ka.n
    public final void b(WindowManager.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        new WindowManagerEx.LayoutParamsEx(layoutParams).setDisplaySideMode(1);
    }

    @Override // ka.n
    public final Rect c(WindowInsets windowInsets) {
        DisplaySideRegionEx displaySideRegion = WindowManagerEx.LayoutParamsEx.getDisplaySideRegion(windowInsets);
        if (displaySideRegion != null) {
            return displaySideRegion.getSafeInsets();
        }
        return null;
    }

    @Override // ka.n
    public final void d(ActionBar actionBar, la.j jVar) {
        ActionBarEx.setStartIcon(actionBar, true, (Drawable) null, jVar);
    }

    @Override // ka.n
    public final String e() {
        return "com.hihonor.android.net.wifi.WifiManagerCommonEx";
    }

    @Override // ka.n
    public final String f() {
        return "com.hihonor.android.os.Build$VERSION";
    }

    @Override // ka.n
    public final String g() {
        return "com.hihonor.android.os.Build";
    }

    @Override // ka.n
    public final int i() {
        return ActivityManagerEx.getCurrentUser();
    }

    @Override // ka.n
    public final int a(ApplicationInfo applicationInfo) {
        return new ApplicationInfoEx(applicationInfo).getHwFlags();
    }

    @Override // ka.n
    public final int c() {
        return HwFoldScreenManagerEx.getDisplayMode();
    }

    @Override // ka.n
    public final boolean d() {
        return HwFoldScreenManagerEx.isFoldable();
    }

    @Override // ka.n
    public final com.huawei.openalliance.ad.ppskit.utils.g1 a() {
        return new com.huawei.openalliance.ad.ppskit.utils.h1();
    }
}
