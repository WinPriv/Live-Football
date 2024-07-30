package cb;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.huawei.openalliance.ad.ppskit.views.viewpager.PPSGalleryView;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public final class c implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3478a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final PPSGalleryView f3479b;

    public c(PPSGalleryView pPSGalleryView) {
        this.f3479b = pPSGalleryView;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets.isConsumed()) {
            return onApplyWindowInsets;
        }
        int systemWindowInsetLeft = onApplyWindowInsets.getSystemWindowInsetLeft();
        Rect rect = this.f3478a;
        rect.left = systemWindowInsetLeft;
        rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
        rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
        rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
        PPSGalleryView pPSGalleryView = this.f3479b;
        int childCount = pPSGalleryView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            WindowInsets dispatchApplyWindowInsets = pPSGalleryView.getChildAt(i10).dispatchApplyWindowInsets(onApplyWindowInsets);
            rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
            rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
            rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
            rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
        }
        return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
    }
}
