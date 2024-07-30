package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class l extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final b f16819a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f16820b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f16821c;

    /* renamed from: d, reason: collision with root package name */
    private c f16822d;

    /* renamed from: e, reason: collision with root package name */
    private float f16823e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private float f16824g;

    /* renamed from: com.applovin.exoplayer2.ui.l$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16826a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f16826a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16826a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16826a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(Context context) {
        this(context, null);
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f16821c.isEmpty()) {
            b();
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16821c = Collections.emptyList();
        this.f16822d = c.f16703a;
        this.f16823e = 0.0533f;
        this.f = 0;
        this.f16824g = 0.08f;
        b bVar = new b(context, attributeSet);
        this.f16819a = bVar;
        WebView webView = new WebView(context, attributeSet) { // from class: com.applovin.exoplayer2.ui.l.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f16820b = webView;
        webView.setBackgroundColor(0);
        addView(bVar);
        addView(webView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        if (r13 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r21 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        r22 = com.huawei.hms.ads.jsb.constant.Constant.MAP_KEY_TOP;
        r13 = 2;
        r23 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        if (r13 != 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.l.b():void");
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f, int i10, float f10) {
        this.f16822d = cVar;
        this.f16823e = f;
        this.f = i10;
        this.f16824g = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.applovin.exoplayer2.i.a aVar = list.get(i11);
            if (aVar.f15510e != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f16821c.isEmpty() || !arrayList2.isEmpty()) {
            this.f16821c = arrayList2;
            b();
        }
        this.f16819a.a(arrayList, cVar, f, i10, f10);
        invalidate();
    }

    public void a() {
        this.f16820b.destroy();
    }

    private static String a(com.applovin.exoplayer2.i.a aVar) {
        float f = aVar.f15521r;
        if (f == gl.Code) {
            return "";
        }
        int i10 = aVar.f15520q;
        return ai.a("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    private String a(int i10, float f) {
        float a10 = j.a(i10, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return a10 == -3.4028235E38f ? "unset" : ai.a("%.2fpx", Float.valueOf(a10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(c cVar) {
        int i10 = cVar.f16707e;
        if (i10 == 1) {
            return ai.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", e.a(cVar.f));
        }
        if (i10 == 2) {
            return ai.a("0.1em 0.12em 0.15em %s", e.a(cVar.f));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : ai.a("-0.05em -0.05em 0.15em %s", e.a(cVar.f));
        }
        return ai.a("0.06em 0.08em 0.15em %s", e.a(cVar.f));
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = AnonymousClass2.f16826a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }
}
