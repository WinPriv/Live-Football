package com.huawei.openalliance.ad.ppskit.views.linkscroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.Scroller;
import bb.b;
import bb.c;
import com.huawei.hms.ads.gl;
import ka.n7;

/* loaded from: classes2.dex */
public class LinkScrollWebView extends WebView implements bb.a {
    public Scroller A;
    public a B;
    public int C;
    public RectF D;
    public Paint E;
    public float[] F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: s, reason: collision with root package name */
    public int f23494s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f23495t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f23496u;

    /* renamed from: v, reason: collision with root package name */
    public int f23497v;

    /* renamed from: w, reason: collision with root package name */
    public c f23498w;

    /* renamed from: x, reason: collision with root package name */
    public VelocityTracker f23499x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f23500z;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public LinkScrollWebView(Context context) {
        super(context);
        this.f23495t = new int[2];
        this.f23496u = new int[2];
        this.C = -1;
        this.f23498w = new c(this);
        setLinkScrollEnabled(true);
        this.A = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23500z = viewConfiguration.getScaledMinimumFlingVelocity();
        this.C = getScrollY();
        this.D = new RectF();
        Paint paint = new Paint();
        this.E = paint;
        paint.setStyle(Paint.Style.FILL);
        this.E.setAntiAlias(true);
        this.E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        c cVar = this.f23498w;
        if (cVar == null || !cVar.f3183c || cVar.f3182b == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr == null) {
                return false;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        View view = cVar.f3181a;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        ViewParent viewParent = cVar.f3182b;
        if (viewParent instanceof b) {
            ((b) viewParent).d();
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    public final boolean b(int i10, int[] iArr, int[] iArr2) {
        int i11;
        int i12;
        c cVar = this.f23498w;
        if (cVar == null || !cVar.f3183c || cVar.f3182b == null) {
            return false;
        }
        if (i10 != 0) {
            View view = cVar.f3181a;
            if (iArr2 != null) {
                view.getLocationInWindow(iArr2);
                i11 = iArr2[0];
                i12 = iArr2[1];
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (iArr == null) {
                if (cVar.f3184d == null) {
                    cVar.f3184d = new int[2];
                }
                iArr = cVar.f3184d;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            ViewParent viewParent = cVar.f3182b;
            if (viewParent instanceof b) {
                ((b) viewParent).e(view, i10, iArr);
            }
            if (iArr2 != null) {
                view.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i11;
                iArr2[1] = iArr2[1] - i12;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        }
        if (iArr2 == null) {
            return false;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        return false;
    }

    public final void c(int i10) {
        n7.b("LinkScrollWebView", "flingScroll");
        Scroller scroller = this.A;
        if (scroller != null) {
            scroller.fling(0, getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        invalidate();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
        Scroller scroller = this.A;
        if (scroller != null && scroller.computeScrollOffset()) {
            scrollTo(0, this.A.getCurrY());
            invalidate();
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        super.destroy();
        this.f23498w = null;
        this.B = null;
        this.A = null;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.I) {
            Path path = new Path();
            path.setFillType(Path.FillType.INVERSE_WINDING);
            this.D.set(getScrollX(), getScrollY(), getScrollX() + this.G, getScrollY() + this.H);
            path.addRoundRect(this.D, this.F, Path.Direction.CW);
            canvas.drawPath(path, this.E);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        a aVar;
        super.onScrollChanged(i10, i11, i12, i13);
        if (!canScrollVertically(-1) && (aVar = this.B) != null) {
            int i14 = LinkScrollView.B;
            LinkScrollView linkScrollView = LinkScrollView.this;
            if (linkScrollView.f()) {
                if (linkScrollView.f23492z != -1) {
                    n7.b("LinkScrollView", "fling orientation invalid, parent can not fling.");
                    return;
                }
                if (linkScrollView.f23488u == linkScrollView.getScrollY()) {
                    Scroller scroller = linkScrollView.f23491x;
                    if (scroller.computeScrollOffset()) {
                        float currVelocity = scroller.getCurrVelocity();
                        if (currVelocity >= gl.Code) {
                            currVelocity = -currVelocity;
                        }
                        scroller.abortAnimation();
                        linkScrollView.b(currVelocity);
                    }
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.G = i10;
        this.H = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:3:0x0008, B:5:0x0014, B:7:0x001f, B:8:0x0022, B:10:0x0030, B:12:0x003c, B:17:0x0046, B:19:0x004a, B:21:0x0052, B:23:0x0056, B:32:0x0061, B:34:0x0065, B:25:0x006b, B:27:0x006f, B:29:0x0072, B:38:0x0077, B:40:0x007b, B:41:0x0085, B:44:0x0082, B:47:0x0092, B:49:0x0096, B:50:0x009c, B:52:0x00ae, B:53:0x00be, B:55:0x00d3, B:56:0x00e5, B:58:0x00e9, B:60:0x00ed, B:71:0x0103, B:74:0x010e, B:76:0x0112, B:77:0x0118, B:79:0x0133, B:80:0x0138, B:84:0x0143, B:85:0x0148, B:87:0x014d, B:89:0x0151, B:91:0x0155, B:93:0x0159, B:96:0x0165, B:98:0x0168, B:100:0x016c, B:102:0x0170, B:104:0x0174, B:105:0x0179, B:106:0x017b), top: B:2:0x0008 }] */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.linkscroll.LinkScrollWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setLinkScrollEnabled(boolean z10) {
        c cVar;
        ViewParent viewParent;
        c cVar2 = this.f23498w;
        if (cVar2 != null) {
            if (cVar2.f3183c) {
                View view = cVar2.f3181a;
                if ((view instanceof bb.a) && (cVar = ((LinkScrollWebView) view).f23498w) != null && (viewParent = cVar.f3182b) != null) {
                    if (viewParent instanceof b) {
                        ((b) viewParent).c();
                    }
                    cVar.f3182b = null;
                }
            }
            cVar2.f3183c = z10;
        }
    }

    public void setRadiusArray(float[] fArr) {
        this.F = fArr;
    }

    public void setScrollListener(a aVar) {
        this.B = aVar;
    }

    public void setSupportWebViewRadius(boolean z10) {
        this.I = z10;
    }
}
