package ka;

import android.app.ActionBar;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public interface n {
    int a(Context context);

    int a(ApplicationInfo applicationInfo);

    com.huawei.openalliance.ad.ppskit.utils.g1 a();

    void b(WindowManager.LayoutParams layoutParams);

    int c();

    Rect c(WindowInsets windowInsets);

    void d(ActionBar actionBar, la.j jVar);

    boolean d();

    String e();

    String f();

    String g();

    int i();
}
