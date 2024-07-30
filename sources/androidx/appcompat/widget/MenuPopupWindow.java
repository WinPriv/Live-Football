package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class MenuPopupWindow extends b0 implements c0 {
    public static final Method V;
    public c0 U;

    /* loaded from: classes.dex */
    public static class MenuDropDownListView extends DropDownListView {
        public final int E;
        public final int F;
        public c0 G;
        public androidx.appcompat.view.menu.j H;

        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.E = 21;
                this.F = 22;
            } else {
                this.E = 22;
                this.F = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.g gVar;
            int i10;
            androidx.appcompat.view.menu.j jVar;
            int pointToPosition;
            int i11;
            if (this.G != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    gVar = (androidx.appcompat.view.menu.g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (androidx.appcompat.view.menu.g) adapter;
                    i10 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < gVar.getCount()) {
                    jVar = gVar.getItem(i11);
                } else {
                    jVar = null;
                }
                androidx.appcompat.view.menu.j jVar2 = this.H;
                if (jVar2 != jVar) {
                    androidx.appcompat.view.menu.h hVar = gVar.f810s;
                    if (jVar2 != null) {
                        this.G.f(hVar, jVar2);
                    }
                    this.H = jVar;
                    if (jVar != null) {
                        this.G.c(hVar, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.g gVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.E) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i10 == this.F) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    gVar = (androidx.appcompat.view.menu.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    gVar = (androidx.appcompat.view.menu.g) adapter;
                }
                gVar.f810s.c(false);
                return true;
            }
            return super.onKeyDown(i10, keyEvent);
        }

        public void setHoverListener(c0 c0Var) {
            this.G = c0Var;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.c0
    public final void c(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        c0 c0Var = this.U;
        if (c0Var != null) {
            c0Var.c(hVar, jVar);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public final void f(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        c0 c0Var = this.U;
        if (c0Var != null) {
            c0Var.f(hVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public final DropDownListView n(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
