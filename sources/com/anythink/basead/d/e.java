package com.anythink.basead.d;

import android.content.Context;
import com.anythink.basead.d.b;
import com.anythink.core.common.e.j;

/* loaded from: classes.dex */
public final class e extends b {
    public e(Context context, b.a aVar, j jVar) {
        super(context, aVar, jVar);
    }

    public final void a(final com.anythink.basead.e.d dVar) {
        super.a(new com.anythink.basead.e.c() { // from class: com.anythink.basead.d.e.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                e eVar = e.this;
                h hVar = new h(eVar.f3860b, eVar.f3863e, eVar.f3861c, eVar.f);
                com.anythink.basead.e.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.onNativeAdLoaded(hVar);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                com.anythink.basead.e.d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.onNativeAdLoadError(eVar);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }
        });
    }
}
