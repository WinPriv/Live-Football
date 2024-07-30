package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public final class n extends z {
    public final /* synthetic */ AppCompatSpinner.g B;
    public final /* synthetic */ AppCompatSpinner C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.g gVar) {
        super(view);
        this.C = appCompatSpinner;
        this.B = gVar;
    }

    @Override // androidx.appcompat.widget.z
    public final androidx.appcompat.view.menu.p b() {
        return this.B;
    }

    @Override // androidx.appcompat.widget.z
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.C;
        if (!appCompatSpinner.getInternalPopup().a()) {
            appCompatSpinner.f976x.k(AppCompatSpinner.c.b(appCompatSpinner), AppCompatSpinner.c.a(appCompatSpinner));
            return true;
        }
        return true;
    }
}
