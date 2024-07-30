package com.anythink.expressad.out;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes.dex */
public class LoadingActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f10444b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f10445c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f10446d;

    /* renamed from: e, reason: collision with root package name */
    private a f10447e;
    private String f;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f10449h;

    /* renamed from: i, reason: collision with root package name */
    private RelativeLayout f10450i;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.d.c f10448g = new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.out.LoadingActivity.1
        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (LoadingActivity.this.f10445c == null || bitmap == null || bitmap.isRecycled() || !((String) LoadingActivity.this.f10445c.getTag()).equals(str)) {
                return;
            }
            LoadingActivity.this.f10445c.setImageBitmap(bitmap);
            LoadingActivity.this.f10446d = bitmap;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f10443a = new BroadcastReceiver() { // from class: com.anythink.expressad.out.LoadingActivity.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            LoadingActivity.this.finish();
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("icon_url")) {
            this.f = getIntent().getStringExtra("icon_url");
        }
        if (this.f10444b == null) {
            this.f10444b = new RelativeLayout(this);
            this.f10450i = new RelativeLayout(this);
            int b10 = com.anythink.expressad.foundation.h.t.b(this, 15.0f);
            this.f10450i.setPadding(b10, b10, b10, b10);
            this.f10450i.setBackgroundResource(getResources().getIdentifier("anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.i.f10125c, getPackageName()));
            this.f10450i.addView(new TextView(this), new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.h.t.b(this, 140.0f), com.anythink.expressad.foundation.h.t.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f10445c = aTImageView;
            aTImageView.setId(com.anythink.expressad.foundation.h.t.a());
            this.f10445c.setTag(this.f);
            if (!TextUtils.isEmpty(this.f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f, this.f10448g);
            }
            int b11 = com.anythink.expressad.foundation.h.t.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b11, b11);
            layoutParams.addRule(13, -1);
            this.f10450i.addView(this.f10445c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f10445c.getId());
            layoutParams2.addRule(14, -1);
            this.f10450i.addView(textView, layoutParams2);
            this.f10444b.addView(this.f10450i, new RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(this.f10444b);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f10443a != null) {
            com.anythink.core.common.b.k.a(this).a(this.f10443a);
        }
        ImageView imageView = this.f10445c;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f10445c = null;
        this.f10444b = null;
        this.f10448g = null;
        this.f10449h = null;
        RelativeLayout relativeLayout = this.f10450i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(null);
        }
        this.f10450i = null;
        Bitmap bitmap = this.f10446d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f10446d = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ExitApp");
        if (this.f10443a != null) {
            com.anythink.core.common.b.k.a(this).a(this.f10443a, intentFilter);
        }
    }

    private View a() {
        if (this.f10444b == null) {
            this.f10444b = new RelativeLayout(this);
            this.f10450i = new RelativeLayout(this);
            int b10 = com.anythink.expressad.foundation.h.t.b(this, 15.0f);
            this.f10450i.setPadding(b10, b10, b10, b10);
            this.f10450i.setBackgroundResource(getResources().getIdentifier("anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.i.f10125c, getPackageName()));
            this.f10450i.addView(new TextView(this), new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.h.t.b(this, 140.0f), com.anythink.expressad.foundation.h.t.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f10445c = aTImageView;
            aTImageView.setId(com.anythink.expressad.foundation.h.t.a());
            this.f10445c.setTag(this.f);
            if (!TextUtils.isEmpty(this.f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f, this.f10448g);
            }
            int b11 = com.anythink.expressad.foundation.h.t.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b11, b11);
            layoutParams.addRule(13, -1);
            this.f10450i.addView(this.f10445c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f10445c.getId());
            layoutParams2.addRule(14, -1);
            this.f10450i.addView(textView, layoutParams2);
            this.f10444b.addView(this.f10450i, new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.f10444b;
    }
}
