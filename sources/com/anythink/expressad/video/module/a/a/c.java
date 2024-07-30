package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.signal.factory.IJSFactory;

/* loaded from: classes.dex */
public final class c extends d {
    private IJSFactory ag;

    public c(IJSFactory iJSFactory, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.c cVar3, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i10, boolean z10) {
        super(cVar, cVar3, cVar2, str, str2, aVar, i10, z10);
        this.ag = iJSFactory;
        if (iJSFactory == null) {
            this.W = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.d, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i10, Object obj) {
        if (this.W) {
            if (i10 != 8) {
                if (i10 != 105) {
                    if (i10 != 107) {
                        if (i10 != 112) {
                            if (i10 == 115) {
                                com.anythink.expressad.video.signal.j jSVideoModule = this.ag.getJSVideoModule();
                                this.ag.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                            }
                        } else {
                            this.ag.getJSVideoModule().setCover(true);
                            this.ag.getJSVideoModule().videoOperate(2);
                        }
                    } else {
                        this.ag.getJSContainerModule().showVideoClickView(-1);
                        this.ag.getJSVideoModule().setCover(false);
                        this.ag.getJSVideoModule().videoOperate(1);
                    }
                } else {
                    this.ag.getJSNotifyProxy().a(3, obj.toString());
                    i10 = -1;
                }
            } else if (!this.ag.getJSContainerModule().showAlertWebView()) {
                this.ag.getJSVideoModule().showAlertView();
            } else {
                this.ag.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.a(i10, obj);
    }
}
