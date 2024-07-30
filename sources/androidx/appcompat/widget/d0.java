package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.f;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: g, reason: collision with root package name */
    public static d0 f1146g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, q.j<ColorStateList>> f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Context, q.f<WeakReference<Drawable.ConstantState>>> f1149b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1150c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1151d;

    /* renamed from: e, reason: collision with root package name */
    public b f1152e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final a f1147h = new a();

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a extends q.g<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public static synchronized d0 c() {
        d0 d0Var;
        synchronized (d0.class) {
            if (f1146g == null) {
                f1146g = new d0();
            }
            d0Var = f1146g;
        }
        return d0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (d0.class) {
            a aVar = f1147h;
            aVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                aVar.getClass();
                aVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            q.f<WeakReference<Drawable.ConstantState>> fVar = this.f1149b.get(context);
            if (fVar == null) {
                fVar = new q.f<>();
                this.f1149b.put(context, fVar);
            }
            fVar.f(j10, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(int r8, android.content.Context r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.f1150c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f1150c = r0
        Lb:
            android.util.TypedValue r0 = r7.f1150c
            android.content.res.Resources r1 = r9.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.d(r9, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            androidx.appcompat.widget.d0$b r1 = r7.f1152e
            if (r1 != 0) goto L2b
            goto L73
        L2b:
            r1 = 2131230787(0x7f080043, float:1.8077637E38)
            if (r8 != r1) goto L4c
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131230786(0x7f080042, float:1.8077635E38)
            android.graphics.drawable.Drawable r5 = r7.f(r9, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131230788(0x7f080044, float:1.8077639E38)
            android.graphics.drawable.Drawable r5 = r7.f(r9, r5)
            r1[r2] = r5
            r8.<init>(r1)
            goto L74
        L4c:
            r1 = 2131230822(0x7f080066, float:1.8077708E38)
            if (r8 != r1) goto L59
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = androidx.appcompat.widget.f.a.c(r7, r9, r8)
            goto L74
        L59:
            r1 = 2131230821(0x7f080065, float:1.8077706E38)
            if (r8 != r1) goto L66
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = androidx.appcompat.widget.f.a.c(r7, r9, r8)
            goto L74
        L66:
            r1 = 2131230823(0x7f080067, float:1.807771E38)
            if (r8 != r1) goto L73
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = androidx.appcompat.widget.f.a.c(r7, r9, r8)
            goto L74
        L73:
            r8 = 0
        L74:
            if (r8 == 0) goto L7e
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            r7.a(r9, r3, r8)
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.b(int, android.content.Context):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable d(Context context, long j10) {
        q.f<WeakReference<Drawable.ConstantState>> fVar = this.f1149b.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) fVar.d(j10, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.g(j10);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        g0.a.b.i(r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002b, code lost:
    
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable e(int r12, android.content.Context r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.e(int, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i10) {
        return e(i10, context, false);
    }

    public final synchronized ColorStateList h(int i10, Context context) {
        ColorStateList colorStateList;
        q.j<ColorStateList> jVar;
        try {
            WeakHashMap<Context, q.j<ColorStateList>> weakHashMap = this.f1148a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (jVar = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) jVar.c(i10, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                b bVar = this.f1152e;
                if (bVar != null) {
                    colorStateList2 = ((f.a) bVar).d(i10, context);
                }
                if (colorStateList2 != null) {
                    if (this.f1148a == null) {
                        this.f1148a = new WeakHashMap<>();
                    }
                    q.j<ColorStateList> jVar2 = this.f1148a.get(context);
                    if (jVar2 == null) {
                        jVar2 = new q.j<>();
                        this.f1148a.put(context, jVar2);
                    }
                    jVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.d0$b r0 = r6.f1152e
            r1 = 0
            if (r0 == 0) goto L70
            androidx.appcompat.widget.f$a r0 = (androidx.appcompat.widget.f.a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.f.f1158b
            int[] r3 = r0.f1161a
            boolean r3 = androidx.appcompat.widget.f.a.a(r8, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968865(0x7f040121, float:1.7546396E38)
            goto L4a
        L17:
            int[] r3 = r0.f1163c
            boolean r3 = androidx.appcompat.widget.f.a.a(r8, r3)
            if (r3 == 0) goto L23
            r8 = 2130968863(0x7f04011f, float:1.7546392E38)
            goto L4a
        L23:
            int[] r0 = r0.f1164d
            boolean r0 = androidx.appcompat.widget.f.a.a(r8, r0)
            if (r0 == 0) goto L2e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L47
        L2e:
            r0 = 2131230808(0x7f080058, float:1.807768E38)
            if (r8 != r0) goto L42
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L52
        L42:
            r0 = 2131230790(0x7f080046, float:1.8077643E38)
            if (r8 != r0) goto L4d
        L47:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4a:
            r0 = r8
            r8 = r4
            goto L4f
        L4d:
            r8 = r1
            r0 = r8
        L4f:
            r3 = r2
            r2 = r0
            r0 = r5
        L52:
            if (r8 == 0) goto L6c
            int[] r8 = androidx.appcompat.widget.x.f1275a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.h0.c(r2, r7)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.f.c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6a
            r8.setAlpha(r0)
        L6a:
            r7 = r4
            goto L6d
        L6c:
            r7 = r1
        L6d:
            if (r7 == 0) goto L70
            r1 = r4
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
