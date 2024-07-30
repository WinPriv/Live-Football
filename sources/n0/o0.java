package n0;

import android.view.View;
import android.view.Window;

/* compiled from: WindowCompat.java */
/* loaded from: classes.dex */
public final class o0 {
    public static void a(Window window, boolean z10) {
        int i10;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility & (-1793);
        } else {
            i10 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i10);
    }
}
