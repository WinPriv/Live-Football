package n0;

import android.view.View;
import com.hamkho.livefoot.R;
import n0.c0;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class y extends c0.b<Boolean> {
    public y() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    @Override // n0.c0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(c0.m.d(view));
    }

    @Override // n0.c0.b
    public final void c(View view, Boolean bool) {
        c0.m.i(view, bool.booleanValue());
    }

    @Override // n0.c0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !c0.b.a(bool, bool2);
    }
}
