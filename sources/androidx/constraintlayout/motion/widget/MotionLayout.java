package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.q;
import x.b;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements q {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f1310j0 = 0;
    public float I;
    public int J;
    public int K;
    public int L;
    public float M;
    public float N;
    public float O;
    public long P;
    public float Q;
    public c R;
    public w.b S;
    public boolean T;
    public ArrayList<MotionHelper> U;
    public ArrayList<MotionHelper> V;
    public ArrayList<MotionHelper> W;

    /* renamed from: c0, reason: collision with root package name */
    public CopyOnWriteArrayList<c> f1311c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f1312d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f1313e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1314f0;

    /* renamed from: g0, reason: collision with root package name */
    public b f1315g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1316h0;

    /* renamed from: i0, reason: collision with root package name */
    public d f1317i0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f1315g0.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public float f1319a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f1320b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f1321c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f1322d = -1;

        public b() {
        }

        public final void a() {
            androidx.constraintlayout.widget.a aVar;
            b.a aVar2;
            androidx.constraintlayout.widget.a aVar3;
            int i10 = this.f1321c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 != -1 || this.f1322d != -1) {
                d dVar = d.SETUP;
                if (i10 == -1) {
                    int i11 = this.f1322d;
                    if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.f1315g0 == null) {
                            motionLayout.f1315g0 = new b();
                        }
                        motionLayout.f1315g0.f1322d = i11;
                    } else {
                        motionLayout.r(i11, -1);
                    }
                } else {
                    int i12 = this.f1322d;
                    if (i12 == -1) {
                        motionLayout.setState(dVar);
                        motionLayout.K = i10;
                        motionLayout.J = -1;
                        motionLayout.L = -1;
                        x.b bVar = motionLayout.C;
                        if (bVar != null) {
                            float f = -1;
                            int i13 = bVar.f36211b;
                            SparseArray<b.a> sparseArray = bVar.f36213d;
                            int i14 = 0;
                            ConstraintLayout constraintLayout = bVar.f36210a;
                            if (i13 == i10) {
                                if (i10 == -1) {
                                    aVar2 = sparseArray.valueAt(0);
                                } else {
                                    aVar2 = sparseArray.get(i13);
                                }
                                int i15 = bVar.f36212c;
                                if (i15 == -1 || !aVar2.f36216b.get(i15).a(f, f)) {
                                    while (true) {
                                        ArrayList<b.C0502b> arrayList = aVar2.f36216b;
                                        if (i14 < arrayList.size()) {
                                            if (arrayList.get(i14).a(f, f)) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        } else {
                                            i14 = -1;
                                            break;
                                        }
                                    }
                                    if (bVar.f36212c != i14) {
                                        ArrayList<b.C0502b> arrayList2 = aVar2.f36216b;
                                        if (i14 == -1) {
                                            aVar3 = null;
                                        } else {
                                            aVar3 = arrayList2.get(i14).f;
                                        }
                                        if (i14 != -1) {
                                            int i16 = arrayList2.get(i14).f36223e;
                                        }
                                        if (aVar3 != null) {
                                            bVar.f36212c = i14;
                                            aVar3.a(constraintLayout);
                                            constraintLayout.setConstraintSet(null);
                                            constraintLayout.requestLayout();
                                        }
                                    }
                                }
                            } else {
                                bVar.f36211b = i10;
                                b.a aVar4 = sparseArray.get(i10);
                                while (true) {
                                    ArrayList<b.C0502b> arrayList3 = aVar4.f36216b;
                                    if (i14 < arrayList3.size()) {
                                        if (arrayList3.get(i14).a(f, f)) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    } else {
                                        i14 = -1;
                                        break;
                                    }
                                }
                                ArrayList<b.C0502b> arrayList4 = aVar4.f36216b;
                                if (i14 == -1) {
                                    aVar = aVar4.f36218d;
                                } else {
                                    aVar = arrayList4.get(i14).f;
                                }
                                if (i14 != -1) {
                                    int i17 = arrayList4.get(i14).f36223e;
                                }
                                if (aVar == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =-1.0, -1.0");
                                } else {
                                    bVar.f36212c = i14;
                                    aVar.a(constraintLayout);
                                    constraintLayout.setConstraintSet(null);
                                    constraintLayout.requestLayout();
                                }
                            }
                        }
                    } else if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.f1315g0 == null) {
                            motionLayout.f1315g0 = new b();
                        }
                        b bVar2 = motionLayout.f1315g0;
                        bVar2.f1321c = i10;
                        bVar2.f1322d = i12;
                    }
                }
                motionLayout.setState(dVar);
            }
            if (Float.isNaN(this.f1320b)) {
                if (Float.isNaN(this.f1319a)) {
                    return;
                }
                motionLayout.setProgress(this.f1319a);
                return;
            }
            float f10 = this.f1319a;
            float f11 = this.f1320b;
            if (!motionLayout.isAttachedToWindow()) {
                if (motionLayout.f1315g0 == null) {
                    motionLayout.f1315g0 = new b();
                }
                b bVar3 = motionLayout.f1315g0;
                bVar3.f1319a = f10;
                bVar3.f1320b = f11;
            } else {
                motionLayout.setProgress(f10);
                motionLayout.setState(d.MOVING);
                motionLayout.I = f11;
            }
            this.f1319a = Float.NaN;
            this.f1320b = Float.NaN;
            this.f1321c = -1;
            this.f1322d = -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public enum d {
        /* JADX INFO: Fake field, exist only in values array */
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        ArrayList<MotionHelper> arrayList = this.W;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        if (this.P == -1) {
            this.P = getNanoTime();
        }
        float f = this.O;
        if (f > gl.Code && f < 1.0f) {
            this.K = -1;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (this.T) {
            float signum = Math.signum(this.Q - f);
            long nanoTime = getNanoTime();
            float f10 = ((((float) (nanoTime - this.P)) * signum) * 1.0E-9f) / this.M;
            float f11 = this.O + f10;
            if ((signum > gl.Code && f11 >= this.Q) || (signum <= gl.Code && f11 <= this.Q)) {
                f11 = this.Q;
            }
            this.O = f11;
            this.N = f11;
            this.P = nanoTime;
            this.I = f10;
            if (Math.abs(f10) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((signum > gl.Code && f11 >= this.Q) || (signum <= gl.Code && f11 <= this.Q)) {
                f11 = this.Q;
            }
            d dVar = d.FINISHED;
            if (f11 >= 1.0f || f11 <= gl.Code) {
                setState(dVar);
            }
            int childCount = getChildCount();
            this.T = false;
            getNanoTime();
            if (childCount <= 0) {
                if ((signum > gl.Code && f11 >= this.Q) || (signum <= gl.Code && f11 <= this.Q)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!this.T && z10) {
                    setState(dVar);
                }
                boolean z13 = (!z10) | this.T;
                this.T = z13;
                if (f11 <= gl.Code && (i10 = this.J) != -1 && this.K != i10) {
                    this.K = i10;
                    throw null;
                }
                if (f11 >= 1.0d) {
                    int i11 = this.K;
                    int i12 = this.L;
                    if (i11 != i12) {
                        this.K = i12;
                        throw null;
                    }
                }
                if (!z13) {
                    if ((signum > gl.Code && f11 == 1.0f) || (signum < gl.Code && f11 == gl.Code)) {
                        setState(dVar);
                    }
                } else {
                    invalidate();
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f12 = this.O;
        if (f12 >= 1.0f) {
            int i13 = this.K;
            int i14 = this.L;
            if (i13 == i14) {
                z11 = false;
            }
            this.K = i14;
        } else {
            if (f12 <= gl.Code) {
                int i15 = this.K;
                int i16 = this.J;
                if (i15 == i16) {
                    z11 = false;
                }
                this.K = i16;
            }
            if (z12 && !this.f1314f0) {
                requestLayout();
            }
            this.N = this.O;
            super.dispatchDraw(canvas);
        }
        z12 = z11;
        if (z12) {
            requestLayout();
        }
        this.N = this.O;
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void f(int i10) {
        this.C = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.K;
    }

    public ArrayList<a.C0012a> getDefinedTransitions() {
        return null;
    }

    public w.b getDesignTool() {
        if (this.S == null) {
            this.S = new w.b();
        }
        return this.S;
    }

    public int getEndState() {
        return this.L;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.O;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return null;
    }

    public int getStartState() {
        return this.J;
    }

    public float getTargetPosition() {
        return this.Q;
    }

    public Bundle getTransitionState() {
        if (this.f1315g0 == null) {
            this.f1315g0 = new b();
        }
        b bVar = this.f1315g0;
        MotionLayout motionLayout = MotionLayout.this;
        bVar.f1322d = motionLayout.L;
        bVar.f1321c = motionLayout.J;
        bVar.f1320b = motionLayout.getVelocity();
        bVar.f1319a = motionLayout.getProgress();
        b bVar2 = this.f1315g0;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f1319a);
        bundle.putFloat("motion.velocity", bVar2.f1320b);
        bundle.putInt("motion.StartState", bVar2.f1321c);
        bundle.putInt("motion.EndState", bVar2.f1322d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return this.M * 1000.0f;
    }

    public float getVelocity() {
        return this.I;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // n0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
    }

    @Override // n0.p
    public final boolean m(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // n0.p
    public final void n(View view, View view2, int i10, int i11) {
        getNanoTime();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.f1315g0;
        if (bVar != null) {
            if (this.f1316h0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1314f0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f1314f0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f10) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f1311c0 == null) {
                this.f1311c0 = new CopyOnWriteArrayList<>();
            }
            this.f1311c0.add(motionHelper);
            if (motionHelper.A) {
                if (this.U == null) {
                    this.U = new ArrayList<>();
                }
                this.U.add(motionHelper);
            }
            if (motionHelper.B) {
                if (this.V == null) {
                    this.V = new ArrayList<>();
                }
                this.V.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.W == null) {
                    this.W = new ArrayList<>();
                }
                this.W.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.U;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.V;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.R != null || ((copyOnWriteArrayList = this.f1311c0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1313e0 != this.N) {
            if (this.f1312d0 != -1) {
                c cVar = this.R;
                if (cVar != null) {
                    cVar.b();
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f1311c0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
            }
            this.f1312d0 = -1;
            this.f1313e0 = this.N;
            c cVar2 = this.R;
            if (cVar2 != null) {
                cVar2.a();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.f1311c0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<c> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    public final void q() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.R == null && ((copyOnWriteArrayList = this.f1311c0) == null || copyOnWriteArrayList.isEmpty())) || this.f1312d0 != -1) {
            if (this.R == null) {
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f1311c0;
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                    return;
                } else {
                    throw null;
                }
            }
            throw null;
        }
        this.f1312d0 = this.K;
        throw null;
    }

    public final void r(int i10, int i11) {
        int i12 = this.K;
        if (i12 == i10) {
            return;
        }
        if (this.J == i10) {
            if (i11 > 0) {
                this.M = i11 / 1000.0f;
                return;
            }
            return;
        }
        if (this.L == i10) {
            if (i11 > 0) {
                this.M = i11 / 1000.0f;
                return;
            }
            return;
        }
        this.L = i10;
        if (i12 != -1) {
            if (!isAttachedToWindow()) {
                if (this.f1315g0 == null) {
                    this.f1315g0 = new b();
                }
                b bVar = this.f1315g0;
                bVar.f1321c = i12;
                bVar.f1322d = i10;
            }
            this.O = gl.Code;
            if (i11 > 0) {
                this.M = i11 / 1000.0f;
                return;
            }
            return;
        }
        this.Q = 1.0f;
        this.N = gl.Code;
        this.O = gl.Code;
        this.P = getNanoTime();
        getNanoTime();
        if (i11 == -1) {
            throw null;
        }
        this.J = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i10 = this.K;
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f1316h0 = z10;
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.V.get(i10).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.U.get(i10).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < gl.Code || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1315g0 == null) {
                this.f1315g0 = new b();
            }
            this.f1315g0.f1319a = f;
            return;
        }
        d dVar = d.FINISHED;
        d dVar2 = d.MOVING;
        if (f <= gl.Code) {
            if (this.O == 1.0f && this.K == this.L) {
                setState(dVar2);
            }
            this.K = this.J;
            if (this.O == gl.Code) {
                setState(dVar);
                return;
            }
            return;
        }
        if (f >= 1.0f) {
            if (this.O == gl.Code && this.K == this.J) {
                setState(dVar2);
            }
            this.K = this.L;
            if (this.O == 1.0f) {
                setState(dVar);
                return;
            }
            return;
        }
        this.K = -1;
        setState(dVar2);
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        e();
        throw null;
    }

    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f1315g0 == null) {
                this.f1315g0 = new b();
            }
            b bVar = this.f1315g0;
            bVar.f1321c = i10;
            bVar.f1322d = i10;
            return;
        }
        this.K = i10;
    }

    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.K == -1) {
            return;
        }
        d dVar3 = this.f1317i0;
        this.f1317i0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            p();
        }
        int ordinal = dVar3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && dVar == dVar2) {
                q();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            p();
        }
        if (dVar == dVar2) {
            q();
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.R = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1315g0 == null) {
            this.f1315g0 = new b();
        }
        b bVar = this.f1315g0;
        bVar.getClass();
        bVar.f1319a = bundle.getFloat("motion.progress");
        bVar.f1320b = bundle.getFloat("motion.velocity");
        bVar.f1321c = bundle.getInt("motion.StartState");
        bVar.f1322d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f1315g0.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return w.a.b(this.J, context) + "->" + w.a.b(this.L, context) + " (pos:" + this.O + " Dpos/Dt:" + this.I;
    }

    public void setTransition(a.C0012a c0012a) {
        throw null;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
    }

    public void setInteractionEnabled(boolean z10) {
    }

    @Override // n0.p
    public final void j(int i10, View view) {
    }

    @Override // n0.p
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // n0.p
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
