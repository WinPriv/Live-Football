package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final p f18998a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18999b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19000c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19001d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19002e;

    /* renamed from: h, reason: collision with root package name */
    private Handler f19004h;

    /* renamed from: k, reason: collision with root package name */
    private a f19007k;
    private WeakReference<View> f = new WeakReference<>(null);

    /* renamed from: g, reason: collision with root package name */
    private int f19003g = 0;

    /* renamed from: i, reason: collision with root package name */
    private final HandlerThread f19005i = new HandlerThread("BlackViewDetector");

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f19006j = new Runnable() { // from class: com.applovin.impl.sdk.l.1
        @Override // java.lang.Runnable
        public void run() {
            l.this.b();
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void a(View view);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public l(p pVar) {
        this.f18998a = pVar;
        this.f18999b = pVar.L();
        this.f19000c = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fI)).longValue();
        this.f19001d = ((Long) pVar.a(com.applovin.impl.sdk.c.b.fH)).longValue();
        this.f19002e = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.fJ)).intValue();
    }

    public static /* synthetic */ int d(l lVar) {
        int i10 = lVar.f19003g;
        lVar.f19003g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        long j10 = this.f19000c;
        if (j10 > 0) {
            if (this.f19003g > 1) {
                d();
                a();
                return;
            }
            Handler handler = this.f19004h;
            if (handler != null) {
                handler.postDelayed(this.f19006j, j10);
                return;
            }
            if (y.a()) {
                this.f18999b.d("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            a();
            return;
        }
        if (this.f19003g == 1) {
            d();
        }
        a();
    }

    private void d() {
        final View view = this.f.get();
        if (y.a()) {
            this.f18999b.d("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.3
            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f19007k != null) {
                    l.this.f19007k.a(view);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        View view = this.f.get();
        if (view == null) {
            if (y.a()) {
                this.f18999b.d("BlackViewDetector", "Monitored view no longer exists.");
            }
            a();
            return;
        }
        if (y.a()) {
            this.f18999b.b("BlackViewDetector", "Checking for black view: " + view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new b() { // from class: com.applovin.impl.sdk.l.2
                @Override // com.applovin.impl.sdk.l.b
                public void a(Bitmap bitmap) {
                    int i10 = measuredWidth / l.this.f19002e;
                    int i11 = measuredHeight / l.this.f19002e;
                    int i12 = i10 / 2;
                    for (int i13 = i11 / 2; i13 < measuredHeight; i13 += i11) {
                        for (int i14 = i12; i14 < measuredWidth; i14 += i10) {
                            if (!l.this.a(bitmap.getPixel(i14, i13))) {
                                l.this.f19003g = 0;
                                bitmap.recycle();
                                l.this.c();
                                return;
                            }
                        }
                    }
                    l.d(l.this);
                    bitmap.recycle();
                    l.this.c();
                }

                @Override // com.applovin.impl.sdk.l.b
                public void a(boolean z10) {
                    if (z10) {
                        l.this.a();
                    }
                }
            });
            return;
        }
        if (y.a()) {
            this.f18999b.d("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        this.f19003g = 0;
        c();
    }

    public void a(View view, a aVar) {
        if (((Boolean) this.f18998a.a(com.applovin.impl.sdk.c.b.fG)).booleanValue()) {
            View view2 = this.f.get();
            if (view2 != null) {
                if (y.a()) {
                    this.f18999b.d("BlackViewDetector", "Monitoring is already in progress for a view:" + view2);
                    return;
                }
                return;
            }
            this.f19007k = aVar;
            this.f = new WeakReference<>(view);
            this.f19003g = 0;
            if (y.a()) {
                this.f18999b.b("BlackViewDetector", "Started monitoring view: " + view);
            }
            this.f19005i.start();
            Handler handler = new Handler(this.f19005i.getLooper());
            this.f19004h = handler;
            handler.postDelayed(this.f19006j, this.f19001d);
        }
    }

    public void a() {
        if (this.f.get() == null) {
            return;
        }
        if (y.a()) {
            this.f18999b.b("BlackViewDetector", "Stopped monitoring view: " + this.f.get());
        }
        Handler handler = this.f19004h;
        if (handler != null) {
            handler.removeCallbacks(this.f19006j);
            this.f19004h = null;
            this.f19005i.quit();
        }
        this.f.clear();
        this.f19007k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10) {
        return Color.red(i10) == 0 && Color.blue(i10) == 0 && Color.green(i10) == 0;
    }

    private void a(View view, final b bVar) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        final Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            Activity b10 = this.f18998a.w().b();
            if (b10 == null) {
                if (y.a()) {
                    this.f18999b.e("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                bVar.a(false);
                return;
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            try {
                PixelCopy.request(b10.getWindow(), new Rect(i10, i11, measuredWidth + i10, measuredHeight + i11), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.applovin.impl.sdk.l.4
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public void onPixelCopyFinished(int i12) {
                        if (i12 != 0) {
                            y unused = l.this.f18999b;
                            if (y.a()) {
                                l.this.f18999b.e("BlackViewDetector", "Failed to capture screenshot with error code: " + i12);
                            }
                            bVar.a(true);
                            return;
                        }
                        bVar.a(createBitmap);
                    }
                }, new Handler());
                return;
            } catch (Throwable th) {
                if (y.a()) {
                    this.f18999b.e("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                bVar.a(true);
                return;
            }
        }
        if (y.a()) {
            this.f18999b.d("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        bVar.a(true);
    }
}
