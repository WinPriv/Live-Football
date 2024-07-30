package com.anythink.core.common.b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.res.b;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements ATCustomLoadListener {

    /* renamed from: a, reason: collision with root package name */
    ATCustomLoadListener f5251a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f5252b;

    public o(ATCustomLoadListener aTCustomLoadListener, Map<String, Object> map) {
        this.f5251a = aTCustomLoadListener;
        this.f5252b = map;
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdCacheLoaded(BaseAd... baseAdArr) {
        if (baseAdArr.length > 0) {
            final BaseAd baseAd = baseAdArr[0];
            if (TextUtils.isEmpty(baseAd.getMainImageUrl())) {
                this.f5251a.onAdCacheLoaded(new com.anythink.core.common.e.a.e(baseAd, this.f5252b));
                return;
            } else {
                com.anythink.core.common.res.b.a(n.a().g()).a(new com.anythink.core.common.res.e(2, baseAd.getMainImageUrl()), 0, 0, new b.a() { // from class: com.anythink.core.common.b.o.1
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                        ATCustomLoadListener aTCustomLoadListener = o.this.f5251a;
                        if (aTCustomLoadListener != null) {
                            aTCustomLoadListener.onAdLoadError("10011", "load image fail:".concat(String.valueOf(str2)));
                        }
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        o oVar;
                        ATCustomLoadListener aTCustomLoadListener;
                        if (TextUtils.equals(str, baseAd.getMainImageUrl()) && (aTCustomLoadListener = (oVar = o.this).f5251a) != null) {
                            aTCustomLoadListener.onAdCacheLoaded(new com.anythink.core.common.e.a.e(baseAd, oVar.f5252b));
                        }
                    }
                });
                return;
            }
        }
        ATCustomLoadListener aTCustomLoadListener = this.f5251a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("10011", "load fail with no adObject");
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.f5251a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.f5251a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
