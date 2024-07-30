package androidx.appcompat.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.q;
import i.a;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class n extends androidx.activity.h implements e {

    /* renamed from: u, reason: collision with root package name */
    public AppCompatDelegateImpl f662u;

    /* renamed from: v, reason: collision with root package name */
    public final m f663v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968976(0x7f040190, float:1.754662E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            androidx.appcompat.app.m r2 = new androidx.appcompat.app.m
            r3 = r4
            androidx.appcompat.app.d r3 = (androidx.appcompat.app.d) r3
            r2.<init>()
            r4.f663v = r2
            androidx.appcompat.app.g r2 = r4.b()
            if (r6 != 0) goto L37
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L37:
            r5 = r2
            androidx.appcompat.app.AppCompatDelegateImpl r5 = (androidx.appcompat.app.AppCompatDelegateImpl) r5
            r5.f600o0 = r6
            r2.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.n.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().c(view, layoutParams);
    }

    public final g b() {
        if (this.f662u == null) {
            q.a aVar = g.f650s;
            this.f662u = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.f662u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return n0.f.b(this.f663v, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) b().e(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().l();
    }

    @Override // androidx.activity.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        b().k();
        super.onCreate(bundle);
        b().o();
    }

    @Override // androidx.activity.h, android.app.Dialog
    public final void onStop() {
        super.onStop();
        b().u();
    }

    @Override // androidx.appcompat.app.e
    public final i.a onWindowStartingSupportActionMode(a.InterfaceC0394a interfaceC0394a) {
        return null;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        b().x(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().C(charSequence);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        b().y(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().z(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        b().C(getContext().getString(i10));
    }

    @Override // androidx.appcompat.app.e
    public final void onSupportActionModeFinished(i.a aVar) {
    }

    @Override // androidx.appcompat.app.e
    public final void onSupportActionModeStarted(i.a aVar) {
    }
}
