package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static Configuration f;

    /* renamed from: a, reason: collision with root package name */
    public int f28974a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f28975b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f28976c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f28977d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f28978e;

    /* compiled from: ContextThemeWrapper.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f28978e == null) {
            if (this.f28977d == null) {
                this.f28977d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z10;
        if (this.f28975b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f28975b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f28975b.setTo(theme);
            }
        }
        this.f28975b.applyStyle(this.f28974a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(i.c.f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f28978e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f28977d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = i.c.f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            i.c.f = r1
        L1c:
            android.content.res.Configuration r1 = i.c.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f28977d
            android.content.Context r0 = i.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f28978e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f28978e = r0
        L38:
            android.content.res.Resources r0 = r3.f28978e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f28976c == null) {
                this.f28976c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f28976c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f28975b;
        if (theme != null) {
            return theme;
        }
        if (this.f28974a == 0) {
            this.f28974a = 2132017810;
        }
        b();
        return this.f28975b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f28974a != i10) {
            this.f28974a = i10;
            b();
        }
    }

    public c(Context context, int i10) {
        super(context);
        this.f28974a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f28975b = theme;
    }
}
