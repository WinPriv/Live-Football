package com.anythink.basead.f;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.ui.AsseblemSplashAdView;
import com.anythink.basead.ui.BaseSdkSplashAdView;
import com.anythink.basead.ui.BaseSplashAdView;
import com.anythink.basead.ui.SinglePictureSplashAdView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.e.a f4007a;

    /* renamed from: k, reason: collision with root package name */
    BaseSplashAdView f4008k;

    /* renamed from: l, reason: collision with root package name */
    boolean f4009l;

    public g(Context context, j jVar, String str) {
        super(context, jVar, str, false);
    }

    @Override // com.anythink.basead.f.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final void b() {
        this.f4009l = true;
    }

    public final void f() {
        this.f4007a = null;
        BaseSplashAdView baseSplashAdView = this.f4008k;
        if (baseSplashAdView != null) {
            baseSplashAdView.destroy();
            this.f4008k = null;
        }
    }

    public final void a(final ViewGroup viewGroup) {
        n.a().a(new Runnable() { // from class: com.anythink.basead.f.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                if (BaseSdkSplashAdView.isSinglePicture(gVar.f3983g, gVar.f3981d.f5664m)) {
                    g gVar2 = g.this;
                    Context context = viewGroup.getContext();
                    g gVar3 = g.this;
                    gVar2.f4008k = new SinglePictureSplashAdView(context, gVar3.f3981d, gVar3.f3983g, gVar3.f4007a);
                } else {
                    g gVar4 = g.this;
                    Context context2 = viewGroup.getContext();
                    g gVar5 = g.this;
                    gVar4.f4008k = new AsseblemSplashAdView(context2, gVar5.f3981d, gVar5.f3983g, gVar5.f4007a);
                }
                g gVar6 = g.this;
                gVar6.f4008k.setDontCountDown(gVar6.f4009l);
                viewGroup.addView(g.this.f4008k);
            }
        });
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.f4007a = aVar;
    }

    @Override // com.anythink.basead.f.c, com.anythink.basead.f.a
    public final boolean a() {
        try {
            if (d()) {
                return com.anythink.basead.f.a.a.a(this.f3980c).a(this.f3983g, this.f3981d, this.f);
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
