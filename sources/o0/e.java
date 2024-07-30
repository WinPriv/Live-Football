package o0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.applovin.exoplayer2.a.x;
import com.google.android.material.textfield.m;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f33519a;

    public e(d dVar) {
        this.f33519a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f33519a.equals(((e) obj).f33519a);
    }

    public final int hashCode() {
        return this.f33519a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        boolean z11;
        m mVar = (m) ((x) this.f33519a).f13016t;
        AutoCompleteTextView autoCompleteTextView = mVar.f21170h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (z10) {
                    i10 = 2;
                }
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.d.s(mVar.f21183d, i10);
            }
        }
    }
}
