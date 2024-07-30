package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.l;
import com.anythink.core.common.k.u;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PanelView extends RelativeLayout {
    public static final int TYPE_FULL_SCREEN_BANNER = 0;
    public static final int TYPE_FULL_SCREEN_EMPTY_INFO = 8;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_LANDSCAPE = 6;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_PORTRAIT = 1;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_LANDSCAPE = 2;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_PORTRAIT = 5;
    public static final int TYPE_HALF_SCREEN_EMPTY_INFO = 7;
    public static final int TYPE_HALF_SCREEN_HORIZONTAL = 4;
    public static final int TYPE_HALF_SCREEN_VERTICAL = 3;

    /* renamed from: a, reason: collision with root package name */
    private View f4339a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f4340b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f4341c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f4342d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f4343e;
    private Button f;

    /* renamed from: g, reason: collision with root package name */
    private BaseShakeView f4344g;

    /* renamed from: h, reason: collision with root package name */
    private a f4345h;

    /* renamed from: i, reason: collision with root package name */
    private int f4346i;

    /* renamed from: j, reason: collision with root package name */
    private k f4347j;

    /* renamed from: k, reason: collision with root package name */
    private j f4348k;

    /* renamed from: l, reason: collision with root package name */
    private i f4349l;

    /* renamed from: m, reason: collision with root package name */
    private int f4350m;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f4351n;
    private TextView o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f4352p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f4353q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f4354r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4355s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4356t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4357u;

    /* renamed from: v, reason: collision with root package name */
    private List<View> f4358v;

    /* renamed from: w, reason: collision with root package name */
    private final View.OnClickListener f4359w;

    /* renamed from: com.anythink.basead.ui.PanelView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f4363b;

        public AnonymousClass2(String str, ViewGroup.LayoutParams layoutParams) {
            this.f4362a = str;
            this.f4363b = layoutParams;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            PanelView.this.f4341c.setVisibility(8);
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f4362a)) {
                PanelView.this.f4341c.setImageBitmap(bitmap);
                ViewGroup.LayoutParams layoutParams = this.f4363b;
                int i10 = layoutParams.height;
                layoutParams.width = (int) (i10 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                layoutParams.height = i10;
                PanelView.this.f4341c.setLayoutParams(this.f4363b);
                PanelView.this.f4341c.setScaleType(ImageView.ScaleType.FIT_XY);
                PanelView.this.f4341c.setImageBitmap(bitmap);
                PanelView.this.f4341c.setVisibility(0);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PanelView.this.f4359w.onClick(PanelView.this.f);
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements BaseShakeView.a {
        public AnonymousClass8() {
        }

        @Override // com.anythink.basead.ui.BaseShakeView.a
        public final boolean a() {
            return PanelView.this.f4345h.b();
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        boolean b();
    }

    public PanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4350m = 0;
        this.f4355s = false;
        this.f4356t = false;
        this.f4357u = false;
        this.f4359w = new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.f4347j != null) {
                    if (PanelView.this.f4347j.x() == 1) {
                        if (view == PanelView.this.f && PanelView.this.f4345h != null) {
                            PanelView.this.f4345h.a();
                            return;
                        }
                        return;
                    }
                    if (PanelView.this.f4345h != null) {
                        PanelView.this.f4345h.a();
                    }
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f4350m == 0) {
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
            super.dispatchDraw(canvas);
            u.a(canvas, getWidth(), getHeight(), h.a(getContext(), 7.0f));
            canvas.restoreToCount(saveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public View getCTAButton() {
        return this.f;
    }

    public List<View> getClickViews() {
        return this.f4358v;
    }

    public View getShakeView() {
        return this.f4344g;
    }

    public void init(i iVar, j jVar, int i10, boolean z10, a aVar) {
        this.f4345h = aVar;
        this.f4346i = i10;
        this.f4349l = iVar;
        this.f4348k = jVar;
        this.f4347j = jVar.f5664m;
        this.f4357u = z10;
        this.f4355s = iVar.K();
        boolean z11 = true;
        if (this.f4347j.o() != 1) {
            z11 = false;
        }
        this.f4356t = z11;
        this.f4358v = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setLayoutType(int i10) {
        this.f4350m = i10;
        switch (i10) {
            case 1:
                if (TextUtils.isEmpty(this.f4349l.t())) {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_horizontal_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 2:
            case 6:
                if (TextUtils.isEmpty(this.f4349l.t())) {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_landscape_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_landscape", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 3:
                if (this.f4346i == 1) {
                    if (TextUtils.isEmpty(this.f4349l.t())) {
                        this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                        break;
                    } else {
                        this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                        break;
                    }
                } else if (TextUtils.isEmpty(this.f4349l.t())) {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_vertical_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 4:
                if (TextUtils.isEmpty(this.f4349l.t())) {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 5:
                if (TextUtils.isEmpty(this.f4349l.t())) {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_vertical_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 7:
                this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 8:
                this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_full_screen_empty_info", "layout"), (ViewGroup) this, true);
                break;
            default:
                if (TextUtils.isEmpty(this.f4349l.t())) {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_bottom_banner_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f4339a = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
                    break;
                }
        }
        d();
        i iVar = this.f4349l;
        if (this.f4340b != null) {
            String t10 = iVar.t();
            if (!TextUtils.isEmpty(t10)) {
                ViewGroup.LayoutParams layoutParams = this.f4340b.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, t10), layoutParams.width, layoutParams.height, new AnonymousClass1(t10));
            }
            if (TextUtils.isEmpty(iVar.t())) {
                this.f4340b.setVisibility(8);
            }
        }
        if (this.f4341c != null) {
            String v3 = iVar.v();
            if (!TextUtils.isEmpty(v3)) {
                ViewGroup.LayoutParams layoutParams2 = this.f4341c.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, v3), layoutParams2.width, layoutParams2.height, new AnonymousClass2(v3, layoutParams2));
            } else {
                this.f4341c.setVisibility(8);
            }
        }
        if (this.f4343e != null) {
            if (!TextUtils.isEmpty(iVar.s())) {
                this.f4343e.setText(iVar.s());
            } else {
                this.f4343e.setVisibility(8);
            }
        }
        if (this.f4342d != null) {
            if (!TextUtils.isEmpty(iVar.r())) {
                this.f4342d.setText(iVar.r());
            } else {
                this.f4342d.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(iVar.w())) {
            this.f.setText(iVar.w());
        } else {
            this.f.setText(com.anythink.basead.a.e.a(getContext(), this.f4349l));
        }
        b(iVar);
        ImageView imageView = this.f4340b;
        if (imageView != null) {
            imageView.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4340b);
        }
        TextView textView = this.f4342d;
        if (textView != null) {
            textView.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4342d);
        }
        TextView textView2 = this.f4343e;
        if (textView2 != null) {
            textView2.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4343e);
        }
        this.f.setOnClickListener(this.f4359w);
        this.f4358v.add(this.f);
        ImageView imageView2 = this.f4341c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4341c);
        }
        BaseShakeView baseShakeView = this.f4344g;
        if (baseShakeView != null && this.f4357u) {
            baseShakeView.setOnClickListener(new AnonymousClass7());
            this.f4344g.setOnShakeListener(new AnonymousClass8(), this.f4347j);
        }
        View findViewById = this.f4339a.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            findViewById.setOnClickListener(this.f4359w);
            this.f4358v.add(findViewById);
        } else {
            this.f4339a.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4339a);
        }
        ImageView imageView3 = this.f4340b;
        if (imageView3 instanceof RoundImageView) {
            ((RoundImageView) imageView3).setNeedRadiu(true);
            int i11 = this.f4350m;
            if (i11 != 2 && i11 != 6) {
                ((RoundImageView) this.f4340b).setRadiusInDip(12);
            } else {
                ((RoundImageView) this.f4340b).setRadiusInDip(8);
            }
            this.f4340b.invalidate();
        }
    }

    private boolean a() {
        return this.f4355s && !this.f4356t;
    }

    private void b() {
        d();
        i iVar = this.f4349l;
        if (this.f4340b != null) {
            String t10 = iVar.t();
            if (!TextUtils.isEmpty(t10)) {
                ViewGroup.LayoutParams layoutParams = this.f4340b.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, t10), layoutParams.width, layoutParams.height, new AnonymousClass1(t10));
            }
            if (TextUtils.isEmpty(iVar.t())) {
                this.f4340b.setVisibility(8);
            }
        }
        if (this.f4341c != null) {
            String v3 = iVar.v();
            if (!TextUtils.isEmpty(v3)) {
                ViewGroup.LayoutParams layoutParams2 = this.f4341c.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, v3), layoutParams2.width, layoutParams2.height, new AnonymousClass2(v3, layoutParams2));
            } else {
                this.f4341c.setVisibility(8);
            }
        }
        if (this.f4343e != null) {
            if (!TextUtils.isEmpty(iVar.s())) {
                this.f4343e.setText(iVar.s());
            } else {
                this.f4343e.setVisibility(8);
            }
        }
        if (this.f4342d != null) {
            if (!TextUtils.isEmpty(iVar.r())) {
                this.f4342d.setText(iVar.r());
            } else {
                this.f4342d.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(iVar.w())) {
            this.f.setText(iVar.w());
        } else {
            this.f.setText(com.anythink.basead.a.e.a(getContext(), this.f4349l));
        }
        b(iVar);
        ImageView imageView = this.f4340b;
        if (imageView != null) {
            imageView.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4340b);
        }
        TextView textView = this.f4342d;
        if (textView != null) {
            textView.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4342d);
        }
        TextView textView2 = this.f4343e;
        if (textView2 != null) {
            textView2.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4343e);
        }
        this.f.setOnClickListener(this.f4359w);
        this.f4358v.add(this.f);
        ImageView imageView2 = this.f4341c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4341c);
        }
        BaseShakeView baseShakeView = this.f4344g;
        if (baseShakeView != null && this.f4357u) {
            baseShakeView.setOnClickListener(new AnonymousClass7());
            this.f4344g.setOnShakeListener(new AnonymousClass8(), this.f4347j);
        }
        View findViewById = this.f4339a.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            findViewById.setOnClickListener(this.f4359w);
            this.f4358v.add(findViewById);
        } else {
            this.f4339a.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4339a);
        }
        ImageView imageView3 = this.f4340b;
        if (imageView3 instanceof RoundImageView) {
            ((RoundImageView) imageView3).setNeedRadiu(true);
            int i10 = this.f4350m;
            if (i10 != 2 && i10 != 6) {
                ((RoundImageView) this.f4340b).setRadiusInDip(12);
            } else {
                ((RoundImageView) this.f4340b).setRadiusInDip(8);
            }
            this.f4340b.invalidate();
        }
    }

    private void c() {
        ImageView imageView = this.f4340b;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i10 = this.f4350m;
            if (i10 != 2 && i10 != 6) {
                ((RoundImageView) this.f4340b).setRadiusInDip(12);
            } else {
                ((RoundImageView) this.f4340b).setRadiusInDip(8);
            }
            this.f4340b.invalidate();
        }
    }

    private void d() {
        this.f4358v.clear();
        this.f4340b = (ImageView) this.f4339a.findViewById(h.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f4342d = (TextView) this.f4339a.findViewById(h.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f4343e = (TextView) this.f4339a.findViewById(h.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f = (Button) this.f4339a.findViewById(h.a(getContext(), "myoffer_btn_banner_cta", "id"));
        this.f4341c = (ImageView) this.f4339a.findViewById(h.a(getContext(), "myoffer_ad_logo", "id"));
        this.f4351n = (ViewGroup) this.f4339a.findViewById(h.a(getContext(), "myoffer_four_element_container", "id"));
        this.o = (TextView) this.f4339a.findViewById(h.a(getContext(), "myoffer_version_name", "id"));
        this.f4352p = (TextView) this.f4339a.findViewById(h.a(getContext(), "myoffer_publisher_name", "id"));
        this.f4353q = (TextView) this.f4339a.findViewById(h.a(getContext(), "myoffer_permission_manage", "id"));
        this.f4354r = (TextView) this.f4339a.findViewById(h.a(getContext(), "myoffer_privacy_agreement", "id"));
        try {
            this.f4344g = (BaseShakeView) this.f4339a.findViewById(h.a(getContext(), "myoffer_shake_hint_text", "id"));
        } catch (Throwable unused) {
        }
        e();
    }

    private void e() {
        BaseShakeView baseShakeView;
        if (!this.f4357u || (baseShakeView = this.f4344g) == null || this.f4350m == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void f() {
        ImageView imageView = this.f4340b;
        if (imageView != null) {
            imageView.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4340b);
        }
        TextView textView = this.f4342d;
        if (textView != null) {
            textView.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4342d);
        }
        TextView textView2 = this.f4343e;
        if (textView2 != null) {
            textView2.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4343e);
        }
        this.f.setOnClickListener(this.f4359w);
        this.f4358v.add(this.f);
        ImageView imageView2 = this.f4341c;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4341c);
        }
        BaseShakeView baseShakeView = this.f4344g;
        if (baseShakeView != null && this.f4357u) {
            baseShakeView.setOnClickListener(new AnonymousClass7());
            this.f4344g.setOnShakeListener(new AnonymousClass8(), this.f4347j);
        }
        View findViewById = this.f4339a.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            findViewById.setOnClickListener(this.f4359w);
            this.f4358v.add(findViewById);
        } else {
            this.f4339a.setOnClickListener(this.f4359w);
            this.f4358v.add(this.f4339a);
        }
    }

    private void a(i iVar) {
        if (this.f4340b != null) {
            String t10 = iVar.t();
            if (!TextUtils.isEmpty(t10)) {
                ViewGroup.LayoutParams layoutParams = this.f4340b.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, t10), layoutParams.width, layoutParams.height, new AnonymousClass1(t10));
            }
            if (TextUtils.isEmpty(iVar.t())) {
                this.f4340b.setVisibility(8);
            }
        }
        if (this.f4341c != null) {
            String v3 = iVar.v();
            if (!TextUtils.isEmpty(v3)) {
                ViewGroup.LayoutParams layoutParams2 = this.f4341c.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, v3), layoutParams2.width, layoutParams2.height, new AnonymousClass2(v3, layoutParams2));
            } else {
                this.f4341c.setVisibility(8);
            }
        }
        if (this.f4343e != null) {
            if (!TextUtils.isEmpty(iVar.s())) {
                this.f4343e.setText(iVar.s());
            } else {
                this.f4343e.setVisibility(8);
            }
        }
        if (this.f4342d != null) {
            if (!TextUtils.isEmpty(iVar.r())) {
                this.f4342d.setText(iVar.r());
            } else {
                this.f4342d.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(iVar.w())) {
            this.f.setText(iVar.w());
        } else {
            this.f.setText(com.anythink.basead.a.e.a(getContext(), this.f4349l));
        }
        b(iVar);
    }

    private void b(final i iVar) {
        if (a()) {
            this.o.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", com.anythink.expressad.foundation.h.i.f10128g), iVar.G()));
            this.f4352p.setText(iVar.F());
            this.f4354r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.b(n.a().g(), iVar.H());
                }
            });
            this.f4353q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.b(n.a().g(), iVar.I());
                }
            });
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            this.f4352p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            ViewGroup viewGroup = this.f4351n;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.o;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f4352p;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f4354r;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.f4353q;
            if (textView4 != null) {
                textView4.setVisibility(0);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.f4351n;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView5 = this.o;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        TextView textView6 = this.f4352p;
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        TextView textView7 = this.f4354r;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        TextView textView8 = this.f4353q;
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
        try {
            View findViewById = findViewById(h.a(getContext(), "myoffer_four_element_container_bg", "id"));
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(null);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4360a;

        public AnonymousClass1(String str) {
            this.f4360a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f4360a)) {
                PanelView.this.f4340b.setImageBitmap(bitmap);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }
}
