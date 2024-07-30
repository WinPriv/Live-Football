package com.anythink.basead.f;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.MraidBannerAdView;
import com.anythink.basead.ui.SdkBannerAdView;
import com.anythink.core.common.e.j;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.e.a f3974a;

    /* renamed from: k, reason: collision with root package name */
    private final String f3975k;

    public b(Context context, j jVar, String str, boolean z10) {
        super(context, jVar, str, z10);
        this.f3975k = "b";
    }

    @Override // com.anythink.basead.f.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final View b() {
        if (a()) {
            if (this.f3983g.g()) {
                return new MraidBannerAdView(this.f3980c, this.f3981d, this.f3983g, this.f3974a);
            }
            return new SdkBannerAdView(this.f3980c, this.f3981d, this.f3983g, this.f3974a);
        }
        return null;
    }

    @Override // com.anythink.basead.f.c
    public final void c() {
        this.f3974a = null;
    }

    public final void a(com.anythink.basead.e.a aVar) {
        this.f3974a = aVar;
    }
}
