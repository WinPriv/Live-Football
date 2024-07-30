package n0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k {
    public static /* bridge */ /* synthetic */ int b(View view) {
        return view.getImportantForAutofill();
    }

    public static /* bridge */ /* synthetic */ void f(int i10, View view) {
        view.setNextClusterForwardId(i10);
    }

    public static /* bridge */ /* synthetic */ void j(View view, boolean z10) {
        view.setFocusedByDefault(z10);
    }

    public static /* bridge */ /* synthetic */ void k(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setHintText(str);
    }

    public static /* bridge */ /* synthetic */ boolean m(View view) {
        return view.restoreDefaultFocus();
    }

    public static /* bridge */ /* synthetic */ boolean o(View view) {
        return view.isImportantForAutofill();
    }

    public static /* bridge */ /* synthetic */ boolean p(View view) {
        return view.isFocusedByDefault();
    }

    public static /* bridge */ /* synthetic */ boolean q(View view) {
        return view.hasExplicitFocusable();
    }
}
