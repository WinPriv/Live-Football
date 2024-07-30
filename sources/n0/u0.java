package n0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class u0 extends v0 {

    /* renamed from: i, reason: collision with root package name */
    public final WindowInsetsController f33128i;

    /* renamed from: j, reason: collision with root package name */
    public final Window f33129j;

    public u0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        new q.i();
        this.f33128i = insetsController;
        this.f33129j = window;
    }

    @Override // n0.v0
    public final void c(boolean z10) {
        WindowInsetsController windowInsetsController = this.f33128i;
        Window window = this.f33129j;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // n0.v0
    public final void d(boolean z10) {
        WindowInsetsController windowInsetsController = this.f33128i;
        Window window = this.f33129j;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
