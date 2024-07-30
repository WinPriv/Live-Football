package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* loaded from: classes.dex */
public final class q0 {

    /* compiled from: TooltipCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        r0 r0Var = r0.C;
        if (r0Var != null && r0Var.f1247s == view) {
            r0.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            r0 r0Var2 = r0.D;
            if (r0Var2 != null && r0Var2.f1247s == view) {
                r0Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new r0(view, charSequence);
    }
}
