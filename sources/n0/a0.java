package n0;

import android.text.TextUtils;
import android.view.View;
import com.hamkho.livefoot.R;
import n0.c0;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class a0 extends c0.b<CharSequence> {
    public a0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // n0.c0.b
    public final CharSequence b(View view) {
        return c0.o.a(view);
    }

    @Override // n0.c0.b
    public final void c(View view, CharSequence charSequence) {
        c0.o.b(view, charSequence);
    }

    @Override // n0.c0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
