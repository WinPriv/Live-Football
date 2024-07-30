package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.ReferenceResolver;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ListReferenceResolver implements ReferenceResolver {
    protected Kryo kryo;
    protected final ArrayList seenObjects = new ArrayList();

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int addWrittenObject(Object obj) {
        int size = this.seenObjects.size();
        this.seenObjects.add(obj);
        return size;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public Object getReadObject(Class cls, int i10) {
        return this.seenObjects.get(i10);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int getWrittenId(Object obj) {
        int size = this.seenObjects.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.seenObjects.get(i10) == obj) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int nextReadId(Class cls) {
        int size = this.seenObjects.size();
        this.seenObjects.add(null);
        return size;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void reset() {
        this.seenObjects.clear();
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void setReadObject(int i10, Object obj) {
        this.seenObjects.set(i10, obj);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public boolean useReferences(Class cls) {
        return !Util.isWrapperClass(cls);
    }
}
