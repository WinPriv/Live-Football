package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.huawei.hms.ads.gl;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class z implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int[] A = new int[2];

    /* renamed from: s, reason: collision with root package name */
    public final float f1283s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1284t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1285u;

    /* renamed from: v, reason: collision with root package name */
    public final View f1286v;

    /* renamed from: w, reason: collision with root package name */
    public a f1287w;

    /* renamed from: x, reason: collision with root package name */
    public b f1288x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f1289z;

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = z.this.f1286v.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            z zVar = z.this;
            zVar.a();
            View view = zVar.f1286v;
            if (view.isEnabled() && !view.isLongClickable() && zVar.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, gl.Code, gl.Code, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                zVar.y = true;
            }
        }
    }

    public z(View view) {
        this.f1286v = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1283s = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1284t = tapTimeout;
        this.f1285u = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f1288x;
        View view = this.f1286v;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1287w;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract androidx.appcompat.view.menu.p b();

    public abstract boolean c();

    public boolean d() {
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.y = false;
        this.f1289z = -1;
        a aVar = this.f1287w;
        if (aVar != null) {
            this.f1286v.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
