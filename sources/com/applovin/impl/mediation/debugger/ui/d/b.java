package com.applovin.impl.mediation.debugger.ui.d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public TextView f18130a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f18131b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f18132c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f18133d;

    /* renamed from: e, reason: collision with root package name */
    private c f18134e;
    private int f;

    public void a(int i10) {
        this.f = i10;
    }

    public c b() {
        return this.f18134e;
    }

    public int a() {
        return this.f;
    }

    public void a(c cVar) {
        this.f18134e = cVar;
        this.f18130a.setText(cVar.k());
        this.f18130a.setTextColor(cVar.n());
        if (this.f18131b != null) {
            if (!TextUtils.isEmpty(cVar.i_())) {
                this.f18131b.setTypeface(null, 0);
                this.f18131b.setVisibility(0);
                this.f18131b.setText(cVar.i_());
                this.f18131b.setTextColor(cVar.e());
                if (cVar.j_()) {
                    this.f18131b.setTypeface(null, 1);
                }
            } else {
                this.f18131b.setVisibility(8);
            }
        }
        if (this.f18132c != null) {
            if (cVar.g() > 0) {
                this.f18132c.setImageResource(cVar.g());
                this.f18132c.setColorFilter(cVar.o());
                this.f18132c.setVisibility(0);
            } else {
                this.f18132c.setVisibility(8);
            }
        }
        if (this.f18133d != null) {
            if (cVar.a() > 0) {
                this.f18133d.setImageResource(cVar.a());
                this.f18133d.setColorFilter(cVar.b());
                this.f18133d.setVisibility(0);
                return;
            }
            this.f18133d.setVisibility(8);
        }
    }
}
