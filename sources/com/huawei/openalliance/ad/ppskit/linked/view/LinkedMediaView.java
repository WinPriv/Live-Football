package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout;
import ka.f7;
import ka.n7;
import ka.o9;

/* loaded from: classes2.dex */
public abstract class LinkedMediaView extends AutoScaleSizeRelativeLayout {

    /* renamed from: x, reason: collision with root package name */
    public boolean f22676x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final a f22677z;

    /* loaded from: classes2.dex */
    public class a extends o9 {
        public a(View view) {
            super(view);
        }

        @Override // ka.o9
        public final void a() {
            LinkedMediaView.this.r();
        }

        @Override // ka.o9
        public final void b(int i10) {
            LinkedMediaView.this.a(i10);
        }

        @Override // ka.o9
        public final void c(long j10, int i10) {
            LinkedMediaView.this.a(0);
        }
    }

    public LinkedMediaView(Context context) {
        super(context);
        this.f22676x = false;
        this.y = false;
        this.f22677z = new a(this);
    }

    final void a(int i10) {
        n7.e("LinkedMediaView", "visiblePercentage is " + i10);
        if (i10 >= getAutoPlayAreaPercentageThresshold()) {
            this.y = false;
            if (!this.f22676x) {
                this.f22676x = true;
                f();
                return;
            }
            return;
        }
        this.f22676x = false;
        int hiddenAreaPercentageThreshhold = getHiddenAreaPercentageThreshhold();
        n7.e("LinkedMediaView", "HiddenAreaPercentageThreshhold is " + hiddenAreaPercentageThreshhold);
        if (i10 <= 100 - hiddenAreaPercentageThreshhold) {
            if (!this.y) {
                this.y = true;
                g();
                return;
            }
            return;
        }
        if (this.y) {
            h();
        }
        this.y = false;
    }

    public int getAutoPlayAreaPercentageThresshold() {
        return 100;
    }

    public int getHiddenAreaPercentageThreshhold() {
        return 10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f22677z;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f22677z;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a aVar = this.f22677z;
        if (aVar != null) {
            n7.e(aVar.f31599s, "onViewVisibilityChanged");
            aVar.f();
        }
    }

    public void setLinkedNativeAd(f7 f7Var) {
        boolean z10 = f7Var instanceof f7;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void r() {
    }
}
