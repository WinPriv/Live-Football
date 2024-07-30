package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.n;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import g2.a0;
import g2.c0;
import g2.d0;
import g2.e;
import g2.e0;
import g2.f;
import g2.f0;
import g2.g0;
import g2.h;
import g2.i0;
import g2.j;
import g2.j0;
import g2.k0;
import g2.l0;
import g2.p;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import s2.d;
import s2.g;
import t2.c;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final f J = new c0() { // from class: g2.f
        @Override // g2.c0
        public final void onResult(Object obj) {
            boolean z10;
            Throwable th = (Throwable) obj;
            f fVar = LottieAnimationView.J;
            g.a aVar = s2.g.f35111a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                s2.c.c("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    };
    public String A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final HashSet F;
    public final HashSet G;
    public g0<h> H;
    public h I;

    /* renamed from: v, reason: collision with root package name */
    public final e f3492v;

    /* renamed from: w, reason: collision with root package name */
    public final a f3493w;

    /* renamed from: x, reason: collision with root package name */
    public c0<Throwable> f3494x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public final a0 f3495z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public String f3496s;

        /* renamed from: t, reason: collision with root package name */
        public int f3497t;

        /* renamed from: u, reason: collision with root package name */
        public float f3498u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f3499v;

        /* renamed from: w, reason: collision with root package name */
        public String f3500w;

        /* renamed from: x, reason: collision with root package name */
        public int f3501x;
        public int y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f3496s);
            parcel.writeFloat(this.f3498u);
            parcel.writeInt(this.f3499v ? 1 : 0);
            parcel.writeString(this.f3500w);
            parcel.writeInt(this.f3501x);
            parcel.writeInt(this.y);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3496s = parcel.readString();
            this.f3498u = parcel.readFloat();
            this.f3499v = parcel.readInt() == 1;
            this.f3500w = parcel.readString();
            this.f3501x = parcel.readInt();
            this.y = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public class a implements c0<Throwable> {
        public a() {
        }

        @Override // g2.c0
        public final void onResult(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i10 = lottieAnimationView.y;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            c0 c0Var = lottieAnimationView.f3494x;
            if (c0Var == null) {
                c0Var = LottieAnimationView.J;
            }
            c0Var.onResult(th2);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.f3492v = new e(this);
        this.f3493w = new a();
        this.y = 0;
        a0 a0Var = new a0();
        this.f3495z = a0Var;
        this.C = false;
        this.D = false;
        this.E = true;
        HashSet hashSet = new HashSet();
        this.F = hashSet;
        this.G = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.J, R.attr.lottieAnimationViewStyle, 0);
        this.E = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(12);
        boolean hasValue2 = obtainStyledAttributes.hasValue(7);
        boolean hasValue3 = obtainStyledAttributes.hasValue(17);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(17)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(6, 0));
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.D = true;
        }
        if (obtainStyledAttributes.getBoolean(10, false)) {
            a0Var.f28358t.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setRepeatMode(obtainStyledAttributes.getInt(15, 1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setRepeatCount(obtainStyledAttributes.getInt(14, -1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setSpeed(obtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(2, true));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(4));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(9));
        boolean hasValue4 = obtainStyledAttributes.hasValue(11);
        float f = obtainStyledAttributes.getFloat(11, gl.Code);
        if (hasValue4) {
            hashSet.add(b.SET_PROGRESS);
        }
        a0Var.u(f);
        boolean z10 = obtainStyledAttributes.getBoolean(5, false);
        if (a0Var.E != z10) {
            a0Var.E = z10;
            if (a0Var.f28357s != null) {
                a0Var.c();
            }
        }
        if (obtainStyledAttributes.hasValue(3)) {
            a0Var.a(new l2.e("**"), e0.K, new c(new k0(d0.a.b(obtainStyledAttributes.getResourceId(3, -1), getContext()).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            int i10 = obtainStyledAttributes.getInt(13, 0);
            setRenderMode(j0.values()[i10 >= j0.values().length ? 0 : i10]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(8, false));
        if (obtainStyledAttributes.hasValue(18)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(18, false));
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        g.a aVar = g.f35111a;
        a0Var.f28359u = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != gl.Code).booleanValue();
    }

    private void setCompositionTask(g0<h> g0Var) {
        Throwable th;
        h hVar;
        this.F.add(b.SET_ANIMATION);
        this.I = null;
        this.f3495z.d();
        c();
        e eVar = this.f3492v;
        synchronized (g0Var) {
            f0<h> f0Var = g0Var.f28404d;
            if (f0Var != null && (hVar = f0Var.f28396a) != null) {
                eVar.onResult(hVar);
            }
            g0Var.f28401a.add(eVar);
        }
        a aVar = this.f3493w;
        synchronized (g0Var) {
            f0<h> f0Var2 = g0Var.f28404d;
            if (f0Var2 != null && (th = f0Var2.f28397b) != null) {
                aVar.onResult(th);
            }
            g0Var.f28402b.add(aVar);
        }
        this.H = g0Var;
    }

    public final void c() {
        g0<h> g0Var = this.H;
        if (g0Var != null) {
            e eVar = this.f3492v;
            synchronized (g0Var) {
                g0Var.f28401a.remove(eVar);
            }
            g0<h> g0Var2 = this.H;
            a aVar = this.f3493w;
            synchronized (g0Var2) {
                g0Var2.f28402b.remove(aVar);
            }
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.f3495z.G;
    }

    public h getComposition() {
        return this.I;
    }

    public long getDuration() {
        if (this.I != null) {
            return r0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f3495z.f28358t.f35108z;
    }

    public String getImageAssetsFolder() {
        return this.f3495z.A;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f3495z.F;
    }

    public float getMaxFrame() {
        return this.f3495z.f28358t.c();
    }

    public float getMinFrame() {
        return this.f3495z.f28358t.d();
    }

    public i0 getPerformanceTracker() {
        h hVar = this.f3495z.f28357s;
        if (hVar != null) {
            return hVar.f28406a;
        }
        return null;
    }

    public float getProgress() {
        d dVar = this.f3495z.f28358t;
        h hVar = dVar.D;
        if (hVar == null) {
            return gl.Code;
        }
        float f = dVar.f35108z;
        float f10 = hVar.f28415k;
        return (f - f10) / (hVar.f28416l - f10);
    }

    public j0 getRenderMode() {
        if (this.f3495z.N) {
            return j0.SOFTWARE;
        }
        return j0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f3495z.f28358t.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f3495z.f28358t.getRepeatMode();
    }

    public float getSpeed() {
        return this.f3495z.f28358t.f35105v;
    }

    @Override // android.view.View
    public final void invalidate() {
        j0 j0Var;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof a0) {
            boolean z10 = ((a0) drawable).N;
            j0 j0Var2 = j0.SOFTWARE;
            if (z10) {
                j0Var = j0Var2;
            } else {
                j0Var = j0.HARDWARE;
            }
            if (j0Var == j0Var2) {
                this.f3495z.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        a0 a0Var = this.f3495z;
        if (drawable2 == a0Var) {
            super.invalidateDrawable(a0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.D) {
            this.f3495z.j();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A = savedState.f3496s;
        HashSet hashSet = this.F;
        b bVar = b.SET_ANIMATION;
        if (!hashSet.contains(bVar) && !TextUtils.isEmpty(this.A)) {
            setAnimation(this.A);
        }
        this.B = savedState.f3497t;
        if (!hashSet.contains(bVar) && (i10 = this.B) != 0) {
            setAnimation(i10);
        }
        boolean contains = hashSet.contains(b.SET_PROGRESS);
        a0 a0Var = this.f3495z;
        if (!contains) {
            a0Var.u(savedState.f3498u);
        }
        b bVar2 = b.PLAY_OPTION;
        if (!hashSet.contains(bVar2) && savedState.f3499v) {
            hashSet.add(bVar2);
            a0Var.j();
        }
        if (!hashSet.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f3500w);
        }
        if (!hashSet.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f3501x);
        }
        if (!hashSet.contains(b.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.y);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        float f;
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3496s = this.A;
        savedState.f3497t = this.B;
        a0 a0Var = this.f3495z;
        d dVar = a0Var.f28358t;
        h hVar = dVar.D;
        if (hVar == null) {
            f = gl.Code;
        } else {
            float f10 = dVar.f35108z;
            float f11 = hVar.f28415k;
            f = (f10 - f11) / (hVar.f28416l - f11);
        }
        savedState.f3498u = f;
        boolean isVisible = a0Var.isVisible();
        d dVar2 = a0Var.f28358t;
        if (isVisible) {
            z10 = dVar2.E;
        } else {
            int i10 = a0Var.f28362x;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        savedState.f3499v = z10;
        savedState.f3500w = a0Var.A;
        savedState.f3501x = dVar2.getRepeatMode();
        savedState.y = dVar2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(final int i10) {
        g0<h> a10;
        g0<h> g0Var;
        this.B = i10;
        final String str = null;
        this.A = null;
        if (isInEditMode()) {
            g0Var = new g0<>(new Callable() { // from class: g2.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z10 = lottieAnimationView.E;
                    int i11 = i10;
                    if (z10) {
                        Context context = lottieAnimationView.getContext();
                        return p.e(context, i11, p.i(i11, context));
                    }
                    return p.e(lottieAnimationView.getContext(), i11, null);
                }
            }, true);
        } else {
            if (this.E) {
                Context context = getContext();
                final String i11 = p.i(i10, context);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                a10 = p.a(i11, new Callable() { // from class: g2.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return p.e(context2, i10, i11);
                    }
                });
            } else {
                Context context2 = getContext();
                HashMap hashMap = p.f28444a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                a10 = p.a(null, new Callable() { // from class: g2.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context22 = (Context) weakReference2.get();
                        if (context22 == null) {
                            context22 = applicationContext2;
                        }
                        return p.e(context22, i10, str);
                    }
                });
            }
            g0Var = a10;
        }
        setCompositionTask(g0Var);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(p.a(null, new j(0, new ByteArrayInputStream(str.getBytes()), null)));
    }

    public void setAnimationFromUrl(final String str) {
        g0<h> a10;
        if (this.E) {
            final Context context = getContext();
            HashMap hashMap = p.f28444a;
            final String b10 = s.f.b("url_", str);
            a10 = p.a(b10, new Callable() { // from class: g2.i
                /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 328
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g2.i.call():java.lang.Object");
                }
            });
        } else {
            final Context context2 = getContext();
            final String str2 = null;
            a10 = p.a(null, new Callable() { // from class: g2.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instructions count: 328
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g2.i.call():java.lang.Object");
                }
            });
        }
        setCompositionTask(a10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f3495z.L = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.E = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        a0 a0Var = this.f3495z;
        if (z10 != a0Var.G) {
            a0Var.G = z10;
            o2.c cVar = a0Var.H;
            if (cVar != null) {
                cVar.H = z10;
            }
            a0Var.invalidateSelf();
        }
    }

    public void setComposition(h hVar) {
        boolean z10;
        a0 a0Var = this.f3495z;
        a0Var.setCallback(this);
        this.I = hVar;
        boolean z11 = true;
        this.C = true;
        h hVar2 = a0Var.f28357s;
        d dVar = a0Var.f28358t;
        boolean z12 = false;
        if (hVar2 == hVar) {
            z11 = false;
        } else {
            a0Var.f28356c0 = true;
            a0Var.d();
            a0Var.f28357s = hVar;
            a0Var.c();
            if (dVar.D == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.D = hVar;
            if (z10) {
                dVar.h(Math.max(dVar.B, hVar.f28415k), Math.min(dVar.C, hVar.f28416l));
            } else {
                dVar.h((int) hVar.f28415k, (int) hVar.f28416l);
            }
            float f = dVar.f35108z;
            dVar.f35108z = gl.Code;
            dVar.y = gl.Code;
            dVar.g((int) f);
            dVar.b();
            a0Var.u(dVar.getAnimatedFraction());
            ArrayList<a0.b> arrayList = a0Var.y;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                a0.b bVar = (a0.b) it.next();
                if (bVar != null) {
                    bVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            hVar.f28406a.f28422a = a0Var.J;
            a0Var.e();
            Drawable.Callback callback = a0Var.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(a0Var);
            }
        }
        this.C = false;
        if (getDrawable() == a0Var && !z11) {
            return;
        }
        if (!z11) {
            if (dVar != null) {
                z12 = dVar.E;
            }
            setImageDrawable(null);
            setImageDrawable(a0Var);
            if (z12) {
                a0Var.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.G.iterator();
        while (it2.hasNext()) {
            ((d0) it2.next()).a();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        a0 a0Var = this.f3495z;
        a0Var.D = str;
        k2.a h10 = a0Var.h();
        if (h10 != null) {
            h10.f30307e = str;
        }
    }

    public void setFailureListener(c0<Throwable> c0Var) {
        this.f3494x = c0Var;
    }

    public void setFallbackResource(int i10) {
        this.y = i10;
    }

    public void setFontAssetDelegate(g2.a aVar) {
        k2.a aVar2 = this.f3495z.B;
    }

    public void setFontMap(Map<String, Typeface> map) {
        a0 a0Var = this.f3495z;
        if (map != a0Var.C) {
            a0Var.C = map;
            a0Var.invalidateSelf();
        }
    }

    public void setFrame(int i10) {
        this.f3495z.m(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f3495z.f28360v = z10;
    }

    public void setImageAssetDelegate(g2.b bVar) {
        k2.b bVar2 = this.f3495z.f28363z;
    }

    public void setImageAssetsFolder(String str) {
        this.f3495z.A = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        c();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f3495z.F = z10;
    }

    public void setMaxFrame(int i10) {
        this.f3495z.n(i10);
    }

    public void setMaxProgress(float f) {
        this.f3495z.p(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f3495z.q(str);
    }

    public void setMinFrame(int i10) {
        this.f3495z.r(i10);
    }

    public void setMinProgress(float f) {
        this.f3495z.t(f);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        a0 a0Var = this.f3495z;
        if (a0Var.K != z10) {
            a0Var.K = z10;
            o2.c cVar = a0Var.H;
            if (cVar != null) {
                cVar.s(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        a0 a0Var = this.f3495z;
        a0Var.J = z10;
        h hVar = a0Var.f28357s;
        if (hVar != null) {
            hVar.f28406a.f28422a = z10;
        }
    }

    public void setProgress(float f) {
        this.F.add(b.SET_PROGRESS);
        this.f3495z.u(f);
    }

    public void setRenderMode(j0 j0Var) {
        a0 a0Var = this.f3495z;
        a0Var.M = j0Var;
        a0Var.e();
    }

    public void setRepeatCount(int i10) {
        this.F.add(b.SET_REPEAT_COUNT);
        this.f3495z.f28358t.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.F.add(b.SET_REPEAT_MODE);
        this.f3495z.f28358t.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f3495z.f28361w = z10;
    }

    public void setSpeed(float f) {
        this.f3495z.f28358t.f35105v = f;
    }

    public void setTextDelegate(l0 l0Var) {
        this.f3495z.getClass();
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f3495z.f28358t.F = z10;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        a0 a0Var;
        boolean z10;
        boolean z11 = this.C;
        boolean z12 = false;
        if (!z11 && drawable == (a0Var = this.f3495z)) {
            d dVar = a0Var.f28358t;
            if (dVar == null) {
                z10 = false;
            } else {
                z10 = dVar.E;
            }
            if (z10) {
                this.D = false;
                a0Var.i();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z11 && (drawable instanceof a0)) {
            a0 a0Var2 = (a0) drawable;
            d dVar2 = a0Var2.f28358t;
            if (dVar2 != null) {
                z12 = dVar2.E;
            }
            if (z12) {
                a0Var2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f3495z.o(str);
    }

    public void setMinFrame(String str) {
        this.f3495z.s(str);
    }

    public void setAnimation(final String str) {
        g0<h> a10;
        g0<h> g0Var;
        this.A = str;
        this.B = 0;
        if (isInEditMode()) {
            g0Var = new g0<>(new Callable() { // from class: g2.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z10 = lottieAnimationView.E;
                    String str2 = str;
                    if (z10) {
                        Context context = lottieAnimationView.getContext();
                        HashMap hashMap = p.f28444a;
                        return p.b(context, str2, "asset_" + str2);
                    }
                    return p.b(lottieAnimationView.getContext(), str2, null);
                }
            }, true);
        } else {
            if (this.E) {
                Context context = getContext();
                HashMap hashMap = p.f28444a;
                final String b10 = s.f.b("asset_", str);
                final Context applicationContext = context.getApplicationContext();
                a10 = p.a(b10, new Callable() { // from class: g2.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return p.b(applicationContext, str, b10);
                    }
                });
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = p.f28444a;
                final Context applicationContext2 = context2.getApplicationContext();
                final String str2 = null;
                a10 = p.a(null, new Callable() { // from class: g2.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return p.b(applicationContext2, str, str2);
                    }
                });
            }
            g0Var = a10;
        }
        setCompositionTask(g0Var);
    }
}
