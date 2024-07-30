package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.hamkho.livefoot.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import n0.o0;
import n0.p0;
import n0.s0;
import n0.t0;
import n0.u0;
import n0.v0;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class n<S> extends androidx.fragment.app.l {
    public static final /* synthetic */ int S = 0;
    public DayViewDecorator A;
    public f<S> B;
    public int C;
    public CharSequence D;
    public boolean E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public CharSequence J;
    public TextView K;
    public TextView L;
    public CheckableImageButton M;
    public d7.g N;
    public Button O;
    public boolean P;
    public CharSequence Q;
    public CharSequence R;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet<q<? super S>> f20707s = new LinkedHashSet<>();

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f20708t = new LinkedHashSet<>();

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f20709u = new LinkedHashSet<>();

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f20710v = new LinkedHashSet<>();

    /* renamed from: w, reason: collision with root package name */
    public int f20711w;

    /* renamed from: x, reason: collision with root package name */
    public DateSelector<S> f20712x;
    public w<S> y;

    /* renamed from: z, reason: collision with root package name */
    public CalendarConstraints f20713z;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            n nVar = n.this;
            Iterator<q<? super S>> it = nVar.f20707s.iterator();
            while (it.hasNext()) {
                q<? super S> next = it.next();
                nVar.a().P();
                next.a();
            }
            nVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class b extends n0.a {
        public b() {
        }

        @Override // n0.a
        public final void d(View view, o0.g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            StringBuilder sb2 = new StringBuilder();
            int i10 = n.S;
            sb2.append(n.this.a().getError());
            sb2.append(", ");
            sb2.append((Object) gVar.e());
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            n nVar = n.this;
            Iterator<View.OnClickListener> it = nVar.f20708t.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            nVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class d extends v<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.v
        public final void a(S s10) {
            n nVar = n.this;
            DateSelector<S> a10 = nVar.a();
            nVar.getContext();
            String e10 = a10.e();
            TextView textView = nVar.L;
            DateSelector<S> a11 = nVar.a();
            nVar.requireContext();
            textView.setContentDescription(a11.l());
            nVar.L.setText(e10);
            nVar.O.setEnabled(nVar.a().j());
        }
    }

    public static int b(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(a0.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = month.f20662v;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    public static boolean c(Context context) {
        return d(android.R.attr.windowFullscreen, context);
    }

    public static boolean d(int i10, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z6.b.c(context, R.attr.materialCalendarStyle, f.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final DateSelector<S> a() {
        if (this.f20712x == null) {
            this.f20712x = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f20712x;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r8 = this;
            r8.requireContext()
            int r0 = r8.f20711w
            if (r0 == 0) goto L8
            goto L10
        L8:
            com.google.android.material.datepicker.DateSelector r0 = r8.a()
            int r0 = r0.i()
        L10:
            com.google.android.material.datepicker.DateSelector r1 = r8.a()
            com.google.android.material.datepicker.CalendarConstraints r2 = r8.f20713z
            com.google.android.material.datepicker.DayViewDecorator r3 = r8.A
            com.google.android.material.datepicker.f r4 = new com.google.android.material.datepicker.f
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r1, r2)
            java.lang.String r7 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r7, r3)
            com.google.android.material.datepicker.Month r2 = r2.f20647v
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r3, r2)
            r4.setArguments(r5)
            r8.B = r4
            com.google.android.material.internal.CheckableImageButton r2 = r8.M
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L69
            com.google.android.material.datepicker.DateSelector r3 = r8.a()
            com.google.android.material.datepicker.CalendarConstraints r4 = r8.f20713z
            com.google.android.material.datepicker.r r5 = new com.google.android.material.datepicker.r
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r7.putParcelable(r0, r3)
            r7.putParcelable(r1, r4)
            r5.setArguments(r7)
            goto L6b
        L69:
            com.google.android.material.datepicker.f<S> r5 = r8.B
        L6b:
            r8.y = r5
            android.widget.TextView r0 = r8.K
            r1 = 0
            r3 = 2
            if (r2 == 0) goto L87
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            if (r2 != r3) goto L81
            r2 = 1
            goto L82
        L81:
            r2 = r1
        L82:
            if (r2 == 0) goto L87
            java.lang.CharSequence r2 = r8.R
            goto L89
        L87:
            java.lang.CharSequence r2 = r8.Q
        L89:
            r0.setText(r2)
            com.google.android.material.datepicker.DateSelector r0 = r8.a()
            r8.getContext()
            java.lang.String r0 = r0.e()
            android.widget.TextView r2 = r8.L
            com.google.android.material.datepicker.DateSelector r4 = r8.a()
            r8.requireContext()
            java.lang.String r4 = r4.l()
            r2.setContentDescription(r4)
            android.widget.TextView r2 = r8.L
            r2.setText(r0)
            androidx.fragment.app.FragmentManager r0 = r8.getChildFragmentManager()
            r0.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r0)
            com.google.android.material.datepicker.w<S> r0 = r8.y
            r4 = 0
            r5 = 2131362855(0x7f0a0427, float:1.8345502E38)
            r2.c(r5, r0, r4, r3)
            boolean r0 = r2.f1895g
            if (r0 != 0) goto Ld5
            androidx.fragment.app.FragmentManager r0 = r2.f1776p
            r0.x(r2, r1)
            com.google.android.material.datepicker.w<S> r0 = r8.y
            com.google.android.material.datepicker.n$d r1 = new com.google.android.material.datepicker.n$d
            r1.<init>()
            r0.a(r1)
            return
        Ld5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.e():void");
    }

    public final void f(CheckableImageButton checkableImageButton) {
        String string;
        if (this.M.isChecked()) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.M.setContentDescription(string);
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f20709u.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f20711w = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f20712x = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f20713z = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.A = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.C = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.D = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.F = bundle.getInt("INPUT_MODE_KEY");
        this.G = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.H = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.I = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.J = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.D;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.C);
        }
        this.Q = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.R = charSequence;
    }

    @Override // androidx.fragment.app.l
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i10 = this.f20711w;
        if (i10 == 0) {
            i10 = a().i();
        }
        Dialog dialog = new Dialog(requireContext, i10);
        Context context = dialog.getContext();
        this.E = c(context);
        int i11 = z6.b.c(context, R.attr.colorSurface, n.class.getCanonicalName()).data;
        d7.g gVar = new d7.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.N = gVar;
        gVar.i(context);
        this.N.k(ColorStateList.valueOf(i11));
        d7.g gVar2 = this.N;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        gVar2.j(c0.i.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        boolean z10;
        if (this.E) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.A;
        if (dayViewDecorator != null) {
            dayViewDecorator.getClass();
        }
        if (this.E) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(b(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(b(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.L = textView;
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        c0.g.f(textView, 1);
        this.M = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.K = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.M.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.M;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, g.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.M;
        if (this.F != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        n0.c0.l(this.M, null);
        f(this.M);
        this.M.setOnClickListener(new p(this));
        this.O = (Button) inflate.findViewById(R.id.confirm_button);
        if (a().j()) {
            this.O.setEnabled(true);
        } else {
            this.O.setEnabled(false);
        }
        this.O.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.H;
        if (charSequence != null) {
            this.O.setText(charSequence);
        } else {
            int i11 = this.G;
            if (i11 != 0) {
                this.O.setText(i11);
            }
        }
        this.O.setOnClickListener(new a());
        n0.c0.l(this.O, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.J;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i12 = this.I;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f20710v.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month c10;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f20711w);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f20712x);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f20713z);
        Month month = this.B.f20694x;
        if (month != null) {
            bVar.f20653c = Long.valueOf(month.f20664x);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f20655e);
        Month c11 = Month.c(bVar.f20651a);
        Month c12 = Month.c(bVar.f20652b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f20653c;
        if (l10 == null) {
            c10 = null;
        } else {
            c10 = Month.c(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(c11, c12, dateValidator, c10, bVar.f20654d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.A);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.C);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.D);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.G);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.H);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.I);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.J);
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public final void onStart() {
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        v0 s0Var;
        v0 s0Var2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.E) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.N);
            if (!this.P) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int L0 = a0.a.L0(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    num = Integer.valueOf(L0);
                }
                Integer valueOf = Integer.valueOf(L0);
                if (i11 >= 30) {
                    p0.a(window, false);
                } else {
                    o0.a(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = f0.a.c(a0.a.L0(context, android.R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean Q0 = a0.a.Q0(num.intValue());
                if (!a0.a.Q0(0) && !Q0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                window.getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    s0Var = new u0(window);
                } else if (i12 >= 26) {
                    s0Var = new t0(window);
                } else {
                    s0Var = new s0(window);
                }
                s0Var.d(z11);
                boolean Q02 = a0.a.Q0(valueOf.intValue());
                if (a0.a.Q0(i10) || (i10 == 0 && Q02)) {
                    z12 = true;
                }
                window.getDecorView();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    s0Var2 = new u0(window);
                } else if (i13 >= 26) {
                    s0Var2 = new t0(window);
                } else {
                    s0Var2 = new s0(window);
                }
                s0Var2.c(z12);
                o oVar = new o(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
                c0.i.u(findViewById, oVar);
                this.P = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.N, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new r6.a(requireDialog(), rect));
        }
        e();
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public final void onStop() {
        this.y.f20742s.clear();
        super.onStop();
    }
}
