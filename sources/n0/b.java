package n0;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public a f33040a;

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(j.a aVar) {
        if (this.f33040a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f33040a = aVar;
    }

    public void f(androidx.appcompat.view.menu.r rVar) {
    }
}
