package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;

/* loaded from: classes.dex */
public final class b extends d {
    private AnythinkVideoView ag;
    private AnythinkContainerView ah;

    public b(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.c cVar3, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i10, boolean z10) {
        super(cVar, cVar3, cVar2, str, str2, aVar, i10, z10);
        this.ag = anythinkVideoView;
        this.ah = anythinkContainerView;
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.W = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.d, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i10, Object obj) {
        if (this.W) {
            if (i10 != 8) {
                if (i10 != 107) {
                    if (i10 != 112) {
                        if (i10 == 115) {
                            this.ah.resizeMiniCard(this.ag.getBorderViewWidth(), this.ag.getBorderViewHeight(), this.ag.getBorderViewRadius());
                        }
                    } else {
                        this.ag.setCover(true);
                        this.ag.videoOperate(2);
                    }
                } else {
                    this.ah.showVideoClickView(-1);
                    this.ag.setCover(false);
                    this.ag.videoOperate(1);
                }
            } else {
                AnythinkContainerView anythinkContainerView = this.ah;
                if (anythinkContainerView != null) {
                    if (!anythinkContainerView.showAlertWebView()) {
                        AnythinkVideoView anythinkVideoView = this.ag;
                        if (anythinkVideoView != null) {
                            anythinkVideoView.showAlertView();
                        }
                    } else {
                        AnythinkVideoView anythinkVideoView2 = this.ag;
                        if (anythinkVideoView2 != null) {
                            anythinkVideoView2.alertWebViewShowed();
                        }
                    }
                } else {
                    AnythinkVideoView anythinkVideoView3 = this.ag;
                    if (anythinkVideoView3 != null) {
                        anythinkVideoView3.showAlertView();
                    }
                }
            }
        }
        super.a(i10, obj);
    }
}
