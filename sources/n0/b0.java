package n0;

import android.view.View;
import com.hamkho.livefoot.R;
import n0.c0;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class b0 extends c0.b<Boolean> {
    public b0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // n0.c0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(c0.m.c(view));
    }

    @Override // n0.c0.b
    public final void c(View view, Boolean bool) {
        c0.m.g(view, bool.booleanValue());
    }

    @Override // n0.c0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !c0.b.a(bool, bool2);
    }
}
