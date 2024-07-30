package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.BaseMediaAdView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.l;
import com.anythink.core.common.k.u;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MediaAdView extends BaseMediaAdView {
    public static final String TAG = "anythink_MediaAdView";

    /* renamed from: g, reason: collision with root package name */
    RelativeLayout f4279g;

    /* renamed from: h, reason: collision with root package name */
    RelativeLayout f4280h;

    /* renamed from: i, reason: collision with root package name */
    TextView f4281i;

    /* renamed from: j, reason: collision with root package name */
    TextView f4282j;

    /* renamed from: k, reason: collision with root package name */
    TextView f4283k;

    /* renamed from: l, reason: collision with root package name */
    TextView f4284l;

    /* renamed from: m, reason: collision with root package name */
    final float f4285m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f4286n;
    private TextView o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f4287p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f4288q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView f4289r;

    /* renamed from: s, reason: collision with root package name */
    private RoundImageView f4290s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f4291t;

    public MediaAdView(Context context, i iVar, j jVar, boolean z10, BaseMediaAdView.a aVar) {
        super(context, iVar, jVar, z10, aVar);
        this.f4285m = 1.0f;
    }

    @Override // com.anythink.basead.ui.BaseMediaAdView
    public List<View> getClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f4286n);
        arrayList.add(this.f4288q);
        arrayList.add(this.o);
        arrayList.add(this.f4290s);
        arrayList.add(this.f4291t);
        k kVar = this.f4150b;
        if (kVar != null && kVar.x() == 0) {
            arrayList.add(this.f4287p);
            arrayList.add(this.f4279g);
        }
        return arrayList;
    }

    @Override // com.anythink.basead.ui.BaseMediaAdView
    public View getMonitorClickView() {
        return this.o;
    }

    @Override // com.anythink.basead.ui.BaseMediaAdView
    public void init(int i10, int i11) {
        View findViewById;
        super.init(i10, i11);
        View inflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_media_ad_view", "layout"), (ViewGroup) null, false);
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f4286n = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_title", "id"));
        this.o = (TextView) findViewById(h.a(getContext(), "myoffer_media_ad_cta", "id"));
        this.f4287p = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_bg_blur", "id"));
        this.f4288q = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_main_image", "id"));
        this.f4289r = (ImageView) findViewById(h.a(getContext(), "myoffer_ad_logo", "id"));
        this.f4290s = (RoundImageView) findViewById(h.a(getContext(), "myoffer_media_ad_icon", "id"));
        this.f4291t = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_desc", "id"));
        this.f4279g = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_media_ad_container", "id"));
        this.f4280h = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_four_element_container", "id"));
        this.f4281i = (TextView) findViewById(h.a(getContext(), "myoffer_publisher_name", "id"));
        this.f4282j = (TextView) findViewById(h.a(getContext(), "myoffer_privacy_agreement", "id"));
        this.f4283k = (TextView) findViewById(h.a(getContext(), "myoffer_permission_manage", "id"));
        this.f4284l = (TextView) findViewById(h.a(getContext(), "myoffer_version_name", "id"));
        String r10 = this.f4149a.r();
        if (!TextUtils.isEmpty(r10)) {
            this.f4286n.setText(r10);
        } else {
            this.f4286n.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f4291t.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = 0;
                this.f4291t.setLayoutParams(layoutParams);
            }
        }
        String w10 = this.f4149a.w();
        if (!TextUtils.isEmpty(w10)) {
            this.o.setText(w10);
        } else {
            this.o.setText(h.a(getContext(), "myoffer_cta_learn_more", com.anythink.expressad.foundation.h.i.f10128g));
        }
        this.f4288q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f4149a.u()), i10, i11, new b.a() { // from class: com.anythink.basead.ui.MediaAdView.1
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
                Log.e(MediaAdView.TAG, "load: image load fail:".concat(String.valueOf(str2)));
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(MediaAdView.this.f4149a.u(), str)) {
                    MediaAdView.this.f4288q.setImageBitmap(bitmap);
                    MediaAdView.this.post(new Runnable() { // from class: com.anythink.basead.ui.MediaAdView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int[] a10 = u.a(MediaAdView.this.getWidth(), MediaAdView.this.getHeight(), bitmap.getWidth() / bitmap.getHeight());
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) MediaAdView.this.f4288q.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.width = a10[0];
                                layoutParams2.height = a10[1];
                                layoutParams2.addRule(13);
                                MediaAdView.this.f4288q.setLayoutParams(layoutParams2);
                            }
                        }
                    });
                    Bitmap a10 = com.anythink.core.common.k.b.a(MediaAdView.this.getContext(), bitmap);
                    MediaAdView.this.f4287p.setScaleType(ImageView.ScaleType.FIT_XY);
                    MediaAdView.this.f4287p.setImageBitmap(a10);
                }
            }
        });
        if (!TextUtils.isEmpty(this.f4149a.v())) {
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f4149a.v()), new b.a() { // from class: com.anythink.basead.ui.MediaAdView.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                    MediaAdView.this.f4289r.setVisibility(8);
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(MediaAdView.this.f4149a.v(), str)) {
                        MediaAdView.this.f4289r.setImageBitmap(bitmap);
                        ViewGroup.LayoutParams layoutParams2 = MediaAdView.this.f4289r.getLayoutParams();
                        int i12 = layoutParams2.height;
                        layoutParams2.width = (int) (i12 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                        layoutParams2.height = i12;
                        MediaAdView.this.f4289r.setLayoutParams(layoutParams2);
                        MediaAdView.this.f4289r.setScaleType(ImageView.ScaleType.FIT_XY);
                        MediaAdView.this.f4289r.setImageBitmap(bitmap);
                        MediaAdView.this.f4289r.setVisibility(0);
                    }
                }
            });
        } else {
            this.f4289r.setVisibility(8);
        }
        String s10 = this.f4149a.s();
        if (!TextUtils.isEmpty(s10)) {
            this.f4291t.setText(s10);
        } else {
            this.f4291t.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f4149a.t())) {
            this.f4290s.setRadiusInDip(6);
            this.f4290s.setNeedRadiu(true);
            ViewGroup.LayoutParams layoutParams2 = this.f4290s.getLayoutParams();
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f4149a.t()), layoutParams2.width, layoutParams2.height, new b.a() { // from class: com.anythink.basead.ui.MediaAdView.3
                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(MediaAdView.this.f4149a.t(), str)) {
                        MediaAdView.this.f4290s.setImageBitmap(bitmap);
                    }
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }
            });
        } else {
            this.f4290s.setVisibility(8);
        }
        if (this.f4149a.K()) {
            RelativeLayout relativeLayout = this.f4280h;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                this.f4280h.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            TextView textView = this.f4281i;
            if (textView != null) {
                textView.setVisibility(0);
                this.f4281i.setText(this.f4149a.F());
                this.f4281i.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            TextView textView2 = this.f4282j;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f4282j.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.b(n.a().g(), MediaAdView.this.f4149a.H());
                    }
                });
            }
            TextView textView3 = this.f4283k;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.f4283k.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.b(n.a().g(), MediaAdView.this.f4149a.I());
                    }
                });
            }
            TextView textView4 = this.f4284l;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f4284l.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", com.anythink.expressad.foundation.h.i.f10128g), this.f4149a.G()));
                this.f4284l.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MediaAdView.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
        if (!com.anythink.basead.a.e.a(this.f4149a) && (findViewById = findViewById(h.a(getContext(), "myoffer_media_ad_main_image_container", "id"))) != null) {
            ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
            if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = h.a(getContext(), 84.0f);
                findViewById.setLayoutParams(layoutParams3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
