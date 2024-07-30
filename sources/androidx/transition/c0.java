package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
public final class c0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f2451a;

    public c0(View view) {
        this.f2451a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c0) && ((c0) obj).f2451a.equals(this.f2451a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2451a.hashCode();
    }
}
