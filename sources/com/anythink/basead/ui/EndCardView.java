package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.u;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes.dex */
public class EndCardView extends BaseEndCardView {

    /* renamed from: e, reason: collision with root package name */
    private a f4247e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f4248g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f4249h;

    /* renamed from: i, reason: collision with root package name */
    private RoundImageView f4250i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f4251j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f4252k;

    /* renamed from: l, reason: collision with root package name */
    private final View.OnClickListener f4253l;

    /* renamed from: com.anythink.basead.ui.EndCardView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f4255a;

        public AnonymousClass2(i iVar) {
            this.f4255a = iVar;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            if (EndCardView.this.f4247e != null) {
                EndCardView.this.f4247e.b();
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, this.f4255a.u())) {
                EndCardView.this.f4249h.setImageBitmap(bitmap);
                EndCardView.this.post(new Runnable() { // from class: com.anythink.basead.ui.EndCardView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int[] a10 = u.a(EndCardView.this.getWidth(), EndCardView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                        ViewGroup.LayoutParams layoutParams = EndCardView.this.f4249h.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a10[0];
                            layoutParams.height = a10[1];
                            EndCardView.this.f4249h.setLayoutParams(layoutParams);
                        }
                        if (EndCardView.this.f4247e != null) {
                            EndCardView.this.f4247e.b();
                        }
                    }
                });
                EndCardView.this.f4250i.setImageBitmap(com.anythink.core.common.k.b.a(EndCardView.this.getContext(), bitmap));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public EndCardView(Context context, i iVar, j jVar) {
        super(context, iVar, jVar);
        this.f4253l = new View.OnClickListener() { // from class: com.anythink.basead.ui.EndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k kVar = EndCardView.this.f4147d;
                if (kVar != null) {
                    if (kVar.x() == 0) {
                        if (EndCardView.this.f4247e != null) {
                            EndCardView.this.f4247e.a();
                        }
                    } else if (EndCardView.this.f4252k != null && EndCardView.this.f4252k.isShown() && view == EndCardView.this.f4252k && EndCardView.this.f4247e != null) {
                        EndCardView.this.f4247e.a();
                    }
                }
            }
        };
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
    }

    public View getLearnMoreButton() {
        return this.f4252k;
    }

    public void init(boolean z10, boolean z11, a aVar) {
        setId(h.a(getContext(), "myoffer_end_card_id", "id"));
        this.f4247e = aVar;
        RoundImageView roundImageView = new RoundImageView(getContext());
        this.f4250i = roundImageView;
        roundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f4249h = new RoundImageView(getContext());
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f, this.f4248g);
        layoutParams2.addRule(13);
        addView(this.f4250i, layoutParams);
        addView(this.f4249h, layoutParams2);
        if (z10) {
            i iVar = this.f4145b;
            this.f4251j = new RoundImageView(getContext());
            int a10 = h.a(getContext(), 12.0f);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, a10);
            layoutParams3.addRule(11);
            layoutParams3.addRule(12);
            addView(this.f4251j, layoutParams3);
            String v3 = iVar.v();
            if (!TextUtils.isEmpty(v3)) {
                ViewGroup.LayoutParams layoutParams4 = this.f4251j.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, v3), layoutParams4.width, layoutParams4.height, new AnonymousClass3(v3, a10));
            }
        }
        if (z11) {
            ScanningAnimTextView scanningAnimTextView = new ScanningAnimTextView(getContext());
            this.f4252k = scanningAnimTextView;
            scanningAnimTextView.setText(h.a(getContext(), "myoffer_cta_learn_more", com.anythink.expressad.foundation.h.i.f10128g));
            this.f4252k.setTextColor(Color.parseColor("#ffffffff"));
            this.f4252k.setTextSize(14.0f);
            this.f4252k.setGravity(17);
            this.f4252k.setBackgroundResource(h.a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", com.anythink.expressad.foundation.h.i.f10125c));
            this.f4252k.setOnClickListener(this.f4253l);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, h.a(getContext(), 48.0f));
            layoutParams5.addRule(12);
            layoutParams5.bottomMargin = h.a(getContext(), 96.0f);
            layoutParams5.leftMargin = h.a(getContext(), 24.0f);
            layoutParams5.rightMargin = h.a(getContext(), 24.0f);
            addView(this.f4252k, layoutParams5);
        }
        setOnClickListener(this.f4253l);
    }

    public void load() {
        i iVar = this.f4145b;
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, iVar.u()), this.f, this.f4248g, new AnonymousClass2(iVar));
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setSize(int i10, int i11) {
        this.f = i10;
        this.f4248g = i11;
    }

    private void b(i iVar) {
        this.f4251j = new RoundImageView(getContext());
        int a10 = h.a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, a10);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.f4251j, layoutParams);
        String v3 = iVar.v();
        if (TextUtils.isEmpty(v3)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f4251j.getLayoutParams();
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, v3), layoutParams2.width, layoutParams2.height, new AnonymousClass3(v3, a10));
    }

    private void a(i iVar) {
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, iVar.u()), this.f, this.f4248g, new AnonymousClass2(iVar));
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
    }

    private void b() {
        ScanningAnimTextView scanningAnimTextView = new ScanningAnimTextView(getContext());
        this.f4252k = scanningAnimTextView;
        scanningAnimTextView.setText(h.a(getContext(), "myoffer_cta_learn_more", com.anythink.expressad.foundation.h.i.f10128g));
        this.f4252k.setTextColor(Color.parseColor("#ffffffff"));
        this.f4252k.setTextSize(14.0f);
        this.f4252k.setGravity(17);
        this.f4252k.setBackgroundResource(h.a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", com.anythink.expressad.foundation.h.i.f10125c));
        this.f4252k.setOnClickListener(this.f4253l);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, h.a(getContext(), 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = h.a(getContext(), 96.0f);
        layoutParams.leftMargin = h.a(getContext(), 24.0f);
        layoutParams.rightMargin = h.a(getContext(), 24.0f);
        addView(this.f4252k, layoutParams);
    }

    /* renamed from: com.anythink.basead.ui.EndCardView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4260b;

        public AnonymousClass3(String str, int i10) {
            this.f4259a = str;
            this.f4260b = i10;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f4259a)) {
                int i10 = this.f4260b;
                ViewGroup.LayoutParams layoutParams = EndCardView.this.f4251j.getLayoutParams();
                layoutParams.width = (int) (i10 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                layoutParams.height = i10;
                EndCardView.this.f4251j.setLayoutParams(layoutParams);
                EndCardView.this.f4251j.setScaleType(ImageView.ScaleType.FIT_XY);
                EndCardView.this.f4251j.setImageBitmap(bitmap);
            }
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }
    }
}
