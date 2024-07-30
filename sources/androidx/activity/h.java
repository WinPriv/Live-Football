package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i;
import com.huawei.openalliance.ad.constant.bj;

/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class h extends Dialog implements androidx.lifecycle.m, m {

    /* renamed from: s, reason: collision with root package name */
    public androidx.lifecycle.n f482s;

    /* renamed from: t, reason: collision with root package name */
    public final OnBackPressedDispatcher f483t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i10) {
        super(context, i10);
        zc.d.d(context, bj.f.o);
        this.f483t = new OnBackPressedDispatcher(new g(this, 0));
    }

    public static void a(h hVar) {
        zc.d.d(hVar, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.n nVar = this.f482s;
        if (nVar == null) {
            androidx.lifecycle.n nVar2 = new androidx.lifecycle.n(this);
            this.f482s = nVar2;
            return nVar2;
        }
        return nVar;
    }

    @Override // androidx.activity.m
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f483t;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f483t.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackPressedDispatcher onBackPressedDispatcher = this.f483t;
            onBackPressedDispatcher.f463e = onBackInvokedDispatcher;
            onBackPressedDispatcher.c();
        }
        androidx.lifecycle.n nVar = this.f482s;
        if (nVar == null) {
            nVar = new androidx.lifecycle.n(this);
            this.f482s = nVar;
        }
        nVar.f(i.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.n nVar = this.f482s;
        if (nVar == null) {
            nVar = new androidx.lifecycle.n(this);
            this.f482s = nVar;
        }
        nVar.f(i.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.n nVar = this.f482s;
        if (nVar == null) {
            nVar = new androidx.lifecycle.n(this);
            this.f482s = nVar;
        }
        nVar.f(i.b.ON_DESTROY);
        this.f482s = null;
        super.onStop();
    }
}
