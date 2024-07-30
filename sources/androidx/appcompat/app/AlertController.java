package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final c K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f545a;

    /* renamed from: b, reason: collision with root package name */
    public final n f546b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f547c;

    /* renamed from: d, reason: collision with root package name */
    public final int f548d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f549e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public RecycleListView f550g;

    /* renamed from: h, reason: collision with root package name */
    public View f551h;

    /* renamed from: i, reason: collision with root package name */
    public int f552i;

    /* renamed from: k, reason: collision with root package name */
    public Button f554k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f555l;

    /* renamed from: m, reason: collision with root package name */
    public Message f556m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f557n;
    public Button o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f558p;

    /* renamed from: q, reason: collision with root package name */
    public Message f559q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f560r;

    /* renamed from: s, reason: collision with root package name */
    public Button f561s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f562t;

    /* renamed from: u, reason: collision with root package name */
    public Message f563u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f564v;

    /* renamed from: w, reason: collision with root package name */
    public NestedScrollView f565w;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f567z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f553j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f566x = 0;
    public int E = -1;
    public final a L = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: s, reason: collision with root package name */
        public final int f568s;

        /* renamed from: t, reason: collision with root package name */
        public final int f569t;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.V);
            this.f569t = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f568s = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f554k && (message4 = alertController.f556m) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.o && (message3 = alertController.f559q) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f561s && (message2 = alertController.f563u) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            alertController.K.obtainMessage(1, alertController.f546b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f571a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f572b;

        /* renamed from: c, reason: collision with root package name */
        public Drawable f573c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f574d;

        /* renamed from: e, reason: collision with root package name */
        public View f575e;
        public CharSequence f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f576g;

        /* renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f577h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f578i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f579j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnKeyListener f580k;

        /* renamed from: l, reason: collision with root package name */
        public ListAdapter f581l;

        /* renamed from: m, reason: collision with root package name */
        public DialogInterface.OnClickListener f582m;

        /* renamed from: n, reason: collision with root package name */
        public View f583n;
        public boolean o;

        /* renamed from: p, reason: collision with root package name */
        public int f584p = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f571a = contextThemeWrapper;
            this.f572b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<DialogInterface> f585a;

        public c(DialogInterface dialogInterface) {
            this.f585a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != -3 && i10 != -2 && i10 != -1) {
                if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f585a.get(), message.what);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10) {
            super(context, i10, R.id.text1, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, n nVar, Window window) {
        this.f545a = context;
        this.f546b = nVar;
        this.f547c = window;
        this.K = new c(nVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a0.a.G, com.hamkho.livefoot.R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f548d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        nVar.b().w(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.K.obtainMessage(i10, onClickListener);
        } else {
            message = null;
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f555l = charSequence;
                    this.f556m = message;
                    this.f557n = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f558p = charSequence;
            this.f559q = message;
            this.f560r = null;
            return;
        }
        this.f562t = charSequence;
        this.f563u = message;
        this.f564v = null;
    }
}
