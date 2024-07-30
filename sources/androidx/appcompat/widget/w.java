package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* compiled from: DecorToolbar.java */
/* loaded from: classes.dex */
public interface w {
    boolean a();

    void b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e(androidx.appcompat.view.menu.h hVar, AppCompatDelegateImpl.d dVar);

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i();

    boolean j();

    void k(int i10);

    void l();

    void m(int i10);

    void n();

    n0.l0 o(int i10, long j10);

    int p();

    void q();

    void r();

    void s(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
