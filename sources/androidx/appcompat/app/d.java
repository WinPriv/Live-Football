package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public final class d extends n implements DialogInterface {

    /* renamed from: w, reason: collision with root package name */
    public final AlertController f646w;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f647a;

        /* renamed from: b, reason: collision with root package name */
        public final int f648b;

        public a(Context context) {
            this(context, d.d(0, context));
        }

        public d create() {
            int i10;
            AlertController.b bVar = this.f647a;
            d dVar = new d(bVar.f571a, this.f648b);
            View view = bVar.f575e;
            AlertController alertController = dVar.f646w;
            if (view != null) {
                alertController.C = view;
            } else {
                CharSequence charSequence = bVar.f574d;
                if (charSequence != null) {
                    alertController.f549e = charSequence;
                    TextView textView = alertController.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f573c;
                if (drawable != null) {
                    alertController.y = drawable;
                    alertController.f566x = 0;
                    ImageView imageView = alertController.f567z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f567z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f576g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar.f577h);
            }
            CharSequence charSequence4 = bVar.f578i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar.f579j);
            }
            if (bVar.f581l != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f572b.inflate(alertController.G, (ViewGroup) null);
                if (bVar.o) {
                    i10 = alertController.H;
                } else {
                    i10 = alertController.I;
                }
                ListAdapter listAdapter = bVar.f581l;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f571a, i10);
                }
                alertController.D = listAdapter;
                alertController.E = bVar.f584p;
                if (bVar.f582m != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                }
                if (bVar.o) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f550g = recycleListView;
            }
            View view2 = bVar.f583n;
            if (view2 != null) {
                alertController.f551h = view2;
                alertController.f552i = 0;
                alertController.f553j = false;
            }
            dVar.setCancelable(true);
            dVar.setCanceledOnTouchOutside(true);
            dVar.setOnCancelListener(null);
            dVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = bVar.f580k;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public Context getContext() {
            return this.f647a.f571a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f647a;
            bVar.f578i = bVar.f571a.getText(i10);
            bVar.f579j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f647a;
            bVar.f576g = bVar.f571a.getText(i10);
            bVar.f577h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f647a.f574d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f647a.f583n = view;
            return this;
        }

        public a(Context context, int i10) {
            this.f647a = new AlertController.b(new ContextThemeWrapper(context, d.d(i10, context)));
            this.f648b = i10;
        }
    }

    public d(Context context, int i10) {
        super(context, d(i10, context));
        this.f646w = new AlertController(getContext(), this, getWindow());
    }

    public static int d(int i10, Context context) {
        if (((i10 >>> 24) & com.anythink.expressad.exoplayer.k.p.f9095b) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.n, androidx.activity.h, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        View view;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        ListAdapter listAdapter;
        int i12;
        int i13;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.f646w;
        alertController.f546b.setContentView(alertController.F);
        Window window = alertController.f547c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = alertController.f551h;
        int i14 = 0;
        Context context = alertController.f545a;
        if (view2 == null) {
            if (alertController.f552i != 0) {
                view2 = LayoutInflater.from(context).inflate(alertController.f552i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !AlertController.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f553j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f550g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = gl.Code;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c10 = AlertController.c(findViewById7, findViewById4);
        ViewGroup c11 = AlertController.c(findViewById8, findViewById5);
        ViewGroup c12 = AlertController.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.f565w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f565w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(android.R.id.message);
        alertController.B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f565w.removeView(alertController.B);
                if (alertController.f550g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f565w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f565w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f550g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c11.setVisibility(8);
                }
            }
        }
        Button button = (Button) c12.findViewById(android.R.id.button1);
        alertController.f554k = button;
        AlertController.a aVar = alertController.L;
        button.setOnClickListener(aVar);
        boolean isEmpty = TextUtils.isEmpty(alertController.f555l);
        int i15 = alertController.f548d;
        if (isEmpty && alertController.f557n == null) {
            alertController.f554k.setVisibility(8);
            i10 = 0;
        } else {
            alertController.f554k.setText(alertController.f555l);
            Drawable drawable = alertController.f557n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i15, i15);
                alertController.f554k.setCompoundDrawables(alertController.f557n, null, null, null);
            }
            alertController.f554k.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) c12.findViewById(android.R.id.button2);
        alertController.o = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f558p) && alertController.f560r == null) {
            alertController.o.setVisibility(8);
        } else {
            alertController.o.setText(alertController.f558p);
            Drawable drawable2 = alertController.f560r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i15, i15);
                alertController.o.setCompoundDrawables(alertController.f560r, null, null, null);
            }
            alertController.o.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) c12.findViewById(android.R.id.button3);
        alertController.f561s = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f562t) && alertController.f564v == null) {
            alertController.f561s.setVisibility(8);
            view = null;
        } else {
            alertController.f561s.setText(alertController.f562t);
            Drawable drawable3 = alertController.f564v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i15, i15);
                view = null;
                alertController.f561s.setCompoundDrawables(alertController.f564v, null, null, null);
            } else {
                view = null;
            }
            alertController.f561s.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 == 1) {
                AlertController.b(alertController.f554k);
            } else if (i10 == 2) {
                AlertController.b(alertController.o);
            } else if (i10 == 4) {
                AlertController.b(alertController.f561s);
            }
        }
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            c12.setVisibility(8);
        }
        if (alertController.C != null) {
            c10.addView(alertController.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f567z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f549e)) && alertController.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.A = textView2;
                textView2.setText(alertController.f549e);
                int i16 = alertController.f566x;
                if (i16 != 0) {
                    alertController.f567z.setImageResource(i16);
                } else {
                    Drawable drawable4 = alertController.y;
                    if (drawable4 != null) {
                        alertController.f567z.setImageDrawable(drawable4);
                    } else {
                        alertController.A.setPadding(alertController.f567z.getPaddingLeft(), alertController.f567z.getPaddingTop(), alertController.f567z.getPaddingRight(), alertController.f567z.getPaddingBottom());
                        alertController.f567z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.f567z.setVisibility(8);
                c10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c10 != null && c10.getVisibility() != 8) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (c12.getVisibility() != 8) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14 && (findViewById2 = c11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f565w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f == null && alertController.f550g == null) {
                findViewById = view;
            } else {
                findViewById = c10.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = c11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f550g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z14 || i11 == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i11 != 0) {
                    i12 = recycleListView.getPaddingTop();
                } else {
                    i12 = recycleListView.f568s;
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (z14) {
                    i13 = recycleListView.getPaddingBottom();
                } else {
                    i13 = recycleListView.f569t;
                }
                recycleListView.setPadding(paddingLeft, i12, paddingRight, i13);
            }
        }
        if (!z13) {
            View view3 = alertController.f550g;
            if (view3 == null) {
                view3 = alertController.f565w;
            }
            if (view3 != null) {
                if (z14) {
                    i14 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.j.d(view3, i11 | i14, 3);
                if (findViewById11 != null) {
                    c11.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c11.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f550g;
        if (recycleListView2 != null && (listAdapter = alertController.D) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i17 = alertController.E;
            if (i17 > -1) {
                recycleListView2.setItemChecked(i17, true);
                recycleListView2.setSelection(i17);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f646w.f565w;
        if (nestedScrollView != null && nestedScrollView.d(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f646w.f565w;
        if (nestedScrollView != null && nestedScrollView.d(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.n, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f646w;
        alertController.f549e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
