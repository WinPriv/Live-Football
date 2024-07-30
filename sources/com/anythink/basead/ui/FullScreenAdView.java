package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.h;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class FullScreenAdView extends BaseScreenAdView {
    public static final String TAG = "FullScreenAdView";
    private GuideToClickView ae;

    public FullScreenAdView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void A() {
        if (this.f4164u) {
            C();
            return;
        }
        if (1 == ((BaseScreenAdView) this).f4158a && !this.f4165v) {
            double ceil = Math.ceil(this.f4119c.f5664m.e() / 1000.0d);
            if (this.f4167x != null) {
                double ceil2 = Math.ceil(r4.getVideoLength() / 1000.0d);
                if (ceil > ceil2) {
                    ceil = ceil2;
                }
            }
            RewardExitConfirmDialogActivity.a(getContext(), String.valueOf((int) ceil), new Runnable() { // from class: com.anythink.basead.ui.FullScreenAdView.2
                @Override // java.lang.Runnable
                public final void run() {
                    FullScreenAdView.this.B();
                    FullScreenAdView.this.C();
                }
            });
            return;
        }
        B();
        p();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void D() {
        super.D();
        a(this.R, this.S);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void H() {
        int a10;
        if (this.f4166w != null && this.f4168z != null) {
            this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            if (n()) {
                this.f4166w.addView(this.f4168z, 3);
                return;
            }
            if (c(this.Q)) {
                int i10 = this.Q;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 == 8) {
                                    if (this.f4119c.f5664m.x() != 0) {
                                        BaseShakeView baseShakeView = this.R;
                                        if (baseShakeView != null) {
                                            baseShakeView.setVisibility(8);
                                        }
                                        BaseShakeView baseShakeView2 = this.S;
                                        if (baseShakeView2 != null) {
                                            baseShakeView2.setVisibility(8);
                                        }
                                        View shakeView = this.y.getShakeView();
                                        if (m()) {
                                            if (shakeView != null) {
                                                shakeView.setVisibility(0);
                                            }
                                        } else if (shakeView != null) {
                                            shakeView.setVisibility(8);
                                        }
                                    } else if (m()) {
                                        BaseShakeView baseShakeView3 = this.S;
                                        if (baseShakeView3 != null) {
                                            baseShakeView3.setVisibility(0);
                                        }
                                    } else {
                                        BaseShakeView baseShakeView4 = this.S;
                                        if (baseShakeView4 != null) {
                                            baseShakeView4.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        } else {
                            int i11 = this.D;
                            int i12 = (int) (i11 * 0.5f);
                            this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(-1, i11 - i12));
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = this.C;
                                layoutParams.height = i12;
                                this.y.setLayoutParams(layoutParams);
                                this.y.removeAllViews();
                                this.y.setLayoutType(this.Q);
                            }
                        }
                    }
                    int a11 = h.a(getContext(), 300.0f);
                    this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(this.C - a11, -1));
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = a11;
                        layoutParams2.height = -1;
                        this.y.setLayoutParams(layoutParams2);
                        this.y.removeAllViews();
                        this.y.setLayoutType(this.Q);
                    }
                } else {
                    this.f4166w.setBackgroundColor(-1);
                    int i13 = (int) (this.D * 0.5f);
                    if (TextUtils.isEmpty(this.f4120d.t())) {
                        a10 = this.D - i13;
                    } else {
                        a10 = (this.D - i13) + h.a(getContext(), 50.0f);
                    }
                    this.f4168z.setLayoutParams(new RelativeLayout.LayoutParams(-1, i13));
                    this.f4168z.setNeedArc(true);
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.width = this.C;
                        layoutParams3.height = a10;
                        this.y.setLayoutParams(layoutParams3);
                        this.y.removeAllViews();
                        this.y.setLayoutType(this.Q);
                    }
                }
            }
            this.f4166w.addView(this.f4168z, 3);
            if (((BaseScreenAdView) this).f4158a == 1) {
                RoundImageView roundImageView = new RoundImageView(getContext());
                roundImageView.setImageResource(h.a(getContext(), "myoffer_reward_icon", i.f10125c));
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(h.a(getContext(), 60.0f), h.a(getContext(), 60.0f));
                if (c(this.Q)) {
                    int i14 = this.Q;
                    if (i14 != 2 && i14 != 6) {
                        layoutParams4.leftMargin = h.a(getContext(), 12.0f);
                        layoutParams4.topMargin = h.a(getContext(), 12.0f);
                    } else {
                        layoutParams4.leftMargin = this.C - h.a(getContext(), 330.0f);
                        layoutParams4.topMargin = h.a(getContext(), 22.0f);
                    }
                } else {
                    layoutParams4.leftMargin = h.a(getContext(), 12.0f);
                    layoutParams4.topMargin = h.a(getContext(), 12.0f);
                }
                roundImageView.setLayoutParams(layoutParams4);
                RelativeLayout relativeLayout = this.f4166w;
                relativeLayout.addView(roundImageView, relativeLayout.getChildCount() - 2);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void I() {
        BaseShakeView baseShakeView;
        GuideToClickView guideToClickView;
        PlayerView playerView = this.f4167x;
        if (playerView != null) {
            this.f4166w.removeView(playerView);
            this.f4167x = null;
        }
        CountDownView countDownView = this.H;
        if (countDownView != null) {
            countDownView.setVisibility(8);
        }
        this.I.setClickAreaScaleFactor(this.N);
        MuteImageView muteImageView = this.K;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
        BaseShakeView baseShakeView2 = this.R;
        if (baseShakeView2 != null) {
            baseShakeView2.setVisibility(8);
        }
        BaseShakeView baseShakeView3 = this.S;
        if (baseShakeView3 != null && this.Q != 8) {
            baseShakeView3.setVisibility(8);
        }
        if (this.f4119c.f5664m.i() == 1 && !getHasPerformClick() && (guideToClickView = this.ae) != null) {
            guideToClickView.setVisibility(0);
            this.ae.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenAdView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FullScreenAdView.this.b(1);
                }
            });
        }
        if (n()) {
            PanelView panelView = this.y;
            if (panelView != null) {
                panelView.setVisibility(8);
            }
            if (m() && (baseShakeView = this.S) != null) {
                baseShakeView.setVisibility(0);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void J() {
        this.O = this.C;
        this.P = this.D;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void b(int i10) {
        super.b(i10);
        GuideToClickView guideToClickView = this.ae;
        if (guideToClickView != null) {
            guideToClickView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final boolean c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 5 && i10 != 6) {
            if (i10 == 8) {
                return true;
            }
            return false;
        }
        return com.anythink.basead.a.e.a(this.f4120d);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public void init() {
        this.R = (BaseShakeView) findViewById(h.a(getContext(), "myoffer_shake_view", "id"));
        this.S = (BaseShakeView) findViewById(h.a(getContext(), "myoffer_shake_border_view", "id"));
        o();
        this.ae = (GuideToClickView) findViewById(h.a(getContext(), "myoffer_guide_to_click_view", "id"));
        super.init();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final int q() {
        int i10 = this.Q;
        if (i10 == 8) {
            return i10;
        }
        if (this.C < this.D) {
            if (this.f4161ac >= this.f4162ad) {
                return 1;
            }
            return 5;
        }
        if (this.f4161ac < this.f4162ad) {
            return 2;
        }
        return 6;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void w() {
        if (this.y != null) {
            if (!com.anythink.basead.a.e.a(this.f4120d)) {
                this.Q = 8;
            } else {
                this.Q = 0;
            }
            this.y.setLayoutType(this.Q);
            if (this.Q == 8 && this.f4119c.f5664m.x() == 0) {
                this.y.getCTAButton().setVisibility(8);
            }
        }
    }

    public FullScreenAdView(Context context, j jVar, com.anythink.core.common.e.i iVar, String str, int i10, int i11) {
        super(context, jVar, iVar, str, i10, i11);
        setId(h.a(getContext(), "myoffer_full_screen_view_id", "id"));
        this.G = 0;
    }
}
