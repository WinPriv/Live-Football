package com.vungle.warren.omsdk;

import android.webkit.WebView;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.vungle.warren.BuildConfig;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class OMTracker implements WebViewObserver {
    static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private AdSession adSession;
    private final boolean enabled;
    private boolean started;

    /* loaded from: classes2.dex */
    public static class Factory {
        public OMTracker make(boolean z10) {
            return new OMTracker(z10);
        }
    }

    @Override // com.vungle.warren.omsdk.WebViewObserver
    public void onPageFinished(WebView webView) {
        if (this.started && this.adSession == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView, null, null));
            this.adSession = createAdSession;
            createAdSession.registerAdView(webView);
            this.adSession.start();
        }
    }

    public void start() {
        if (this.enabled && Omid.isActive()) {
            this.started = true;
        }
    }

    public long stop() {
        long j10;
        AdSession adSession;
        if (this.started && (adSession = this.adSession) != null) {
            adSession.finish();
            j10 = DESTROY_DELAY_MS;
        } else {
            j10 = 0;
        }
        this.started = false;
        this.adSession = null;
        return j10;
    }

    private OMTracker(boolean z10) {
        this.enabled = z10;
    }
}
