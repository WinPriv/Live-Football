package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.n;
import com.hamkho.livefoot.R;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class f<S> extends w<S> {
    public static final /* synthetic */ int G = 0;
    public RecyclerView A;
    public RecyclerView B;
    public View C;
    public View D;
    public View E;
    public View F;

    /* renamed from: t, reason: collision with root package name */
    public int f20690t;

    /* renamed from: u, reason: collision with root package name */
    public DateSelector<S> f20691u;

    /* renamed from: v, reason: collision with root package name */
    public CalendarConstraints f20692v;

    /* renamed from: w, reason: collision with root package name */
    public DayViewDecorator f20693w;

    /* renamed from: x, reason: collision with root package name */
    public Month f20694x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public com.google.android.material.datepicker.b f20695z;

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class a extends n0.a {
        @Override // n0.a
        public final void d(View view, o0.g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class b extends y {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11) {
            super(i10);
            this.E = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void C0(RecyclerView.z zVar, int[] iArr) {
            int i10 = this.E;
            f fVar = f.this;
            if (i10 == 0) {
                iArr[0] = fVar.B.getWidth();
                iArr[1] = fVar.B.getWidth();
            } else {
                iArr[0] = fVar.B.getHeight();
                iArr[1] = fVar.B.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class c implements d {
        public c() {
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public interface d {
    }

    @Override // com.google.android.material.datepicker.w
    public final boolean a(n.d dVar) {
        return super.a(dVar);
    }

    public final void b(Month month) {
        boolean z10;
        Month month2 = ((u) this.B.getAdapter()).f20735i.f20644s;
        Calendar calendar = month2.f20659s;
        if (calendar instanceof GregorianCalendar) {
            int i10 = month.f20661u;
            int i11 = month2.f20661u;
            int i12 = month.f20660t;
            int i13 = month2.f20660t;
            int i14 = (i12 - i13) + ((i10 - i11) * 12);
            Month month3 = this.f20694x;
            if (calendar instanceof GregorianCalendar) {
                int i15 = i14 - ((month3.f20660t - i13) + ((month3.f20661u - i11) * 12));
                boolean z11 = true;
                if (Math.abs(i15) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i15 <= 0) {
                    z11 = false;
                }
                this.f20694x = month;
                if (z10 && z11) {
                    this.B.scrollToPosition(i14 - 3);
                    this.B.post(new e(this, i14));
                    return;
                } else if (z10) {
                    this.B.scrollToPosition(i14 + 3);
                    this.B.post(new e(this, i14));
                    return;
                } else {
                    this.B.post(new e(this, i14));
                    return;
                }
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void c(int i10) {
        this.y = i10;
        if (i10 == 2) {
            this.A.getLayoutManager().p0(this.f20694x.f20661u - ((c0) this.A.getAdapter()).f20684i.f20692v.f20644s.f20661u);
            this.E.setVisibility(0);
            this.F.setVisibility(8);
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.E.setVisibility(8);
            this.F.setVisibility(0);
            this.C.setVisibility(0);
            this.D.setVisibility(0);
            b(this.f20694x);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f20690t = bundle.getInt("THEME_RES_ID_KEY");
        this.f20691u = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f20692v = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f20693w = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f20694x = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        com.google.android.material.datepicker.c cVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f20690t);
        this.f20695z = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f20692v.f20644s;
        if (n.c(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = s.y;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        n0.c0.l(gridView, new a());
        int i13 = this.f20692v.f20648w;
        if (i13 > 0) {
            cVar = new com.google.android.material.datepicker.c(i13);
        } else {
            cVar = new com.google.android.material.datepicker.c();
        }
        gridView.setAdapter((ListAdapter) cVar);
        gridView.setNumColumns(month.f20662v);
        gridView.setEnabled(false);
        this.B = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.B.setLayoutManager(new b(i11, i11));
        this.B.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.f20691u, this.f20692v, this.f20693w, new c());
        this.B.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.A = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.A.setLayoutManager(new GridLayoutManager(integer));
            this.A.setAdapter(new c0(this));
            this.A.addItemDecoration(new h(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            n0.c0.l(materialButton, new i(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.C = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.D = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.E = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.F = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            c(1);
            materialButton.setText(this.f20694x.k());
            this.B.addOnScrollListener(new j(this, uVar, materialButton));
            materialButton.setOnClickListener(new k(this));
            this.D.setOnClickListener(new l(this, uVar));
            this.C.setOnClickListener(new com.google.android.material.datepicker.d(this, uVar));
        }
        if (!n.c(contextThemeWrapper)) {
            new androidx.recyclerview.widget.u().a(this.B);
        }
        RecyclerView recyclerView2 = this.B;
        Month month2 = this.f20694x;
        Month month3 = uVar.f20735i.f20644s;
        if (month3.f20659s instanceof GregorianCalendar) {
            recyclerView2.scrollToPosition((month2.f20660t - month3.f20660t) + ((month2.f20661u - month3.f20661u) * 12));
            n0.c0.l(this.B, new g());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f20690t);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f20691u);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20692v);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f20693w);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f20694x);
    }
}
