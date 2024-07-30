package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f866a;

    /* renamed from: b, reason: collision with root package name */
    public final h f867b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f868c;

    /* renamed from: d, reason: collision with root package name */
    public final int f869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f870e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public int f871g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f872h;

    /* renamed from: i, reason: collision with root package name */
    public m.a f873i;

    /* renamed from: j, reason: collision with root package name */
    public k f874j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f875k;

    /* renamed from: l, reason: collision with root package name */
    public final a f876l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            l.this.c();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, h hVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, hVar, z10);
    }

    public final k a() {
        boolean z10;
        k qVar;
        if (this.f874j == null) {
            Context context = this.f866a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                qVar = new d(this.f866a, this.f, this.f869d, this.f870e, this.f868c);
            } else {
                Context context2 = this.f866a;
                h hVar = this.f867b;
                qVar = new q(this.f869d, this.f870e, context2, this.f, hVar, this.f868c);
            }
            qVar.m(this.f867b);
            qVar.s(this.f876l);
            qVar.o(this.f);
            qVar.e(this.f873i);
            qVar.p(this.f872h);
            qVar.q(this.f871g);
            this.f874j = qVar;
        }
        return this.f874j;
    }

    public final boolean b() {
        k kVar = this.f874j;
        if (kVar != null && kVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f874j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f875k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        k a10 = a();
        a10.t(z11);
        if (z10) {
            int i12 = this.f871g;
            View view = this.f;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if ((Gravity.getAbsoluteGravity(i12, c0.e.d(view)) & 7) == 5) {
                i10 -= this.f.getWidth();
            }
            a10.r(i10);
            a10.u(i11);
            int i13 = (int) ((this.f866a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f865s = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.show();
    }

    public l(int i10, int i11, Context context, View view, h hVar, boolean z10) {
        this.f871g = 8388611;
        this.f876l = new a();
        this.f866a = context;
        this.f867b = hVar;
        this.f = view;
        this.f868c = z10;
        this.f869d = i10;
        this.f870e = i11;
    }
}
