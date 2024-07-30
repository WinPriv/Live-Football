package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import d6.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* renamed from: s, reason: collision with root package name */
    public final CanvasSubtitleOutput f20329s;

    /* renamed from: t, reason: collision with root package name */
    public final WebView f20330t;

    /* renamed from: u, reason: collision with root package name */
    public List<r5.a> f20331u;

    /* renamed from: v, reason: collision with root package name */
    public b f20332v;

    /* renamed from: w, reason: collision with root package name */
    public float f20333w;

    /* renamed from: x, reason: collision with root package name */
    public int f20334x;
    public float y;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20335a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f20335a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20335a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20335a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        super(context, null);
        this.f20331u = Collections.emptyList();
        this.f20332v = b.f20336g;
        this.f20333w = 0.0533f;
        this.f20334x = 0;
        this.y = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f20329s = canvasSubtitleOutput;
        WebView webView = new WebView(context) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public final boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f20330t = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List<r5.a> list, b bVar, float f, int i10, float f10) {
        this.f20332v = bVar;
        this.f20333w = f;
        this.f20334x = i10;
        this.y = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r5.a aVar = list.get(i11);
            if (aVar.f34897v != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f20331u.isEmpty() || !arrayList2.isEmpty()) {
            this.f20331u = arrayList2;
            c();
        }
        this.f20329s.a(arrayList, bVar, f, i10, f10);
        invalidate();
    }

    public final String b(float f, int i10) {
        float b10 = h.b(i10, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (b10 == -3.4028235E38f) {
            return "unset";
        }
        return g0.l("%.2fpx", Float.valueOf(b10 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0488, code lost:
    
        if (((android.text.style.TypefaceSpan) r15).getFamily() != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01d8, code lost:
    
        if (r3 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01e0, code lost:
    
        r0 = 2;
        r24 = r23;
        r23 = com.huawei.hms.ads.jsb.constant.Constant.MAP_KEY_TOP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01de, code lost:
    
        r23 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01db, code lost:
    
        if (r3 != 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f20331u.isEmpty()) {
            c();
        }
    }
}
