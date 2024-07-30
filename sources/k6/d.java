package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f30879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30882e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f30882e = bottomAppBar;
        this.f30879b = actionMenuView;
        this.f30880c = i10;
        this.f30881d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f30878a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        if (!this.f30878a) {
            BottomAppBar bottomAppBar = this.f30882e;
            int i10 = bottomAppBar.A0;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0) {
                bottomAppBar.A0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i10);
            }
            bottomAppBar.B(this.f30879b, this.f30880c, this.f30881d, z10);
        }
    }
}
