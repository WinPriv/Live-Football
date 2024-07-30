package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public final class r implements LayoutInflater.Factory2 {

    /* renamed from: s, reason: collision with root package name */
    public final FragmentManager f1868s;

    public r(FragmentManager fragmentManager) {
        this.f1868s = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        w f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f1868s;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.L);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z10 = Fragment.class.isAssignableFrom(p.a(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment A = resourceId != -1 ? fragmentManager.A(resourceId) : null;
                if (A == null && string != null) {
                    A = fragmentManager.B(string);
                }
                if (A == null && id2 != -1) {
                    A = fragmentManager.A(id2);
                }
                if (A == null) {
                    p E = fragmentManager.E();
                    context.getClassLoader();
                    A = Fragment.instantiate(FragmentManager.this.f1737p.f1865t, attributeValue, null);
                    A.mFromLayout = true;
                    A.mFragmentId = resourceId != 0 ? resourceId : id2;
                    A.mContainerId = id2;
                    A.mTag = string;
                    A.mInLayout = true;
                    A.mFragmentManager = fragmentManager;
                    q<?> qVar = fragmentManager.f1737p;
                    A.mHost = qVar;
                    A.onInflate(qVar.f1865t, attributeSet, A.mSavedFragmentState);
                    f = fragmentManager.a(A);
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!A.mInLayout) {
                    A.mInLayout = true;
                    A.mFragmentManager = fragmentManager;
                    q<?> qVar2 = fragmentManager.f1737p;
                    A.mHost = qVar2;
                    A.onInflate(qVar2.f1865t, attributeSet, A.mSavedFragmentState);
                    f = fragmentManager.f(A);
                    if (FragmentManager.H(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                }
                A.mContainer = (ViewGroup) view;
                f.k();
                f.j();
                View view2 = A.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.mView.getTag() == null) {
                        A.mView.setTag(string);
                    }
                    A.mView.addOnAttachStateChangeListener(new a(f));
                    return A.mView;
                }
                throw new IllegalStateException(a3.k.l("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w f1869s;

        public a(w wVar) {
            this.f1869s = wVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            w wVar = this.f1869s;
            Fragment fragment = wVar.f1883c;
            wVar.k();
            j0.f((ViewGroup) fragment.mView.getParent(), r.this.f1868s).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
