package n0;

import android.view.View;
import android.view.Window;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class t0 extends s0 {
    public t0(Window window) {
        super(window);
    }

    @Override // n0.v0
    public final void c(boolean z10) {
        Window window = this.f33127i;
        if (z10) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
