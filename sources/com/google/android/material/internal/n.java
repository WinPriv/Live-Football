package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.r;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.q0;
import n0.s;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class n {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f20885a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f20886b;

        public a(b bVar, c cVar) {
            this.f20885a = bVar;
            this.f20886b = cVar;
        }

        @Override // n0.s
        public final q0 a(View view, q0 q0Var) {
            return this.f20885a.a(view, q0Var, new c(this.f20886b));
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public interface b {
        q0 a(View view, q0 q0Var, c cVar);
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.i.u(view, new a(bVar, new c(c0.e.f(view), view.getPaddingTop(), c0.e.e(view), view.getPaddingBottom())));
        if (c0.g.b(view)) {
            c0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new o());
        }
    }

    public static float b(int i10, Context context) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static r d(View view) {
        ViewGroup c10 = c(view);
        if (c10 == null) {
            return null;
        }
        return new r(c10);
    }

    public static boolean e(View view) {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f20887a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20888b;

        /* renamed from: c, reason: collision with root package name */
        public int f20889c;

        /* renamed from: d, reason: collision with root package name */
        public int f20890d;

        public c(int i10, int i11, int i12, int i13) {
            this.f20887a = i10;
            this.f20888b = i11;
            this.f20889c = i12;
            this.f20890d = i13;
        }

        public c(c cVar) {
            this.f20887a = cVar.f20887a;
            this.f20888b = cVar.f20888b;
            this.f20889c = cVar.f20889c;
            this.f20890d = cVar.f20890d;
        }
    }
}
