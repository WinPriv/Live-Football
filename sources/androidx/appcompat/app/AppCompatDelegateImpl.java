package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.t;
import androidx.appcompat.app.v;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.u0;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.constant.av;
import i.a;
import i.e;
import j0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.c0;
import n0.f;
import n0.l0;

/* loaded from: classes.dex */
public final class AppCompatDelegateImpl extends androidx.appcompat.app.g implements h.a, LayoutInflater.Factory2 {
    public static final q.i<String, Integer> C0 = new q.i<>();
    public static final int[] D0 = {R.attr.windowBackground};
    public static final boolean E0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean F0 = true;
    public OnBackInvokedDispatcher A0;
    public final Object B;
    public OnBackInvokedCallback B0;
    public final Context C;
    public Window D;
    public h E;
    public final androidx.appcompat.app.e F;
    public androidx.appcompat.app.a G;
    public i.f H;
    public CharSequence I;
    public androidx.appcompat.widget.v J;
    public d K;
    public m L;
    public i.a M;
    public ActionBarContextView N;
    public PopupWindow O;
    public androidx.appcompat.app.j P;
    public boolean S;
    public ViewGroup T;
    public TextView U;
    public View V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f588c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f589d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f590e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f591f0;

    /* renamed from: g0, reason: collision with root package name */
    public l[] f592g0;

    /* renamed from: h0, reason: collision with root package name */
    public l f593h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f594i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f595j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f596k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f597l0;

    /* renamed from: m0, reason: collision with root package name */
    public Configuration f598m0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f599n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f600o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f601p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f602q0;

    /* renamed from: r0, reason: collision with root package name */
    public k f603r0;

    /* renamed from: s0, reason: collision with root package name */
    public i f604s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f605t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f606u0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f608w0;

    /* renamed from: x0, reason: collision with root package name */
    public Rect f609x0;
    public Rect y0;

    /* renamed from: z0, reason: collision with root package name */
    public o f610z0;
    public l0 Q = null;
    public final boolean R = true;

    /* renamed from: v0, reason: collision with root package name */
    public final a f607v0 = new a();

    /* loaded from: classes.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(i.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.L(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x10 >= -5 && y >= -5 && x10 <= getWidth() + 5 && y <= getHeight() + 5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.J(appCompatDelegateImpl.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.a(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f606u0 & 1) != 0) {
                appCompatDelegateImpl.M(0);
            }
            if ((appCompatDelegateImpl.f606u0 & 4096) != 0) {
                appCompatDelegateImpl.M(108);
            }
            appCompatDelegateImpl.f605t0 = false;
            appCompatDelegateImpl.f606u0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.appcompat.app.b {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public final class d implements m.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            AppCompatDelegateImpl.this.I(hVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            Window.Callback R = AppCompatDelegateImpl.this.R();
            if (R != null) {
                R.onMenuOpened(108, hVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e implements a.InterfaceC0394a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0394a f613a;

        /* loaded from: classes.dex */
        public class a extends a0.a {
            public a() {
            }

            @Override // n0.m0
            public final void a() {
                e eVar = e.this;
                AppCompatDelegateImpl.this.N.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.O;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.N.getParent() instanceof View) {
                    View view = (View) appCompatDelegateImpl.N.getParent();
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.h.c(view);
                }
                appCompatDelegateImpl.N.g();
                appCompatDelegateImpl.Q.d(null);
                appCompatDelegateImpl.Q = null;
                ViewGroup viewGroup = appCompatDelegateImpl.T;
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                c0.h.c(viewGroup);
            }
        }

        public e(a.InterfaceC0394a interfaceC0394a) {
            this.f613a = interfaceC0394a;
        }

        @Override // i.a.InterfaceC0394a
        public final boolean a(i.a aVar, MenuItem menuItem) {
            return this.f613a.a(aVar, menuItem);
        }

        @Override // i.a.InterfaceC0394a
        public final void b(i.a aVar) {
            this.f613a.b(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.O != null) {
                appCompatDelegateImpl.D.getDecorView().removeCallbacks(appCompatDelegateImpl.P);
            }
            if (appCompatDelegateImpl.N != null) {
                l0 l0Var = appCompatDelegateImpl.Q;
                if (l0Var != null) {
                    l0Var.b();
                }
                l0 a10 = c0.a(appCompatDelegateImpl.N);
                a10.a(gl.Code);
                appCompatDelegateImpl.Q = a10;
                a10.d(new a());
            }
            androidx.appcompat.app.e eVar = appCompatDelegateImpl.F;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl.M);
            }
            appCompatDelegateImpl.M = null;
            ViewGroup viewGroup = appCompatDelegateImpl.T;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.h.c(viewGroup);
            appCompatDelegateImpl.Z();
        }

        @Override // i.a.InterfaceC0394a
        public final boolean c(i.a aVar, androidx.appcompat.view.menu.h hVar) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.T;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.h.c(viewGroup);
            return this.f613a.c(aVar, hVar);
        }

        @Override // i.a.InterfaceC0394a
        public final boolean d(i.a aVar, androidx.appcompat.view.menu.h hVar) {
            return this.f613a.d(aVar, hVar);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static j0.f b(Configuration configuration) {
            return j0.f.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(j0.f fVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f29563a.a()));
        }

        public static void d(Configuration configuration, j0.f fVar) {
            configuration.setLocales(LocaleList.forLanguageTags(fVar.f29563a.a()));
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.l
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.U();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class h extends i.h {

        /* renamed from: t, reason: collision with root package name */
        public c f615t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f616u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f617v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f618w;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f616u = true;
                callback.onContentChanged();
            } finally {
                this.f616u = false;
            }
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f617v) {
                return this.f29026s.dispatchKeyEvent(keyEvent);
            }
            if (!AppCompatDelegateImpl.this.L(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            if (r6 != false) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
        @Override // i.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L4f
                int r0 = r6.getKeyCode()
                androidx.appcompat.app.AppCompatDelegateImpl r2 = androidx.appcompat.app.AppCompatDelegateImpl.this
                r2.S()
                androidx.appcompat.app.a r3 = r2.G
                r4 = 0
                if (r3 == 0) goto L1c
                boolean r0 = r3.i(r0, r6)
                if (r0 == 0) goto L1c
                goto L48
            L1c:
                androidx.appcompat.app.AppCompatDelegateImpl$l r0 = r2.f593h0
                if (r0 == 0) goto L31
                int r3 = r6.getKeyCode()
                boolean r0 = r2.W(r0, r3, r6)
                if (r0 == 0) goto L31
                androidx.appcompat.app.AppCompatDelegateImpl$l r6 = r2.f593h0
                if (r6 == 0) goto L48
                r6.f637l = r1
                goto L48
            L31:
                androidx.appcompat.app.AppCompatDelegateImpl$l r0 = r2.f593h0
                if (r0 != 0) goto L4a
                androidx.appcompat.app.AppCompatDelegateImpl$l r0 = r2.Q(r4)
                r2.X(r0, r6)
                int r3 = r6.getKeyCode()
                boolean r6 = r2.W(r0, r3, r6)
                r0.f636k = r4
                if (r6 == 0) goto L4a
            L48:
                r6 = r1
                goto L4b
            L4a:
                r6 = r4
            L4b:
                if (r6 == 0) goto L4e
                goto L4f
            L4e:
                r1 = r4
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.h.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f616u) {
                this.f29026s.onContentChanged();
            }
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 == 0 && !(menu instanceof androidx.appcompat.view.menu.h)) {
                return false;
            }
            return super.onCreatePanelMenu(i10, menu);
        }

        @Override // i.h, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            View view;
            c cVar = this.f615t;
            if (cVar != null) {
                t.e eVar = (t.e) cVar;
                if (i10 == 0) {
                    view = new View(t.this.f691a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i10 == 108) {
                appCompatDelegateImpl.S();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.G;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        @Override // i.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f618w) {
                this.f29026s.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i10 == 108) {
                appCompatDelegateImpl.S();
                androidx.appcompat.app.a aVar = appCompatDelegateImpl.G;
                if (aVar != null) {
                    aVar.c(false);
                    return;
                }
                return;
            }
            if (i10 == 0) {
                l Q = appCompatDelegateImpl.Q(i10);
                if (Q.f638m) {
                    appCompatDelegateImpl.J(Q, false);
                    return;
                }
                return;
            }
            appCompatDelegateImpl.getClass();
        }

        @Override // i.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.h hVar;
            if (menu instanceof androidx.appcompat.view.menu.h) {
                hVar = (androidx.appcompat.view.menu.h) menu;
            } else {
                hVar = null;
            }
            if (i10 == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.f837x = true;
            }
            c cVar = this.f615t;
            if (cVar != null) {
                t.e eVar = (t.e) cVar;
                if (i10 == 0) {
                    t tVar = t.this;
                    if (!tVar.f694d) {
                        tVar.f691a.f1241m = true;
                        tVar.f694d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (hVar != null) {
                hVar.f837x = false;
            }
            return onPreparePanel;
        }

        @Override // i.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.h hVar = AppCompatDelegateImpl.this.Q(0).f633h;
            if (hVar != null) {
                super.onProvideKeyboardShortcuts(list, hVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // i.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.R && i10 == 0) {
                e.a aVar = new e.a(appCompatDelegateImpl.C, callback);
                i.a D = appCompatDelegateImpl.D(aVar);
                if (D != null) {
                    return aVar.e(D);
                }
                return null;
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* loaded from: classes.dex */
    public class i extends j {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f620c;

        public i(Context context) {
            super();
            this.f620c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final int c() {
            if (this.f620c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final void d() {
            AppCompatDelegateImpl.this.E(true, true);
        }
    }

    /* loaded from: classes.dex */
    public abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public a f622a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.f622a;
            if (aVar != null) {
                try {
                    AppCompatDelegateImpl.this.C.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f622a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f622a == null) {
                    this.f622a = new a();
                }
                AppCompatDelegateImpl.this.C.registerReceiver(this.f622a, b10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class k extends j {

        /* renamed from: c, reason: collision with root package name */
        public final v f625c;

        public k(v vVar) {
            super();
            this.f625c = vVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final int c() {
            boolean z10;
            Location location;
            boolean z11;
            long j10;
            long j11;
            Location location2;
            v vVar = this.f625c;
            v.a aVar = vVar.f711c;
            boolean z12 = false;
            if (aVar.f713b > System.currentTimeMillis()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = aVar.f712a;
            } else {
                Context context = vVar.f709a;
                int A0 = a0.a.A0(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = vVar.f710b;
                if (A0 == 0) {
                    try {
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        location2 = locationManager.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (a0.a.A0(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (u.f704d == null) {
                        u.f704d = new u();
                    }
                    u uVar = u.f704d;
                    uVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                    uVar.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                    if (uVar.f707c == 1) {
                        z12 = true;
                    }
                    long j12 = uVar.f706b;
                    long j13 = uVar.f705a;
                    uVar.a(location.getLatitude(), location.getLongitude(), 86400000 + currentTimeMillis);
                    long j14 = uVar.f706b;
                    if (j12 != -1 && j13 != -1) {
                        if (currentTimeMillis > j13) {
                            j11 = j14 + 0;
                        } else if (currentTimeMillis > j12) {
                            j11 = j13 + 0;
                        } else {
                            j11 = j12 + 0;
                        }
                        j10 = j11 + 60000;
                    } else {
                        j10 = 43200000 + currentTimeMillis;
                    }
                    aVar.f712a = z12;
                    aVar.f713b = j10;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 < 6 || i10 >= 22) {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (!z11) {
                return 1;
            }
            return 2;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.j
        public final void d() {
            AppCompatDelegateImpl.this.E(true, true);
        }
    }

    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final int f627a;

        /* renamed from: b, reason: collision with root package name */
        public int f628b;

        /* renamed from: c, reason: collision with root package name */
        public int f629c;

        /* renamed from: d, reason: collision with root package name */
        public int f630d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f631e;
        public View f;

        /* renamed from: g, reason: collision with root package name */
        public View f632g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f633h;

        /* renamed from: i, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f634i;

        /* renamed from: j, reason: collision with root package name */
        public i.c f635j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f636k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f637l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f638m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f639n = false;
        public boolean o;

        /* renamed from: p, reason: collision with root package name */
        public Bundle f640p;

        public l(int i10) {
            this.f627a = i10;
        }
    }

    /* loaded from: classes.dex */
    public final class m implements m.a {
        public m() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            boolean z11;
            int i10;
            l lVar;
            androidx.appcompat.view.menu.h k10 = hVar.k();
            int i11 = 0;
            if (k10 != hVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                hVar = k10;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            l[] lVarArr = appCompatDelegateImpl.f592g0;
            if (lVarArr != null) {
                i10 = lVarArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    lVar = lVarArr[i11];
                    if (lVar != null && lVar.f633h == hVar) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                if (z11) {
                    appCompatDelegateImpl.H(lVar.f627a, lVar, k10);
                    appCompatDelegateImpl.J(lVar, true);
                } else {
                    appCompatDelegateImpl.J(lVar, z10);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            Window.Callback R;
            if (hVar == hVar.k()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.Y && (R = appCompatDelegateImpl.R()) != null && !appCompatDelegateImpl.f597l0) {
                    R.onMenuOpened(108, hVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        q.i<String, Integer> iVar;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f599n0 = -100;
        this.C = context;
        this.F = eVar;
        this.B = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof AppCompatActivity) {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f599n0 = appCompatActivity.getDelegate().h();
            }
        }
        if (this.f599n0 == -100 && (orDefault = (iVar = C0).getOrDefault(this.B.getClass().getName(), null)) != null) {
            this.f599n0 = orDefault.intValue();
            iVar.remove(this.B.getClass().getName());
        }
        if (window != null) {
            F(window);
        }
        androidx.appcompat.widget.f.d();
    }

    public static j0.f G(Context context) {
        j0.f fVar;
        j0.f fVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (fVar = androidx.appcompat.app.g.f652u) == null) {
            return null;
        }
        j0.f b10 = f.b(context.getApplicationContext().getResources().getConfiguration());
        j0.g gVar = fVar.f29563a;
        if (gVar.isEmpty()) {
            fVar2 = j0.f.f29562b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < b10.f29563a.size() + gVar.size(); i10++) {
                if (i10 < gVar.size()) {
                    locale = gVar.get(i10);
                } else {
                    locale = b10.f29563a.get(i10 - gVar.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            fVar2 = new j0.f(new j0.h(f.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!fVar2.f29563a.isEmpty()) {
            return fVar2;
        }
        return b10;
    }

    public static Configuration K(Context context, int i10, j0.f fVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = gl.Code;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            f.d(configuration2, fVar);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.g
    public final void A(Toolbar toolbar) {
        CharSequence charSequence;
        Object obj = this.B;
        if (!(obj instanceof Activity)) {
            return;
        }
        S();
        androidx.appcompat.app.a aVar = this.G;
        if (!(aVar instanceof w)) {
            this.H = null;
            if (aVar != null) {
                aVar.h();
            }
            this.G = null;
            if (toolbar != null) {
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.I;
                }
                t tVar = new t(toolbar, charSequence, this.E);
                this.G = tVar;
                this.E.f615t = tVar.f693c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.E.f615t = null;
            }
            l();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.g
    public final void B(int i10) {
        this.f600o0 = i10;
    }

    @Override // androidx.appcompat.app.g
    public final void C(CharSequence charSequence) {
        this.I = charSequence;
        androidx.appcompat.widget.v vVar = this.J;
        if (vVar != null) {
            vVar.setWindowTitle(charSequence);
            return;
        }
        androidx.appcompat.app.a aVar = this.G;
        if (aVar != null) {
            aVar.n(charSequence);
            return;
        }
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x013c, code lost:
    
        if (n0.c0.g.c(r9) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i.a D(i.a.InterfaceC0394a r9) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.D(i.a$a):i.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.E(boolean, boolean):boolean");
    }

    public final void F(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.D == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof h)) {
                h hVar = new h(callback);
                this.E = hVar;
                window.setCallback(hVar);
                Context context = this.C;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, D0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.f a10 = androidx.appcompat.widget.f.a();
                    synchronized (a10) {
                        drawable = a10.f1160a.e(resourceId, context, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.D = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.A0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.B0) != null) {
                        g.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.B0 = null;
                    }
                    Object obj = this.B;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.A0 = g.a(activity);
                            Z();
                            return;
                        }
                    }
                    this.A0 = null;
                    Z();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void H(int i10, l lVar, androidx.appcompat.view.menu.h hVar) {
        if (hVar == null) {
            if (lVar == null && i10 >= 0) {
                l[] lVarArr = this.f592g0;
                if (i10 < lVarArr.length) {
                    lVar = lVarArr[i10];
                }
            }
            if (lVar != null) {
                hVar = lVar.f633h;
            }
        }
        if ((lVar == null || lVar.f638m) && !this.f597l0) {
            h hVar2 = this.E;
            Window.Callback callback = this.D.getCallback();
            hVar2.getClass();
            try {
                hVar2.f618w = true;
                callback.onPanelClosed(i10, hVar);
            } finally {
                hVar2.f618w = false;
            }
        }
    }

    public final void I(androidx.appcompat.view.menu.h hVar) {
        if (this.f591f0) {
            return;
        }
        this.f591f0 = true;
        this.J.i();
        Window.Callback R = R();
        if (R != null && !this.f597l0) {
            R.onPanelClosed(108, hVar);
        }
        this.f591f0 = false;
    }

    public final void J(l lVar, boolean z10) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.v vVar;
        if (z10 && lVar.f627a == 0 && (vVar = this.J) != null && vVar.a()) {
            I(lVar.f633h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.C.getSystemService("window");
        if (windowManager != null && lVar.f638m && (viewGroup = lVar.f631e) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                H(lVar.f627a, lVar, null);
            }
        }
        lVar.f636k = false;
        lVar.f637l = false;
        lVar.f638m = false;
        lVar.f = null;
        lVar.f639n = true;
        if (this.f593h0 == lVar) {
            this.f593h0 = null;
        }
        if (lVar.f627a == 0) {
            Z();
        }
    }

    public final boolean L(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj = this.B;
        boolean z13 = true;
        if (((obj instanceof f.a) || (obj instanceof n)) && (decorView = this.D.getDecorView()) != null && n0.f.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            h hVar = this.E;
            Window.Callback callback = this.D.getCallback();
            hVar.getClass();
            try {
                hVar.f617v = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                hVar.f617v = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    l Q = Q(0);
                    if (Q.f638m) {
                        return true;
                    }
                    X(Q, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z13 = false;
                }
                this.f594i0 = z13;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.M != null) {
                    return true;
                }
                l Q2 = Q(0);
                androidx.appcompat.widget.v vVar = this.J;
                Context context = this.C;
                if (vVar != null && vVar.c() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.J.a()) {
                        if (!this.f597l0 && X(Q2, keyEvent)) {
                            z11 = this.J.g();
                        }
                        z11 = false;
                    } else {
                        z11 = this.J.f();
                    }
                } else {
                    boolean z14 = Q2.f638m;
                    if (!z14 && !Q2.f637l) {
                        if (Q2.f636k) {
                            if (Q2.o) {
                                Q2.f636k = false;
                                z12 = X(Q2, keyEvent);
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                V(Q2, keyEvent);
                                z11 = true;
                            }
                        }
                        z11 = false;
                    } else {
                        J(Q2, true);
                        z11 = z14;
                    }
                }
                if (!z11) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (U()) {
            return true;
        }
        return false;
    }

    public final void M(int i10) {
        l Q = Q(i10);
        if (Q.f633h != null) {
            Bundle bundle = new Bundle();
            Q.f633h.t(bundle);
            if (bundle.size() > 0) {
                Q.f640p = bundle;
            }
            Q.f633h.w();
            Q.f633h.clear();
        }
        Q.o = true;
        Q.f639n = true;
        if ((i10 == 108 || i10 == 0) && this.J != null) {
            l Q2 = Q(0);
            Q2.f636k = false;
            X(Q2, null);
        }
    }

    public final void N() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.S) {
            int[] iArr = a0.a.L;
            Context context2 = this.C;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    w(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    w(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    w(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    w(10);
                }
                this.f589d0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                O();
                this.D.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f590e0) {
                    if (this.f589d0) {
                        viewGroup = (ViewGroup) from.inflate(com.hamkho.livefoot.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.Z = false;
                        this.Y = false;
                    } else if (this.Y) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.hamkho.livefoot.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new i.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.hamkho.livefoot.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        androidx.appcompat.widget.v vVar = (androidx.appcompat.widget.v) viewGroup.findViewById(com.hamkho.livefoot.R.id.decor_content_parent);
                        this.J = vVar;
                        vVar.setWindowCallback(R());
                        if (this.Z) {
                            this.J.h(109);
                        }
                        if (this.W) {
                            this.J.h(2);
                        }
                        if (this.X) {
                            this.J.h(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.f588c0 ? (ViewGroup) from.inflate(com.hamkho.livefoot.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.hamkho.livefoot.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    androidx.appcompat.app.h hVar = new androidx.appcompat.app.h(this);
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.i.u(viewGroup, hVar);
                    if (this.J == null) {
                        this.U = (TextView) viewGroup.findViewById(com.hamkho.livefoot.R.id.title);
                    }
                    Method method = u0.f1273a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.hamkho.livefoot.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.D.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.D.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new androidx.appcompat.app.i(this));
                    this.T = viewGroup;
                    Object obj = this.B;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.I;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        androidx.appcompat.widget.v vVar2 = this.J;
                        if (vVar2 != null) {
                            vVar2.setWindowTitle(charSequence);
                        } else {
                            androidx.appcompat.app.a aVar = this.G;
                            if (aVar != null) {
                                aVar.n(charSequence);
                            } else {
                                TextView textView = this.U;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.T.findViewById(R.id.content);
                    View decorView = this.D.getDecorView();
                    contentFrameLayout2.y.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                    if (c0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.S = true;
                    l Q = Q(0);
                    if (!this.f597l0 && Q.f633h == null) {
                        this.f606u0 |= 4096;
                        if (!this.f605t0) {
                            c0.d.m(this.D.getDecorView(), this.f607v0);
                            this.f605t0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Y + ", windowActionBarOverlay: " + this.Z + ", android:windowIsFloating: " + this.f589d0 + ", windowActionModeOverlay: " + this.f588c0 + ", windowNoTitle: " + this.f590e0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void O() {
        if (this.D == null) {
            Object obj = this.B;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.D != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j P(Context context) {
        if (this.f603r0 == null) {
            if (v.f708d == null) {
                Context applicationContext = context.getApplicationContext();
                v.f708d = new v(applicationContext, (LocationManager) applicationContext.getSystemService(av.at));
            }
            this.f603r0 = new k(v.f708d);
        }
        return this.f603r0;
    }

    public final l Q(int i10) {
        l[] lVarArr = this.f592g0;
        if (lVarArr == null || lVarArr.length <= i10) {
            l[] lVarArr2 = new l[i10 + 1];
            if (lVarArr != null) {
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
            }
            this.f592g0 = lVarArr2;
            lVarArr = lVarArr2;
        }
        l lVar = lVarArr[i10];
        if (lVar == null) {
            l lVar2 = new l(i10);
            lVarArr[i10] = lVar2;
            return lVar2;
        }
        return lVar;
    }

    public final Window.Callback R() {
        return this.D.getCallback();
    }

    public final void S() {
        N();
        if (this.Y && this.G == null) {
            Object obj = this.B;
            if (obj instanceof Activity) {
                this.G = new w((Activity) obj, this.Z);
            } else if (obj instanceof Dialog) {
                this.G = new w((Dialog) obj);
            }
            androidx.appcompat.app.a aVar = this.G;
            if (aVar != null) {
                aVar.l(this.f608w0);
            }
        }
    }

    public final int T(int i10, Context context) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f604s0 == null) {
                            this.f604s0 = new i(context);
                        }
                        return this.f604s0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                return i10;
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            }
            return P(context).c();
        }
        return i10;
    }

    public final boolean U() {
        boolean z10 = this.f594i0;
        this.f594i0 = false;
        l Q = Q(0);
        if (Q.f638m) {
            if (!z10) {
                J(Q, true);
            }
            return true;
        }
        i.a aVar = this.M;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        S();
        androidx.appcompat.app.a aVar2 = this.G;
        if (aVar2 == null || !aVar2.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (r2.f807x.getCount() > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0154, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(androidx.appcompat.app.AppCompatDelegateImpl.l r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.V(androidx.appcompat.app.AppCompatDelegateImpl$l, android.view.KeyEvent):void");
    }

    public final boolean W(l lVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!lVar.f636k && !X(lVar, keyEvent)) || (hVar = lVar.f633h) == null) {
            return false;
        }
        return hVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean X(l lVar, KeyEvent keyEvent) {
        boolean z10;
        androidx.appcompat.widget.v vVar;
        androidx.appcompat.widget.v vVar2;
        Resources.Theme theme;
        int i10;
        boolean z11;
        androidx.appcompat.widget.v vVar3;
        androidx.appcompat.widget.v vVar4;
        if (this.f597l0) {
            return false;
        }
        if (lVar.f636k) {
            return true;
        }
        l lVar2 = this.f593h0;
        if (lVar2 != null && lVar2 != lVar) {
            J(lVar2, false);
        }
        Window.Callback R = R();
        int i11 = lVar.f627a;
        if (R != null) {
            lVar.f632g = R.onCreatePanelView(i11);
        }
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (vVar4 = this.J) != null) {
            vVar4.b();
        }
        if (lVar.f632g == null && (!z10 || !(this.G instanceof t))) {
            androidx.appcompat.view.menu.h hVar = lVar.f633h;
            if (hVar == null || lVar.o) {
                if (hVar == null) {
                    Context context = this.C;
                    if ((i11 == 0 || i11 == 108) && this.J != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.hamkho.livefoot.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.hamkho.livefoot.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.hamkho.livefoot.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            i.c cVar = new i.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.h hVar2 = new androidx.appcompat.view.menu.h(context);
                    hVar2.f820e = this;
                    androidx.appcompat.view.menu.h hVar3 = lVar.f633h;
                    if (hVar2 != hVar3) {
                        if (hVar3 != null) {
                            hVar3.r(lVar.f634i);
                        }
                        lVar.f633h = hVar2;
                        androidx.appcompat.view.menu.f fVar = lVar.f634i;
                        if (fVar != null) {
                            hVar2.b(fVar, hVar2.f816a);
                        }
                    }
                    if (lVar.f633h == null) {
                        return false;
                    }
                }
                if (z10 && (vVar2 = this.J) != null) {
                    if (this.K == null) {
                        this.K = new d();
                    }
                    vVar2.e(lVar.f633h, this.K);
                }
                lVar.f633h.w();
                if (!R.onCreatePanelMenu(i11, lVar.f633h)) {
                    androidx.appcompat.view.menu.h hVar4 = lVar.f633h;
                    if (hVar4 != null) {
                        if (hVar4 != null) {
                            hVar4.r(lVar.f634i);
                        }
                        lVar.f633h = null;
                    }
                    if (z10 && (vVar = this.J) != null) {
                        vVar.e(null, this.K);
                    }
                    return false;
                }
                lVar.o = false;
            }
            lVar.f633h.w();
            Bundle bundle = lVar.f640p;
            if (bundle != null) {
                lVar.f633h.s(bundle);
                lVar.f640p = null;
            }
            if (!R.onPreparePanel(0, lVar.f632g, lVar.f633h)) {
                if (z10 && (vVar3 = this.J) != null) {
                    vVar3.e(null, this.K);
                }
                lVar.f633h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            lVar.f633h.setQwertyMode(z11);
            lVar.f633h.v();
        }
        lVar.f636k = true;
        lVar.f637l = false;
        this.f593h0 = lVar;
        return true;
    }

    public final void Y() {
        if (!this.S) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Z() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.A0 != null && (Q(0).f638m || this.M != null)) {
                z10 = true;
            }
            if (z10 && this.B0 == null) {
                this.B0 = g.b(this.A0, this);
            } else if (!z10 && (onBackInvokedCallback = this.B0) != null) {
                g.c(this.A0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        int i10;
        int i11;
        l lVar;
        Window.Callback R = R();
        if (R != null && !this.f597l0) {
            androidx.appcompat.view.menu.h k10 = hVar.k();
            l[] lVarArr = this.f592g0;
            if (lVarArr != null) {
                i10 = lVarArr.length;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    lVar = lVarArr[i11];
                    if (lVar != null && lVar.f633h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                return R.onMenuItemSelected(lVar.f627a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void b(androidx.appcompat.view.menu.h hVar) {
        androidx.appcompat.widget.v vVar = this.J;
        if (vVar != null && vVar.c() && (!ViewConfiguration.get(this.C).hasPermanentMenuKey() || this.J.d())) {
            Window.Callback R = R();
            if (this.J.a()) {
                this.J.f();
                if (!this.f597l0) {
                    R.onPanelClosed(108, Q(0).f633h);
                    return;
                }
                return;
            }
            if (R != null && !this.f597l0) {
                if (this.f605t0 && (1 & this.f606u0) != 0) {
                    View decorView = this.D.getDecorView();
                    a aVar = this.f607v0;
                    decorView.removeCallbacks(aVar);
                    aVar.run();
                }
                l Q = Q(0);
                androidx.appcompat.view.menu.h hVar2 = Q.f633h;
                if (hVar2 != null && !Q.o && R.onPreparePanel(0, Q.f632g, hVar2)) {
                    R.onMenuOpened(108, Q.f633h);
                    this.J.g();
                    return;
                }
                return;
            }
            return;
        }
        l Q2 = Q(0);
        Q2.f639n = true;
        J(Q2, false);
        V(Q2, null);
    }

    @Override // androidx.appcompat.app.g
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ((ViewGroup) this.T.findViewById(R.id.content)).addView(view, layoutParams);
        this.E.a(this.D.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Context d(final android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.d(android.content.Context):android.content.Context");
    }

    @Override // androidx.appcompat.app.g
    public final <T extends View> T e(int i10) {
        N();
        return (T) this.D.findViewById(i10);
    }

    @Override // androidx.appcompat.app.g
    public final Context f() {
        return this.C;
    }

    @Override // androidx.appcompat.app.g
    public final b g() {
        return new b();
    }

    @Override // androidx.appcompat.app.g
    public final int h() {
        return this.f599n0;
    }

    @Override // androidx.appcompat.app.g
    public final MenuInflater i() {
        Context context;
        if (this.H == null) {
            S();
            androidx.appcompat.app.a aVar = this.G;
            if (aVar != null) {
                context = aVar.e();
            } else {
                context = this.C;
            }
            this.H = new i.f(context);
        }
        return this.H;
    }

    @Override // androidx.appcompat.app.g
    public final androidx.appcompat.app.a j() {
        S();
        return this.G;
    }

    @Override // androidx.appcompat.app.g
    public final void k() {
        LayoutInflater from = LayoutInflater.from(this.C);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.g
    public final void l() {
        if (this.G != null) {
            S();
            if (!this.G.f()) {
                this.f606u0 |= 1;
                if (!this.f605t0) {
                    View decorView = this.D.getDecorView();
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.d.m(decorView, this.f607v0);
                    this.f605t0 = true;
                }
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public final void n(Configuration configuration) {
        if (this.Y && this.S) {
            S();
            androidx.appcompat.app.a aVar = this.G;
            if (aVar != null) {
                aVar.g();
            }
        }
        androidx.appcompat.widget.f a10 = androidx.appcompat.widget.f.a();
        Context context = this.C;
        synchronized (a10) {
            d0 d0Var = a10.f1160a;
            synchronized (d0Var) {
                q.f<WeakReference<Drawable.ConstantState>> fVar = d0Var.f1149b.get(context);
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        this.f598m0 = new Configuration(this.C.getResources().getConfiguration());
        E(false, false);
    }

    @Override // androidx.appcompat.app.g
    public final void o() {
        String str;
        this.f595j0 = true;
        E(false, true);
        O();
        Object obj = this.B;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = b0.k.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a aVar = this.G;
                if (aVar == null) {
                    this.f608w0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (androidx.appcompat.app.g.f656z) {
                androidx.appcompat.app.g.v(this);
                androidx.appcompat.app.g.y.add(new WeakReference<>(this));
            }
        }
        this.f598m0 = new Configuration(this.C.getResources().getConfiguration());
        this.f596k0 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0112, code lost:
    
        if (r10.equals("ImageButton") == false) goto L80;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.B
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.g.f656z
            monitor-enter(r0)
            androidx.appcompat.app.g.v(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f605t0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.D
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = r3.f607v0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f597l0 = r0
            int r0 = r3.f599n0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.B
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            q.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.C0
            java.lang.Object r1 = r3.B
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f599n0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            q.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.C0
            java.lang.Object r1 = r3.B
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.a r0 = r3.G
            if (r0 == 0) goto L63
            r0.h()
        L63:
            androidx.appcompat.app.AppCompatDelegateImpl$k r0 = r3.f603r0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = r3.f604s0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.p():void");
    }

    @Override // androidx.appcompat.app.g
    public final void q() {
        N();
    }

    @Override // androidx.appcompat.app.g
    public final void r() {
        S();
        androidx.appcompat.app.a aVar = this.G;
        if (aVar != null) {
            aVar.m(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public final void t() {
        E(true, false);
    }

    @Override // androidx.appcompat.app.g
    public final void u() {
        S();
        androidx.appcompat.app.a aVar = this.G;
        if (aVar != null) {
            aVar.m(false);
        }
    }

    @Override // androidx.appcompat.app.g
    public final boolean w(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f590e0 && i10 == 108) {
            return false;
        }
        if (this.Y && i10 == 1) {
            this.Y = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.D.requestFeature(i10);
                            }
                            Y();
                            this.Z = true;
                            return true;
                        }
                        Y();
                        this.Y = true;
                        return true;
                    }
                    Y();
                    this.f588c0 = true;
                    return true;
                }
                Y();
                this.X = true;
                return true;
            }
            Y();
            this.W = true;
            return true;
        }
        Y();
        this.f590e0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.g
    public final void x(int i10) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.C).inflate(i10, viewGroup);
        this.E.a(this.D.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public final void y(View view) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.E.a(this.D.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public final void z(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.E.a(this.D.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public final void s() {
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
