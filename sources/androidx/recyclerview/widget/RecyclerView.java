package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.z;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j0.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n0.c0;
import n0.g0;
import n0.l0;
import o0.g;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements n0.n {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.v mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    androidx.recyclerview.widget.b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.m mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<c0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    m.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final List<w> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private n0.o mScrollingChildHelper;
    final z mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final b0 mViewFlinger;
    private final a0.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.a0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.mIsAttached) {
                    recyclerView.requestLayout();
                } else if (recyclerView.mLayoutSuppressed) {
                    recyclerView.mLayoutWasDefered = true;
                } else {
                    recyclerView.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j10;
            long j11;
            RecyclerView recyclerView = RecyclerView.this;
            l lVar = recyclerView.mItemAnimator;
            if (lVar != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) lVar;
                ArrayList<c0> arrayList = kVar.f2298h;
                boolean z10 = !arrayList.isEmpty();
                ArrayList<k.b> arrayList2 = kVar.f2300j;
                boolean z11 = !arrayList2.isEmpty();
                ArrayList<k.a> arrayList3 = kVar.f2301k;
                boolean z12 = !arrayList3.isEmpty();
                ArrayList<c0> arrayList4 = kVar.f2299i;
                boolean z13 = !arrayList4.isEmpty();
                if (z10 || z11 || z13 || z12) {
                    Iterator<c0> it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j10 = kVar.f2146d;
                        if (!hasNext) {
                            break;
                        }
                        c0 next = it.next();
                        View view = next.itemView;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f2306q.add(next);
                        animate.setDuration(j10).alpha(gl.Code).setListener(new androidx.recyclerview.widget.f(view, animate, kVar, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z11) {
                        ArrayList<k.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        kVar.f2303m.add(arrayList5);
                        arrayList2.clear();
                        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(kVar, arrayList5);
                        if (z10) {
                            View view2 = arrayList5.get(0).f2313a.itemView;
                            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                            c0.d.n(view2, cVar, j10);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z12) {
                        ArrayList<k.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        kVar.f2304n.add(arrayList6);
                        arrayList3.clear();
                        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(kVar, arrayList6);
                        if (z10) {
                            View view3 = arrayList6.get(0).f2308a.itemView;
                            WeakHashMap<View, l0> weakHashMap2 = n0.c0.f33054a;
                            c0.d.n(view3, dVar, j10);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z13) {
                        ArrayList<c0> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        kVar.f2302l.add(arrayList7);
                        arrayList4.clear();
                        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(kVar, arrayList7);
                        if (!z10 && !z11 && !z12) {
                            eVar.run();
                        } else {
                            long j12 = 0;
                            if (!z10) {
                                j10 = 0;
                            }
                            if (z11) {
                                j11 = kVar.f2147e;
                            } else {
                                j11 = 0;
                            }
                            if (z12) {
                                j12 = kVar.f;
                            }
                            long max = Math.max(j11, j12) + j10;
                            View view4 = arrayList7.get(0).itemView;
                            WeakHashMap<View, l0> weakHashMap3 = n0.c0.f33054a;
                            c0.d.n(view4, eVar, max);
                        }
                    }
                }
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public int f2132s;

        /* renamed from: t, reason: collision with root package name */
        public int f2133t;

        /* renamed from: u, reason: collision with root package name */
        public OverScroller f2134u;

        /* renamed from: v, reason: collision with root package name */
        public Interpolator f2135v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f2136w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f2137x;

        public b0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f2135v = interpolator;
            this.f2136w = false;
            this.f2137x = false;
            this.f2134u = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a() {
            if (this.f2136w) {
                this.f2137x = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.d.m(recyclerView, this);
        }

        public final void b(int i10, int i11, Interpolator interpolator, int i12) {
            boolean z10;
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f2135v != interpolator) {
                this.f2135v = interpolator;
                this.f2134u = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f2133t = 0;
            this.f2132s = 0;
            recyclerView.setScrollState(2);
            this.f2134u.startScroll(0, 0, i10, i11, i13);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f2134u.abortAnimation();
                return;
            }
            this.f2137x = false;
            this.f2136w = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f2134u;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currX - this.f2132s;
                int i16 = currY - this.f2133t;
                this.f2132s = currX;
                this.f2133t = currY;
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(i15, i16, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    i15 -= iArr2[0];
                    i16 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(i15, i16);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(i15, i16, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i17 = iArr4[0];
                    int i18 = iArr4[1];
                    int i19 = i15 - i17;
                    int i20 = i16 - i18;
                    y yVar = recyclerView.mLayout.f2155e;
                    if (yVar != null && !yVar.f2191d && yVar.f2192e) {
                        int b10 = recyclerView.mState.b();
                        if (b10 == 0) {
                            yVar.d();
                        } else if (yVar.f2188a >= b10) {
                            yVar.f2188a = b10 - 1;
                            yVar.b(i17, i18);
                        } else {
                            yVar.b(i17, i18);
                        }
                    }
                    i12 = i18;
                    i13 = i17;
                    i10 = i19;
                    i11 = i20;
                } else {
                    i10 = i15;
                    i11 = i16;
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i13, i12, i10, i11, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i21 = i10 - iArr6[0];
                int i22 = i11 - iArr6[1];
                if (i13 != 0 || i12 != 0) {
                    recyclerView.dispatchOnScrolled(i13, i12);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i21 == 0) || (!z11 && i22 == 0))) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                y yVar2 = recyclerView.mLayout.f2155e;
                if (yVar2 != null && yVar2.f2191d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && z12) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i21 < 0) {
                            i14 = -currVelocity;
                        } else if (i21 > 0) {
                            i14 = currVelocity;
                        } else {
                            i14 = 0;
                        }
                        if (i22 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i22 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i14, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        m.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.f2354c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f2355d = 0;
                    }
                } else {
                    a();
                    androidx.recyclerview.widget.m mVar = recyclerView.mGapWorker;
                    if (mVar != null) {
                        mVar.a(recyclerView, i13, i12);
                    }
                }
            }
            y yVar3 = recyclerView.mLayout.f2155e;
            if (yVar3 != null && yVar3.f2191d) {
                yVar3.b(0, 0);
            }
            this.f2136w = false;
            if (this.f2137x) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                c0.d.m(recyclerView, this);
            } else {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f10 = f - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        g<? extends c0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        c0 mShadowedHolder = null;
        c0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public c0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                if (c0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final g<? extends c0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            g adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            if ((i10 & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) == 0 && !isInvalid()) {
                return false;
            }
            return true;
        }

        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                if (!c0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f2172c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                View view = this.itemView;
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                this.mWasImportantForAccessibilityBeforeHidden = c0.d.c(view);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10;
            int i11 = this.mIsRecyclableCount;
            if (z10) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i10 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(v vVar, boolean z10) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(simpleName, "{");
            l10.append(Integer.toHexString(hashCode()));
            l10.append(" position=");
            l10.append(this.mPosition);
            l10.append(" id=");
            l10.append(this.mItemId);
            l10.append(", oldPos=");
            l10.append(this.mOldPosition);
            l10.append(", pLpos:");
            l10.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(l10.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.k(this);
        }

        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements a0.b {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0020b {
        public e() {
        }

        public final int a() {
            return RecyclerView.this.getChildCount();
        }

        public final void b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i10);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0019a {
        public f() {
        }

        public final void a(a.b bVar) {
            int i10 = bVar.f2255a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            recyclerView.mLayout.Z(bVar.f2256b, bVar.f2258d);
                            return;
                        }
                        return;
                    }
                    recyclerView.mLayout.b0(bVar.f2256b, bVar.f2258d);
                    return;
                }
                recyclerView.mLayout.a0(bVar.f2256b, bVar.f2258d);
                return;
            }
            recyclerView.mLayout.X(bVar.f2256b, bVar.f2258d);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public final void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public final void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
    }

    /* loaded from: classes.dex */
    public static class k {
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        public b f2143a = null;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<a> f2144b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final long f2145c = 120;

        /* renamed from: d, reason: collision with root package name */
        public final long f2146d = 120;

        /* renamed from: e, reason: collision with root package name */
        public final long f2147e = 250;
        public final long f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f2148a;

            /* renamed from: b, reason: collision with root package name */
            public int f2149b;

            public final void a(c0 c0Var) {
                View view = c0Var.itemView;
                this.f2148a = view.getLeft();
                this.f2149b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(c0 c0Var) {
            int i10 = c0Var.mFlags & 14;
            if (!c0Var.isInvalid() && (i10 & 4) == 0) {
                c0Var.getOldPosition();
                c0Var.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public final void c(c0 c0Var) {
            b bVar = this.f2143a;
            if (bVar != null) {
                m mVar = (m) bVar;
                mVar.getClass();
                c0Var.setIsRecyclable(true);
                if (c0Var.mShadowedHolder != null && c0Var.mShadowingHolder == null) {
                    c0Var.mShadowedHolder = null;
                }
                c0Var.mShadowingHolder = null;
                if (!c0Var.shouldBeKeptAsChild()) {
                    View view = c0Var.itemView;
                    RecyclerView recyclerView = RecyclerView.this;
                    if (!recyclerView.removeAnimatingView(view) && c0Var.isTmpDetached()) {
                        recyclerView.removeDetachedView(c0Var.itemView, false);
                    }
                }
            }
        }

        public abstract void d(c0 c0Var);

        public abstract void e();

        public abstract boolean f();
    }

    /* loaded from: classes.dex */
    public class m implements l.b {
        public m() {
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void a();

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
    }

    /* loaded from: classes.dex */
    public interface s {
        void a();

        boolean b(MotionEvent motionEvent);

        void onTouchEvent(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f2174a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public int f2175b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<c0> f2176a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public final int f2177b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f2178c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f2179d = 0;
        }

        public final a a(int i10) {
            SparseArray<a> sparseArray = this.f2174a;
            a aVar = sparseArray.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                sparseArray.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class v {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<c0> f2180a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<c0> f2181b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<c0> f2182c;

        /* renamed from: d, reason: collision with root package name */
        public final List<c0> f2183d;

        /* renamed from: e, reason: collision with root package name */
        public int f2184e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public u f2185g;

        public v() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.f2180a = arrayList;
            this.f2181b = null;
            this.f2182c = new ArrayList<>();
            this.f2183d = Collections.unmodifiableList(arrayList);
            this.f2184e = 2;
            this.f = 2;
        }

        public static void d(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    d((ViewGroup) childAt, true);
                }
            }
            if (!z10) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void a(c0 c0Var, boolean z10) {
            n0.a aVar;
            RecyclerView.clearNestedRecyclerViewIfNotNested(c0Var);
            View view = c0Var.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.v vVar = recyclerView.mAccessibilityDelegate;
            if (vVar != null) {
                v.a aVar2 = vVar.f2384e;
                if (aVar2 instanceof v.a) {
                    aVar = (n0.a) aVar2.f2386e.remove(view);
                } else {
                    aVar = null;
                }
                n0.c0.l(view, aVar);
            }
            if (z10) {
                w wVar = recyclerView.mRecyclerListener;
                if (wVar != null) {
                    wVar.a();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i10 = 0; i10 < size; i10++) {
                    recyclerView.mRecyclerListeners.get(i10).a();
                }
                g gVar = recyclerView.mAdapter;
                if (gVar != null) {
                    gVar.onViewRecycled(c0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(c0Var);
                }
            }
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = null;
            u c10 = c();
            c10.getClass();
            int itemViewType = c0Var.getItemViewType();
            ArrayList<c0> arrayList = c10.a(itemViewType).f2176a;
            if (c10.f2174a.get(itemViewType).f2177b > arrayList.size()) {
                c0Var.resetInternal();
                arrayList.add(c0Var);
            }
        }

        public final int b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.mState.b()) {
                if (!recyclerView.mState.f2206g) {
                    return i10;
                }
                return recyclerView.mAdapterHelper.f(i10, 0);
            }
            StringBuilder n10 = a3.k.n("invalid position ", i10, ". State item count is ");
            n10.append(recyclerView.mState.b());
            n10.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(n10.toString());
        }

        public final u c() {
            if (this.f2185g == null) {
                this.f2185g = new u();
            }
            return this.f2185g;
        }

        public final void e() {
            ArrayList<c0> arrayList = this.f2182c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                f(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                m.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f2354c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2355d = 0;
            }
        }

        public final void f(int i10) {
            ArrayList<c0> arrayList = this.f2182c;
            a(arrayList.get(i10), true);
            arrayList.remove(i10);
        }

        public final void g(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean isTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            h(childViewHolderInt);
            if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                recyclerView.mItemAnimator.d(childViewHolderInt);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
        
            if (r6 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
        
            r5 = r5 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
        
            if (r5 < 0) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            r6 = r4.get(r5).mPosition;
            r7 = r2.mPrefetchRegistry;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
        
            if (r7.f2354c == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        
            r8 = r7.f2355d * 2;
            r9 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
        
            if (r9 >= r8) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
        
            if (r7.f2354c[r9] != r6) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
        
            r9 = r9 + 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a4, code lost:
        
            if (r6 != false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00a6, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00a3, code lost:
        
            r6 = false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(androidx.recyclerview.widget.RecyclerView.c0 r12) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.h(androidx.recyclerview.widget.RecyclerView$c0):void");
        }

        public final void i(View view) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2181b == null) {
                    this.f2181b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f2181b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(a3.k.i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f2180a.add(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:254:0x0430, code lost:
        
            if (r8 == false) goto L240;
         */
        /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x04b6  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x04db A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x04c2  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x0453  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x0463  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x04ab  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x04a4  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.recyclerview.widget.RecyclerView.c0 j(long r20, int r22) {
            /*
                Method dump skipped, instructions count: 1285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.j(long, int):androidx.recyclerview.widget.RecyclerView$c0");
        }

        public final void k(c0 c0Var) {
            if (c0Var.mInChangeScrap) {
                this.f2181b.remove(c0Var);
            } else {
                this.f2180a.remove(c0Var);
            }
            c0Var.mScrapContainer = null;
            c0Var.mInChangeScrap = false;
            c0Var.clearReturnedFromScrapFlag();
        }

        public final void l() {
            int i10;
            o oVar = RecyclerView.this.mLayout;
            if (oVar != null) {
                i10 = oVar.f2159j;
            } else {
                i10 = 0;
            }
            this.f = this.f2184e + i10;
            ArrayList<c0> arrayList = this.f2182c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                f(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a();
    }

    /* loaded from: classes.dex */
    public class x extends i {
        public x() {
        }

        public final void a() {
            boolean z10 = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (z10 && recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                c0.d.m(recyclerView, runnable);
            } else {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!recyclerView.mAdapterHelper.g()) {
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            boolean z10 = false;
            if (i11 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f2251b;
                arrayList.add(aVar.h(4, i10, i11, obj));
                aVar.f |= 4;
                if (arrayList.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            boolean z10 = false;
            if (i11 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f2251b;
                arrayList.add(aVar.h(1, i10, i11, null));
                aVar.f |= 1;
                if (arrayList.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            aVar.getClass();
            boolean z10 = false;
            if (i10 != i11) {
                if (i12 == 1) {
                    ArrayList<a.b> arrayList = aVar.f2251b;
                    arrayList.add(aVar.h(8, i10, i11, null));
                    aVar.f |= 8;
                    if (arrayList.size() == 1) {
                        z10 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            boolean z10 = false;
            if (i11 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f2251b;
                arrayList.add(aVar.h(2, i10, i11, null));
                aVar.f |= 2;
                if (arrayList.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onStateRestorationPolicyChanged() {
            g gVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (gVar = recyclerView.mAdapter) != null && gVar.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f2189b;

        /* renamed from: c, reason: collision with root package name */
        public o f2190c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2191d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2192e;
        public View f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2194h;

        /* renamed from: a, reason: collision with root package name */
        public int f2188a = -1;

        /* renamed from: g, reason: collision with root package name */
        public final a f2193g = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d, reason: collision with root package name */
            public int f2198d = -1;
            public boolean f = false;

            /* renamed from: g, reason: collision with root package name */
            public int f2200g = 0;

            /* renamed from: a, reason: collision with root package name */
            public int f2195a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f2196b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f2197c = Integer.MIN_VALUE;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f2199e = null;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f2198d;
                if (i10 >= 0) {
                    this.f2198d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f = false;
                    return;
                }
                if (this.f) {
                    Interpolator interpolator = this.f2199e;
                    if (interpolator != null && this.f2197c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.f2197c;
                    if (i11 >= 1) {
                        recyclerView.mViewFlinger.b(this.f2195a, this.f2196b, interpolator, i11);
                        int i12 = this.f2200g + 1;
                        this.f2200g = i12;
                        if (i12 > 10) {
                            Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                this.f2200g = 0;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public final PointF a(int i10) {
            Object obj = this.f2190c;
            if (obj instanceof b) {
                return ((b) obj).a(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f2189b;
            if (this.f2188a == -1 || recyclerView == null) {
                d();
            }
            if (this.f2191d && this.f == null && this.f2190c != null && (a10 = a(this.f2188a)) != null) {
                float f = a10.x;
                if (f != gl.Code || a10.y != gl.Code) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a10.y), null);
                }
            }
            boolean z10 = false;
            this.f2191d = false;
            View view = this.f;
            a aVar = this.f2193g;
            if (view != null) {
                if (this.f2189b.getChildLayoutPosition(view) == this.f2188a) {
                    View view2 = this.f;
                    z zVar = recyclerView.mState;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.f2192e) {
                z zVar2 = recyclerView.mState;
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
                if (oVar.f2189b.mLayout.w() == 0) {
                    oVar.d();
                } else {
                    int i12 = oVar.o;
                    int i13 = i12 - i10;
                    if (i12 * i13 <= 0) {
                        i13 = 0;
                    }
                    oVar.o = i13;
                    int i14 = oVar.f2375p;
                    int i15 = i14 - i11;
                    if (i14 * i15 <= 0) {
                        i15 = 0;
                    }
                    oVar.f2375p = i15;
                    if (i13 == 0 && i15 == 0) {
                        PointF a11 = oVar.a(oVar.f2188a);
                        if (a11 != null) {
                            if (a11.x != gl.Code || a11.y != gl.Code) {
                                float f10 = a11.y;
                                float sqrt = (float) Math.sqrt((f10 * f10) + (r9 * r9));
                                float f11 = a11.x / sqrt;
                                a11.x = f11;
                                float f12 = a11.y / sqrt;
                                a11.y = f12;
                                oVar.f2371k = a11;
                                oVar.o = (int) (f11 * 10000.0f);
                                oVar.f2375p = (int) (f12 * 10000.0f);
                                int g6 = oVar.g(10000);
                                int i16 = (int) (oVar.o * 1.2f);
                                int i17 = (int) (oVar.f2375p * 1.2f);
                                LinearInterpolator linearInterpolator = oVar.f2369i;
                                aVar.f2195a = i16;
                                aVar.f2196b = i17;
                                aVar.f2197c = (int) (g6 * 1.2f);
                                aVar.f2199e = linearInterpolator;
                                aVar.f = true;
                            }
                        }
                        aVar.f2198d = oVar.f2188a;
                        oVar.d();
                    }
                }
                if (aVar.f2198d >= 0) {
                    z10 = true;
                }
                aVar.a(recyclerView);
                if (z10 && this.f2192e) {
                    this.f2191d = true;
                    recyclerView.mViewFlinger.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (!this.f2192e) {
                return;
            }
            this.f2192e = false;
            androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
            oVar.f2375p = 0;
            oVar.o = 0;
            oVar.f2371k = null;
            this.f2189b.mState.f2201a = -1;
            this.f = null;
            this.f2188a = -1;
            this.f2191d = false;
            o oVar2 = this.f2190c;
            if (oVar2.f2155e == this) {
                oVar2.f2155e = null;
            }
            this.f2190c = null;
            this.f2189b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class z {

        /* renamed from: a, reason: collision with root package name */
        public int f2201a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f2202b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f2203c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f2204d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f2205e = 0;
        public boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2206g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2207h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2208i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2209j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2210k = false;

        /* renamed from: l, reason: collision with root package name */
        public int f2211l;

        /* renamed from: m, reason: collision with root package name */
        public long f2212m;

        /* renamed from: n, reason: collision with root package name */
        public int f2213n;

        public final void a(int i10) {
            if ((this.f2204d & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2204d));
        }

        public final int b() {
            if (this.f2206g) {
                return this.f2202b - this.f2203c;
            }
            return this.f2205e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f2201a + ", mData=null, mItemCount=" + this.f2205e + ", mIsMeasuring=" + this.f2208i + ", mPreviousLayoutItemCount=" + this.f2202b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2203c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f2206g + ", mRunSimpleAnimations=" + this.f2209j + ", mRunPredictiveAnimations=" + this.f2210k + '}';
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(c0 c0Var) {
        boolean z10;
        View view = c0Var.itemView;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mRecycler.k(getChildViewHolder(view));
        if (c0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f2266b.h(indexOfChild);
            bVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(c0 c0Var, c0 c0Var2, l.c cVar, l.c cVar2, boolean z10, boolean z11) {
        c0Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z11) {
                addAnimatingView(c0Var2);
            }
            c0Var.mShadowedHolder = c0Var2;
            addAnimatingView(c0Var);
            this.mRecycler.k(c0Var);
            c0Var2.setIsRecyclable(false);
            c0Var2.mShadowingHolder = c0Var;
        }
        if (this.mItemAnimator.a(c0Var, c0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            c0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(o.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            o0.b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z10;
        boolean z11;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2208i = false;
        startInterceptRequestLayout();
        androidx.recyclerview.widget.a0 a0Var = this.mViewInfoStore;
        a0Var.f2259a.clear();
        a0Var.f2260b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        z zVar = this.mState;
        if (zVar.f2209j && this.mItemsChanged) {
            z10 = true;
        } else {
            z10 = false;
        }
        zVar.f2207h = z10;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        zVar.f2206g = zVar.f2210k;
        zVar.f2205e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2209j) {
            int e10 = this.mChildHelper.e();
            for (int i10 = 0; i10 < e10; i10++) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    l lVar = this.mItemAnimator;
                    l.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    lVar.getClass();
                    l.c cVar = new l.c();
                    cVar.a(childViewHolderInt);
                    q.i<c0, a0.a> iVar = this.mViewInfoStore.f2259a;
                    a0.a orDefault = iVar.getOrDefault(childViewHolderInt, null);
                    if (orDefault == null) {
                        orDefault = a0.a.a();
                        iVar.put(childViewHolderInt, orDefault);
                    }
                    orDefault.f2263b = cVar;
                    orDefault.f2262a |= 4;
                    if (this.mState.f2207h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f2260b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2210k) {
            saveOldPositions();
            z zVar2 = this.mState;
            boolean z12 = zVar2.f;
            zVar2.f = false;
            this.mLayout.c0(this.mRecycler, zVar2);
            this.mState.f = z12;
            for (int i11 = 0; i11 < this.mChildHelper.e(); i11++) {
                c0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt2.shouldIgnore()) {
                    a0.a orDefault2 = this.mViewInfoStore.f2259a.getOrDefault(childViewHolderInt2, null);
                    if (orDefault2 != null && (orDefault2.f2262a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        l.b(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        l lVar2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        lVar2.getClass();
                        l.c cVar2 = new l.c();
                        cVar2.a(childViewHolderInt2);
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                        } else {
                            q.i<c0, a0.a> iVar2 = this.mViewInfoStore.f2259a;
                            a0.a orDefault3 = iVar2.getOrDefault(childViewHolderInt2, null);
                            if (orDefault3 == null) {
                                orDefault3 = a0.a.a();
                                iVar2.put(childViewHolderInt2, orDefault3);
                            }
                            orDefault3.f2262a |= 2;
                            orDefault3.f2263b = cVar2;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2204d = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z10;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f2205e = this.mAdapter.getItemCount();
        this.mState.f2203c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f2129u;
            if (parcelable != null) {
                this.mLayout.e0(parcelable);
            }
            this.mPendingSavedState = null;
        }
        z zVar = this.mState;
        zVar.f2206g = false;
        this.mLayout.c0(this.mRecycler, zVar);
        z zVar2 = this.mState;
        zVar2.f = false;
        if (zVar2.f2209j && this.mItemAnimator != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zVar2.f2209j = z10;
        zVar2.f2204d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        boolean g6;
        boolean z10;
        boolean z11;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        z zVar = this.mState;
        zVar.f2204d = 1;
        if (zVar.f2209j) {
            for (int e10 = this.mChildHelper.e() - 1; e10 >= 0; e10--) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e10));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    l.c cVar = new l.c();
                    cVar.a(childViewHolderInt);
                    c0 c0Var = (c0) this.mViewInfoStore.f2260b.d(changedHolderKey, null);
                    if (c0Var != null && !c0Var.shouldIgnore()) {
                        a0.a orDefault = this.mViewInfoStore.f2259a.getOrDefault(c0Var, null);
                        if (orDefault != null && (orDefault.f2262a & 1) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a0.a orDefault2 = this.mViewInfoStore.f2259a.getOrDefault(childViewHolderInt, null);
                        if (orDefault2 != null && (orDefault2.f2262a & 1) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && c0Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                        } else {
                            l.c b10 = this.mViewInfoStore.b(c0Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                            l.c b11 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b10 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, c0Var);
                            } else {
                                animateChange(c0Var, childViewHolderInt, b10, b11, z10, z11);
                            }
                        }
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt, cVar);
                    }
                }
            }
            androidx.recyclerview.widget.a0 a0Var = this.mViewInfoStore;
            a0.b bVar = this.mViewInfoProcessCallback;
            q.i<c0, a0.a> iVar = a0Var.f2259a;
            for (int i10 = iVar.f34547u - 1; i10 >= 0; i10--) {
                c0 h10 = iVar.h(i10);
                a0.a j10 = iVar.j(i10);
                int i11 = j10.f2262a;
                if ((i11 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.k0(h10.itemView, recyclerView.mRecycler);
                } else if ((i11 & 1) != 0) {
                    l.c cVar2 = j10.f2263b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.k0(h10.itemView, recyclerView2.mRecycler);
                    } else {
                        l.c cVar3 = j10.f2264c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mRecycler.k(h10);
                        recyclerView3.animateDisappearance(h10, cVar2, cVar3);
                    }
                } else if ((i11 & 14) == 14) {
                    RecyclerView.this.animateAppearance(h10, j10.f2263b, j10.f2264c);
                } else if ((i11 & 12) == 12) {
                    l.c cVar4 = j10.f2263b;
                    l.c cVar5 = j10.f2264c;
                    d dVar = (d) bVar;
                    dVar.getClass();
                    h10.setIsRecyclable(false);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (recyclerView4.mDataSetHasChangedAfterLayout) {
                        if (recyclerView4.mItemAnimator.a(h10, h10, cVar4, cVar5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) recyclerView4.mItemAnimator;
                        xVar.getClass();
                        int i12 = cVar4.f2148a;
                        int i13 = cVar5.f2148a;
                        if (i12 == i13 && cVar4.f2149b == cVar5.f2149b) {
                            xVar.c(h10);
                            g6 = false;
                        } else {
                            g6 = xVar.g(h10, i12, cVar4.f2149b, i13, cVar5.f2149b);
                        }
                        if (g6) {
                            recyclerView4.postAnimationRunner();
                        }
                    }
                } else if ((i11 & 4) != 0) {
                    l.c cVar6 = j10.f2263b;
                    RecyclerView recyclerView5 = RecyclerView.this;
                    recyclerView5.mRecycler.k(h10);
                    recyclerView5.animateDisappearance(h10, cVar6, null);
                } else if ((i11 & 8) != 0) {
                    RecyclerView.this.animateAppearance(h10, j10.f2263b, j10.f2264c);
                }
                j10.f2262a = 0;
                j10.f2263b = null;
                j10.f2264c = null;
                a0.a.f2261d.a(j10);
            }
        }
        this.mLayout.j0(this.mRecycler);
        z zVar2 = this.mState;
        zVar2.f2202b = zVar2.f2205e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        zVar2.f2209j = false;
        zVar2.f2210k = false;
        this.mLayout.f = false;
        ArrayList<c0> arrayList = this.mRecycler.f2181b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.f2160k) {
            oVar.f2159j = 0;
            oVar.f2160k = false;
            this.mRecycler.l();
        }
        this.mLayout.d0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        androidx.recyclerview.widget.a0 a0Var2 = this.mViewInfoStore;
        a0Var2.f2259a.clear();
        a0Var2.f2260b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        sVar.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = this.mOnItemTouchListeners.get(i10);
            if (sVar.b(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e10 = this.mChildHelper.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        c0 findViewHolderForAdapterPosition;
        z zVar = this.mState;
        int i10 = zVar.f2211l;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = zVar.b();
        for (int i11 = i10; i11 < b10; i11++) {
            c0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b10, i10);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    public static c0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f2170a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f2171b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private n0.o getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new n0.o(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j10, c0 c0Var, c0 c0Var2) {
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != c0Var && getChangedHolderKey(childViewHolderInt) == j10) {
                g gVar = this.mAdapter;
                if (gVar != null && gVar.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(c0Var);
                    throw new IllegalStateException(a3.k.i(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(c0Var);
                throw new IllegalStateException(a3.k.i(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        int i10;
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            i10 = c0.l.b(this);
        } else {
            i10 = 0;
        }
        if (i10 == 0 && i11 >= 26) {
            c0.l.l(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        if (this.mLayout.z() == 1) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            if ((i15 > i16 || i13 >= i16) && i13 > i14) {
                i12 = -1;
            } else {
                i12 = 0;
            }
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                if (c10 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                            sb2.append(i10);
                            throw new IllegalArgumentException(a3.k.i(this, sb2));
                        }
                        if (i12 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (c10 >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i12 >= 0) {
                    return false;
                }
                return true;
            }
            if (c10 <= 0 && (c10 != 0 || i12 * i11 <= 0)) {
                return false;
            }
            return true;
        }
        if (c10 >= 0 && (c10 != 0 || i12 * i11 >= 0)) {
            return false;
        }
        return true;
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i17 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean d10 = oVar.d();
        boolean e10 = this.mLayout.e();
        if (e10) {
            i13 = (d10 ? 1 : 0) | 2;
        } else {
            i13 = d10 ? 1 : 0;
        }
        startNestedScroll(i13, i12);
        if (d10) {
            i14 = i10;
        } else {
            i14 = 0;
        }
        if (e10) {
            i15 = i11;
        } else {
            i15 = 0;
        }
        if (dispatchNestedPreScroll(i14, i15, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            i10 -= iArr2[0];
            i11 -= iArr2[1];
        }
        if (d10) {
            i16 = i10;
        } else {
            i16 = 0;
        }
        if (e10) {
            i17 = i11;
        }
        scrollByInternal(i16, i17, motionEvent, i12);
        androidx.recyclerview.widget.m mVar = this.mGapWorker;
        if (mVar != null && (i10 != 0 || i11 != 0)) {
            mVar.a(this, i10, i11);
        }
        stopNestedScroll(i12);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        if (this.mItemAnimator != null && this.mLayout.B0()) {
            return true;
        }
        return false;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.l(aVar.f2251b);
            aVar.l(aVar.f2252c);
            aVar.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.Y();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z10 = false;
        } else {
            z10 = true;
        }
        z zVar = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z12 = this.mDataSetHasChangedAfterLayout) || z10 || this.mLayout.f) && (!z12 || this.mAdapter.hasStableIds()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        zVar.f2209j = z11;
        z zVar2 = this.mState;
        if (zVar2.f2209j && z10 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z13 = true;
        }
        zVar2.f2210k = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            r0.d.a.a(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            r0.d.a.a(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            r0.d.a.a(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            r0.d.a.a(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L81
        L7c:
            java.util.WeakHashMap<android.view.View, n0.l0> r7 = n0.c0.f33054a
            n0.c0.d.k(r6)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        c0 c0Var;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.e() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.j(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.f2212m != -1 && this.mAdapter.hasStableIds()) {
                    c0Var = findViewHolderForItemId(this.mState.f2212m);
                } else {
                    c0Var = null;
                }
                if (c0Var != null && !this.mChildHelper.j(c0Var.itemView) && c0Var.itemView.hasFocusable()) {
                    view = c0Var.itemView;
                } else if (this.mChildHelper.e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i10 = this.mState.f2213n;
                    if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.d.k(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f2172c) {
                Rect rect = this.mTempRect;
                int i10 = rect.left;
                Rect rect2 = pVar.f2171b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        o oVar = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z11 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        oVar.m0(this, view, rect3, z11, z10);
    }

    private void resetFocusInfo() {
        z zVar = this.mState;
        zVar.f2212m = -1L;
        zVar.f2211l = -1;
        zVar.f2213n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j10;
        int absoluteAdapterPosition;
        c0 c0Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            c0Var = findContainingViewHolder(view);
        }
        if (c0Var == null) {
            resetFocusInfo();
            return;
        }
        z zVar = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j10 = c0Var.getItemId();
        } else {
            j10 = -1;
        }
        zVar.f2212m = j10;
        z zVar2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (c0Var.isRemoved()) {
            absoluteAdapterPosition = c0Var.mOldPosition;
        } else {
            absoluteAdapterPosition = c0Var.getAbsoluteAdapterPosition();
        }
        zVar2.f2211l = absoluteAdapterPosition;
        this.mState.f2213n = getDeepestFocusedViewWithId(c0Var.itemView);
    }

    private void setAdapterInternal(g gVar, boolean z10, boolean z11) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.l(aVar.f2251b);
        aVar.l(aVar.f2252c);
        int i10 = 0;
        aVar.f = 0;
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.Q();
        }
        v vVar = this.mRecycler;
        g gVar4 = this.mAdapter;
        vVar.f2180a.clear();
        vVar.e();
        u c10 = vVar.c();
        if (gVar3 != null) {
            c10.f2175b--;
        }
        if (!z10 && c10.f2175b == 0) {
            while (true) {
                SparseArray<u.a> sparseArray = c10.f2174a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i10).f2176a.clear();
                i10++;
            }
        }
        if (gVar4 != null) {
            c10.f2175b++;
        } else {
            c10.getClass();
        }
        this.mState.f = true;
    }

    private void stopScrollersInternal() {
        y yVar;
        b0 b0Var = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(b0Var);
        b0Var.f2134u.abortAnimation();
        o oVar = this.mLayout;
        if (oVar != null && (yVar = oVar.f2155e) != null) {
            yVar.d();
        }
    }

    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public void addItemDecoration(n nVar, int i10) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i10, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void addRecyclerListener(w wVar) {
        boolean z10;
        if (wVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a0.a.u0(z10, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(wVar);
    }

    public void animateAppearance(c0 c0Var, l.c cVar, l.c cVar2) {
        boolean z10;
        int i10;
        int i11;
        c0Var.setIsRecyclable(false);
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) this.mItemAnimator;
        xVar.getClass();
        if (cVar != null && ((i10 = cVar.f2148a) != (i11 = cVar2.f2148a) || cVar.f2149b != cVar2.f2149b)) {
            z10 = xVar.g(c0Var, i10, cVar.f2149b, i11, cVar2.f2149b);
        } else {
            androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) xVar;
            kVar.l(c0Var);
            c0Var.itemView.setAlpha(gl.Code);
            kVar.f2299i.add(c0Var);
            z10 = true;
        }
        if (z10) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(c0 c0Var, l.c cVar, l.c cVar2) {
        int i10;
        int i11;
        boolean z10;
        addAnimatingView(c0Var);
        c0Var.setIsRecyclable(false);
        androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) this.mItemAnimator;
        xVar.getClass();
        int i12 = cVar.f2148a;
        int i13 = cVar.f2149b;
        View view = c0Var.itemView;
        if (cVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = cVar2.f2148a;
        }
        int i14 = i10;
        if (cVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = cVar2.f2149b;
        }
        int i15 = i11;
        if (!c0Var.isRemoved() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = xVar.g(c0Var, i12, i13, i14, i15);
        } else {
            androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) xVar;
            kVar.l(c0Var);
            kVar.f2298h.add(c0Var);
            z10 = true;
        }
        if (z10) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(a3.k.i(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(a3.k.i(this, com.ironsource.adapters.facebook.a.j(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(a3.k.i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a3.k.i(this, new StringBuilder(""))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.c0 r5) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r4.mItemAnimator
            r1 = 1
            if (r0 == 0) goto L2d
            java.util.List r2 = r5.getUnmodifiedPayloads()
            androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
            r0.getClass()
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L28
            boolean r0 = r0.f2387g
            if (r0 == 0) goto L22
            boolean r5 = r5.isInvalid()
            if (r5 == 0) goto L20
            goto L22
        L20:
            r5 = r3
            goto L23
        L22:
            r5 = r1
        L23:
            if (r5 == 0) goto L26
            goto L28
        L26:
            r5 = r3
            goto L29
        L28:
            r5 = r1
        L29:
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            r1 = r3
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView$c0):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof p) && this.mLayout.f((p) layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOldPositions() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        v vVar = this.mRecycler;
        ArrayList<c0> arrayList = vVar.f2182c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).clearOldPosition();
        }
        ArrayList<c0> arrayList2 = vVar.f2180a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.get(i12).clearOldPosition();
        }
        ArrayList<c0> arrayList3 = vVar.f2181b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                vVar.f2181b.get(i13).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.d()) {
            return 0;
        }
        return this.mLayout.j(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.d()) {
            return 0;
        }
        return this.mLayout.k(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.d()) {
            return 0;
        }
        return this.mLayout.l(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.e()) {
            return 0;
        }
        return this.mLayout.m(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.e()) {
            return 0;
        }
        return this.mLayout.n(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.e()) {
            return 0;
        }
        return this.mLayout.o(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.d.k(this);
        }
    }

    public void consumePendingUpdateOperations() {
        boolean z10;
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i10 = aVar.f;
            boolean z11 = false;
            if ((4 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((i10 & 11) != 0) {
                    z11 = true;
                }
                if (!z11) {
                    int i11 = j0.i.f29566a;
                    i.a.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    i.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i12 = j0.i.f29566a;
                i.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                i.a.b();
                return;
            }
            return;
        }
        int i13 = j0.i.f29566a;
        i.a.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        i.a.b();
    }

    public void defaultOnMeasure(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        setMeasuredDimension(o.g(i10, paddingRight, c0.d.e(this)), o.g(i11, getPaddingBottom() + getPaddingTop(), c0.d.d(this)));
    }

    public void dispatchChildAttached(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.mOnChildAttachStateListeners.get(size).a();
                } else {
                    return;
                }
            }
        }
    }

    public void dispatchLayout() {
        boolean z10;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        boolean z11 = false;
        this.mState.f2208i = false;
        if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f2204d == 1) {
            dispatchLayoutStep1();
            this.mLayout.r0(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            if (!aVar.f2252c.isEmpty() && !aVar.f2251b.isEmpty()) {
                z11 = true;
            }
            if (!z11 && !z10 && this.mLayout.f2163n == getWidth() && this.mLayout.o == getHeight()) {
                this.mLayout.r0(this);
            } else {
                this.mLayout.r0(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i10) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g0(i10);
        }
        onScrollStateChanged(i10);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i10);
            }
        }
    }

    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            c0 c0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (c0Var.itemView.getParent() == this && !c0Var.shouldIgnore() && (i10 = c0Var.mPendingAccessibilityState) != -1) {
                View view = c0Var.itemView;
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                c0.d.s(view, i10);
                c0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            this.mItemDecorations.get(i12).d(canvas);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, gl.Code);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f2134u;
            overScroller.getFinalX();
            overScroller.getCurrX();
            zVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        zVar.getClass();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int e10 = this.mChildHelper.e() - 1; e10 >= 0; e10--) {
            View d10 = this.mChildHelper.d(e10);
            float translationX = d10.getTranslationX();
            float translationY = d10.getTranslationY();
            if (f10 >= d10.getLeft() + translationX && f10 <= d10.getRight() + translationX && f11 >= d10.getTop() + translationY && f11 <= d10.getBottom() + translationY) {
                return d10;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public c0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public c0 findViewHolderForAdapterPosition(int i10) {
        c0 c0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h10 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h10; i11++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (this.mChildHelper.j(childViewHolderInt.itemView)) {
                    c0Var = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return c0Var;
    }

    public c0 findViewHolderForItemId(long j10) {
        g gVar = this.mAdapter;
        c0 c0Var = null;
        if (gVar != null && gVar.hasStableIds()) {
            int h10 = this.mChildHelper.h();
            for (int i10 = 0; i10 < h10; i10++) {
                c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (this.mChildHelper.j(childViewHolderInt.itemView)) {
                        c0Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return c0Var;
    }

    public c0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public c0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0164, code lost:
    
        if (r2 < r13) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        this.mLayout.getClass();
        boolean z14 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.e()) {
                if (i10 == 2) {
                    i12 = 130;
                } else {
                    i12 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i12) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.d()) {
                if (this.mLayout.z() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 ^ z13) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i11) != null) {
                    z14 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
                z11 = z14;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.S(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.S(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (!isPreferredNextFocus(view, view2, i10)) {
            return super.focusSearch(view, i10);
        }
        return view2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.r();
        }
        throw new IllegalStateException(a3.k.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(a3.k.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(c0 c0Var) {
        if (c0Var.hasAnyOfTheFlags(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT) || !c0Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        int i10 = c0Var.mPosition;
        ArrayList<a.b> arrayList = aVar.f2251b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = arrayList.get(i11);
            int i12 = bVar.f2255a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = bVar.f2256b;
                        if (i13 == i10) {
                            i10 = bVar.f2258d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (bVar.f2258d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = bVar.f2256b;
                    if (i14 <= i10) {
                        int i15 = bVar.f2258d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.f2256b <= i10) {
                i10 += bVar.f2258d;
            }
        }
        return i10;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(c0 c0Var) {
        if (this.mAdapter.hasStableIds()) {
            return c0Var.getItemId();
        }
        return c0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(View view) {
        c0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public c0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.v getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        boolean z10 = pVar.f2172c;
        Rect rect = pVar.f2171b;
        if (!z10) {
            return rect;
        }
        if (this.mState.f2206g && (pVar.b() || pVar.f2170a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            n nVar = this.mItemDecorations.get(i10);
            Rect rect2 = this.mTempRect;
            nVar.getClass();
            ((p) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            int i11 = rect.left;
            Rect rect3 = this.mTempRect;
            rect.left = i11 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        pVar.f2172c = false;
        return rect;
    }

    public n getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.g()) {
            return false;
        }
        return true;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.hamkho.livefoot.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.hamkho.livefoot.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.hamkho.livefoot.R.dimen.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException(a3.k.i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.c("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        if (lVar != null && lVar.f()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f33096d;
    }

    public void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.p0(i10);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((p) this.mChildHelper.g(i10).getLayoutParams()).f2172c = true;
        }
        ArrayList<c0> arrayList = this.mRecycler.f2182c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = (p) arrayList.get(i11).itemView.getLayoutParams();
            if (pVar != null) {
                pVar.f2172c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        v vVar = this.mRecycler;
        ArrayList<c0> arrayList = vVar.f2182c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0 c0Var = arrayList.get(i11);
            if (c0Var != null) {
                c0Var.addFlags(6);
                c0Var.addChangePayload(null);
            }
        }
        g gVar = RecyclerView.this.mAdapter;
        if (gVar == null || !gVar.hasStableIds()) {
            vVar.e();
        }
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int e10 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e10; i11++) {
            this.mChildHelper.d(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int e10 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e10; i11++) {
            this.mChildHelper.d(i11).offsetTopAndBottom(i10);
        }
    }

    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int h10 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h10; i12++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f = true;
            }
        }
        ArrayList<c0> arrayList = this.mRecycler.f2182c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c0 c0Var = arrayList.get(i13);
            if (c0Var != null && c0Var.mPosition >= i10) {
                c0Var.offsetPosition(i11, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int h10 = this.mChildHelper.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i20));
            if (childViewHolderInt != null && (i18 = childViewHolderInt.mPosition) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f = true;
            }
        }
        v vVar = this.mRecycler;
        vVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i19 = 1;
            i16 = i11;
        }
        ArrayList<c0> arrayList = vVar.f2182c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            c0 c0Var = arrayList.get(i21);
            if (c0Var != null && (i17 = c0Var.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c0Var.offsetPosition(i11 - i10, false);
                } else {
                    c0Var.offsetPosition(i19, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.mChildHelper.h();
        for (int i13 = 0; i13 < h10; i13++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f = true;
                } else if (i14 >= i10) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f = true;
                }
            }
        }
        v vVar = this.mRecycler;
        ArrayList<c0> arrayList = vVar.f2182c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                c0 c0Var = arrayList.get(size);
                if (c0Var != null) {
                    int i15 = c0Var.mPosition;
                    if (i15 >= i12) {
                        c0Var.offsetPosition(-i11, z10);
                    } else if (i15 >= i10) {
                        c0Var.addFlags(8);
                        vVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.mFirstLayoutComplete = r2
            androidx.recyclerview.widget.RecyclerView$o r2 = r5.mLayout
            if (r2 == 0) goto L1e
            r2.f2156g = r1
        L1e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L65
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.f2346w
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L5e
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.mGapWorker = r1
            java.util.WeakHashMap<android.view.View, n0.l0> r1 = n0.c0.f33054a
            android.view.Display r1 = n0.c0.e.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L50
            if (r1 == 0) goto L50
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L50
            goto L52
        L50:
            r1 = 1114636288(0x42700000, float:60.0)
        L52:
            androidx.recyclerview.widget.m r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f2350u = r3
            r0.set(r2)
        L5e:
            androidx.recyclerview.widget.m r0 = r5.mGapWorker
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f2348s
            r0.add(r5)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.m mVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.e();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f2156g = false;
            oVar.R(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (a0.a.f2261d.b() != null);
        if (ALLOW_THREAD_GAP_WORK && (mVar = this.mGapWorker) != null) {
            mVar.f2348s.remove(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).c(canvas, this);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.e()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.d()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.e()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.d()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean d10 = oVar.d();
        boolean e10 = this.mLayout.e();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x10;
                            this.mInitialTouchX = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y10;
                            this.mInitialTouchY = y10;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i10 = x11 - this.mInitialTouchX;
                        int i11 = y11 - this.mInitialTouchY;
                        if (d10 != 0 && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchX = x11;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (e10 && Math.abs(i11) > this.mTouchSlop) {
                            this.mLastTouchY = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = d10;
            if (e10) {
                i12 = (d10 ? 1 : 0) | 2;
            }
            startNestedScroll(i12, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = j0.i.f29566a;
        i.a.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        i.a.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (oVar.L()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.f2152b.defaultOnMeasure(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (!z10 && this.mAdapter != null) {
                if (this.mState.f2204d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.s0(i10, i11);
                this.mState.f2208i = true;
                dispatchLayoutStep2();
                this.mLayout.u0(i10, i11);
                if (this.mLayout.x0()) {
                    this.mLayout.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f2208i = true;
                    dispatchLayoutStep2();
                    this.mLayout.u0(i10, i11);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.f2152b.defaultOnMeasure(i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            z zVar = this.mState;
            if (zVar.f2210k) {
                zVar.f2206g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f2206g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f2210k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.mAdapter;
        if (gVar != null) {
            this.mState.f2205e = gVar.getItemCount();
        } else {
            this.mState.f2205e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.f2152b.defaultOnMeasure(i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f2206g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.f1595s);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f2129u = savedState2.f2129u;
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                savedState.f2129u = oVar.f0();
            } else {
                savedState.f2129u = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.d.m(this, runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(c0 c0Var, l.c cVar) {
        c0Var.setFlags(0, 8192);
        if (this.mState.f2207h && c0Var.isUpdated() && !c0Var.isRemoved() && !c0Var.shouldIgnore()) {
            this.mViewInfoStore.f2260b.f(getChangedHolderKey(c0Var), c0Var);
        }
        q.i<c0, a0.a> iVar = this.mViewInfoStore.f2259a;
        a0.a orDefault = iVar.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = a0.a.a();
            iVar.put(c0Var, orDefault);
        }
        orDefault.f2263b = cVar;
        orDefault.f2262a |= 4;
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.e();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.i0(this.mRecycler);
            this.mLayout.j0(this.mRecycler);
        }
        v vVar = this.mRecycler;
        vVar.f2180a.clear();
        vVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAnimatingView(android.view.View r6) {
        /*
            r5 = this;
            r5.startInterceptRequestLayout()
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            androidx.recyclerview.widget.b$b r1 = r0.f2265a
            androidx.recyclerview.widget.RecyclerView$e r1 = (androidx.recyclerview.widget.RecyclerView.e) r1
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            int r2 = r2.indexOfChild(r6)
            r3 = -1
            if (r2 != r3) goto L16
            r0.k(r6)
            goto L27
        L16:
            androidx.recyclerview.widget.b$a r3 = r0.f2266b
            boolean r4 = r3.d(r2)
            if (r4 == 0) goto L29
            r3.f(r2)
            r0.k(r6)
            r1.b(r2)
        L27:
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$c0 r6 = getChildViewHolderInt(r6)
            androidx.recyclerview.widget.RecyclerView$v r1 = r5.mRecycler
            r1.k(r6)
            androidx.recyclerview.widget.RecyclerView$v r1 = r5.mRecycler
            r1.h(r6)
        L3a:
            r6 = r0 ^ 1
            r5.stopInterceptRequestLayout(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a3.k.i(this, sb2));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(n nVar) {
        boolean z10;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void removeRecyclerListener(w wVar) {
        this.mRecyclerListeners.remove(wVar);
    }

    public void repositionShadowingViews() {
        c0 c0Var;
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            View d10 = this.mChildHelper.d(i10);
            c0 childViewHolder = getChildViewHolder(d10);
            if (childViewHolder != null && (c0Var = childViewHolder.mShadowingHolder) != null) {
                View view = c0Var.itemView;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z10;
        y yVar = this.mLayout.f2155e;
        boolean z11 = true;
        if (yVar != null && yVar.f2192e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !isComputingLayout()) {
            z11 = false;
        }
        if (!z11 && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.m0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).a();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean d10 = oVar.d();
        boolean e10 = this.mLayout.e();
        if (d10 || e10) {
            if (!d10) {
                i10 = 0;
            }
            if (!e10) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i13, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        if (i19 == 0 && i21 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.activity.n.C0(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            dispatchOnScrolled(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z10 || i14 != 0 || i13 != 0) {
            return true;
        }
        return false;
    }

    public void scrollStep(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i14 = j0.i.f29566a;
        i.a.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i10 != 0) {
            i12 = this.mLayout.o0(i10, this.mRecycler, this.mState);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.mLayout.q0(i11, this.mRecycler, this.mState);
        } else {
            i13 = 0;
        }
        i.a.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.p0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.v vVar) {
        this.mAccessibilityDelegate = vVar;
        n0.c0.l(this, vVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(c0 c0Var, int i10) {
        if (isComputingLayout()) {
            c0Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(c0Var);
            return false;
        }
        View view = c0Var.itemView;
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        c0.d.s(view, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        kVar.getClass();
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.e();
            this.mItemAnimator.f2143a = null;
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.f2143a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i10) {
        v vVar = this.mRecycler;
        vVar.f2184e = i10;
        vVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(o oVar) {
        b.InterfaceC0020b interfaceC0020b;
        RecyclerView recyclerView;
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        int i10 = 0;
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.e();
            }
            this.mLayout.i0(this.mRecycler);
            this.mLayout.j0(this.mRecycler);
            v vVar = this.mRecycler;
            vVar.f2180a.clear();
            vVar.e();
            if (this.mIsAttached) {
                o oVar2 = this.mLayout;
                oVar2.f2156g = false;
                oVar2.R(this);
            }
            this.mLayout.v0(null);
            this.mLayout = null;
        } else {
            v vVar2 = this.mRecycler;
            vVar2.f2180a.clear();
            vVar2.e();
        }
        androidx.recyclerview.widget.b bVar = this.mChildHelper;
        bVar.f2266b.g();
        ArrayList arrayList = bVar.f2267c;
        int size = arrayList.size();
        while (true) {
            size--;
            interfaceC0020b = bVar.f2265a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            e eVar = (e) interfaceC0020b;
            eVar.getClass();
            c0 childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            arrayList.remove(size);
        }
        e eVar2 = (e) interfaceC0020b;
        int a10 = eVar2.a();
        while (true) {
            recyclerView = RecyclerView.this;
            if (i10 >= a10) {
                break;
            }
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
            i10++;
        }
        recyclerView.removeAllViews();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.f2152b == null) {
                oVar.v0(this);
                if (this.mIsAttached) {
                    this.mLayout.f2156g = true;
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(oVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a3.k.i(oVar.f2152b, sb2));
            }
        }
        this.mRecycler.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        n0.o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f33096d) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.i.z(scrollingChildHelper.f33095c);
        }
        scrollingChildHelper.f33096d = z10;
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(u uVar) {
        v vVar = this.mRecycler;
        if (vVar.f2185g != null) {
            r1.f2175b--;
        }
        vVar.f2185g = uVar;
        if (uVar != null && RecyclerView.this.getAdapter() != null) {
            vVar.f2185g.f2175b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i10 = o0.b.a(accessibilityEvent);
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = i10;
        }
        this.mEatenAccessibilityChangeFlags |= i11;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.z0(this, i10);
        }
    }

    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, gl.Code, gl.Code, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int h10 = this.mChildHelper.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g6 = this.mChildHelper.g(i15);
            c0 childViewHolderInt = getChildViewHolderInt(g6);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i10 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) g6.getLayoutParams()).f2172c = true;
            }
        }
        v vVar = this.mRecycler;
        ArrayList<c0> arrayList = vVar.f2182c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                c0 c0Var = arrayList.get(size);
                if (c0Var != null && (i12 = c0Var.mPosition) >= i10 && i12 < i14) {
                    c0Var.addFlags(2);
                    vVar.f(size);
                }
            } else {
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends c0> {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT_WHEN_EMPTY,
            /* JADX INFO: Fake field, exist only in values array */
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i10) {
            boolean z10;
            if (vh.mBindingAdapter == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vh.mPosition = i10;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i10);
                }
                vh.setFlags(1, 519);
                int i11 = j0.i.f29566a;
                i.a.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof p) {
                    ((p) layoutParams).f2172c = true;
                }
                int i12 = j0.i.f29566a;
                i.a.b();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return false;
                }
                return true;
            }
            if (getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                int i11 = j0.i.f29566a;
                i.a.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    i.a.b();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i12 = j0.i.f29566a;
                i.a.b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(g<? extends c0> gVar, c0 c0Var, int i10) {
            if (gVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1, null);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.e(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11, null);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.e(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.f(i10, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.d(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.d(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hamkho.livefoot.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.c0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.j(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public Parcelable f2129u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2129u = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeParcelable(this.f2129u, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a10;
        float a11;
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new androidx.recyclerview.widget.a0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.k();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new b0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new m.b() : null;
        this.mState = new z();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = g0.f33078a;
            a10 = g0.a.a(viewConfiguration);
        } else {
            a10 = g0.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = a10;
        if (i11 >= 26) {
            a11 = g0.a.b(viewConfiguration);
        } else {
            a11 = g0.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = a11;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f2143a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        if (c0.d.c(this) == 0) {
            c0.d.s(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.v(this));
        int[] iArr = androidx.activity.n.F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0.c0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z10 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        n0.c0.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().f(i10) != null;
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().g(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().h(i10);
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c0 f2170a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f2171b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2172c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2173d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2171b = new Rect();
            this.f2172c = true;
            this.f2173d = false;
        }

        public final int a() {
            return this.f2170a.getLayoutPosition();
        }

        public final boolean b() {
            return this.f2170a.isUpdated();
        }

        public final boolean c() {
            return this.f2170a.isRemoved();
        }

        public p(int i10, int i11) {
            super(i10, i11);
            this.f2171b = new Rect();
            this.f2172c = true;
            this.f2173d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2171b = new Rect();
            this.f2172c = true;
            this.f2173d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2171b = new Rect();
            this.f2172c = true;
            this.f2173d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f2171b = new Rect();
            this.f2172c = true;
            this.f2173d = false;
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oVar.d()) {
            i10 = 0;
        }
        if (!this.mLayout.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 == Integer.MIN_VALUE || i12 > 0) {
            if (z10) {
                int i13 = i10 != 0 ? 1 : 0;
                if (i11 != 0) {
                    i13 |= 2;
                }
                startNestedScroll(i13, 1);
            }
            this.mViewFlinger.b(i10, i11, interpolator, i12);
            return;
        }
        scrollBy(i10, i11);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.t(layoutParams);
        }
        throw new IllegalStateException(a3.k.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    /* loaded from: classes.dex */
    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f2151a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f2152b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.recyclerview.widget.z f2153c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.recyclerview.widget.z f2154d;

        /* renamed from: e, reason: collision with root package name */
        public y f2155e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2156g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f2157h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f2158i;

        /* renamed from: j, reason: collision with root package name */
        public int f2159j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2160k;

        /* renamed from: l, reason: collision with root package name */
        public int f2161l;

        /* renamed from: m, reason: collision with root package name */
        public int f2162m;

        /* renamed from: n, reason: collision with root package name */
        public int f2163n;
        public int o;

        /* loaded from: classes.dex */
        public class a implements z.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int a(View view) {
                p pVar = (p) view.getLayoutParams();
                o.this.getClass();
                return (view.getLeft() - o.A(view)) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int b() {
                return o.this.C();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int c() {
                o oVar = o.this;
                return oVar.f2163n - oVar.D();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final View d(int i10) {
                return o.this.v(i10);
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int e(View view) {
                p pVar = (p) view.getLayoutParams();
                o.this.getClass();
                return o.H(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements z.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int a(View view) {
                p pVar = (p) view.getLayoutParams();
                o.this.getClass();
                return (view.getTop() - o.J(view)) - ((ViewGroup.MarginLayoutParams) pVar).topMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int b() {
                return o.this.E();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int c() {
                o oVar = o.this;
                return oVar.o - oVar.B();
            }

            @Override // androidx.recyclerview.widget.z.b
            public final View d(int i10) {
                return o.this.v(i10);
            }

            @Override // androidx.recyclerview.widget.z.b
            public final int e(View view) {
                p pVar = (p) view.getLayoutParams();
                o.this.getClass();
                return o.u(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f2166a;

            /* renamed from: b, reason: collision with root package name */
            public int f2167b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f2168c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f2169d;
        }

        public o() {
            a aVar = new a();
            b bVar = new b();
            this.f2153c = new androidx.recyclerview.widget.z(aVar);
            this.f2154d = new androidx.recyclerview.widget.z(bVar);
            this.f = false;
            this.f2156g = false;
            this.f2157h = true;
            this.f2158i = true;
        }

        public static int A(View view) {
            return ((p) view.getLayoutParams()).f2171b.left;
        }

        public static int F(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public static d G(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.activity.n.F, i10, i11);
            dVar.f2166a = obtainStyledAttributes.getInt(0, 1);
            dVar.f2167b = obtainStyledAttributes.getInt(10, 1);
            dVar.f2168c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f2169d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int H(View view) {
            return ((p) view.getLayoutParams()).f2171b.right;
        }

        public static int J(View view) {
            return ((p) view.getLayoutParams()).f2171b.top;
        }

        public static boolean M(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i10) {
                    return false;
                }
                return true;
            }
            if (size < i10) {
                return false;
            }
            return true;
        }

        public static void N(View view, int i10, int i11, int i12, int i13) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f2171b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public static int g(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i11, i12);
                }
                return size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public static int u(View view) {
            return ((p) view.getLayoutParams()).f2171b.bottom;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int x(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.x(int, int, int, int, boolean):int");
        }

        public final void A0(androidx.recyclerview.widget.o oVar) {
            y yVar = this.f2155e;
            if (yVar != null && oVar != yVar && yVar.f2192e) {
                yVar.d();
            }
            this.f2155e = oVar;
            RecyclerView recyclerView = this.f2152b;
            b0 b0Var = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f2134u.abortAnimation();
            if (oVar.f2194h) {
                Log.w(RecyclerView.TAG, "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.f2189b = recyclerView;
            oVar.f2190c = this;
            int i10 = oVar.f2188a;
            if (i10 != -1) {
                recyclerView.mState.f2201a = i10;
                oVar.f2192e = true;
                oVar.f2191d = true;
                oVar.f = recyclerView.mLayout.q(i10);
                oVar.f2189b.mViewFlinger.a();
                oVar.f2194h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int B() {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean B0() {
            return false;
        }

        public final int C() {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int D() {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int I(v vVar, z zVar) {
            return -1;
        }

        public final void K(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((p) view.getLayoutParams()).f2171b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f2152b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2152b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean L() {
            return false;
        }

        public void O(int i10) {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void P(int i10) {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public View S(View view, int i10, v vVar, z zVar) {
            return null;
        }

        public void T(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2152b;
            v vVar = recyclerView.mRecycler;
            z zVar = recyclerView.mState;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2152b.canScrollVertically(-1) && !this.f2152b.canScrollHorizontally(-1) && !this.f2152b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                g gVar = this.f2152b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.getItemCount());
                }
            }
        }

        public void U(v vVar, z zVar, o0.g gVar) {
            if (this.f2152b.canScrollVertically(-1) || this.f2152b.canScrollHorizontally(-1)) {
                gVar.a(8192);
                gVar.i(true);
            }
            if (this.f2152b.canScrollVertically(1) || this.f2152b.canScrollHorizontally(1)) {
                gVar.a(4096);
                gVar.i(true);
            }
            gVar.f33521a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(I(vVar, zVar), y(vVar, zVar), 0).f33535a);
        }

        public final void V(View view, o0.g gVar) {
            c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f2151a.j(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f2152b;
                W(recyclerView.mRecycler, recyclerView.mState, view, gVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(android.view.View r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.b(android.view.View, int, boolean):void");
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void c0(v vVar, z zVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public boolean f(p pVar) {
            if (pVar != null) {
                return true;
            }
            return false;
        }

        public Parcelable f0() {
            return null;
        }

        public boolean h0(v vVar, z zVar, int i10, Bundle bundle) {
            int i11;
            int C;
            int i12;
            int i13;
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 != 8192) {
                    i13 = 0;
                    i12 = 0;
                } else {
                    if (recyclerView.canScrollVertically(-1)) {
                        i11 = -((this.o - E()) - B());
                    } else {
                        i11 = 0;
                    }
                    if (this.f2152b.canScrollHorizontally(-1)) {
                        C = -((this.f2163n - C()) - D());
                        i12 = i11;
                        i13 = C;
                    }
                    i12 = i11;
                    i13 = 0;
                }
            } else {
                if (recyclerView.canScrollVertically(1)) {
                    i11 = (this.o - E()) - B();
                } else {
                    i11 = 0;
                }
                if (this.f2152b.canScrollHorizontally(1)) {
                    C = (this.f2163n - C()) - D();
                    i12 = i11;
                    i13 = C;
                }
                i12 = i11;
                i13 = 0;
            }
            if (i12 == 0 && i13 == 0) {
                return false;
            }
            this.f2152b.smoothScrollBy(i13, i12, null, Integer.MIN_VALUE, true);
            return true;
        }

        public final void i0(v vVar) {
            int w10 = w();
            while (true) {
                w10--;
                if (w10 >= 0) {
                    if (!RecyclerView.getChildViewHolderInt(v(w10)).shouldIgnore()) {
                        View v3 = v(w10);
                        l0(w10);
                        vVar.g(v3);
                    }
                } else {
                    return;
                }
            }
        }

        public int j(z zVar) {
            return 0;
        }

        public final void j0(v vVar) {
            ArrayList<c0> arrayList;
            int size = vVar.f2180a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = vVar.f2180a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).itemView;
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f2152b.removeDetachedView(view, false);
                    }
                    l lVar = this.f2152b.mItemAnimator;
                    if (lVar != null) {
                        lVar.d(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    vVar.h(childViewHolderInt2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<c0> arrayList2 = vVar.f2181b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f2152b.invalidate();
            }
        }

        public int k(z zVar) {
            return 0;
        }

        public final void k0(View view, v vVar) {
            androidx.recyclerview.widget.b bVar = this.f2151a;
            e eVar = (e) bVar.f2265a;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f2266b.f(indexOfChild)) {
                    bVar.k(view);
                }
                eVar.b(indexOfChild);
            }
            vVar.g(view);
        }

        public int l(z zVar) {
            return 0;
        }

        public final void l0(int i10) {
            if (v(i10) != null) {
                androidx.recyclerview.widget.b bVar = this.f2151a;
                int f = bVar.f(i10);
                e eVar = (e) bVar.f2265a;
                View childAt = RecyclerView.this.getChildAt(f);
                if (childAt != null) {
                    if (bVar.f2266b.f(f)) {
                        bVar.k(childAt);
                    }
                    eVar.b(f);
                }
            }
        }

        public int m(z zVar) {
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a8, code lost:
        
            if (r10 == false) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.C()
                int r1 = r8.E()
                int r2 = r8.f2163n
                int r3 = r8.D()
                int r2 = r2 - r3
                int r3 = r8.o
                int r4 = r8.B()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.z()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                if (r13 == 0) goto Laa
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L75
            L73:
                r10 = r0
                goto La8
            L75:
                int r11 = r8.C()
                int r13 = r8.E()
                int r3 = r8.f2163n
                int r4 = r8.D()
                int r3 = r3 - r4
                int r4 = r8.o
                int r5 = r8.B()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f2152b
                android.graphics.Rect r5 = r5.mTempRect
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L73
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L73
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L73
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto La7
                goto L73
            La7:
                r10 = r7
            La8:
                if (r10 == 0) goto Laf
            Laa:
                if (r2 != 0) goto Lb0
                if (r1 == 0) goto Laf
                goto Lb0
            Laf:
                return r0
            Lb0:
                if (r12 == 0) goto Lb6
                r9.scrollBy(r2, r1)
                goto Lb9
            Lb6:
                r9.smoothScrollBy(r2, r1)
            Lb9:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.m0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int n(z zVar) {
            return 0;
        }

        public final void n0() {
            RecyclerView recyclerView = this.f2152b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int o(z zVar) {
            return 0;
        }

        public int o0(int i10, v vVar, z zVar) {
            return 0;
        }

        public final void p(v vVar) {
            int w10 = w();
            while (true) {
                w10--;
                if (w10 >= 0) {
                    View v3 = v(w10);
                    c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(v3);
                    if (!childViewHolderInt.shouldIgnore()) {
                        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f2152b.mAdapter.hasStableIds()) {
                            l0(w10);
                            vVar.h(childViewHolderInt);
                        } else {
                            v(w10);
                            this.f2151a.c(w10);
                            vVar.i(v3);
                            this.f2152b.mViewInfoStore.c(childViewHolderInt);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public View q(int i10) {
            int w10 = w();
            for (int i11 = 0; i11 < w10; i11++) {
                View v3 = v(i11);
                c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(v3);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f2152b.mState.f2206g || !childViewHolderInt.isRemoved())) {
                    return v3;
                }
            }
            return null;
        }

        public int q0(int i10, v vVar, z zVar) {
            return 0;
        }

        public abstract p r();

        public final void r0(RecyclerView recyclerView) {
            s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public p s(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public final void s0(int i10, int i11) {
            this.f2163n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2161l = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f2163n = 0;
            }
            this.o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2162m = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.o = 0;
            }
        }

        public p t(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public void t0(Rect rect, int i10, int i11) {
            int D = D() + C() + rect.width();
            int B = B() + E() + rect.height();
            RecyclerView recyclerView = this.f2152b;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            this.f2152b.setMeasuredDimension(g(i10, D, c0.d.e(recyclerView)), g(i11, B, c0.d.d(this.f2152b)));
        }

        public final void u0(int i10, int i11) {
            int w10 = w();
            if (w10 == 0) {
                this.f2152b.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < w10; i16++) {
                View v3 = v(i16);
                Rect rect = this.f2152b.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(v3, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f2152b.mTempRect.set(i15, i13, i12, i14);
            t0(this.f2152b.mTempRect, i10, i11);
        }

        public final View v(int i10) {
            androidx.recyclerview.widget.b bVar = this.f2151a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public final void v0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2152b = null;
                this.f2151a = null;
                this.f2163n = 0;
                this.o = 0;
            } else {
                this.f2152b = recyclerView;
                this.f2151a = recyclerView.mChildHelper;
                this.f2163n = recyclerView.getWidth();
                this.o = recyclerView.getHeight();
            }
            this.f2161l = 1073741824;
            this.f2162m = 1073741824;
        }

        public final int w() {
            androidx.recyclerview.widget.b bVar = this.f2151a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final boolean w0(View view, int i10, int i11, p pVar) {
            if (!view.isLayoutRequested() && this.f2157h && M(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && M(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) {
                return false;
            }
            return true;
        }

        public boolean x0() {
            return false;
        }

        public int y(v vVar, z zVar) {
            return -1;
        }

        public final boolean y0(View view, int i10, int i11, p pVar) {
            if (this.f2157h && M(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) pVar).width) && M(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) pVar).height)) {
                return false;
            }
            return true;
        }

        public final int z() {
            RecyclerView recyclerView = this.f2152b;
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            return c0.e.d(recyclerView);
        }

        public void z0(RecyclerView recyclerView, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void Q() {
        }

        public void Y() {
        }

        public void R(RecyclerView recyclerView) {
        }

        public void d0(z zVar) {
        }

        public void e0(Parcelable parcelable) {
        }

        public void g0(int i10) {
        }

        public void p0(int i10) {
        }

        public void X(int i10, int i11) {
        }

        public void Z(int i10, int i11) {
        }

        public void a0(int i10, int i11) {
        }

        public void b0(int i10, int i11) {
        }

        public void i(int i10, c cVar) {
        }

        public void W(v vVar, z zVar, View view, o0.g gVar) {
        }

        public void h(int i10, int i11, z zVar, c cVar) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        public void d(Canvas canvas) {
        }

        public void c(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i10) {
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void onScrolled(int i10, int i11) {
    }
}
