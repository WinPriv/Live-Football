package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class o0 implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f1212s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f1213t;

    public o0(p0 p0Var) {
        this.f1213t = p0Var;
        this.f1212s = new androidx.appcompat.view.menu.a(p0Var.f1230a.getContext(), p0Var.f1237i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p0 p0Var = this.f1213t;
        Window.Callback callback = p0Var.f1240l;
        if (callback != null && p0Var.f1241m) {
            callback.onMenuItemSelected(0, this.f1212s);
        }
    }
}
