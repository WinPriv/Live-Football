package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import com.anythink.expressad.video.module.AnythinkContainerView;

/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: k, reason: collision with root package name */
    private AnythinkContainerView f11936k;

    public k(AnythinkContainerView anythinkContainerView) {
        this.f11936k = anythinkContainerView;
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void configurationChanged(int i10, int i11, int i12) {
        super.configurationChanged(i10, i11, i12);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.configurationChanged(i10, i11, i12);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean endCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        AnythinkContainerView anythinkContainerView = this.f11936k;
        if (anythinkContainerView != null) {
            anythinkContainerView.hideAlertWebview();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void install(com.anythink.expressad.foundation.d.c cVar) {
        super.install(cVar);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.install(cVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        AnythinkContainerView anythinkContainerView = this.f11936k;
        if (anythinkContainerView != null) {
            anythinkContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean miniCardLoaded() {
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardLoaded();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardLoaded();
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean miniCardShowing() {
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                return anythinkContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.f
    public final void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        super.preLoadData(bVar);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.preLoadData(bVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public final void readyStatus(int i10) {
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.readyStatus(i10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i10);
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void resizeMiniCard(int i10, int i11, int i12) {
        super.resizeMiniCard(i10, i11, i12);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.resizeMiniCard(i10, i11, i12);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        AnythinkContainerView anythinkContainerView = this.f11936k;
        if (anythinkContainerView != null) {
            return anythinkContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showEndcard(int i10) {
        super.showEndcard(i10);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showEndcard(i10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        super.showMiniCard(i10, i11, i12, i13, i14);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showMiniCard(i10, i11, i12, i13, i14);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showPlayableView() {
        super.showPlayableView();
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.showPlayableView();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.e
    public final void showVideoClickView(int i10) {
        super.showVideoClickView(i10);
        AnythinkContainerView anythinkContainerView = this.f11936k;
        if (anythinkContainerView != null) {
            anythinkContainerView.showVideoClickView(i10);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void toggleCloseBtn(int i10) {
        super.toggleCloseBtn(i10);
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.toggleCloseBtn(i10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.video.signal.a.d, com.anythink.expressad.video.signal.h
    public final void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.f11936k;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
