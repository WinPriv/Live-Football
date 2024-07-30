package n1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import e0.f;
import e0.l;
import g0.a;
import java.io.IOException;
import java.util.ArrayList;
import n1.g;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class d extends f implements Animatable {

    /* renamed from: t, reason: collision with root package name */
    public final b f33147t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f33148u;

    /* renamed from: v, reason: collision with root package name */
    public e f33149v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<n1.c> f33150w;

    /* renamed from: x, reason: collision with root package name */
    public final a f33151x;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            d.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public g f33153a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f33154b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f33155c;

        /* renamed from: d, reason: collision with root package name */
        public q.b<Animator, String> f33156d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d() {
        this(null);
    }

    @Override // n1.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f33147t;
        bVar.f33153a.draw(canvas);
        if (bVar.f33154b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.C0385a.a(drawable);
        }
        return this.f33147t.f33153a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f33147t.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f33147t.f33153a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f33159s != null) {
            return new c(this.f33159s.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f33147t.f33153a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f33147t.f33153a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f33147t.f33153a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar;
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f33147t;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray e10 = l.e(resources, theme, attributeSet, n1.a.f33144e);
                    int resourceId = e10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVar = new g();
                        ThreadLocal<TypedValue> threadLocal = e0.f.f27633a;
                        gVar.f33159s = f.a.a(resources, resourceId, theme);
                        new g.h(gVar.f33159s.getConstantState());
                        gVar.f33164x = false;
                        gVar.setCallback(this.f33151x);
                        g gVar2 = bVar.f33153a;
                        if (gVar2 != null) {
                            gVar2.setCallback(null);
                        }
                        bVar.f33153a = gVar;
                    }
                    e10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, n1.a.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f33148u;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(bVar.f33153a.f33160t.f33205b.o.getOrDefault(string, null));
                            if (bVar.f33155c == null) {
                                bVar.f33155c = new ArrayList<>();
                                bVar.f33156d = new q.b<>();
                            }
                            bVar.f33155c.add(loadAnimator);
                            bVar.f33156d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (bVar.f33154b == null) {
            bVar.f33154b = new AnimatorSet();
        }
        bVar.f33154b.playTogether(bVar.f33155c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return a.C0385a.d(drawable);
        }
        return this.f33147t.f33153a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f33147t.f33154b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f33147t.f33153a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f33147t.f33153a.setBounds(rect);
        }
    }

    @Override // n1.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f33147t.f33153a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f33147t.f33153a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f33147t.f33153a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            a.C0385a.e(drawable, z10);
        } else {
            this.f33147t.f33153a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f33147t.f33153a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            g0.a.a(drawable, i10);
        } else {
            this.f33147t.f33153a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            g0.a.b(drawable, colorStateList);
        } else {
            this.f33147t.f33153a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            g0.a.c(drawable, mode);
        } else {
            this.f33147t.f33153a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f33147t.f33153a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f33147t;
        if (bVar.f33154b.isStarted()) {
            return;
        }
        bVar.f33154b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f33159s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f33147t.f33154b.end();
        }
    }

    public d(Context context) {
        this.f33149v = null;
        this.f33150w = null;
        a aVar = new a();
        this.f33151x = aVar;
        this.f33148u = context;
        this.f33147t = new b(aVar);
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f33157a;

        public c(Drawable.ConstantState constantState) {
            this.f33157a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f33157a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f33157a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f33157a.newDrawable();
            dVar.f33159s = newDrawable;
            newDrawable.setCallback(dVar.f33151x);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f33157a.newDrawable(resources);
            dVar.f33159s = newDrawable;
            newDrawable.setCallback(dVar.f33151x);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f33157a.newDrawable(resources, theme);
            dVar.f33159s = newDrawable;
            newDrawable.setCallback(dVar.f33151x);
            return dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
