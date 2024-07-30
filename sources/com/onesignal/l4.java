package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: TrackAmazonPurchase.java */
/* loaded from: classes2.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26904b;

    /* renamed from: c, reason: collision with root package name */
    public final b f26905c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26906d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f26907e;
    public final Field f;

    /* compiled from: TrackAmazonPurchase.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l4 l4Var = l4.this;
            PurchasingService.registerListener(l4Var.f26903a, l4Var.f26905c);
        }
    }

    /* compiled from: TrackAmazonPurchase.java */
    /* loaded from: classes2.dex */
    public class b implements PurchasingListener {
    }

    public l4(Context context) {
        this.f26904b = false;
        this.f26906d = false;
        this.f26903a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.f26907e = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f26907e = cls.getMethod(com.anythink.core.c.e.f4869a, new Class[0]).invoke(null, new Object[0]);
                this.f26906d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f = declaredField;
            declaredField.setAccessible(true);
            this.f26905c = new b();
            this.f26904b = true;
            e();
        } catch (ClassCastException e10) {
            d(e10);
        } catch (ClassNotFoundException e11) {
            d(e11);
        } catch (IllegalAccessException e12) {
            d(e12);
        } catch (NoSuchFieldException e13) {
            d(e13);
        } catch (NoSuchMethodException e14) {
            d(e14);
        } catch (InvocationTargetException e15) {
            d(e15);
        }
    }

    public static void d(Exception exc) {
        e3.b(3, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    public final void c() {
        if (!this.f26904b) {
            return;
        }
        try {
            PurchasingListener purchasingListener = (PurchasingListener) this.f.get(this.f26907e);
            b bVar = this.f26905c;
            if (purchasingListener != bVar) {
                bVar.getClass();
                e();
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    public final void e() {
        if (this.f26906d) {
            OSUtils.s(new a());
        } else {
            PurchasingService.registerListener(this.f26903a, this.f26905c);
        }
    }
}
