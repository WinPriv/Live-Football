package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.h;

/* loaded from: classes.dex */
public class HalfScreenAdView extends BaseScreenAdView {
    public static final String TAG = "HalfScreenAdView";
    private int ae;
    private RelativeLayout af;

    public HalfScreenAdView(Context context) {
        super(context);
    }

    private void K() {
        if (!com.anythink.basead.a.e.a(this.f4120d)) {
            this.ae = 7;
        } else if (L()) {
            this.ae = 3;
        } else {
            this.ae = 4;
        }
    }

    private boolean L() {
        if (this.f4159aa <= this.f4160ab) {
            return true;
        }
        return false;
    }

    private boolean M() {
        if (!com.anythink.basead.a.e.a(this.f4120d)) {
            return true;
        }
        return false;
    }

    private void N() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f4166w.getLayoutParams();
        int i15 = layoutParams2.leftMargin;
        int i16 = layoutParams2.rightMargin;
        int i17 = layoutParams2.topMargin;
        int i18 = layoutParams2.bottomMargin;
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f4167x.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
        int b10 = h.b(getContext());
        if (b10 <= 0) {
            b10 = h.a(getContext(), 25.0f);
        }
        int i19 = this.ae;
        if (i19 == 7) {
            if (this.f4163t == 2) {
                i10 = (this.D - i17) - i18;
                i11 = (int) (i10 * 1.75f);
                i12 = h.a(getContext(), 120.0f);
                if (i17 < b10) {
                    layoutParams2.topMargin = (int) (b10 * 1.1f);
                }
                layoutParams2.width = i11;
                this.f4166w.setLayoutParams(layoutParams2);
            } else if (L()) {
                i11 = (this.C - i15) - i16;
                i10 = (int) (i11 / 0.5714286f);
                i12 = h.a(getContext(), 240.0f);
            } else {
                i11 = (this.C - i15) - i16;
                i10 = (int) (i11 / 1.032258f);
                i12 = h.a(getContext(), 120.0f);
            }
            this.O = i11;
            this.P = i10;
        } else {
            int i20 = 0;
            if (i19 == 3) {
                if (this.f4163t == 1) {
                    View findViewById = this.y.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                    if (findViewById != null) {
                        i20 = ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).topMargin;
                    }
                    i11 = (this.C - i15) - i16;
                    float f = i11;
                    i10 = (int) (f / 0.5714286f);
                    if (this.D < (h.a(getContext(), 28.0f) * 2) + i10) {
                        i12 = (int) (f / 1.8181819f);
                        this.O = i11;
                        this.P = (i10 - i12) + i20;
                    } else {
                        this.O = i11;
                        i13 = (int) (i11 / 0.8f);
                        this.P = i13;
                        i12 = (i10 - i13) + i20;
                    }
                } else {
                    if (i17 < b10) {
                        i17 = (int) (b10 * 1.1f);
                        layoutParams2.topMargin = i17;
                    }
                    i10 = (this.D - i17) - i18;
                    i11 = (int) (i10 * 1.6f);
                    this.P = i10;
                    int i21 = (int) (i10 * 0.56f);
                    this.O = i21;
                    i14 = i11 - i21;
                    layoutParams2.width = i11;
                    this.f4166w.setLayoutParams(layoutParams2);
                    i12 = i10;
                }
            } else {
                View findViewById2 = this.y.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                if (findViewById2 != null) {
                    i20 = ((RelativeLayout.LayoutParams) findViewById2.getLayoutParams()).topMargin;
                }
                if (this.f4163t == 1) {
                    i11 = (this.C - i15) - i16;
                    i10 = (int) (i11 / 1.032258f);
                    this.O = i11;
                    i13 = (int) (i11 / 2.0f);
                    this.P = i13;
                    i12 = (i10 - i13) + i20;
                } else {
                    if (i17 < b10) {
                        i17 = (int) (b10 * 1.1f);
                        layoutParams2.topMargin = i17;
                    }
                    i10 = (this.D - i17) - i18;
                    i11 = (int) (i10 * 1.032258f);
                    this.O = i11;
                    int i22 = (int) (i11 / 2.0f);
                    this.P = i22;
                    i12 = (i10 - i22) + i20;
                    layoutParams2.width = i11;
                    this.f4166w.setLayoutParams(layoutParams2);
                }
            }
            layoutParams4.width = i11;
            layoutParams4.height = i10;
            this.af.setLayoutParams(layoutParams4);
            layoutParams3.width = this.O;
            layoutParams3.height = this.P;
            this.f4167x.setLayoutParams(layoutParams3);
            layoutParams.width = i14;
            layoutParams.height = i12;
            this.y.setLayoutParams(layoutParams);
        }
        i14 = i11;
        layoutParams4.width = i11;
        layoutParams4.height = i10;
        this.af.setLayoutParams(layoutParams4);
        layoutParams3.width = this.O;
        layoutParams3.height = this.P;
        this.f4167x.setLayoutParams(layoutParams3);
        layoutParams.width = i14;
        layoutParams.height = i12;
        this.y.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void A() {
        super.B();
        super.C();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void H() {
        if (this.af != null && this.f4168z != null) {
            this.af.addView(this.f4168z, 1, this.f4167x.getLayoutParams());
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void I() {
        PlayerView playerView = this.f4167x;
        if (playerView != null) {
            this.af.removeView(playerView);
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
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void J() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        int i10;
        int i11;
        int i12;
        int i13;
        RelativeLayout.LayoutParams layoutParams3;
        RelativeLayout.LayoutParams layoutParams4;
        int b10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        try {
            layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
            layoutParams2 = (RelativeLayout.LayoutParams) this.f4166w.getLayoutParams();
            i10 = layoutParams2.leftMargin;
            i11 = layoutParams2.rightMargin;
            i12 = layoutParams2.topMargin;
            i13 = layoutParams2.bottomMargin;
            layoutParams3 = (RelativeLayout.LayoutParams) this.f4167x.getLayoutParams();
            layoutParams4 = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
            b10 = h.b(getContext());
            if (b10 <= 0) {
                b10 = h.a(getContext(), 25.0f);
            }
            i14 = this.ae;
        } catch (Throwable th) {
            th.printStackTrace();
            return;
        }
        if (i14 == 7) {
            if (this.f4163t == 2) {
                i15 = (this.D - i12) - i13;
                i16 = (int) (i15 * 1.75f);
                i17 = h.a(getContext(), 120.0f);
                if (i12 < b10) {
                    layoutParams2.topMargin = (int) (b10 * 1.1f);
                }
                layoutParams2.width = i16;
                this.f4166w.setLayoutParams(layoutParams2);
            } else if (L()) {
                i16 = (this.C - i10) - i11;
                i15 = (int) (i16 / 0.5714286f);
                i17 = h.a(getContext(), 240.0f);
            } else {
                i16 = (this.C - i10) - i11;
                i15 = (int) (i16 / 1.032258f);
                i17 = h.a(getContext(), 120.0f);
            }
            this.O = i16;
            this.P = i15;
        } else {
            int i20 = 0;
            if (i14 == 3) {
                if (this.f4163t == 1) {
                    View findViewById = this.y.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                    if (findViewById != null) {
                        i20 = ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).topMargin;
                    }
                    i16 = (this.C - i10) - i11;
                    float f = i16;
                    i15 = (int) (f / 0.5714286f);
                    if (this.D < (h.a(getContext(), 28.0f) * 2) + i15) {
                        i17 = (int) (f / 1.8181819f);
                        this.O = i16;
                        this.P = (i15 - i17) + i20;
                    } else {
                        this.O = i16;
                        i18 = (int) (i16 / 0.8f);
                        this.P = i18;
                        i17 = (i15 - i18) + i20;
                    }
                } else {
                    if (i12 < b10) {
                        i12 = (int) (b10 * 1.1f);
                        layoutParams2.topMargin = i12;
                    }
                    i15 = (this.D - i12) - i13;
                    i16 = (int) (i15 * 1.6f);
                    this.P = i15;
                    int i21 = (int) (i15 * 0.56f);
                    this.O = i21;
                    i19 = i16 - i21;
                    layoutParams2.width = i16;
                    this.f4166w.setLayoutParams(layoutParams2);
                    i17 = i15;
                    layoutParams4.width = i16;
                    layoutParams4.height = i15;
                    this.af.setLayoutParams(layoutParams4);
                    layoutParams3.width = this.O;
                    layoutParams3.height = this.P;
                    this.f4167x.setLayoutParams(layoutParams3);
                    layoutParams.width = i19;
                    layoutParams.height = i17;
                    this.y.setLayoutParams(layoutParams);
                }
            } else {
                View findViewById2 = this.y.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                if (findViewById2 != null) {
                    i20 = ((RelativeLayout.LayoutParams) findViewById2.getLayoutParams()).topMargin;
                }
                if (this.f4163t == 1) {
                    i16 = (this.C - i10) - i11;
                    i15 = (int) (i16 / 1.032258f);
                    this.O = i16;
                    i18 = (int) (i16 / 2.0f);
                    this.P = i18;
                    i17 = (i15 - i18) + i20;
                } else {
                    if (i12 < b10) {
                        i12 = (int) (b10 * 1.1f);
                        layoutParams2.topMargin = i12;
                    }
                    i15 = (this.D - i12) - i13;
                    i16 = (int) (i15 * 1.032258f);
                    this.O = i16;
                    int i22 = (int) (i16 / 2.0f);
                    this.P = i22;
                    i17 = (i15 - i22) + i20;
                    layoutParams2.width = i16;
                    this.f4166w.setLayoutParams(layoutParams2);
                }
            }
            th.printStackTrace();
            return;
        }
        i19 = i16;
        layoutParams4.width = i16;
        layoutParams4.height = i15;
        this.af.setLayoutParams(layoutParams4);
        layoutParams3.width = this.O;
        layoutParams3.height = this.P;
        this.f4167x.setLayoutParams(layoutParams3);
        layoutParams.width = i19;
        layoutParams.height = i17;
        this.y.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void a() {
        int i10 = this.ae;
        if (i10 != 3) {
            if (i10 != 7) {
                LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_horizontal", "layout"), this);
                return;
            } else {
                LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_empty_info", "layout"), this);
                return;
            }
        }
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_vertical", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void b() {
        super.b();
        this.af = (RelativeLayout) this.f4166w.findViewById(h.a(getContext(), "myoffer_rl_container", "id"));
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final boolean c(int i10) {
        return true;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void d() {
        super.d();
        if (!com.anythink.basead.a.e.a(this.f4120d)) {
            this.ae = 7;
        } else if (L()) {
            this.ae = 3;
        } else {
            this.ae = 4;
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final int q() {
        return this.Q;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void w() {
        PanelView panelView = this.y;
        if (panelView != null) {
            int i10 = this.ae;
            this.Q = i10;
            panelView.setLayoutType(i10);
            if (this.ae == 7) {
                if (this.f4119c.f5664m.x() == 0) {
                    this.y.getCTAButton().setVisibility(8);
                }
                if (m()) {
                    this.R = (BaseShakeView) findViewById(h.a(getContext(), "myoffer_shake_view", "id"));
                    this.S = (BaseShakeView) findViewById(h.a(getContext(), "myoffer_shake_border_view", "id"));
                    o();
                    a(this.R, this.S);
                }
            }
        }
        super.E();
    }

    public HalfScreenAdView(Context context, j jVar, i iVar, String str, int i10, int i11) {
        super(context, jVar, iVar, str, i10, i11);
        setId(h.a(getContext(), "myoffer_half_screen_view_id", "id"));
        this.G = 1;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void F() {
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void y() {
    }
}
