package com.vungle.warren.persistence;

/* loaded from: classes2.dex */
class Query {
    String[] args;
    String[] columns;
    String groupBy;
    String having;
    String limit;
    String orderBy;
    String selection;
    final String tableName;

    public Query(String str) {
        this.tableName = str;
    }
}
