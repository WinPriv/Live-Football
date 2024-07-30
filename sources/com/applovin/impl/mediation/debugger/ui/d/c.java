package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    protected b f18135b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f18136c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f18137d;

    /* renamed from: e, reason: collision with root package name */
    protected SpannedString f18138e;
    protected String f;

    /* renamed from: g, reason: collision with root package name */
    protected String f18139g;

    /* renamed from: h, reason: collision with root package name */
    protected int f18140h;

    /* renamed from: i, reason: collision with root package name */
    protected int f18141i;

    /* renamed from: j, reason: collision with root package name */
    protected int f18142j;

    /* renamed from: k, reason: collision with root package name */
    protected int f18143k;

    /* renamed from: l, reason: collision with root package name */
    protected int f18144l;

    /* renamed from: m, reason: collision with root package name */
    protected int f18145m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f18146n;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final b f18147a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18148b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f18149c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f18150d;

        /* renamed from: e, reason: collision with root package name */
        String f18151e;
        String f;

        /* renamed from: g, reason: collision with root package name */
        int f18152g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f18153h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f18154i = -16777216;

        /* renamed from: j, reason: collision with root package name */
        int f18155j = -16777216;

        /* renamed from: k, reason: collision with root package name */
        int f18156k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f18157l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f18158m;

        public a(b bVar) {
            this.f18147a = bVar;
        }

        public a a(boolean z10) {
            this.f18148b = z10;
            return this;
        }

        public a b(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a c(String str) {
            this.f18151e = str;
            return this;
        }

        public a d(String str) {
            this.f = str;
            return this;
        }

        public a a(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a c(int i10) {
            this.f18157l = i10;
            return this;
        }

        public a b(SpannedString spannedString) {
            this.f18150d = spannedString;
            return this;
        }

        public a a(SpannedString spannedString) {
            this.f18149c = spannedString;
            return this;
        }

        public a b(int i10) {
            this.f18155j = i10;
            return this;
        }

        public a a(int i10) {
            this.f18153h = i10;
            return this;
        }

        public a b(boolean z10) {
            this.f18158m = z10;
            return this;
        }

        public a a(Context context) {
            this.f18153h = R.drawable.applovin_ic_disclosure_arrow;
            this.f18157l = g.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: g, reason: collision with root package name */
        private final int f18165g;

        b(int i10) {
            this.f18165g = i10;
        }

        public int a() {
            return this.f18165g;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            if (this == DETAIL) {
                return R.layout.applovin_debugger_list_item_detail;
            }
            return R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    public static int h() {
        return b.COUNT.a();
    }

    public static a p() {
        return a(b.RIGHT_DETAIL);
    }

    public int a() {
        return this.f18141i;
    }

    public int b() {
        return this.f18145m;
    }

    public boolean c() {
        return this.f18136c;
    }

    public int e() {
        return this.f18143k;
    }

    public int g() {
        return this.f18140h;
    }

    public int i() {
        return this.f18135b.a();
    }

    public SpannedString i_() {
        return this.f18138e;
    }

    public int j() {
        return this.f18135b.b();
    }

    public boolean j_() {
        return this.f18146n;
    }

    public SpannedString k() {
        return this.f18137d;
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.f18139g;
    }

    public int n() {
        return this.f18142j;
    }

    public int o() {
        return this.f18144l;
    }

    public c(b bVar) {
        this.f18140h = 0;
        this.f18141i = 0;
        this.f18142j = -16777216;
        this.f18143k = -16777216;
        this.f18144l = 0;
        this.f18145m = 0;
        this.f18135b = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    private c(a aVar) {
        this.f18140h = 0;
        this.f18141i = 0;
        this.f18142j = -16777216;
        this.f18143k = -16777216;
        this.f18144l = 0;
        this.f18145m = 0;
        this.f18135b = aVar.f18147a;
        this.f18136c = aVar.f18148b;
        this.f18137d = aVar.f18149c;
        this.f18138e = aVar.f18150d;
        this.f = aVar.f18151e;
        this.f18139g = aVar.f;
        this.f18140h = aVar.f18152g;
        this.f18141i = aVar.f18153h;
        this.f18142j = aVar.f18154i;
        this.f18143k = aVar.f18155j;
        this.f18144l = aVar.f18156k;
        this.f18145m = aVar.f18157l;
        this.f18146n = aVar.f18158m;
    }
}
