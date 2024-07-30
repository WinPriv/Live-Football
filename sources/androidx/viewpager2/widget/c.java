package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
public final class c extends ViewPager2.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2568a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i10) {
        try {
            Iterator it = this.f2568a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void b(float f, int i10, int i11) {
        try {
            Iterator it = this.f2568a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).b(f, i10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i10) {
        try {
            Iterator it = this.f2568a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}
