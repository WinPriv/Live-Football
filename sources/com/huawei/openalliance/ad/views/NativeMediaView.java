package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.View;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fx;
import com.huawei.hms.ads.fy;

/* loaded from: classes2.dex */
public abstract class NativeMediaView extends AutoScaleSizeRelativeLayout {

    /* renamed from: c0, reason: collision with root package name */
    public boolean f23709c0;

    /* renamed from: d0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.j f23710d0;

    /* renamed from: e0, reason: collision with root package name */
    public fy f23711e0;

    /* renamed from: f0, reason: collision with root package name */
    public final a f23712f0;
    public boolean y;

    /* loaded from: classes2.dex */
    public class a extends fx {
        public a(View view) {
            super(view);
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code() {
            NativeMediaView.this.Code();
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code(int i10) {
            NativeMediaView.this.Code(i10);
        }

        @Override // com.huawei.hms.ads.fx
        public final void Code(long j10, int i10) {
            NativeMediaView.this.Code(0);
        }
    }

    public NativeMediaView(Context context) {
        super(context);
        this.y = false;
        this.f23709c0 = false;
        this.f23712f0 = new a(this);
    }

    public void Code() {
    }

    public int getAutoPlayAreaPercentageThresshold() {
        return 100;
    }

    public int getHiddenAreaPercentageThreshhold() {
        return 10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f23712f0;
        if (aVar != null) {
            aVar.D();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f23712f0;
        if (aVar != null) {
            aVar.L();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a aVar = this.f23712f0;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNativeAd(com.huawei.openalliance.ad.inter.data.e eVar) {
        com.huawei.openalliance.ad.inter.data.j jVar;
        if (eVar instanceof com.huawei.openalliance.ad.inter.data.j) {
            jVar = (com.huawei.openalliance.ad.inter.data.j) eVar;
        } else {
            jVar = null;
        }
        this.f23710d0 = jVar;
    }

    public void setViewShowAreaListener(fy fyVar) {
        this.f23711e0 = fyVar;
    }

    final void Code(int i10) {
        ex.V("NativeMediaView", "visiblePercentage is " + i10);
        fy fyVar = this.f23711e0;
        if (fyVar != null) {
            fyVar.Code(i10);
        }
        if (i10 >= getAutoPlayAreaPercentageThresshold()) {
            this.f23709c0 = false;
            if (this.y) {
                return;
            }
            this.y = true;
            V();
            return;
        }
        this.y = false;
        int hiddenAreaPercentageThreshhold = getHiddenAreaPercentageThreshhold();
        ex.V("NativeMediaView", "HiddenAreaPercentageThreshhold is " + hiddenAreaPercentageThreshhold);
        if (i10 > 100 - hiddenAreaPercentageThreshhold) {
            if (this.f23709c0) {
                B();
            }
            this.f23709c0 = false;
        } else {
            if (this.f23709c0) {
                return;
            }
            this.f23709c0 = true;
            I();
        }
    }

    public void B() {
    }

    public void I() {
    }

    public void V() {
    }
}
