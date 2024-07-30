package cn.iwgang.countdownview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import b9.x;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import f2.c;

/* loaded from: classes.dex */
public class CountdownView extends View {

    /* renamed from: s, reason: collision with root package name */
    public final f2.b f3486s;

    /* renamed from: t, reason: collision with root package name */
    public a f3487t;

    /* renamed from: u, reason: collision with root package name */
    public b f3488u;

    /* renamed from: v, reason: collision with root package name */
    public c f3489v;

    /* renamed from: w, reason: collision with root package name */
    public long f3490w;

    /* renamed from: x, reason: collision with root package name */
    public long f3491x;
    public long y;

    /* loaded from: classes.dex */
    public class a extends f2.c {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // f2.c
        public final void a() {
            CountdownView countdownView = CountdownView.this;
            f2.b bVar = countdownView.f3486s;
            bVar.f27990a = 0;
            bVar.f27992b = 0;
            bVar.f27994c = 0;
            bVar.f27996d = 0;
            bVar.f27998e = 0;
            countdownView.invalidate();
            b bVar2 = countdownView.f3488u;
            if (bVar2 != null) {
                int i10 = WatchActivity.I;
                ((x) bVar2).f3178a.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public CountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f2.b aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f9f0);
        if (obtainStyledAttributes.getBoolean(1, true)) {
            aVar = new f2.b();
        } else {
            aVar = new f2.a();
        }
        this.f3486s = aVar;
        aVar.f(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        aVar.W = !TextUtils.isEmpty(aVar.f28018p);
        aVar.X = !TextUtils.isEmpty(aVar.f28020q);
        aVar.Y = !TextUtils.isEmpty(aVar.f28022r);
        aVar.Z = !TextUtils.isEmpty(aVar.f28024s);
        boolean z10 = !TextUtils.isEmpty(aVar.f28026t);
        aVar.f27991a0 = z10;
        if ((aVar.f && aVar.W) || ((aVar.f28001g && aVar.X) || ((aVar.f28003h && aVar.Y) || ((aVar.f28005i && aVar.Z) || (aVar.f28007j && z10))))) {
            aVar.f27993b0 = true;
        }
        aVar.f28031v0 = aVar.f28022r;
        aVar.f28033w0 = aVar.f28024s;
        aVar.e();
        aVar.g();
        if (!aVar.f28005i) {
            aVar.f28007j = false;
        }
        aVar.h();
    }

    public final int a(int i10, int i11, int i12) {
        int paddingTop;
        int paddingBottom;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == 1073741824) {
            return Math.max(i11, size);
        }
        if (i10 == 1) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        return paddingBottom + paddingTop + i11;
    }

    public final void b(long j10) {
        long j11;
        if (j10 <= 0) {
            return;
        }
        this.f3490w = 0L;
        a aVar = this.f3487t;
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f28039d = true;
                aVar.f28040e.removeMessages(1);
            }
            this.f3487t = null;
        }
        if (this.f3486s.f28007j) {
            c(j10);
            j11 = 10;
        } else {
            j11 = 1000;
        }
        a aVar2 = new a(j10, j11);
        this.f3487t = aVar2;
        synchronized (aVar2) {
            long j12 = aVar2.f28036a;
            synchronized (aVar2) {
                aVar2.f28039d = false;
                if (j12 <= 0) {
                    aVar2.a();
                } else {
                    aVar2.f28038c = SystemClock.elapsedRealtime() + j12;
                    c.a aVar3 = aVar2.f28040e;
                    aVar3.sendMessage(aVar3.obtainMessage(1));
                }
            }
        }
    }

    public final void c(long j10) {
        int i10;
        int i11;
        boolean z10;
        this.y = j10;
        f2.b bVar = this.f3486s;
        boolean z11 = false;
        if (!bVar.f28009k) {
            i11 = (int) (j10 / 86400000);
            i10 = (int) ((j10 % 86400000) / 3600000);
        } else {
            i10 = (int) (j10 / 3600000);
            i11 = 0;
        }
        bVar.f27990a = i11;
        bVar.f27992b = i10;
        bVar.f27994c = (int) ((j10 % 3600000) / 60000);
        bVar.f27996d = (int) ((j10 % 60000) / 1000);
        bVar.f27998e = (int) (j10 % 1000);
        long j11 = this.f3491x;
        if (j11 > 0 && this.f3489v != null) {
            long j12 = this.f3490w;
            if (j12 == 0) {
                this.f3490w = j10;
            } else if (j11 + j10 <= j12) {
                this.f3490w = j10;
            }
        }
        if (!bVar.f28011l) {
            boolean z12 = bVar.f;
            if (!z12 && i11 > 0) {
                if (!bVar.f28013m) {
                    bVar.k(true, true, bVar.f28003h, bVar.f28005i, bVar.f28007j);
                } else {
                    bVar.k(true, bVar.f28001g, bVar.f28003h, bVar.f28005i, bVar.f28007j);
                }
            } else if (z12 && i11 == 0) {
                bVar.k(false, bVar.f28001g, bVar.f28003h, bVar.f28005i, bVar.f28007j);
            } else {
                if (!bVar.f28013m) {
                    boolean z13 = bVar.f28001g;
                    if (!z13 && (i11 > 0 || i10 > 0)) {
                        bVar.k(z12, true, bVar.f28003h, bVar.f28005i, bVar.f28007j);
                    } else if (z13 && i11 == 0 && i10 == 0) {
                        bVar.k(false, false, bVar.f28003h, bVar.f28005i, bVar.f28007j);
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            if (!bVar.f28013m) {
                boolean z14 = bVar.f28001g;
                if (!z14 && (i11 > 0 || i10 > 0)) {
                    bVar.k(bVar.f, true, bVar.f28003h, bVar.f28005i, bVar.f28007j);
                } else if (z14 && i11 == 0 && i10 == 0) {
                    bVar.k(bVar.f, false, bVar.f28003h, bVar.f28005i, bVar.f28007j);
                }
                z10 = true;
            }
            z10 = false;
        }
        if (!z10) {
            if (bVar.f) {
                boolean z15 = bVar.f28035z;
                if (!z15 && bVar.f27990a > 99) {
                    bVar.f28035z = true;
                } else if (z15 && bVar.f27990a <= 99) {
                    bVar.f28035z = false;
                }
                z11 = true;
            }
            if (!z11) {
                invalidate();
                return;
            }
        }
        bVar.g();
        bVar.h();
        requestLayout();
    }

    public int getDay() {
        return this.f3486s.f27990a;
    }

    public int getHour() {
        return this.f3486s.f27992b;
    }

    public int getMinute() {
        return this.f3486s.f27994c;
    }

    public long getRemainTime() {
        return this.y;
    }

    public int getSecond() {
        return this.f3486s.f27996d;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f3487t;
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f28039d = true;
                aVar.f28040e.removeMessages(1);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3486s.i(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        f2.b bVar = this.f3486s;
        int b10 = bVar.b();
        int a10 = bVar.a();
        int a11 = a(1, b10, i10);
        int a12 = a(2, a10, i11);
        setMeasuredDimension(a11, a12);
        this.f3486s.j(this, a11, a12, b10, a10);
    }

    public void setOnCountdownEndListener(b bVar) {
        this.f3488u = bVar;
    }
}
