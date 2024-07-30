package i2;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public final class k implements l, i {

    /* renamed from: a, reason: collision with root package name */
    public final Path f29109a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f29110b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f29111c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f29112d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final n2.g f29113e;

    public k(n2.g gVar) {
        gVar.getClass();
        this.f29113e = gVar;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f29110b;
        path.reset();
        Path path2 = this.f29109a;
        path2.reset();
        ArrayList arrayList = this.f29112d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                ArrayList arrayList2 = (ArrayList) cVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path i10 = ((l) arrayList2.get(size2)).i();
                    j2.o oVar = cVar.f29062k;
                    if (oVar != null) {
                        matrix2 = oVar.d();
                    } else {
                        matrix2 = cVar.f29055c;
                        matrix2.reset();
                    }
                    i10.transform(matrix2);
                    path.addPath(i10);
                }
            } else {
                path.addPath(lVar.i());
            }
        }
        int i11 = 0;
        l lVar2 = (l) arrayList.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> f = cVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) f;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                Path i12 = ((l) arrayList3.get(i11)).i();
                j2.o oVar2 = cVar2.f29062k;
                if (oVar2 != null) {
                    matrix = oVar2.d();
                } else {
                    matrix = cVar2.f29055c;
                    matrix.reset();
                }
                i12.transform(matrix);
                path2.addPath(i12);
                i11++;
            }
        } else {
            path2.set(lVar2.i());
        }
        this.f29111c.op(path2, path, op);
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29112d;
            if (i10 < arrayList.size()) {
                ((l) arrayList.get(i10)).b(list, list2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // i2.i
    public final void f(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous instanceof l) {
                this.f29112d.add((l) previous);
                listIterator.remove();
            }
        }
    }

    @Override // i2.l
    public final Path i() {
        Path path = this.f29111c;
        path.reset();
        n2.g gVar = this.f29113e;
        if (gVar.f33247b) {
            return path;
        }
        int c10 = s.f.c(gVar.f33246a);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f29112d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                path.addPath(((l) arrayList.get(i10)).i());
                i10++;
            }
        }
        return path;
    }
}
