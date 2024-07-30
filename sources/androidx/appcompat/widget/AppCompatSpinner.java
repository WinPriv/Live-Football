package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    @SuppressLint({"ResourceType"})
    public static final int[] A = {R.attr.spinnerMode};

    /* renamed from: s, reason: collision with root package name */
    public final androidx.appcompat.widget.c f971s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f972t;

    /* renamed from: u, reason: collision with root package name */
    public final n f973u;

    /* renamed from: v, reason: collision with root package name */
    public SpinnerAdapter f974v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f975w;

    /* renamed from: x, reason: collision with root package name */
    public final h f976x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f977z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public boolean f978s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f978s ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f978s = parcel.readByte() != 0;
        }
    }

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().a()) {
                appCompatSpinner.f976x.k(c.b(appCompatSpinner), c.a(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!m0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements h, DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public androidx.appcompat.app.d f980s;

        /* renamed from: t, reason: collision with root package name */
        public ListAdapter f981t;

        /* renamed from: u, reason: collision with root package name */
        public CharSequence f982u;

        public e() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final boolean a() {
            androidx.appcompat.app.d dVar = this.f980s;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void d(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void dismiss() {
            androidx.appcompat.app.d dVar = this.f980s;
            if (dVar != null) {
                dVar.dismiss();
                this.f980s = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final CharSequence e() {
            return this.f982u;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void g(CharSequence charSequence) {
            this.f982u = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void h(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void k(int i10, int i11) {
            if (this.f981t == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            d.a aVar = new d.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f982u;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f981t;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AlertController.b bVar = aVar.f647a;
            bVar.f581l = listAdapter;
            bVar.f582m = this;
            bVar.f584p = selectedItemPosition;
            bVar.o = true;
            androidx.appcompat.app.d create = aVar.create();
            this.f980s = create;
            AlertController.RecycleListView recycleListView = create.f646w.f550g;
            c.d(recycleListView, i10);
            c.c(recycleListView, i11);
            this.f980s.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void m(ListAdapter listAdapter) {
            this.f981t = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i10);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i10, this.f981t.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: s, reason: collision with root package name */
        public final SpinnerAdapter f984s;

        /* renamed from: t, reason: collision with root package name */
        public final ListAdapter f985t;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f984s = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f985t = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof i0) {
                    i0 i0Var = (i0) spinnerAdapter;
                    if (i0Var.getDropDownViewTheme() == null) {
                        i0Var.t();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f985t;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f985t;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f984s;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends b0 implements h {
        public CharSequence U;
        public ListAdapter V;
        public final Rect W;
        public int X;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                g gVar = g.this;
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i10, gVar.V.getItemId(i10));
                }
                gVar.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z10;
                g gVar = g.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                gVar.getClass();
                WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                if (c0.g.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(gVar.W)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    gVar.dismiss();
                } else {
                    gVar.p();
                    gVar.show();
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f988s;

            public c(b bVar) {
                this.f988s = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f988s);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.W = new Rect();
            this.G = AppCompatSpinner.this;
            this.Q = true;
            this.R.setFocusable(true);
            this.H = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final CharSequence e() {
            return this.U;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void g(CharSequence charSequence) {
            this.U = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void j(int i10) {
            this.X = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public final void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            p();
            j jVar = this.R;
            jVar.setInputMethodMode(2);
            show();
            DropDownListView dropDownListView = this.f1126u;
            dropDownListView.setChoiceMode(1);
            c.d(dropDownListView, i10);
            c.c(dropDownListView, i11);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            DropDownListView dropDownListView2 = this.f1126u;
            if (a() && dropDownListView2 != null) {
                dropDownListView2.setListSelectionHidden(false);
                dropDownListView2.setSelection(selectedItemPosition);
                if (dropDownListView2.getChoiceMode() != 0) {
                    dropDownListView2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a10 && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                jVar.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.b0, androidx.appcompat.widget.AppCompatSpinner.h
        public final void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.V = listAdapter;
        }

        public final void p() {
            int i10;
            int i11;
            Drawable background = getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f977z);
                if (u0.a(appCompatSpinner)) {
                    i10 = appCompatSpinner.f977z.right;
                } else {
                    i10 = -appCompatSpinner.f977z.left;
                }
            } else {
                Rect rect = appCompatSpinner.f977z;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i12 = appCompatSpinner.y;
            if (i12 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.V, getBackground());
                int i13 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.f977z;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a10 > i14) {
                    a10 = i14;
                }
                o(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                o((width - paddingLeft) - paddingRight);
            } else {
                o(i12);
            }
            if (u0.a(appCompatSpinner)) {
                i11 = (((width - paddingRight) - this.f1128w) - this.X) + i10;
            } else {
                i11 = paddingLeft + this.X + i10;
            }
            this.f1129x = i11;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean a();

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        void g(CharSequence charSequence);

        Drawable getBackground();

        void h(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f977z = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.h0.a(r0, r10)
            int[] r0 = a0.a.X
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.c r3 = new androidx.appcompat.widget.c
            r3.<init>(r10)
            r10.f971s = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2e
            i.c r4 = new i.c
            r4.<init>(r11, r3)
            r10.f972t = r4
            goto L30
        L2e:
            r10.f972t = r11
        L30:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.AppCompatSpinner.A     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r6 == 0) goto L58
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r11 = move-exception
            r4 = r5
            goto Lcb
        L47:
            r6 = move-exception
            goto L4f
        L49:
            r11 = move-exception
            goto Lcb
        L4c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L4f:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L5b
        L58:
            r5.recycle()
        L5b:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L93
            if (r3 == r6) goto L62
            goto La0
        L62:
            androidx.appcompat.widget.AppCompatSpinner$g r3 = new androidx.appcompat.widget.AppCompatSpinner$g
            android.content.Context r7 = r10.f972t
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.f972t
            androidx.appcompat.widget.m0 r0 = androidx.appcompat.widget.m0.m(r7, r12, r0, r13)
            android.content.res.TypedArray r7 = r0.f1206b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.y = r7
            android.graphics.drawable.Drawable r7 = r0.e(r6)
            r3.setBackgroundDrawable(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.U = r5
            r0.n()
            r10.f976x = r3
            androidx.appcompat.widget.n r0 = new androidx.appcompat.widget.n
            r0.<init>(r10, r10, r3)
            r10.f973u = r0
            goto La0
        L93:
            androidx.appcompat.widget.AppCompatSpinner$e r0 = new androidx.appcompat.widget.AppCompatSpinner$e
            r0.<init>()
            r10.f976x = r0
            java.lang.String r3 = r2.getString(r5)
            r0.f982u = r3
        La0:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto Lb7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131558798(0x7f0d018e, float:1.8742922E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter(r1)
        Lb7:
            r2.recycle()
            r10.f975w = r6
            android.widget.SpinnerAdapter r11 = r10.f974v
            if (r11 == 0) goto Lc5
            r10.setAdapter(r11)
            r10.f974v = r4
        Lc5:
            androidx.appcompat.widget.c r11 = r10.f971s
            r11.d(r12, r13)
            return
        Lcb:
            if (r4 == 0) goto Ld0
            r4.recycle()
        Ld0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f977z;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f976x;
        if (hVar != null) {
            return hVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f976x;
        if (hVar != null) {
            return hVar.l();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f976x != null) {
            return this.y;
        }
        return super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.f976x;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f976x;
        if (hVar != null) {
            return hVar.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f972t;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f976x;
        if (hVar != null) {
            return hVar.e();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f976x;
        if (hVar != null && hVar.a()) {
            hVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f976x != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f978s && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        h hVar = this.f976x;
        if (hVar != null && hVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        savedState.f978s = z10;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n nVar = this.f973u;
        if (nVar != null && nVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        h hVar = this.f976x;
        if (hVar != null) {
            if (!hVar.a()) {
                hVar.k(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f976x;
        if (hVar != null) {
            hVar.j(i10);
            hVar.d(i10);
        } else {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f976x;
        if (hVar != null) {
            hVar.h(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f976x != null) {
            this.y = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f976x;
        if (hVar != null) {
            hVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.a(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f976x;
        if (hVar != null) {
            hVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.c cVar = this.f971s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f975w) {
            this.f974v = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        h hVar = this.f976x;
        if (hVar != null) {
            Context context = this.f972t;
            if (context == null) {
                context = getContext();
            }
            hVar.m(new f(spinnerAdapter, context.getTheme()));
        }
    }
}
