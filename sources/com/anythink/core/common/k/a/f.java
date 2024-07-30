package com.anythink.core.common.k.a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    final int f6097a;

    /* renamed from: b, reason: collision with root package name */
    final ViewTreeObserver.OnPreDrawListener f6098b;

    /* renamed from: c, reason: collision with root package name */
    private int f6099c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<View> f6100d;

    /* renamed from: e, reason: collision with root package name */
    private long f6101e;
    private final Map<View, a> f;

    /* renamed from: g, reason: collision with root package name */
    private final b f6102g;

    /* renamed from: h, reason: collision with root package name */
    private d f6103h;

    /* renamed from: i, reason: collision with root package name */
    private final c f6104i;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f6105j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6106k;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f6108a;

        /* renamed from: b, reason: collision with root package name */
        int f6109b;

        /* renamed from: c, reason: collision with root package name */
        long f6110c;

        /* renamed from: d, reason: collision with root package name */
        View f6111d;

        /* renamed from: e, reason: collision with root package name */
        Integer f6112e;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f6113a = new Rect();

        private static boolean a(long j10, int i10) {
            return SystemClock.uptimeMillis() - j10 >= ((long) i10);
        }

        public final boolean a(View view, View view2, int i10, Integer num) {
            if (view2 == null || !view2.isShown() || view.getParent() == null || view2.getWindowVisibility() != 0 || !view2.getGlobalVisibleRect(this.f6113a)) {
                return false;
            }
            long height = this.f6113a.height() * this.f6113a.width();
            long height2 = view2.getHeight() * view2.getWidth();
            if (height2 <= 0) {
                return false;
            }
            return (num == null || num.intValue() <= 0) ? height * 100 >= ((long) i10) * height2 : height >= ((long) num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<View> f6116c = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<View> f6115b = new ArrayList<>();

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : f.this.f.entrySet()) {
                View view = (View) entry.getKey();
                int i10 = ((a) entry.getValue()).f6108a;
                int i11 = ((a) entry.getValue()).f6109b;
                Integer num = ((a) entry.getValue()).f6112e;
                View view2 = ((a) entry.getValue()).f6111d;
                if (f.this.f6102g.a(view2, view, i10, num)) {
                    this.f6115b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.f6098b);
                    } catch (Throwable unused) {
                    }
                } else if (!f.this.f6102g.a(view2, view, i11, null)) {
                    this.f6116c.add(view);
                }
            }
            if (f.this.f6103h != null) {
                f.this.f6103h.a(this.f6115b);
            }
            this.f6115b.clear();
            this.f6116c.clear();
            f.d(f.this);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(List<View> list);
    }

    public f() {
        this(new WeakHashMap(10), new b(), new Handler(Looper.getMainLooper()));
    }

    public static /* synthetic */ boolean d(f fVar) {
        fVar.f6106k = false;
        return false;
    }

    public final void a(d dVar) {
        this.f6103h = dVar;
    }

    public final void b() {
        a();
        this.f6103h = null;
    }

    public final void c() {
        if (this.f6106k) {
            return;
        }
        this.f6106k = true;
        this.f6105j.postDelayed(this.f6104i, this.f6099c);
    }

    private void a(View view, View view2, int i10, Integer num) {
        a(view, view2, i10, i10, num);
    }

    public f(int i10) {
        this(new WeakHashMap(10), new b(), new Handler(Looper.getMainLooper()));
        this.f6099c = i10;
    }

    public final void a(View view, View view2, int i10, int i11, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                a aVar = this.f.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.f.put(view2, aVar);
                    c();
                }
                int min = Math.min(i11, i10);
                aVar.f6111d = view;
                aVar.f6108a = i10;
                aVar.f6109b = min;
                aVar.f6110c = this.f6101e;
                aVar.f6112e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.f6098b);
                long j10 = this.f6101e + 1;
                this.f6101e = j10;
                if (j10 % 50 == 0) {
                    a(j10 - 50);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private f(Map<View, a> map, b bVar, Handler handler) {
        this.f6099c = 100;
        this.f6097a = 50;
        this.f6101e = 0L;
        this.f = map;
        this.f6102g = bVar;
        this.f6105j = handler;
        this.f6104i = new c();
        this.f6100d = new ArrayList<>(50);
        this.f6098b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.k.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                f.this.c();
                return true;
            }
        };
    }

    private void a(long j10) {
        for (Map.Entry<View, a> entry : this.f.entrySet()) {
            if (entry.getValue().f6110c < j10) {
                this.f6100d.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f6100d.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f6100d.clear();
    }

    public final void a(View view) {
        this.f.remove(view);
    }

    public final void a() {
        this.f.clear();
        this.f6105j.removeMessages(0);
        this.f6106k = false;
    }

    private static boolean a(Context context, View view) {
        View rootView;
        View view2 = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (view2 = rootView.findViewById(R.id.content)) == null) {
            view2 = rootView;
        }
        if (findViewById == null) {
            findViewById = view2;
        }
        return findViewById != null && findViewById.getViewTreeObserver().isAlive();
    }

    private void a(View view, int i10, Integer num) {
        a(view, view, i10, i10, num);
    }
}
