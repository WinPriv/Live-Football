package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.ArrayList;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements p.a {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0019a f2253d;

    /* renamed from: a, reason: collision with root package name */
    public final s.d f2250a = new s.d(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f2251b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f2252c = new ArrayList<>();
    public int f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final p f2254e = new p(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0019a {
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2255a;

        /* renamed from: b, reason: collision with root package name */
        public int f2256b;

        /* renamed from: c, reason: collision with root package name */
        public Object f2257c;

        /* renamed from: d, reason: collision with root package name */
        public int f2258d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f2255a = i10;
            this.f2256b = i11;
            this.f2258d = i12;
            this.f2257c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f2255a;
            if (i10 != bVar.f2255a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f2258d - this.f2256b) == 1 && this.f2258d == bVar.f2256b && this.f2256b == bVar.f2258d) {
                return true;
            }
            if (this.f2258d != bVar.f2258d || this.f2256b != bVar.f2256b) {
                return false;
            }
            Object obj2 = this.f2257c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2257c)) {
                    return false;
                }
            } else if (bVar.f2257c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2255a * 31) + this.f2256b) * 31) + this.f2258d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f2255a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = com.anythink.expressad.d.a.b.ay;
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f2256b);
            sb2.append("c:");
            sb2.append(this.f2258d);
            sb2.append(",p:");
            sb2.append(this.f2257c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(RecyclerView.f fVar) {
        this.f2253d = fVar;
    }

    public final boolean a(int i10) {
        ArrayList<b> arrayList = this.f2252c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f2255a;
            if (i12 == 8) {
                if (f(bVar.f2258d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f2256b;
                int i14 = bVar.f2258d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f2252c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((RecyclerView.f) this.f2253d).a(arrayList.get(i10));
        }
        l(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f2251b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f2255a;
            InterfaceC0019a interfaceC0019a = this.f2253d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            RecyclerView.f fVar = (RecyclerView.f) interfaceC0019a;
                            fVar.a(bVar);
                            int i12 = bVar.f2256b;
                            int i13 = bVar.f2258d;
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.offsetPositionRecordsForMove(i12, i13);
                            recyclerView.mItemsAddedOrRemoved = true;
                        }
                    } else {
                        RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0019a;
                        fVar2.a(bVar);
                        int i14 = bVar.f2256b;
                        int i15 = bVar.f2258d;
                        Object obj = bVar.f2257c;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.viewRangeUpdate(i14, i15, obj);
                        recyclerView2.mItemsChanged = true;
                    }
                } else {
                    RecyclerView.f fVar3 = (RecyclerView.f) interfaceC0019a;
                    fVar3.a(bVar);
                    int i16 = bVar.f2256b;
                    int i17 = bVar.f2258d;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.offsetPositionRecordsForRemove(i16, i17, true);
                    recyclerView3.mItemsAddedOrRemoved = true;
                    recyclerView3.mState.f2203c += i17;
                }
            } else {
                RecyclerView.f fVar4 = (RecyclerView.f) interfaceC0019a;
                fVar4.a(bVar);
                int i18 = bVar.f2256b;
                int i19 = bVar.f2258d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForInsert(i18, i19);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.f = 0;
    }

    public final void d(b bVar) {
        int i10;
        s.d dVar;
        boolean z10;
        int i11 = bVar.f2255a;
        if (i11 != 1 && i11 != 8) {
            int m10 = m(bVar.f2256b, i11);
            int i12 = bVar.f2256b;
            int i13 = bVar.f2255a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int i16 = bVar.f2258d;
                dVar = this.f2250a;
                if (i14 >= i16) {
                    break;
                }
                int m11 = m((i10 * i14) + bVar.f2256b, bVar.f2255a);
                int i17 = bVar.f2255a;
                if (i17 == 2 ? m11 == m10 : !(i17 != 4 || m11 != m10 + 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15++;
                } else {
                    b h10 = h(i17, m10, i15, bVar.f2257c);
                    e(h10, i12);
                    h10.f2257c = null;
                    dVar.a(h10);
                    if (bVar.f2255a == 4) {
                        i12 += i15;
                    }
                    i15 = 1;
                    m10 = m11;
                }
                i14++;
            }
            Object obj = bVar.f2257c;
            bVar.f2257c = null;
            dVar.a(bVar);
            if (i15 > 0) {
                b h11 = h(bVar.f2255a, m10, i15, obj);
                e(h11, i12);
                h11.f2257c = null;
                dVar.a(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i10) {
        RecyclerView.f fVar = (RecyclerView.f) this.f2253d;
        fVar.a(bVar);
        int i11 = bVar.f2255a;
        if (i11 != 2) {
            if (i11 == 4) {
                int i12 = bVar.f2258d;
                Object obj = bVar.f2257c;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.viewRangeUpdate(i10, i12, obj);
                recyclerView.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i13 = bVar.f2258d;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.offsetPositionRecordsForRemove(i10, i13, true);
        recyclerView2.mItemsAddedOrRemoved = true;
        recyclerView2.mState.f2203c += i13;
    }

    public final int f(int i10, int i11) {
        ArrayList<b> arrayList = this.f2252c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f2255a;
            if (i12 == 8) {
                int i13 = bVar.f2256b;
                if (i13 == i10) {
                    i10 = bVar.f2258d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f2258d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f2256b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f2258d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f2258d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        if (this.f2251b.size() > 0) {
            return true;
        }
        return false;
    }

    public final b h(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f2250a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f2255a = i10;
        bVar.f2256b = i11;
        bVar.f2258d = i12;
        bVar.f2257c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2252c.add(bVar);
        int i10 = bVar.f2255a;
        InterfaceC0019a interfaceC0019a = this.f2253d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        int i11 = bVar.f2256b;
                        int i12 = bVar.f2258d;
                        RecyclerView recyclerView = RecyclerView.this;
                        recyclerView.offsetPositionRecordsForMove(i11, i12);
                        recyclerView.mItemsAddedOrRemoved = true;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                int i13 = bVar.f2256b;
                int i14 = bVar.f2258d;
                Object obj = bVar.f2257c;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.viewRangeUpdate(i13, i14, obj);
                recyclerView2.mItemsChanged = true;
                return;
            }
            int i15 = bVar.f2256b;
            int i16 = bVar.f2258d;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.offsetPositionRecordsForRemove(i15, i16, false);
            recyclerView3.mItemsAddedOrRemoved = true;
            return;
        }
        int i17 = bVar.f2256b;
        int i18 = bVar.f2258d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForInsert(i17, i18);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f2257c = null;
        this.f2250a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<b> arrayList = this.f2252c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i14 = bVar.f2255a;
            if (i14 == 8) {
                int i15 = bVar.f2256b;
                int i16 = bVar.f2258d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            bVar.f2258d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f2258d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            bVar.f2256b = i15 + 1;
                        } else if (i11 == 2) {
                            bVar.f2256b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        bVar.f2256b = i15 + 1;
                        bVar.f2258d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f2256b = i15 - 1;
                        bVar.f2258d = i16 - 1;
                    }
                }
            } else {
                int i17 = bVar.f2256b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f2258d;
                    } else if (i14 == 2) {
                        i10 += bVar.f2258d;
                    }
                } else if (i11 == 1) {
                    bVar.f2256b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f2256b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f2255a == 8) {
                int i18 = bVar2.f2258d;
                if (i18 == bVar2.f2256b || i18 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f2258d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
