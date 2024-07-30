package com.huawei.openalliance.ad.ppskit.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.huawei.openalliance.ad.ppskit.activity.BaseDialogActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class a2 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka.n f22806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.views.o1 f22807b;

    public a2(ka.n nVar, BaseDialogActivity.d dVar) {
        this.f22806a = nVar;
        this.f22807b = dVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        String concat;
        com.huawei.openalliance.ad.ppskit.views.o1 o1Var;
        int i10;
        try {
            Rect c10 = this.f22806a.c(windowInsets);
            if (n7.d()) {
                Object[] objArr = new Object[1];
                if (c10 == null) {
                    i10 = 0;
                } else {
                    i10 = c10.right;
                }
                objArr[0] = Integer.valueOf(i10);
                n7.c("SystemUtil", "got safe padding: %s", objArr);
            }
            if (c10 != null && (o1Var = this.f22807b) != null) {
                ((BaseDialogActivity.d) o1Var).a(c10.right);
            }
        } catch (NoSuchMethodError unused) {
            concat = "getRingScreenSafePadding NoSuchMethodError getDisplaySideRegion";
            n7.g("SystemUtil", concat);
            return windowInsets;
        } catch (Throwable th) {
            concat = "getRingScreenSafePadding error:".concat(th.getClass().getSimpleName());
            n7.g("SystemUtil", concat);
            return windowInsets;
        }
        return windowInsets;
    }
}
