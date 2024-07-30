package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import d0.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.g0;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class h implements h0.a {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f816a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f817b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f818c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f819d;

    /* renamed from: e, reason: collision with root package name */
    public a f820e;
    public final ArrayList<j> f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<j> f821g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f822h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<j> f823i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<j> f824j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f825k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f827m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f828n;
    public View o;

    /* renamed from: v, reason: collision with root package name */
    public j f835v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f837x;

    /* renamed from: l, reason: collision with root package name */
    public int f826l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f829p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f830q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f831r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f832s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<j> f833t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<m>> f834u = new CopyOnWriteArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    public boolean f836w = false;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(h hVar, MenuItem menuItem);

        void b(h hVar);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(j jVar);
    }

    public h(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f816a = context;
        Resources resources = context.getResources();
        this.f817b = resources;
        this.f = new ArrayList<>();
        this.f821g = new ArrayList<>();
        this.f822h = true;
        this.f823i = new ArrayList<>();
        this.f824j = new ArrayList<>();
        this.f825k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = g0.f33078a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = g0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f819d = z11;
    }

    public j a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (y[i14] << 16) | (65535 & i12);
            j jVar = new j(this, i10, i11, i12, i15, charSequence, this.f826l);
            ArrayList<j> arrayList = this.f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (arrayList.get(size).f844d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, jVar);
            p(true);
            return jVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f816a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f846g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a10;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(m mVar, Context context) {
        this.f834u.add(new WeakReference<>(mVar));
        mVar.g(context, this);
        this.f825k = true;
    }

    public final void c(boolean z10) {
        if (this.f832s) {
            return;
        }
        this.f832s = true;
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f834u;
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                mVar.b(this, z10);
            }
        }
        this.f832s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f835v;
        if (jVar != null) {
            d(jVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f828n = null;
        this.f827m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f834u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f835v == jVar) {
            w();
            Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 = mVar.f(jVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f835v = null;
            }
        }
        return z10;
    }

    public boolean e(h hVar, MenuItem menuItem) {
        a aVar = this.f820e;
        if (aVar != null && aVar.a(hVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f834u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z10 = mVar.l(jVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f835v = jVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f.get(i11);
            if (jVar.f841a == i10) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<j> arrayList = this.f833t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            if (n10) {
                c10 = jVar.f849j;
            } else {
                c10 = jVar.f847h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i10 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean z10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList<j> arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = arrayList2.get(i12);
            if (jVar.hasSubMenu()) {
                jVar.o.h(arrayList, i10, keyEvent);
            }
            if (n10) {
                c10 = jVar.f849j;
            } else {
                c10 = jVar.f847h;
            }
            if (n10) {
                i11 = jVar.f850k;
            } else {
                i11 = jVar.f848i;
            }
            if ((modifiers & 69647) == (i11 & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && c10 != 0) {
                char[] cArr = keyData.meta;
                if (c10 != cArr[0] && c10 != cArr[2]) {
                    if (n10 && c10 == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (jVar.isEnabled()) {
                    arrayList.add(jVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f837x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ArrayList<j> l10 = l();
        if (!this.f825k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f834u;
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z11 |= mVar.d();
            }
        }
        ArrayList<j> arrayList = this.f823i;
        ArrayList<j> arrayList2 = this.f824j;
        if (z11) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = l10.get(i10);
                if ((jVar.f862x & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(jVar);
                } else {
                    arrayList2.add(jVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f825k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<j> l() {
        boolean z10 = this.f822h;
        ArrayList<j> arrayList = this.f821g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<j> arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = arrayList2.get(i10);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f822h = false;
        this.f825k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f836w;
    }

    public boolean n() {
        return this.f818c;
    }

    public boolean o() {
        return this.f819d;
    }

    public final void p(boolean z10) {
        if (!this.f829p) {
            if (z10) {
                this.f822h = true;
                this.f825k = true;
            }
            CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f834u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<m> next = it.next();
                    m mVar = next.get();
                    if (mVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        mVar.c(z10);
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f830q = true;
        if (z10) {
            this.f831r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        j g6 = g(i10, keyEvent);
        if (g6 != null) {
            z10 = q(g6, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.j) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f854p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L3e
        L19:
            androidx.appcompat.view.menu.h r1 = r7.f853n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L22
            goto L3e
        L22:
            android.content.Intent r3 = r7.f846g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f816a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L3e
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            n0.b r1 = r7.A
            if (r1 == 0) goto L40
            boolean r1 = r1.e()
            if (r1 == 0) goto L40
        L3e:
            r1 = r2
            goto L41
        L40:
            r1 = r0
        L41:
            n0.b r3 = r7.A
            if (r3 == 0) goto L4d
            boolean r4 = r3.a()
            if (r4 == 0) goto L4d
            r4 = r2
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L60
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            r6.c(r2)
            goto Lcb
        L60:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L71
            if (r4 == 0) goto L69
            goto L71
        L69:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            r6.c(r2)
            goto Lcb
        L71:
            r9 = r9 & 4
            if (r9 != 0) goto L78
            r6.c(r0)
        L78:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8c
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r5 = r6.f816a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.f845e
            r9.setHeaderTitle(r5)
        L8c:
            androidx.appcompat.view.menu.r r7 = r7.o
            if (r4 == 0) goto L93
            r3.f(r7)
        L93:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.m>> r9 = r6.f834u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9c
            goto Lc5
        L9c:
            if (r8 == 0) goto La2
            boolean r0 = r8.j(r7)
        La2:
            java.util.Iterator r8 = r9.iterator()
        La6:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.m r4 = (androidx.appcompat.view.menu.m) r4
            if (r4 != 0) goto Lbe
            r9.remove(r3)
            goto La6
        Lbe:
            if (r0 != 0) goto La6
            boolean r0 = r4.j(r7)
            goto La6
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
            r6.c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.q(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    public final void r(m mVar) {
        CopyOnWriteArrayList<WeakReference<m>> copyOnWriteArrayList = this.f834u;
        Iterator<WeakReference<m>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList<j> arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f;
            if (i12 < size) {
                if (arrayList.get(i12).f842b == i10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f842b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList<j> arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f;
            if (i11 < size) {
                if (arrayList.get(i11).f841a == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int i11;
        ArrayList<j> arrayList = this.f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = arrayList.get(i12);
            if (jVar.f842b == i10) {
                int i13 = jVar.f862x & (-5);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                jVar.f862x = i13 | i11;
                jVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f836w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList<j> arrayList = this.f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            if (jVar.f842b == i10) {
                jVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        boolean z11;
        ArrayList<j> arrayList = this.f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = arrayList.get(i12);
            if (jVar.f842b == i10) {
                int i13 = jVar.f862x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                jVar.f862x = i15;
                if (i13 != i15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f818c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.f827m = null;
            this.f828n = null;
        } else {
            if (i10 > 0) {
                this.f827m = this.f817b.getText(i10);
            } else if (charSequence != null) {
                this.f827m = charSequence;
            }
            if (i11 > 0) {
                Object obj = d0.a.f27248a;
                this.f828n = a.c.b(this.f816a, i11);
            } else if (drawable != null) {
                this.f828n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.f829p = false;
        if (this.f830q) {
            this.f830q = false;
            p(this.f831r);
        }
    }

    public final void w() {
        if (!this.f829p) {
            this.f829p = true;
            this.f830q = false;
            this.f831r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f817b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f817b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        j a10 = a(i10, i11, i12, charSequence);
        r rVar = new r(this.f816a, this, a10);
        a10.o = rVar;
        rVar.setHeaderTitle(a10.f845e);
        return rVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f817b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f817b.getString(i13));
    }

    public h k() {
        return this;
    }
}
