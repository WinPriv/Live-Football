package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05963c {
    public static Object A00(final InterfaceC05953b interfaceC05953b) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3a
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) InterfaceC05953b.this.A4D(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return InterfaceC05953b.this.A5M(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return InterfaceC05953b.this.AD2(i10, i11, bundle);
            }
        };
    }
}
