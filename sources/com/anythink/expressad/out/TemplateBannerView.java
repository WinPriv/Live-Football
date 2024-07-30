package com.anythink.expressad.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class TemplateBannerView extends RelativeLayout implements com.anythink.core.common.a.g {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.b.a f10453a;

    /* renamed from: b, reason: collision with root package name */
    private h f10454b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10455c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10456d;

    /* renamed from: e, reason: collision with root package name */
    private String f10457e;

    public TemplateBannerView(Context context) {
        this(context, null);
    }

    public String getRequestId() {
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            return aVar.a();
        }
        return "";
    }

    public void init(i iVar, String str, String str2) {
        com.anythink.expressad.mbbanner.b.a aVar = new com.anythink.expressad.mbbanner.b.a(this, iVar, str, str2);
        this.f10453a = aVar;
        aVar.c(this.f10456d);
        this.f10453a.b(this.f10455c);
    }

    @Override // com.anythink.core.common.a.g
    public boolean isReady() {
        return true;
    }

    public void load(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.b(this.f10455c);
            this.f10453a.a(dVar);
        } else {
            h hVar = this.f10454b;
            if (hVar != null) {
                hVar.a(com.anythink.expressad.mbbanner.a.a.f10264a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void onPause() {
        if (this.f10453a != null && TextUtils.isEmpty(this.f10457e)) {
            this.f10453a.c();
        }
    }

    public void onResume() {
        if (this.f10453a != null && TextUtils.isEmpty(this.f10457e) && !com.anythink.expressad.foundation.f.b.f9758c) {
            this.f10453a.d();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.a(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10456d = z10;
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            if (i10 == 0) {
                a();
            } else {
                aVar.c(false);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10456d = z10;
        if (this.f10453a != null) {
            if (i10 == 0) {
                a();
            } else {
                if (com.anythink.expressad.foundation.f.b.f9758c) {
                    return;
                }
                this.f10453a.c(false);
            }
        }
    }

    public void release() {
        if (this.f10454b != null) {
            this.f10454b = null;
        }
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.a((h) null);
            this.f10453a.b();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z10) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.a(z10);
        }
    }

    public void setBannerAdListener(h hVar) {
        this.f10454b = hVar;
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    public void updateBannerSize(i iVar) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.a(iVar);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(boolean z10) {
        this.f10455c = z10;
        com.anythink.expressad.mbbanner.b.a aVar = this.f10453a;
        if (aVar != null) {
            aVar.b(z10);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10455c = false;
        this.f10456d = false;
        com.anythink.expressad.foundation.b.a.b().b(context);
    }

    private void a() {
        postDelayed(new Runnable() { // from class: com.anythink.expressad.out.TemplateBannerView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (TemplateBannerView.this.f10453a != null && !com.anythink.expressad.foundation.f.b.f9758c) {
                    TemplateBannerView.this.f10453a.c(true);
                }
            }
        }, 200L);
    }
}
