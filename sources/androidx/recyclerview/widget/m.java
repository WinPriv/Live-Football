package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import j0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal<m> f2346w = new ThreadLocal<>();

    /* renamed from: x, reason: collision with root package name */
    public static final a f2347x = new a();

    /* renamed from: t, reason: collision with root package name */
    public long f2349t;

    /* renamed from: u, reason: collision with root package name */
    public long f2350u;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList<RecyclerView> f2348s = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList<c> f2351v = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.m.c r7, androidx.recyclerview.widget.m.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2359d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2359d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f2356a
                boolean r3 = r8.f2356a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f2357b
                int r2 = r7.f2357b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f2358c
                int r8 = r8.f2358c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        public int f2352a;

        /* renamed from: b, reason: collision with root package name */
        public int f2353b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f2354c;

        /* renamed from: d, reason: collision with root package name */
        public int f2355d;

        public final void a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    int i12 = this.f2355d * 2;
                    int[] iArr = this.f2354c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f2354c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i12 >= iArr.length) {
                        int[] iArr3 = new int[i12 * 2];
                        this.f2354c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f2354c;
                    iArr4[i12] = i10;
                    iArr4[i12 + 1] = i11;
                    this.f2355d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            this.f2355d = 0;
            int[] iArr = this.f2354c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.f2158i) {
                if (z10) {
                    if (!recyclerView.mAdapterHelper.g()) {
                        oVar.i(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.h(this.f2352a, this.f2353b, recyclerView.mState, this);
                }
                int i10 = this.f2355d;
                if (i10 > oVar.f2159j) {
                    oVar.f2159j = i10;
                    oVar.f2160k = z10;
                    recyclerView.mRecycler.l();
                }
            }
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2356a;

        /* renamed from: b, reason: collision with root package name */
        public int f2357b;

        /* renamed from: c, reason: collision with root package name */
        public int f2358c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f2359d;

        /* renamed from: e, reason: collision with root package name */
        public int f2360e;
    }

    public static RecyclerView.c0 c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int h10 = recyclerView.mChildHelper.h();
        int i11 = 0;
        while (true) {
            if (i11 < h10) {
                RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i11));
                if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.c0 j11 = vVar.j(j10, i10);
            if (j11 != null) {
                if (j11.isBound() && !j11.isInvalid()) {
                    vVar.g(j11.itemView);
                } else {
                    vVar.a(j11, false);
                }
            }
            return j11;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f2349t == 0) {
            this.f2349t = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f2352a = i10;
        bVar.f2353b = i11;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z10;
        ArrayList<RecyclerView> arrayList = this.f2348s;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i10 += recyclerView3.mPrefetchRegistry.f2355d;
            }
        }
        ArrayList<c> arrayList2 = this.f2351v;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.f2353b) + Math.abs(bVar.f2352a);
                for (int i14 = 0; i14 < bVar.f2355d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar.f2354c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar2.f2356a = z10;
                    cVar2.f2357b = abs;
                    cVar2.f2358c = i15;
                    cVar2.f2359d = recyclerView4;
                    cVar2.f2360e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f2347x);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i16)).f2359d) != null; i16++) {
            if (cVar.f2356a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            RecyclerView.c0 c10 = c(recyclerView, cVar.f2360e, j11);
            if (c10 != null && c10.mNestedRecyclerView != null && c10.isBound() && !c10.isInvalid() && (recyclerView2 = c10.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2355d != 0) {
                    try {
                        int i17 = j0.i.f29566a;
                        i.a.a("RV Nested Prefetch");
                        RecyclerView.z zVar = recyclerView2.mState;
                        RecyclerView.g gVar = recyclerView2.mAdapter;
                        zVar.f2204d = 1;
                        zVar.f2205e = gVar.getItemCount();
                        zVar.f2206g = false;
                        zVar.f2207h = false;
                        zVar.f2208i = false;
                        for (int i18 = 0; i18 < bVar2.f2355d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f2354c[i18], j10);
                        }
                        i.a.b();
                        cVar.f2356a = false;
                        cVar.f2357b = 0;
                        cVar.f2358c = 0;
                        cVar.f2359d = null;
                        cVar.f2360e = 0;
                    } catch (Throwable th) {
                        int i19 = j0.i.f29566a;
                        i.a.b();
                        throw th;
                    }
                }
            }
            cVar.f2356a = false;
            cVar.f2357b = 0;
            cVar.f2358c = 0;
            cVar.f2359d = null;
            cVar.f2360e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = j0.i.f29566a;
            i.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f2348s;
            if (arrayList.isEmpty()) {
                this.f2349t = 0L;
                i.a.b();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f2349t = 0L;
                i.a.b();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f2350u);
                this.f2349t = 0L;
                i.a.b();
            }
        } catch (Throwable th) {
            this.f2349t = 0L;
            int i12 = j0.i.f29566a;
            i.a.b();
            throw th;
        }
    }
}
