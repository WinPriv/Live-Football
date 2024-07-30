package com.applovin.exoplayer2.i;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.exoplayer2.a0;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g {

    /* renamed from: a */
    public static final a f15505a = new C0175a().a("").e();

    /* renamed from: s */
    public static final g.a<a> f15506s = new a0(7);

    /* renamed from: b */
    public final CharSequence f15507b;

    /* renamed from: c */
    public final Layout.Alignment f15508c;

    /* renamed from: d */
    public final Layout.Alignment f15509d;

    /* renamed from: e */
    public final Bitmap f15510e;
    public final float f;

    /* renamed from: g */
    public final int f15511g;

    /* renamed from: h */
    public final int f15512h;

    /* renamed from: i */
    public final float f15513i;

    /* renamed from: j */
    public final int f15514j;

    /* renamed from: k */
    public final float f15515k;

    /* renamed from: l */
    public final float f15516l;

    /* renamed from: m */
    public final boolean f15517m;

    /* renamed from: n */
    public final int f15518n;
    public final int o;

    /* renamed from: p */
    public final float f15519p;

    /* renamed from: q */
    public final int f15520q;

    /* renamed from: r */
    public final float f15521r;

    /* renamed from: com.applovin.exoplayer2.i.a$a */
    /* loaded from: classes.dex */
    public static final class C0175a {

        /* renamed from: a */
        private CharSequence f15545a;

        /* renamed from: b */
        private Bitmap f15546b;

        /* renamed from: c */
        private Layout.Alignment f15547c;

        /* renamed from: d */
        private Layout.Alignment f15548d;

        /* renamed from: e */
        private float f15549e;
        private int f;

        /* renamed from: g */
        private int f15550g;

        /* renamed from: h */
        private float f15551h;

        /* renamed from: i */
        private int f15552i;

        /* renamed from: j */
        private int f15553j;

        /* renamed from: k */
        private float f15554k;

        /* renamed from: l */
        private float f15555l;

        /* renamed from: m */
        private float f15556m;

        /* renamed from: n */
        private boolean f15557n;
        private int o;

        /* renamed from: p */
        private int f15558p;

        /* renamed from: q */
        private float f15559q;

        public /* synthetic */ C0175a(a aVar, AnonymousClass1 anonymousClass1) {
            this(aVar);
        }

        public C0175a a(CharSequence charSequence) {
            this.f15545a = charSequence;
            return this;
        }

        public C0175a b(Layout.Alignment alignment) {
            this.f15548d = alignment;
            return this;
        }

        public int c() {
            return this.f15552i;
        }

        public C0175a d() {
            this.f15557n = false;
            return this;
        }

        public a e() {
            return new a(this.f15545a, this.f15547c, this.f15548d, this.f15546b, this.f15549e, this.f, this.f15550g, this.f15551h, this.f15552i, this.f15553j, this.f15554k, this.f15555l, this.f15556m, this.f15557n, this.o, this.f15558p, this.f15559q);
        }

        public C0175a() {
            this.f15545a = null;
            this.f15546b = null;
            this.f15547c = null;
            this.f15548d = null;
            this.f15549e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.f15550g = Integer.MIN_VALUE;
            this.f15551h = -3.4028235E38f;
            this.f15552i = Integer.MIN_VALUE;
            this.f15553j = Integer.MIN_VALUE;
            this.f15554k = -3.4028235E38f;
            this.f15555l = -3.4028235E38f;
            this.f15556m = -3.4028235E38f;
            this.f15557n = false;
            this.o = -16777216;
            this.f15558p = Integer.MIN_VALUE;
        }

        public CharSequence a() {
            return this.f15545a;
        }

        public int b() {
            return this.f15550g;
        }

        public C0175a c(float f) {
            this.f15556m = f;
            return this;
        }

        public C0175a d(int i10) {
            this.f15558p = i10;
            return this;
        }

        public C0175a a(Bitmap bitmap) {
            this.f15546b = bitmap;
            return this;
        }

        public C0175a b(int i10) {
            this.f15552i = i10;
            return this;
        }

        public C0175a c(int i10) {
            this.o = i10;
            this.f15557n = true;
            return this;
        }

        public C0175a d(float f) {
            this.f15559q = f;
            return this;
        }

        public C0175a a(Layout.Alignment alignment) {
            this.f15547c = alignment;
            return this;
        }

        public C0175a b(float f, int i10) {
            this.f15554k = f;
            this.f15553j = i10;
            return this;
        }

        public C0175a a(float f, int i10) {
            this.f15549e = f;
            this.f = i10;
            return this;
        }

        public C0175a b(float f) {
            this.f15555l = f;
            return this;
        }

        public C0175a a(int i10) {
            this.f15550g = i10;
            return this;
        }

        public C0175a a(float f) {
            this.f15551h = f;
            return this;
        }

        private C0175a(a aVar) {
            this.f15545a = aVar.f15507b;
            this.f15546b = aVar.f15510e;
            this.f15547c = aVar.f15508c;
            this.f15548d = aVar.f15509d;
            this.f15549e = aVar.f;
            this.f = aVar.f15511g;
            this.f15550g = aVar.f15512h;
            this.f15551h = aVar.f15513i;
            this.f15552i = aVar.f15514j;
            this.f15553j = aVar.o;
            this.f15554k = aVar.f15519p;
            this.f15555l = aVar.f15515k;
            this.f15556m = aVar.f15516l;
            this.f15557n = aVar.f15517m;
            this.o = aVar.f15518n;
            this.f15558p = aVar.f15520q;
            this.f15559q = aVar.f15521r;
        }
    }

    public /* synthetic */ a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14, AnonymousClass1 anonymousClass1) {
        this(charSequence, alignment, alignment2, bitmap, f, i10, i11, f10, i12, i13, f11, f12, f13, z10, i14, i15, f14);
    }

    public static /* synthetic */ a b(Bundle bundle) {
        return a(bundle);
    }

    public C0175a a() {
        return new C0175a();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.f15507b, aVar.f15507b) && this.f15508c == aVar.f15508c && this.f15509d == aVar.f15509d && ((bitmap = this.f15510e) != null ? !((bitmap2 = aVar.f15510e) == null || !bitmap.sameAs(bitmap2)) : aVar.f15510e == null) && this.f == aVar.f && this.f15511g == aVar.f15511g && this.f15512h == aVar.f15512h && this.f15513i == aVar.f15513i && this.f15514j == aVar.f15514j && this.f15515k == aVar.f15515k && this.f15516l == aVar.f15516l && this.f15517m == aVar.f15517m && this.f15518n == aVar.f15518n && this.o == aVar.o && this.f15519p == aVar.f15519p && this.f15520q == aVar.f15520q && this.f15521r == aVar.f15521r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f15507b, this.f15508c, this.f15509d, this.f15510e, Float.valueOf(this.f), Integer.valueOf(this.f15511g), Integer.valueOf(this.f15512h), Float.valueOf(this.f15513i), Integer.valueOf(this.f15514j), Float.valueOf(this.f15515k), Float.valueOf(this.f15516l), Boolean.valueOf(this.f15517m), Integer.valueOf(this.f15518n), Integer.valueOf(this.o), Float.valueOf(this.f15519p), Integer.valueOf(this.f15520q), Float.valueOf(this.f15521r));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14) {
        if (charSequence == null) {
            com.applovin.exoplayer2.l.a.b(bitmap);
        } else {
            com.applovin.exoplayer2.l.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f15507b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f15507b = charSequence.toString();
        } else {
            this.f15507b = null;
        }
        this.f15508c = alignment;
        this.f15509d = alignment2;
        this.f15510e = bitmap;
        this.f = f;
        this.f15511g = i10;
        this.f15512h = i11;
        this.f15513i = f10;
        this.f15514j = i12;
        this.f15515k = f12;
        this.f15516l = f13;
        this.f15517m = z10;
        this.f15518n = i14;
        this.o = i13;
        this.f15519p = f11;
        this.f15520q = i15;
        this.f15521r = f14;
    }

    public static final a a(Bundle bundle) {
        C0175a c0175a = new C0175a();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            c0175a.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            c0175a.a(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            c0175a.b(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            c0175a.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            c0175a.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            c0175a.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            c0175a.a(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            c0175a.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            c0175a.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            c0175a.b(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            c0175a.c(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            c0175a.c(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            c0175a.d();
        }
        if (bundle.containsKey(a(15))) {
            c0175a.d(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            c0175a.d(bundle.getFloat(a(16)));
        }
        return c0175a.e();
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
