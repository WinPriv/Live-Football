package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.huawei.hms.ads.gl;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public float f20876c;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<b> f20878e;
    public z6.d f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f20874a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final a f20875b = new a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f20877d = true;

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes2.dex */
    public class a extends z6.f {
        public a() {
            super(0);
        }

        @Override // z6.f
        public final void q(int i10) {
            h hVar = h.this;
            hVar.f20877d = true;
            b bVar = hVar.f20878e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // z6.f
        public final void r(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            h hVar = h.this;
            hVar.f20877d = true;
            b bVar = hVar.f20878e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        this.f20878e = new WeakReference<>(null);
        this.f20878e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f20877d) {
            return this.f20876c;
        }
        if (str == null) {
            measureText = gl.Code;
        } else {
            measureText = this.f20874a.measureText((CharSequence) str, 0, str.length());
        }
        this.f20876c = measureText;
        this.f20877d = false;
        return measureText;
    }

    public final void b(z6.d dVar, Context context) {
        if (this.f != dVar) {
            this.f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f20874a;
                a aVar = this.f20875b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f20878e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f20877d = true;
            }
            b bVar2 = this.f20878e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
