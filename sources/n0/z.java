package n0;

import android.text.TextUtils;
import android.view.View;
import com.hamkho.livefoot.R;
import n0.c0;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class z extends c0.b<CharSequence> {
    public z() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // n0.c0.b
    public final CharSequence b(View view) {
        return c0.m.b(view);
    }

    @Override // n0.c0.b
    public final void c(View view, CharSequence charSequence) {
        c0.m.h(view, charSequence);
    }

    @Override // n0.c0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
