package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.hamkho.livefoot.R;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: s, reason: collision with root package name */
    public final Calendar f20657s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f20658t;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20657s = a0.d(null);
        if (n.c(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f20658t = n.d(R.attr.nestedScrollable, getContext());
        n0.c0.l(this, new m());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s getAdapter2() {
        return (s) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        s sVar;
        Iterator<m0.c<Long, Long>> it;
        int i10;
        int i11;
        boolean z10;
        int a10;
        int width;
        int a11;
        int width2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int left;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        s adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f20728t;
        b bVar = adapter.f20730v;
        int max = Math.max(adapter.a(), getFirstVisiblePosition());
        int a12 = adapter.a();
        Month month = adapter.f20727s;
        int min = Math.min((a12 + month.f20663w) - 1, getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<m0.c<Long, Long>> it2 = dateSelector.f().iterator();
        while (it2.hasNext()) {
            m0.c<Long, Long> next = it2.next();
            Long l10 = next.f32635a;
            if (l10 != null) {
                Long l11 = next.f32636b;
                if (l11 != null) {
                    long longValue = l10.longValue();
                    long longValue2 = l11.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        boolean e10 = com.google.android.material.internal.n.e(this);
                        long longValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f20657s;
                        if (longValue < longValue3) {
                            if (max % month.f20662v == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                left = 0;
                            } else if (!e10) {
                                left = materialCalendarGridView.b(max - 1).getRight();
                            } else {
                                left = materialCalendarGridView.b(max - 1).getLeft();
                            }
                            width = left;
                            a10 = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            a10 = adapter.a() + (calendar.get(5) - 1);
                            View b10 = materialCalendarGridView.b(a10);
                            width = (b10.getWidth() / 2) + b10.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % month.f20662v == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                width2 = getWidth();
                            } else if (!e10) {
                                width2 = materialCalendarGridView.b(min).getRight();
                            } else {
                                width2 = materialCalendarGridView.b(min).getLeft();
                            }
                            a11 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            a11 = adapter.a() + (calendar.get(5) - 1);
                            View b11 = materialCalendarGridView.b(a11);
                            width2 = (b11.getWidth() / 2) + b11.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(a10);
                        i10 = max;
                        i11 = min;
                        int itemId2 = (int) adapter.getItemId(a11);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            s sVar2 = adapter;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View b12 = materialCalendarGridView.b(numColumns);
                            int top = b12.getTop() + bVar.f20671a.f20665a.top;
                            Iterator<m0.c<Long, Long>> it3 = it2;
                            int bottom = b12.getBottom() - bVar.f20671a.f20665a.bottom;
                            if (!e10) {
                                if (numColumns > a10) {
                                    i14 = 0;
                                } else {
                                    i14 = width;
                                }
                                if (a11 > numColumns2) {
                                    i15 = getWidth();
                                } else {
                                    i15 = width2;
                                }
                            } else {
                                if (a11 > numColumns2) {
                                    i12 = 0;
                                } else {
                                    i12 = width2;
                                }
                                if (numColumns > a10) {
                                    i13 = getWidth();
                                } else {
                                    i13 = width;
                                }
                                int i16 = i13;
                                i14 = i12;
                                i15 = i16;
                            }
                            canvas.drawRect(i14, top, i15, bottom, bVar.f20677h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter = sVar2;
                            it2 = it3;
                        }
                        sVar = adapter;
                        it = it2;
                    }
                }
            } else {
                sVar = adapter;
                it = it2;
                i10 = max;
                i11 = min;
            }
            materialCalendarGridView = this;
            max = i10;
            min = i11;
            adapter = sVar;
            it2 = it;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            if (i10 == 33) {
                s adapter = getAdapter();
                setSelection((adapter.a() + adapter.f20727s.f20663w) - 1);
                return;
            } else if (i10 == 130) {
                setSelection(getAdapter().a());
                return;
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
        }
        super.onFocusChanged(false, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f20658t) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof s) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), s.class.getCanonicalName()));
    }
}
