package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.ReferenceResolver;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class MapReferenceResolver implements ReferenceResolver {
    protected Kryo kryo;
    protected final IdentityObjectIntMap writtenObjects = new IdentityObjectIntMap();
    protected final ArrayList readObjects = new ArrayList();

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int addWrittenObject(Object obj) {
        IdentityObjectIntMap identityObjectIntMap = this.writtenObjects;
        int i10 = identityObjectIntMap.size;
        identityObjectIntMap.put(obj, i10);
        return i10;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public Object getReadObject(Class cls, int i10) {
        return this.readObjects.get(i10);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int getWrittenId(Object obj) {
        return this.writtenObjects.get(obj, -1);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public int nextReadId(Class cls) {
        int size = this.readObjects.size();
        this.readObjects.add(null);
        return size;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void reset() {
        this.readObjects.clear();
        this.writtenObjects.clear();
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public void setReadObject(int i10, Object obj) {
        this.readObjects.set(i10, obj);
    }

    @Override // com.esotericsoftware.kryo.ReferenceResolver
    public boolean useReferences(Class cls) {
        return !Util.isWrapperClass(cls);
    }
}
