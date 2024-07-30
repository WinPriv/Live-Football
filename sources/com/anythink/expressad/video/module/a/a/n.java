package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.factory.IJSFactory;

/* loaded from: classes.dex */
public final class n extends o {
    private IJSFactory ag;
    private int ai;
    private boolean aj;
    private int ak;
    private boolean al;

    public n(IJSFactory iJSFactory, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.c cVar3, String str, String str2, int i10, int i11, com.anythink.expressad.video.module.a.a aVar, int i12, boolean z10, int i13) {
        super(cVar, cVar2, cVar3, str, str2, aVar, i12, z10);
        boolean z11;
        this.aj = false;
        this.al = false;
        this.ag = iJSFactory;
        this.ai = i10;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.aj = z11;
        this.ak = i13;
        if (iJSFactory == null) {
            this.W = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.o, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i10, Object obj) {
        Integer num;
        int i11;
        if (this.W) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 5) {
                        int i12 = 6;
                        if (i10 != 6) {
                            if (i10 != 8) {
                                if (i10 != 114) {
                                    if (i10 != 116) {
                                        switch (i10) {
                                            case 10:
                                                this.al = true;
                                                this.ag.getJSNotifyProxy().a(0);
                                                break;
                                            case 11:
                                            case 12:
                                                this.ag.getJSVideoModule().videoOperate(3);
                                                if (this.X.F() != 3) {
                                                    if (this.X.f() != 2) {
                                                        this.ag.getJSVideoModule().setVisible(8);
                                                    }
                                                } else {
                                                    this.ag.getJSVideoModule().setVisible(0);
                                                }
                                                if (i10 == 12) {
                                                    f();
                                                    i11 = 2;
                                                } else {
                                                    i11 = 1;
                                                }
                                                this.ag.getJSNotifyProxy().a(i11);
                                                if (this.ag.getJSCommon().m() == 2) {
                                                    this.ag.getJSVideoModule().setVisible(0);
                                                    com.anythink.expressad.video.signal.j jSVideoModule = this.ag.getJSVideoModule();
                                                    this.ag.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                } else if (i10 == 12) {
                                                    if (this.ak == 1) {
                                                        if (this.X.f() != 2) {
                                                            this.ag.getJSContainerModule().showEndcard(this.X.F());
                                                        } else {
                                                            this.ag.getJSContainerModule().showVideoEndCover();
                                                        }
                                                    }
                                                } else if (this.X.f() != 2) {
                                                    this.ag.getJSContainerModule().showEndcard(this.X.F());
                                                } else {
                                                    this.ag.getJSContainerModule().showVideoEndCover();
                                                }
                                                this.ag.getJSVideoModule().dismissAllAlert();
                                                if (i10 == 12 && !this.al && this.ak == 1) {
                                                    f();
                                                    e();
                                                    d();
                                                    c();
                                                    break;
                                                }
                                                break;
                                            case 13:
                                                if (!this.ag.getJSVideoModule().isH5Canvas()) {
                                                    this.ag.getJSVideoModule().closeVideoOperate(0, 2);
                                                }
                                                this.ag.getJSNotifyProxy().a(-1);
                                                break;
                                            case 14:
                                                if (!this.aj) {
                                                    this.ag.getJSVideoModule().closeVideoOperate(0, 1);
                                                    break;
                                                }
                                                break;
                                            case 15:
                                                if (obj != null && (obj instanceof AnythinkVideoView.a)) {
                                                    this.aj = true;
                                                    this.ag.getJSNotifyProxy().a((AnythinkVideoView.a) obj);
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (i10) {
                                                    case 123:
                                                    case 124:
                                                        com.anythink.expressad.video.signal.g jSNotifyProxy = this.ag.getJSNotifyProxy();
                                                        if (i10 == 123) {
                                                            i12 = 7;
                                                        }
                                                        jSNotifyProxy.a(i12, "");
                                                        break;
                                                    case 125:
                                                        this.ag.getJSContainerModule().hideAlertWebview();
                                                        break;
                                                }
                                        }
                                    } else {
                                        com.anythink.expressad.video.signal.j jSVideoModule2 = this.ag.getJSVideoModule();
                                        this.ag.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                    }
                                } else if (this.ag.getJSCommon().m() == 2) {
                                    com.anythink.expressad.video.signal.j jSVideoModule3 = this.ag.getJSVideoModule();
                                    this.ag.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                }
                            } else if (!this.ag.getJSContainerModule().showAlertWebView()) {
                                this.ag.getJSVideoModule().showAlertView();
                            } else {
                                this.ag.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.ag.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.ag.getJSNotifyProxy().a(5, String.valueOf(num));
                    }
                }
                this.ag.getJSVideoModule().dismissAllAlert();
                if (i10 == 2) {
                    this.ag.getJSNotifyProxy().a(2, "");
                }
                this.ag.getJSVideoModule().videoOperate(3);
                if (this.ag.getJSCommon().m() != 2) {
                    if (this.X.F() != 3) {
                        this.ag.getJSVideoModule().setVisible(8);
                    } else {
                        this.ag.getJSVideoModule().setVisible(0);
                    }
                    if (this.ai == 2 && !this.ag.getJSContainerModule().endCardShowing() && this.X.f() != 2) {
                        this.ag.getJSContainerModule().showEndcard(this.X.F());
                        this.ag.getJSNotifyProxy().a(1);
                    }
                }
                i10 = 16;
                this.ag.getJSNotifyProxy().a(1);
            } else if (!this.ag.getJSContainerModule().endCardShowing()) {
                this.ag.getJSNotifyProxy().a(1, "");
            }
        }
        super.a(i10, obj);
    }
}
