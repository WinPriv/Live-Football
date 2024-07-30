package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f11413a;

    /* renamed from: b, reason: collision with root package name */
    private String f11414b;

    /* renamed from: c, reason: collision with root package name */
    private int f11415c;

    /* renamed from: d, reason: collision with root package name */
    private float f11416d;

    /* renamed from: e, reason: collision with root package name */
    private float f11417e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f11418g;

    /* renamed from: h, reason: collision with root package name */
    private View f11419h;

    /* renamed from: i, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.c> f11420i;

    /* renamed from: j, reason: collision with root package name */
    private int f11421j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11422k;

    /* renamed from: l, reason: collision with root package name */
    private String f11423l;

    /* renamed from: m, reason: collision with root package name */
    private int f11424m;

    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f11425a;

        /* renamed from: b, reason: collision with root package name */
        private String f11426b;

        /* renamed from: c, reason: collision with root package name */
        private int f11427c;

        /* renamed from: d, reason: collision with root package name */
        private float f11428d;

        /* renamed from: e, reason: collision with root package name */
        private float f11429e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private int f11430g;

        /* renamed from: h, reason: collision with root package name */
        private View f11431h;

        /* renamed from: i, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.c> f11432i;

        /* renamed from: j, reason: collision with root package name */
        private int f11433j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f11434k;

        /* renamed from: l, reason: collision with root package name */
        private String f11435l;

        /* renamed from: m, reason: collision with root package name */
        private int f11436m;

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(Context context) {
            this.f11425a = context.getApplicationContext();
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(float f) {
            this.f11429e = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(int i10) {
            this.f11430g = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b d(int i10) {
            this.f11433j = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b e(int i10) {
            this.f11436m = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(String str) {
            this.f11426b = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(int i10) {
            this.f = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(int i10) {
            this.f11427c = i10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(String str) {
            this.f11435l = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(float f) {
            this.f11428d = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(View view) {
            this.f11431h = view;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(List<com.anythink.expressad.foundation.d.c> list) {
            this.f11432i = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(boolean z10) {
            this.f11434k = z10;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        b a(float f);

        b a(int i10);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<com.anythink.expressad.foundation.d.c> list);

        b a(boolean z10);

        c a();

        b b(float f);

        b b(int i10);

        b b(String str);

        b c(int i10);

        b d(int i10);

        b e(int i10);
    }

    public /* synthetic */ c(a aVar, byte b10) {
        this(aVar);
    }

    private static a l() {
        return new a();
    }

    public final Context a() {
        return this.f11413a;
    }

    public final String b() {
        return this.f11414b;
    }

    public final float c() {
        return this.f11416d;
    }

    public final float d() {
        return this.f11417e;
    }

    public final int e() {
        return this.f;
    }

    public final View f() {
        return this.f11419h;
    }

    public final List<com.anythink.expressad.foundation.d.c> g() {
        return this.f11420i;
    }

    public final int h() {
        return this.f11415c;
    }

    public final int i() {
        return this.f11421j;
    }

    public final int j() {
        return this.f11418g;
    }

    public final boolean k() {
        return this.f11422k;
    }

    private c(a aVar) {
        this.f11417e = aVar.f11429e;
        this.f11416d = aVar.f11428d;
        this.f = aVar.f;
        this.f11418g = aVar.f11430g;
        this.f11413a = aVar.f11425a;
        this.f11414b = aVar.f11426b;
        this.f11415c = aVar.f11427c;
        this.f11419h = aVar.f11431h;
        this.f11420i = aVar.f11432i;
        this.f11421j = aVar.f11433j;
        this.f11422k = aVar.f11434k;
    }
}
