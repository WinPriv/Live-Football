package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.m;
import com.hamkho.livefoot.R;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements m {
    public int A;

    /* renamed from: s, reason: collision with root package name */
    public final Context f776s;

    /* renamed from: t, reason: collision with root package name */
    public Context f777t;

    /* renamed from: u, reason: collision with root package name */
    public h f778u;

    /* renamed from: v, reason: collision with root package name */
    public final LayoutInflater f779v;

    /* renamed from: w, reason: collision with root package name */
    public m.a f780w;

    /* renamed from: x, reason: collision with root package name */
    public final int f781x = R.layout.abc_action_menu_layout;
    public final int y = R.layout.abc_action_menu_item_layout;

    /* renamed from: z, reason: collision with root package name */
    public n f782z;

    public b(Context context) {
        this.f776s = context;
        this.f779v = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(m.a aVar) {
        this.f780w = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(j jVar) {
        return false;
    }
}
