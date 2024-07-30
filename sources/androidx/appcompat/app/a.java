package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n(CharSequence charSequence);

    public i.a o(AppCompatDelegateImpl.e eVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f643a;

        public C0010a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f643a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.D);
            this.f643a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0010a() {
            super(-2, -2);
            this.f643a = 8388627;
        }

        public C0010a(C0010a c0010a) {
            super((ViewGroup.MarginLayoutParams) c0010a);
            this.f643a = 0;
            this.f643a = c0010a.f643a;
        }

        public C0010a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f643a = 0;
        }
    }

    public void h() {
    }
}
