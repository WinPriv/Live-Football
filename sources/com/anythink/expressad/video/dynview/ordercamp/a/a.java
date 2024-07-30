package com.anythink.expressad.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.dynview.h.b;
import com.anythink.expressad.video.dynview.widget.ATRotationView;
import com.anythink.expressad.video.dynview.widget.AnyThinkImageView;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11556a = "OrderCampAdapter";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11557e = "anythink_lv_item_rl";
    private static final String f = "anythink_lv_iv";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11558g = "anythink_lv_icon_iv";

    /* renamed from: h, reason: collision with root package name */
    private static final String f11559h = "anythink_lv_title_tv";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11560i = "anythink_lv_tv_install";

    /* renamed from: j, reason: collision with root package name */
    private static final String f11561j = "anythink_lv_sv_starlevel";

    /* renamed from: k, reason: collision with root package name */
    private static final String f11562k = "anythink_lv_sv_heat_level";

    /* renamed from: l, reason: collision with root package name */
    private static final String f11563l = "anythink_lv_ration";

    /* renamed from: m, reason: collision with root package name */
    private static final String f11564m = "anythink_lv_desc_tv";

    /* renamed from: n, reason: collision with root package name */
    private static final String f11565n = "anythink_iv_flag";
    private static final String o = "anythink_order_viewed_tv";

    /* renamed from: p, reason: collision with root package name */
    private static final String f11566p = "anythink_order_layout_item";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11567q = "anythink_lv_iv_burl";

    /* renamed from: r, reason: collision with root package name */
    private static final String f11568r = "501";

    /* renamed from: s, reason: collision with root package name */
    private static final String f11569s = "\\.xml";

    /* renamed from: t, reason: collision with root package name */
    private static final String f11570t = "\\/xml";

    /* renamed from: u, reason: collision with root package name */
    private static final String f11571u = "_item.xml";

    /* renamed from: b, reason: collision with root package name */
    private boolean f11572b = false;

    /* renamed from: c, reason: collision with root package name */
    private C0138a f11573c;

    /* renamed from: d, reason: collision with root package name */
    private List<c> f11574d;

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11578a;

        public AnonymousClass2(Context context) {
            this.f11578a = context;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                int b10 = t.b(this.f11578a, 12.0f);
                a.this.f11573c.f11588j.getLayoutParams().height = b10;
                a.this.f11573c.f11588j.getLayoutParams().width = (int) (b10 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                a.this.f11573c.f11588j.setImageBitmap(bitmap);
                a.this.f11573c.f11588j.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0138a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f11580a;

        /* renamed from: b, reason: collision with root package name */
        ATRotationView f11581b;

        /* renamed from: c, reason: collision with root package name */
        AnyThinkImageView f11582c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f11583d;

        /* renamed from: e, reason: collision with root package name */
        TextView f11584e;
        TextView f;

        /* renamed from: g, reason: collision with root package name */
        TextView f11585g;

        /* renamed from: h, reason: collision with root package name */
        TextView f11586h;

        /* renamed from: i, reason: collision with root package name */
        AnyThinkLevelLayoutView f11587i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f11588j;
    }

    public a(List<c> list) {
        this.f11574d = list;
    }

    private View b() {
        View inflate = LayoutInflater.from(n.a().g()).inflate(i.a(n.a().g().getApplicationContext(), f11566p, "layout"), (ViewGroup) null);
        C0138a c0138a = new C0138a();
        this.f11573c = c0138a;
        c0138a.f11582c = (AnyThinkImageView) inflate.findViewById(b(f));
        this.f11573c.f11583d = (RoundImageView) inflate.findViewById(b(f11558g));
        this.f11573c.f11587i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f11561j));
        this.f11573c.f11581b = (ATRotationView) inflate.findViewById(b(f11563l));
        inflate.setTag(this.f11573c);
        return inflate;
    }

    private static int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    private int d(String str) {
        if (this.f11572b) {
            return c(str);
        }
        return b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<c> list = this.f11574d;
        if (list != null && list.size() > 0) {
            return this.f11574d.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        List<c> list = this.f11574d;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            if (view == null) {
                View inflate = LayoutInflater.from(n.a().g()).inflate(i.a(n.a().g().getApplicationContext(), f11566p, "layout"), (ViewGroup) null);
                C0138a c0138a = new C0138a();
                this.f11573c = c0138a;
                c0138a.f11582c = (AnyThinkImageView) inflate.findViewById(b(f));
                this.f11573c.f11583d = (RoundImageView) inflate.findViewById(b(f11558g));
                this.f11573c.f11587i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f11561j));
                this.f11573c.f11581b = (ATRotationView) inflate.findViewById(b(f11563l));
                inflate.setTag(this.f11573c);
                view = inflate;
            } else {
                this.f11573c = (C0138a) view.getTag();
            }
            this.f11573c.f11580a = (RelativeLayout) view.findViewById(d(f11557e));
            this.f11573c.f11584e = (TextView) view.findViewById(d(f11559h));
            this.f11573c.f11585g = (TextView) view.findViewById(d(f11560i));
            this.f11573c.f = (TextView) view.findViewById(d(f11564m));
            this.f11573c.f11588j = (ImageView) view.findViewById(d(f11565n));
            this.f11573c.f11586h = (TextView) view.findViewById(d(o));
            List<c> list = this.f11574d;
            if (list != null && this.f11573c != null && list.size() != 0) {
                AnyThinkImageView anyThinkImageView = this.f11573c.f11582c;
                if (anyThinkImageView != null) {
                    a(anyThinkImageView, this.f11574d.get(i10).be(), false);
                }
                RoundImageView roundImageView = this.f11573c.f11583d;
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(25);
                    a(this.f11573c.f11583d, this.f11574d.get(i10).bd(), true);
                }
                double aX = this.f11574d.get(i10).aX();
                if (aX <= 0.0d) {
                    aX = 5.0d;
                }
                AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f11573c.f11587i;
                if (anyThinkLevelLayoutView != null) {
                    anyThinkLevelLayoutView.setRatingAndUser(aX, this.f11574d.get(i10).aY());
                    this.f11573c.f11587i.setOrientation(0);
                }
                ATRotationView aTRotationView = this.f11573c.f11581b;
                if (aTRotationView != null) {
                    aTRotationView.setWidthRatio(1.0f);
                    this.f11573c.f11581b.setHeightRatio(1.0f);
                    this.f11573c.f11581b.setAutoscroll(false);
                }
                AnyThinkImageView anyThinkImageView2 = this.f11573c.f11582c;
                if (anyThinkImageView2 != null) {
                    anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                }
            }
            if (this.f11573c != null) {
                c cVar = this.f11574d.get(i10);
                if (this.f11573c.f11584e != null) {
                    this.f11573c.f11584e.setText(cVar.bb());
                }
                if (this.f11573c.f != null) {
                    this.f11573c.f.setText(cVar.bc());
                }
                TextView textView = this.f11573c.f11585g;
                if (textView != null) {
                    String str = cVar.cU;
                    if (textView instanceof AnyThinkTextView) {
                        new b();
                        ((AnyThinkTextView) this.f11573c.f11585g).setObjectAnimator(b.c(this.f11573c.f11585g));
                    }
                    this.f11573c.f11585g.setText(str);
                }
                if (this.f11573c.f11588j != null) {
                    try {
                        Locale.getDefault().getLanguage();
                        Context g6 = n.a().g();
                        com.anythink.expressad.foundation.g.d.b.a(g6).a(cVar.aE(), new AnonymousClass2(g6));
                    } catch (Exception e10) {
                        o.d(f11556a, e10.getMessage());
                    }
                }
                if (this.f11573c.f11586h != null) {
                    try {
                        this.f11573c.f11586h.setText(n.a().g().getResources().getString(n.a().g().getResources().getIdentifier("anythink_reward_viewed_text_str", i.f10128g, n.a().g().getPackageName())));
                        this.f11573c.f11586h.setVisibility(0);
                    } catch (Exception e11) {
                        o.d(f11556a, e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            o.d(f11556a, e12.getMessage());
        }
        return view;
    }

    private void a(int i10) {
        List<c> list = this.f11574d;
        if (list == null || this.f11573c == null || list.size() == 0) {
            return;
        }
        AnyThinkImageView anyThinkImageView = this.f11573c.f11582c;
        if (anyThinkImageView != null) {
            a(anyThinkImageView, this.f11574d.get(i10).be(), false);
        }
        RoundImageView roundImageView = this.f11573c.f11583d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f11573c.f11583d, this.f11574d.get(i10).bd(), true);
        }
        double aX = this.f11574d.get(i10).aX();
        if (aX <= 0.0d) {
            aX = 5.0d;
        }
        AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f11573c.f11587i;
        if (anyThinkLevelLayoutView != null) {
            anyThinkLevelLayoutView.setRatingAndUser(aX, this.f11574d.get(i10).aY());
            this.f11573c.f11587i.setOrientation(0);
        }
        ATRotationView aTRotationView = this.f11573c.f11581b;
        if (aTRotationView != null) {
            aTRotationView.setWidthRatio(1.0f);
            this.f11573c.f11581b.setHeightRatio(1.0f);
            this.f11573c.f11581b.setAutoscroll(false);
        }
        AnyThinkImageView anyThinkImageView2 = this.f11573c.f11582c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private static int b(String str) {
        return i.a(n.a().g().getApplicationContext(), str, "id");
    }

    private void b(int i10) {
        if (this.f11573c != null) {
            c cVar = this.f11574d.get(i10);
            if (this.f11573c.f11584e != null) {
                this.f11573c.f11584e.setText(cVar.bb());
            }
            if (this.f11573c.f != null) {
                this.f11573c.f.setText(cVar.bc());
            }
            TextView textView = this.f11573c.f11585g;
            if (textView != null) {
                String str = cVar.cU;
                if (textView instanceof AnyThinkTextView) {
                    new b();
                    ((AnyThinkTextView) this.f11573c.f11585g).setObjectAnimator(b.c(this.f11573c.f11585g));
                }
                this.f11573c.f11585g.setText(str);
            }
            if (this.f11573c.f11588j != null) {
                try {
                    Locale.getDefault().getLanguage();
                    Context g6 = n.a().g();
                    com.anythink.expressad.foundation.g.d.b.a(g6).a(cVar.aE(), new AnonymousClass2(g6));
                } catch (Exception e10) {
                    o.d(f11556a, e10.getMessage());
                }
            }
            if (this.f11573c.f11586h != null) {
                try {
                    this.f11573c.f11586h.setText(n.a().g().getResources().getString(n.a().g().getResources().getIdentifier("anythink_reward_viewed_text_str", i.f10128g, n.a().g().getPackageName())));
                    this.f11573c.f11586h.setVisibility(0);
                } catch (Exception e11) {
                    o.d(f11556a, e11.getMessage());
                }
            }
        }
    }

    private void a(View view) {
        this.f11573c.f11580a = (RelativeLayout) view.findViewById(d(f11557e));
        this.f11573c.f11584e = (TextView) view.findViewById(d(f11559h));
        this.f11573c.f11585g = (TextView) view.findViewById(d(f11560i));
        this.f11573c.f = (TextView) view.findViewById(d(f11564m));
        this.f11573c.f11588j = (ImageView) view.findViewById(d(f11565n));
        this.f11573c.f11586h = (TextView) view.findViewById(d(o));
    }

    private void a(final ImageView imageView, String str, final boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.ordercamp.a.a.1
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str2) {
                    try {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        imageView.setImageBitmap(bitmap);
                    } catch (Throwable th) {
                        o.d(a.f11556a, th.getMessage());
                    }
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str2, String str3) {
                    if (z10) {
                        imageView.setVisibility(8);
                    }
                }
            });
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private static int a(String str) {
        return i.a(n.a().g().getApplicationContext(), str, "layout");
    }

    private View a() {
        View inflate = LayoutInflater.from(n.a().g()).inflate(i.a(n.a().g().getApplicationContext(), f11566p, "layout"), (ViewGroup) null);
        C0138a c0138a = new C0138a();
        this.f11573c = c0138a;
        c0138a.f11582c = (AnyThinkImageView) inflate.findViewById(b(f));
        this.f11573c.f11583d = (RoundImageView) inflate.findViewById(b(f11558g));
        this.f11573c.f11587i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f11561j));
        this.f11573c.f11581b = (ATRotationView) inflate.findViewById(b(f11563l));
        inflate.setTag(this.f11573c);
        return inflate;
    }
}
