package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import com.hamkho.livefoot.R;
import g0.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.b {
    public OverflowMenuButton B;
    public Drawable C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final SparseBooleanArray K;
    public d L;
    public a M;
    public c N;
    public b O;
    public final e P;
    public int Q;

    /* loaded from: classes.dex */
    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends z {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.z
            public final androidx.appcompat.view.menu.p b() {
                d dVar = ActionMenuPresenter.this.L;
                if (dVar == null) {
                    return null;
                }
                return dVar.a();
            }

            @Override // androidx.appcompat.widget.z
            public final boolean c() {
                ActionMenuPresenter.this.n();
                return true;
            }

            @Override // androidx.appcompat.widget.z
            public final boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.N != null) {
                    return false;
                }
                actionMenuPresenter.i();
                return true;
            }
        }

        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            q0.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public int f918s;

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

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f918s);
        }

        public SavedState(Parcel parcel) {
            this.f918s = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false);
            if (!((rVar.A.f862x & 32) == 32)) {
                View view2 = ActionMenuPresenter.this.B;
                this.f = view2 == null ? (View) ActionMenuPresenter.this.f782z : view2;
            }
            e eVar = ActionMenuPresenter.this.P;
            this.f873i = eVar;
            androidx.appcompat.view.menu.k kVar = this.f874j;
            if (kVar != null) {
                kVar.e(eVar);
            }
        }

        @Override // androidx.appcompat.view.menu.l
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.M = null;
            actionMenuPresenter.Q = 0;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final d f921s;

        public c(d dVar) {
            this.f921s = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.a aVar;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.h hVar = actionMenuPresenter.f778u;
            if (hVar != null && (aVar = hVar.f820e) != null) {
                aVar.b(hVar);
            }
            View view = (View) actionMenuPresenter.f782z;
            if (view != null && view.getWindowToken() != null) {
                d dVar = this.f921s;
                boolean z10 = true;
                if (!dVar.b()) {
                    if (dVar.f == null) {
                        z10 = false;
                    } else {
                        dVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    actionMenuPresenter.L = dVar;
                }
            }
            actionMenuPresenter.N = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.appcompat.view.menu.l {
        public d(Context context, androidx.appcompat.view.menu.h hVar, View view) {
            super(context, hVar, view, true);
            this.f871g = 8388613;
            e eVar = ActionMenuPresenter.this.P;
            this.f873i = eVar;
            androidx.appcompat.view.menu.k kVar = this.f874j;
            if (kVar != null) {
                kVar.e(eVar);
            }
        }

        @Override // androidx.appcompat.view.menu.l
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.h hVar = actionMenuPresenter.f778u;
            if (hVar != null) {
                hVar.c(true);
            }
            actionMenuPresenter.L = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class e implements m.a {
        public e() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (hVar instanceof androidx.appcompat.view.menu.r) {
                hVar.k().c(false);
            }
            m.a aVar = ActionMenuPresenter.this.f780w;
            if (aVar != null) {
                aVar.b(hVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (hVar == actionMenuPresenter.f778u) {
                return false;
            }
            actionMenuPresenter.Q = ((androidx.appcompat.view.menu.r) hVar).A.f841a;
            m.a aVar = actionMenuPresenter.f780w;
            if (aVar == null) {
                return false;
            }
            return aVar.c(hVar);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context);
        this.K = new SparseBooleanArray();
        this.P = new e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.n$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = jVar.getActionView();
        int i10 = 0;
        if (actionView == null || jVar.e()) {
            if (view instanceof n.a) {
                actionMenuItemView = (n.a) view;
            } else {
                actionMenuItemView = (n.a) this.f779v.inflate(this.y, viewGroup, false);
            }
            actionMenuItemView.c(jVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f782z);
            if (this.O == null) {
                this.O = new b();
            }
            actionMenuItemView2.setPopupCallback(this.O);
            actionView = actionMenuItemView;
        }
        if (jVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
        i();
        a aVar = this.M;
        if (aVar != null && aVar.b()) {
            aVar.f874j.dismiss();
        }
        m.a aVar2 = this.f780w;
        if (aVar2 != null) {
            aVar2.b(hVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        androidx.appcompat.view.menu.j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f782z;
        ArrayList<androidx.appcompat.view.menu.j> arrayList = null;
        boolean z13 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.h hVar = this.f778u;
            if (hVar != null) {
                hVar.i();
                ArrayList<androidx.appcompat.view.menu.j> l10 = this.f778u.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.appcompat.view.menu.j jVar2 = l10.get(i11);
                    if ((jVar2.f862x & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof n.a) {
                            jVar = ((n.a) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View a10 = a(jVar2, childAt, viewGroup);
                        if (jVar2 != jVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f782z).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.B) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z11 = true;
                }
                if (!z11) {
                    i10++;
                }
            }
        }
        ((View) this.f782z).requestLayout();
        androidx.appcompat.view.menu.h hVar2 = this.f778u;
        if (hVar2 != null) {
            hVar2.i();
            ArrayList<androidx.appcompat.view.menu.j> arrayList2 = hVar2.f823i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                n0.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.h hVar3 = this.f778u;
        if (hVar3 != null) {
            hVar3.i();
            arrayList = hVar3.f824j;
        }
        if (this.E && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z13 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z13 = true;
            }
        }
        if (z13) {
            if (this.B == null) {
                this.B = new OverflowMenuButton(this.f776s);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.B.getParent();
            if (viewGroup3 != this.f782z) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f782z;
                OverflowMenuButton overflowMenuButton = this.B;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f925a = true;
                actionMenuView.addView(overflowMenuButton, cVar);
            }
        } else {
            OverflowMenuButton overflowMenuButton2 = this.B;
            if (overflowMenuButton2 != null) {
                Object parent = overflowMenuButton2.getParent();
                Object obj = this.f782z;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.B);
                }
            }
        }
        ((ActionMenuView) this.f782z).setOverflowReserved(this.E);
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d() {
        int i10;
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.h hVar = actionMenuPresenter.f778u;
        if (hVar != null) {
            arrayList = hVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = actionMenuPresenter.I;
        int i13 = actionMenuPresenter.H;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f782z;
        int i14 = 0;
        boolean z18 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            androidx.appcompat.view.menu.j jVar = arrayList.get(i14);
            int i17 = jVar.y;
            if ((i17 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i16++;
                } else {
                    z18 = true;
                }
            }
            if (actionMenuPresenter.J && jVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (actionMenuPresenter.E && (z18 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.K;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            androidx.appcompat.view.menu.j jVar2 = arrayList.get(i19);
            int i21 = jVar2.y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = jVar2.f842b;
            if (z11) {
                View a10 = actionMenuPresenter.a(jVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                jVar2.f(z10);
            } else {
                if ((i21 & 1) == z10) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean z19 = sparseBooleanArray.get(i22);
                    if ((i18 > 0 || z19) && i13 > 0) {
                        z13 = z10;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = actionMenuPresenter.a(jVar2, null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i19; i23++) {
                            androidx.appcompat.view.menu.j jVar3 = arrayList.get(i23);
                            if (jVar3.f842b == i22) {
                                if ((jVar3.f862x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i18++;
                                }
                                jVar3.f(false);
                            }
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    jVar2.f(z13);
                } else {
                    jVar2.f(false);
                    i19++;
                    i11 = 2;
                    actionMenuPresenter = this;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            actionMenuPresenter = this;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void g(Context context, androidx.appcompat.view.menu.h hVar) {
        this.f777t = context;
        LayoutInflater.from(context);
        this.f778u = hVar;
        Resources resources = context.getResources();
        if (!this.F) {
            this.E = true;
        }
        int i10 = 2;
        this.G = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 5;
        }
        this.I = i10;
        int i13 = this.G;
        if (this.E) {
            if (this.B == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f776s);
                this.B = overflowMenuButton;
                if (this.D) {
                    overflowMenuButton.setImageDrawable(this.C);
                    this.C = null;
                    this.D = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.B.getMeasuredWidth();
        } else {
            this.B = null;
        }
        this.H = i13;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void h(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f918s) > 0 && (findItem = this.f778u.findItem(i10)) != null) {
            j((androidx.appcompat.view.menu.r) findItem.getSubMenu());
        }
    }

    public final boolean i() {
        Object obj;
        c cVar = this.N;
        if (cVar != null && (obj = this.f782z) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.N = null;
            return true;
        }
        d dVar = this.L;
        if (dVar != null) {
            if (dVar.b()) {
                dVar.f874j.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(androidx.appcompat.view.menu.r r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.h r2 = r0.f887z
            androidx.appcompat.view.menu.h r3 = r8.f778u
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.r r0 = (androidx.appcompat.view.menu.r) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.n r2 = r8.f782z
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.n.a
            if (r6 == 0) goto L35
            r6 = r5
            androidx.appcompat.view.menu.n$a r6 = (androidx.appcompat.view.menu.n.a) r6
            androidx.appcompat.view.menu.j r6 = r6.getItemData()
            androidx.appcompat.view.menu.j r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            androidx.appcompat.view.menu.j r0 = r9.A
            int r0 = r0.f841a
            r8.Q = r0
            int r0 = r9.size()
            r2 = r1
        L47:
            r3 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5c
            r0 = r3
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            androidx.appcompat.widget.ActionMenuPresenter$a r2 = new androidx.appcompat.widget.ActionMenuPresenter$a
            android.content.Context r4 = r8.f777t
            r2.<init>(r4, r9, r5)
            r8.M = r2
            r2.f872h = r0
            androidx.appcompat.view.menu.k r2 = r2.f874j
            if (r2 == 0) goto L72
            r2.p(r0)
        L72:
            androidx.appcompat.widget.ActionMenuPresenter$a r0 = r8.M
            boolean r2 = r0.b()
            if (r2 == 0) goto L7c
        L7a:
            r1 = r3
            goto L85
        L7c:
            android.view.View r2 = r0.f
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.d(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            androidx.appcompat.view.menu.m$a r0 = r8.f780w
            if (r0 == 0) goto L8e
            r0.c(r9)
        L8e:
            return r3
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.j(androidx.appcompat.view.menu.r):boolean");
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable k() {
        SavedState savedState = new SavedState();
        savedState.f918s = this.Q;
        return savedState;
    }

    public final boolean m() {
        d dVar = this.L;
        if (dVar != null && dVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.h hVar;
        if (this.E && !m() && (hVar = this.f778u) != null && this.f782z != null && this.N == null) {
            hVar.i();
            if (!hVar.f824j.isEmpty()) {
                c cVar = new c(new d(this.f777t, this.f778u, this.B));
                this.N = cVar;
                ((View) this.f782z).post(cVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
