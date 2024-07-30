package o0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33537a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final h f33538a;

        public a(h hVar) {
            this.f33538a = hVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            g a10 = this.f33538a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f33521a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f33538a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f33538a.c(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(h hVar) {
            super(hVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            g b10 = this.f33538a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f33521a;
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(h hVar) {
            super(hVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f33538a.getClass();
        }
    }

    public h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33537a = new c(this);
        } else {
            this.f33537a = new b(this);
        }
    }

    public g a(int i10) {
        return null;
    }

    public g b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }

    public h(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f33537a = accessibilityNodeProvider;
    }
}
