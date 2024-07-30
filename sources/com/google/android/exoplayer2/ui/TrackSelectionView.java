package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import j5.m0;
import j7.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k4.r1;

/* loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {
    public boolean A;
    public j B;
    public CheckedTextView[][] C;
    public boolean D;

    /* renamed from: s, reason: collision with root package name */
    public final int f20319s;

    /* renamed from: t, reason: collision with root package name */
    public final LayoutInflater f20320t;

    /* renamed from: u, reason: collision with root package name */
    public final CheckedTextView f20321u;

    /* renamed from: v, reason: collision with root package name */
    public final CheckedTextView f20322v;

    /* renamed from: w, reason: collision with root package name */
    public final a f20323w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f20324x;
    public final HashMap y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20325z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10;
            boolean z11;
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f20321u;
            HashMap hashMap = trackSelectionView.y;
            boolean z12 = true;
            if (view == checkedTextView) {
                trackSelectionView.D = true;
                hashMap.clear();
            } else if (view == trackSelectionView.f20322v) {
                trackSelectionView.D = false;
                hashMap.clear();
            } else {
                trackSelectionView.D = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                m0 m0Var = bVar.f20327a.f30784t;
                b6.j jVar = (b6.j) hashMap.get(m0Var);
                int i10 = bVar.f20328b;
                if (jVar == null) {
                    if (!trackSelectionView.A && hashMap.size() > 0) {
                        hashMap.clear();
                    }
                    hashMap.put(m0Var, new b6.j(m0Var, j0.G(Integer.valueOf(i10))));
                } else {
                    ArrayList arrayList = new ArrayList(jVar.f3072t);
                    boolean isChecked = ((CheckedTextView) view).isChecked();
                    if (trackSelectionView.f20325z && bVar.f20327a.f30785u) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (trackSelectionView.A && trackSelectionView.f20324x.size() > 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            z12 = false;
                        }
                    }
                    if (isChecked && z12) {
                        arrayList.remove(Integer.valueOf(i10));
                        if (arrayList.isEmpty()) {
                            hashMap.remove(m0Var);
                        } else {
                            hashMap.put(m0Var, new b6.j(m0Var, arrayList));
                        }
                    } else if (!isChecked) {
                        if (z10) {
                            arrayList.add(Integer.valueOf(i10));
                            hashMap.put(m0Var, new b6.j(m0Var, arrayList));
                        } else {
                            hashMap.put(m0Var, new b6.j(m0Var, j0.G(Integer.valueOf(i10))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final r1.a f20327a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20328b;

        public b(r1.a aVar, int i10) {
            this.f20327a = aVar;
            this.f20328b = i10;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f20319s = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f20320t = from;
        a aVar = new a();
        this.f20323w = aVar;
        this.B = new d(getResources());
        this.f20324x = new ArrayList();
        this.y = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20321u = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.hamkho.livefoot.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.hamkho.livefoot.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20322v = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.hamkho.livefoot.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z10;
        this.f20321u.setChecked(this.D);
        boolean z11 = this.D;
        HashMap hashMap = this.y;
        if (!z11 && hashMap.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20322v.setChecked(z10);
        for (int i10 = 0; i10 < this.C.length; i10++) {
            b6.j jVar = (b6.j) hashMap.get(((r1.a) this.f20324x.get(i10)).f30784t);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.C[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (jVar != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.C[i10][i11].setChecked(jVar.f3072t.contains(Integer.valueOf(((b) tag).f20328b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f20324x;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f20322v;
        CheckedTextView checkedTextView2 = this.f20321u;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.C = new CheckedTextView[arrayList.size()];
        if (this.A && arrayList.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r1.a aVar = (r1.a) arrayList.get(i11);
            if (this.f20325z && aVar.f30785u) {
                z11 = true;
            } else {
                z11 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.C;
            int i12 = aVar.f30783s;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            b[] bVarArr = new b[i12];
            for (int i13 = 0; i13 < aVar.f30783s; i13++) {
                bVarArr[i13] = new b(aVar, i13);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                LayoutInflater layoutInflater = this.f20320t;
                if (i14 == 0) {
                    addView(layoutInflater.inflate(com.hamkho.livefoot.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z11 && !z10) {
                    i10 = R.layout.simple_list_item_single_choice;
                } else {
                    i10 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i10, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f20319s);
                j jVar = this.B;
                b bVar = bVarArr[i14];
                checkedTextView3.setText(jVar.a(bVar.f20327a.f30784t.f29804v[bVar.f20328b]));
                checkedTextView3.setTag(bVarArr[i14]);
                if (aVar.f30786v[i14] != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f20323w);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.C[i11][i14] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.D;
    }

    public Map<m0, b6.j> getOverrides() {
        return this.y;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f20325z != z10) {
            this.f20325z = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            if (!z10) {
                HashMap hashMap = this.y;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f20324x;
                    HashMap hashMap2 = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        b6.j jVar = (b6.j) hashMap.get(((r1.a) arrayList.get(i10)).f30784t);
                        if (jVar != null && hashMap2.isEmpty()) {
                            hashMap2.put(jVar.f3071s, jVar);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f20321u.setVisibility(i10);
    }

    public void setTrackNameProvider(j jVar) {
        jVar.getClass();
        this.B = jVar;
        b();
    }
}
