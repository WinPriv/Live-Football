package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0020b f2265a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2266b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2267c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f2268a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f2269b;

        public final void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f2269b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f2268a &= ~(1 << i10);
        }

        public final int b(int i10) {
            a aVar = this.f2269b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f2268a);
                }
                return Long.bitCount(this.f2268a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f2268a & ((1 << i10) - 1));
            }
            return Long.bitCount(this.f2268a) + aVar.b(i10 - 64);
        }

        public final void c() {
            if (this.f2269b == null) {
                this.f2269b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2269b.d(i10 - 64);
            }
            if ((this.f2268a & (1 << i10)) != 0) {
                return true;
            }
            return false;
        }

        public final void e(int i10, boolean z10) {
            boolean z11;
            if (i10 >= 64) {
                c();
                this.f2269b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f2268a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i10) - 1;
            this.f2268a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f2269b != null) {
                c();
                this.f2269b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            boolean z10;
            if (i10 >= 64) {
                c();
                return this.f2269b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2268a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (~j10);
            this.f2268a = j12;
            long j13 = j10 - 1;
            this.f2268a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2269b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2269b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f2268a = 0L;
            a aVar = this.f2269b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f2269b.h(i10 - 64);
            } else {
                this.f2268a |= 1 << i10;
            }
        }

        public final String toString() {
            if (this.f2269b == null) {
                return Long.toBinaryString(this.f2268a);
            }
            return this.f2269b.toString() + "xx" + Long.toBinaryString(this.f2268a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0020b {
    }

    public b(RecyclerView.e eVar) {
        this.f2265a = eVar;
    }

    public final void a(View view, int i10, boolean z10) {
        int f;
        InterfaceC0020b interfaceC0020b = this.f2265a;
        if (i10 < 0) {
            f = ((RecyclerView.e) interfaceC0020b).a();
        } else {
            f = f(i10);
        }
        this.f2266b.e(f, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.addView(view, f);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f;
        InterfaceC0020b interfaceC0020b = this.f2265a;
        if (i10 < 0) {
            f = ((RecyclerView.e) interfaceC0020b).a();
        } else {
            f = f(i10);
        }
        this.f2266b.e(f, z10);
        if (z10) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) interfaceC0020b;
        eVar.getClass();
        RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = RecyclerView.this;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a3.k.i(recyclerView, sb2));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, f, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.c0 childViewHolderInt;
        int f = f(i10);
        this.f2266b.f(f);
        RecyclerView.e eVar = (RecyclerView.e) this.f2265a;
        View childAt = RecyclerView.this.getChildAt(f);
        RecyclerView recyclerView = RecyclerView.this;
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a3.k.i(recyclerView, sb2));
            }
            childViewHolderInt.addFlags(256);
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i10) {
        return RecyclerView.this.getChildAt(f(i10));
    }

    public final int e() {
        return ((RecyclerView.e) this.f2265a).a() - this.f2267c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((RecyclerView.e) this.f2265a).a();
        int i11 = i10;
        while (i11 < a10) {
            a aVar = this.f2266b;
            int b10 = i10 - (i11 - aVar.b(i11));
            if (b10 == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return RecyclerView.this.getChildAt(i10);
    }

    public final int h() {
        return ((RecyclerView.e) this.f2265a).a();
    }

    public final void i(View view) {
        this.f2267c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.f2265a;
        eVar.getClass();
        RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final boolean j(View view) {
        return this.f2267c.contains(view);
    }

    public final void k(View view) {
        if (this.f2267c.remove(view)) {
            RecyclerView.e eVar = (RecyclerView.e) this.f2265a;
            eVar.getClass();
            RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f2266b.toString() + ", hidden list:" + this.f2267c.size();
    }
}
