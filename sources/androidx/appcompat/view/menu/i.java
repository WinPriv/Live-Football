package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.m;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public final class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: s, reason: collision with root package name */
    public final h f838s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.appcompat.app.d f839t;

    /* renamed from: u, reason: collision with root package name */
    public f f840u;

    public i(h hVar) {
        this.f838s = hVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public final void b(h hVar, boolean z10) {
        androidx.appcompat.app.d dVar;
        if ((z10 || hVar == this.f838s) && (dVar = this.f839t) != null) {
            dVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public final boolean c(h hVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        f fVar = this.f840u;
        if (fVar.f807x == null) {
            fVar.f807x = new f.a();
        }
        this.f838s.q(fVar.f807x.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f840u.b(this.f838s, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        h hVar = this.f838s;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f839t.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f839t.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                hVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return hVar.performShortcut(i10, keyEvent, 0);
    }
}
