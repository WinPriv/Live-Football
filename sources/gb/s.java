package gb;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.huawei.hms.ads.cx;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class s implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx f28624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f28625b;

    public s(cx cxVar, View view) {
        this.f28624a = cxVar;
        this.f28625b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        String concat;
        View view2;
        try {
            Rect Code = this.f28624a.Code(windowInsets);
            if (Code != null && (view2 = this.f28625b) != null) {
                view2.setPadding(Code.left, 0, Code.right, 0);
            }
        } catch (NoSuchMethodError unused) {
            int i10 = u.f28631a;
            concat = "initOnApplyWindowInsets NoSuchMethodError getDisplaySideRegion";
            ex.I("u", concat);
            return windowInsets;
        } catch (Throwable th) {
            int i11 = u.f28631a;
            concat = "initOnApplyWindowInsets error:".concat(th.getClass().getSimpleName());
            ex.I("u", concat);
            return windowInsets;
        }
        return windowInsets;
    }
}
