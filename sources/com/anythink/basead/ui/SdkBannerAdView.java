package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.s;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.l;
import com.anythink.core.common.k.u;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class SdkBannerAdView extends BaseBannerAdView {

    /* renamed from: x, reason: collision with root package name */
    private static final int f4420x = 1;
    private static final int y = 2;
    private final View.OnClickListener A;

    /* renamed from: u, reason: collision with root package name */
    boolean f4421u;

    /* renamed from: v, reason: collision with root package name */
    String f4422v;

    /* renamed from: w, reason: collision with root package name */
    private int f4423w;

    /* renamed from: z, reason: collision with root package name */
    private final View.OnClickListener f4424z;

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass12 implements View.OnClickListener {
        public AnonymousClass12() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.b(n.a().g(), SdkBannerAdView.this.f4120d.H());
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass13 implements View.OnClickListener {
        public AnonymousClass13() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.b(n.a().g(), SdkBannerAdView.this.f4120d.I());
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.b(n.a().g(), SdkBannerAdView.this.f4120d.H());
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            l.b(n.a().g(), SdkBannerAdView.this.f4120d.I());
        }
    }

    public SdkBannerAdView(Context context) {
        super(context);
        this.f4423w = 2;
        this.f4424z = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (2 != SdkBannerAdView.this.f4423w) {
                    SdkBannerAdView.super.b(1);
                    return;
                }
                k kVar = SdkBannerAdView.this.f4119c.f5664m;
                if (kVar != null && kVar.x() == 0) {
                    SdkBannerAdView.super.b(1);
                }
            }
        };
        this.A = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerAdView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerAdView.super.b(1);
            }
        };
    }

    private void b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) a3.l.g(this, "myoffer_banner_root", "id");
        this.f4141t = (CloseImageView) a3.l.g(this, "myoffer_banner_close", "id");
        RelativeLayout relativeLayout2 = (RelativeLayout) a3.l.g(this, "myoffer_banner_container", "id");
        TextView textView = (TextView) a3.l.g(this, "myoffer_banner_publisher_name", "id");
        TextView textView2 = (TextView) a3.l.g(this, "myoffer_banner_privacy_agreement", "id");
        TextView textView3 = (TextView) a3.l.g(this, "myoffer_banner_permission_manage", "id");
        TextView textView4 = (TextView) a3.l.g(this, "myoffer_banner_version_name", "id");
        if (this.f4119c.f5664m.s() == 0) {
            this.f4141t.setVisibility(0);
            if (TextUtils.equals(k.f5669d, this.f4422v)) {
                ViewGroup.LayoutParams layoutParams = this.f4141t.getLayoutParams();
                layoutParams.width = h.a(getContext(), 23.0f);
                layoutParams.height = h.a(getContext(), 23.0f);
                this.f4141t.setLayoutParams(layoutParams);
            }
            a(this.f4141t, this.f4119c.f5664m.h());
        } else {
            this.f4141t.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        relativeLayout.setLayoutParams(layoutParams2);
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(recycleImageView, 0, new RelativeLayout.LayoutParams(-1, -1));
        RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
        recycleImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, str), new AnonymousClass9(str, recycleImageView2, recycleImageView));
        this.f4132r.add(recycleImageView2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        addView(recycleImageView2, 1, layoutParams3);
        if (!TextUtils.isEmpty(this.f4120d.v())) {
            ImageView imageView = (ImageView) a3.l.g(this, "myoffer_banner_self_ad_logo", "id");
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f4120d.v()), new AnonymousClass10(imageView));
            this.f4132r.add(imageView);
        }
        if (this.f4120d.K()) {
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText(this.f4120d.F());
                textView.setOnClickListener(new AnonymousClass11());
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new AnonymousClass12());
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new AnonymousClass13());
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
                textView4.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", i.f10128g), this.f4120d.G()));
                textView4.setOnClickListener(new AnonymousClass14());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0677, code lost:
    
        if (r2.equals(r6) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x071c, code lost:
    
        if (r5.equals(r6) != false) goto L246;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o() {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.SdkBannerAdView.o():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03c4, code lost:
    
        if (r2.equals(com.anythink.core.common.e.k.f5666a) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0455, code lost:
    
        if (r4.equals(com.anythink.core.common.e.k.f5669d) != false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0442  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.SdkBannerAdView.p():void");
    }

    private int a(String str) {
        com.anythink.core.common.e.i iVar = this.f4120d;
        int i10 = 1;
        if (!(iVar instanceof aa) ? !(iVar instanceof s) || TextUtils.isEmpty(str) || !com.anythink.basead.a.b.c.c(str) : ((aa) iVar).Y() != 1) {
            i10 = 2;
        }
        this.f4423w = i10;
        return i10;
    }

    @Override // com.anythink.basead.ui.BaseBannerAdView
    public final void c() {
        int size = this.f4132r.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f4132r.get(i10);
            if (view != null) {
                view.setOnClickListener(this.A);
            }
        }
        setOnClickListener(this.f4424z);
        super.c();
    }

    public SdkBannerAdView(Context context, j jVar, com.anythink.core.common.e.i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
        this.f4423w = 2;
        this.f4424z = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (2 != SdkBannerAdView.this.f4423w) {
                    SdkBannerAdView.super.b(1);
                    return;
                }
                k kVar = SdkBannerAdView.this.f4119c.f5664m;
                if (kVar != null && kVar.x() == 0) {
                    SdkBannerAdView.super.b(1);
                }
            }
        };
        this.A = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerAdView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerAdView.super.b(1);
            }
        };
        b();
        c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0677, code lost:
    
        if (r2.equals(r6) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x071c, code lost:
    
        if (r5.equals(r6) != false) goto L246;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05c6  */
    @Override // com.anythink.basead.ui.BaseAdView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.SdkBannerAdView.a():void");
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 implements View.OnClickListener {
        public AnonymousClass11() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$14, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass14 implements View.OnClickListener {
        public AnonymousClass14() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f4426a;

        public AnonymousClass10(ImageView imageView) {
            this.f4426a = imageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerAdView.this.f4120d.v(), str)) {
                this.f4426a.setImageBitmap(bitmap);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$15, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass15 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f4432a;

        public AnonymousClass15(RoundImageView roundImageView) {
            this.f4432a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerAdView.this.f4120d.t(), str)) {
                this.f4432a.setImageBitmap(bitmap);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f4434a;

        public AnonymousClass2(ImageView imageView) {
            this.f4434a = imageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerAdView.this.f4120d.v(), str)) {
                this.f4434a.setImageBitmap(bitmap);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f4436a;

        public AnonymousClass3(RoundImageView roundImageView) {
            this.f4436a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerAdView.this.f4120d.u(), str)) {
                this.f4436a.setImageBitmap(bitmap);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SdkBannerAdView$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecycleImageView f4444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecycleImageView f4445c;

        public AnonymousClass9(String str, RecycleImageView recycleImageView, RecycleImageView recycleImageView2) {
            this.f4443a = str;
            this.f4444b = recycleImageView;
            this.f4445c = recycleImageView2;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(this.f4443a, str)) {
                this.f4444b.setImageBitmap(bitmap);
                SdkBannerAdView.this.post(new Runnable() { // from class: com.anythink.basead.ui.SdkBannerAdView.9.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int[] a10 = u.a(SdkBannerAdView.this.getWidth(), SdkBannerAdView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                        ViewGroup.LayoutParams layoutParams = AnonymousClass9.this.f4444b.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a10[0];
                            layoutParams.height = a10[1];
                            AnonymousClass9.this.f4444b.setLayoutParams(layoutParams);
                        }
                    }
                });
                this.f4445c.setImageBitmap(com.anythink.core.common.k.b.a(SdkBannerAdView.this.getContext(), bitmap));
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }
}
