package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f664b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f665c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f666d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f667e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f668g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final q.i<String, Constructor<? extends View>> f669h = new q.i<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f670a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final View f671s;

        /* renamed from: t, reason: collision with root package name */
        public final String f672t;

        /* renamed from: u, reason: collision with root package name */
        public Method f673u;

        /* renamed from: v, reason: collision with root package name */
        public Context f674v;

        public a(View view, String str) {
            this.f671s = view;
            this.f672t = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f673u == null) {
                View view2 = this.f671s;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f672t;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f673u = method;
                                this.f674v = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        int id2 = view2.getId();
                        if (id2 == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                        }
                        StringBuilder s10 = a3.l.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        s10.append(view2.getClass());
                        s10.append(str);
                        throw new IllegalStateException(s10.toString());
                    }
                }
            }
            try {
                this.f673u.invoke(this.f674v, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String concat;
        q.i<String, Constructor<? extends View>> iVar = f669h;
        Constructor<? extends View> orDefault = iVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            orDefault = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f664b);
            iVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f670a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
