package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class u extends View {

    /* renamed from: a, reason: collision with root package name */
    private final o f17221a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17222b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public u(o oVar, Context context) {
        super(context);
        this.f17221a = oVar;
        setClickable(false);
        setFocusable(false);
    }

    public void a() {
        a(null);
    }

    public boolean b() {
        return this.f17222b;
    }

    public String getIdentifier() {
        return this.f17221a.b();
    }

    public void a(a aVar) {
        if (this.f17222b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a10 = this.f17221a.a();
        if (a10 == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(a10);
            this.f17222b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
