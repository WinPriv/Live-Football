package gb;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.huawei.hms.ads.cx;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.activity.a;

/* loaded from: classes2.dex */
public final class t implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx f28626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.views.z f28627b;

    public t(cx cxVar, a.c cVar) {
        this.f28626a = cxVar;
        this.f28627b = cVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        String concat;
        com.huawei.openalliance.ad.views.z zVar;
        int i10;
        try {
            Rect Code = this.f28626a.Code(windowInsets);
            if (ex.Code()) {
                int i11 = u.f28631a;
                Object[] objArr = new Object[1];
                if (Code == null) {
                    i10 = 0;
                } else {
                    i10 = Code.right;
                }
                objArr[0] = Integer.valueOf(i10);
                ex.Code("u", "got safe padding: %s", objArr);
            }
            if (Code != null && (zVar = this.f28627b) != null) {
                ((a.c) zVar).a(Code.right);
            }
        } catch (NoSuchMethodError unused) {
            int i12 = u.f28631a;
            concat = "getRingScreenSafePadding NoSuchMethodError getDisplaySideRegion";
            ex.I("u", concat);
            return windowInsets;
        } catch (Throwable th) {
            int i13 = u.f28631a;
            concat = "getRingScreenSafePadding error:".concat(th.getClass().getSimpleName());
            ex.I("u", concat);
            return windowInsets;
        }
        return windowInsets;
    }
}
