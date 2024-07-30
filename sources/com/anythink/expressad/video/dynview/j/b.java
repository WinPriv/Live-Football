package com.anythink.expressad.video.dynview.j;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.dynview.widget.AnyThinkFramLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkRelativeLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.video.module.AnythinkClickCTAView;
import com.anythink.expressad.video.widget.SoundImageView;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f11531a = "anythink_top_play_bg";

    /* renamed from: b, reason: collision with root package name */
    private String f11532b = "anythink_top_finger_bg";

    /* renamed from: c, reason: collision with root package name */
    private String f11533c = "anythink_bottom_play_bg";

    /* renamed from: d, reason: collision with root package name */
    private String f11534d = "anythink_bottom_finger_bg";

    /* renamed from: e, reason: collision with root package name */
    private String f11535e = "anythink_tv_count";
    private String f = "anythink_sound_switch";

    /* renamed from: g, reason: collision with root package name */
    private String f11536g = "anythink_top_control";

    /* renamed from: h, reason: collision with root package name */
    private String f11537h = "anythink_tv_title";

    /* renamed from: i, reason: collision with root package name */
    private String f11538i = "anythink_tv_desc";

    /* renamed from: j, reason: collision with root package name */
    private String f11539j = "anythink_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private String f11540k = "anythink_sv_starlevel";

    /* renamed from: l, reason: collision with root package name */
    private String f11541l = "anythink_sv_heat_count_level";

    /* renamed from: m, reason: collision with root package name */
    private String f11542m = "anythink_tv_cta";

    /* renamed from: n, reason: collision with root package name */
    private String f11543n = "anythink_native_ec_controller";
    private String o = "anythink_reward_shape_choice_rl";

    /* renamed from: p, reason: collision with root package name */
    private String f11544p = "#FFFFFF";

    /* renamed from: q, reason: collision with root package name */
    private String f11545q = "#FF000000";

    /* renamed from: r, reason: collision with root package name */
    private String f11546r = "#40000000";

    /* renamed from: s, reason: collision with root package name */
    private String f11547s = "#CAEF79";

    /* renamed from: t, reason: collision with root package name */
    private String f11548t = "#2196F3";

    /* renamed from: u, reason: collision with root package name */
    private String f11549u = "#402196F3";

    /* renamed from: v, reason: collision with root package name */
    private String f11550v = "#8FC31F";

    /* renamed from: w, reason: collision with root package name */
    private String f11551w = "#03A9F4";

    /* renamed from: x, reason: collision with root package name */
    private boolean f11552x = false;

    private static void a() {
    }

    private void b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f11536g));
        if (relativeLayout != null) {
            if (com.anythink.expressad.video.dynview.a.b.f11403a == 0 && com.anythink.expressad.video.dynview.a.b.f11404b == 0 && com.anythink.expressad.video.dynview.a.b.f11405c == 0 && com.anythink.expressad.video.dynview.a.b.f11406d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private void d(View view, com.anythink.expressad.video.dynview.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f11543n));
        if (relativeLayout != null) {
            if (cVar.e() == 1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.f11403a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.f11405c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.f11404b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.f11406d);
                relativeLayout.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.f11403a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.f11405c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.f11404b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.f11406d);
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void c(View view, com.anythink.expressad.video.dynview.c cVar) {
        if (view != null && cVar != null) {
            if (view.getContext() != null) {
                this.f11552x = false;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(a(this.f11540k));
                View findViewById = view.findViewById(a(this.f11542m));
                if (linearLayout != null && (linearLayout instanceof AnyThinkLevelLayoutView)) {
                    if (cVar.e() == 1) {
                        linearLayout.setOrientation(1);
                    } else {
                        linearLayout.setOrientation(0);
                    }
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f11543n));
                if (relativeLayout != null) {
                    if (cVar.e() == 1) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.f11403a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.f11405c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.f11404b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.f11406d);
                        relativeLayout.setLayoutParams(layoutParams);
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.f11403a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.f11405c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.f11404b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.f11406d);
                        relativeLayout.setLayoutParams(layoutParams2);
                    }
                }
                if (findViewById != null) {
                    if (findViewById instanceof TextView) {
                        TextView textView = (TextView) findViewById;
                        textView.setTextColor(Color.parseColor(this.f11544p));
                        textView.setTextSize(25.0f);
                        String str = this.f11547s;
                        com.anythink.expressad.video.dynview.i.b.a.a(findViewById, 1.0f, 5.0f, str, new String[]{this.f11550v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    new com.anythink.expressad.video.dynview.h.b();
                    animatorSet.playTogether(com.anythink.expressad.video.dynview.h.b.c(findViewById));
                    if (view instanceof AnyThinkFramLayout) {
                        ((AnyThinkFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof AnyThinkRelativeLayout) {
                        ((AnyThinkRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
            new com.anythink.expressad.video.dynview.h.b();
            com.anythink.expressad.video.dynview.h.b.e(view);
        }
    }

    public final void a(View view) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        if (view == null || !(view instanceof AnyThinkFramLayout)) {
            return;
        }
        AnyThinkFramLayout anyThinkFramLayout = (AnyThinkFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            this.f11552x = false;
            ImageView imageView = (ImageView) view.findViewById(a(this.f11531a));
            ImageView imageView2 = (ImageView) view.findViewById(a(this.f11532b));
            ImageView imageView3 = (ImageView) view.findViewById(a(this.f11533c));
            ImageView imageView4 = (ImageView) view.findViewById(a(this.f11534d));
            ObjectAnimator objectAnimator4 = null;
            if (imageView != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator = com.anythink.expressad.video.dynview.h.b.a(imageView);
            } else {
                objectAnimator = null;
            }
            if (imageView2 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator2 = com.anythink.expressad.video.dynview.h.b.b(imageView2);
            } else {
                objectAnimator2 = null;
            }
            if (imageView3 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator3 = com.anythink.expressad.video.dynview.h.b.a(imageView3);
            } else {
                objectAnimator3 = null;
            }
            if (imageView4 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator4 = com.anythink.expressad.video.dynview.h.b.b(imageView4);
            }
            if (objectAnimator == null || objectAnimator3 == null || objectAnimator2 == null || objectAnimator4 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimator, objectAnimator3, objectAnimator2, objectAnimator4);
            anyThinkFramLayout.setAnimatorSet(animatorSet);
        }
    }

    public final void b(View view, com.anythink.expressad.video.dynview.c cVar) {
        Context context;
        int b10;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.e() == 1) {
            view.setBackgroundDrawable(context.getResources().getDrawable(i.a(context, this.o, i.f10125c)));
            TextView textView = (TextView) view.findViewById(a(this.f11537h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f11545q));
            }
            TextView textView2 = (TextView) view.findViewById(a(this.f11538i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f11545q));
            }
            b10 = t.b(context, 2.0f);
        } else {
            b10 = t.b(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int b11 = t.b(context, 8.0f);
        View findViewById = view.findViewById(a(this.f11539j));
        if (findViewById != null) {
            if (cVar.f() != null && (cVar.f() instanceof AnythinkClickCTAView)) {
                new com.anythink.expressad.video.dynview.h.b();
                ((AnythinkClickCTAView) cVar.f()).setObjectAnimator(com.anythink.expressad.video.dynview.h.b.c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.f11544p));
                textView3.setTextSize(15.0f);
                String str = this.f11547s;
                com.anythink.expressad.video.dynview.i.b.a.a(textView3, 1.0f, 5.0f, str, new String[]{this.f11550v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(b10, b10, b10, b11);
            layoutParams.height = t.b(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void a(View view, com.anythink.expressad.video.dynview.c cVar) {
        String str;
        String str2;
        float f;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        this.f11552x = false;
        TextView textView = (TextView) view.findViewById(a(this.f11535e));
        TextView textView2 = (TextView) view.findViewById(a("anythink_reward_click_tv"));
        if (textView != null) {
            textView.setBackgroundResource(i.a(context, "anythink_reward_shape_progress", i.f10125c));
            textView.setTextColor(Color.parseColor(this.f11544p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof AnyThinkTextView) {
                new com.anythink.expressad.video.dynview.h.b();
                ((AnyThinkTextView) textView2).setObjectAnimator(com.anythink.expressad.video.dynview.h.b.c(textView2));
            }
        }
        String str3 = this.f11545q;
        String str4 = this.f11547s;
        int i10 = cVar.i();
        float f10 = 1.0f;
        if (i10 == 302) {
            str = this.f11548t;
            str2 = this.f11551w;
            str3 = this.f11544p;
            str4 = this.f11549u;
            f = 10.0f;
        } else if (i10 != 802) {
            str = this.f11550v;
            str2 = this.f11547s;
            f = 5.0f;
        } else {
            str = this.f11544p;
            str3 = this.f11545q;
            str4 = this.f11546r;
            f = 25.0f;
            f10 = 0.5f;
            str2 = str;
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str3));
            com.anythink.expressad.video.dynview.i.b.a.a(textView2, f10, f, str4, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (cVar.f() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.f().getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            cVar.f().setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f11536g));
        if (relativeLayout != null) {
            if (com.anythink.expressad.video.dynview.a.b.f11403a == 0 && com.anythink.expressad.video.dynview.a.b.f11404b == 0 && com.anythink.expressad.video.dynview.a.b.f11405c == 0 && com.anythink.expressad.video.dynview.a.b.f11406d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private void a(Context context, View view, com.anythink.expressad.video.dynview.c cVar) {
        SoundImageView soundImageView = (SoundImageView) view.findViewById(a(this.f));
        int b10 = t.b(context, 60.0f);
        int b11 = t.b(context, 10.0f);
        if (soundImageView != null) {
            cVar.e();
            ((FrameLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(b11, 0, 0, b10);
        }
    }

    private static int a(String str) {
        return i.a(n.a().g(), str, "id");
    }
}
