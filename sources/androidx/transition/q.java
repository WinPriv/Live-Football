package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public final View f2491b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2490a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<i> f2492c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f2491b == qVar.f2491b && this.f2490a.equals(qVar.f2490a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2490a.hashCode() + (this.f2491b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        l10.append(this.f2491b);
        l10.append("\n");
        String h10 = com.ironsource.adapters.facebook.a.h(l10.toString(), "    values:");
        HashMap hashMap = this.f2490a;
        for (String str : hashMap.keySet()) {
            h10 = h10 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return h10;
    }

    public q(View view) {
        this.f2491b = view;
    }
}
