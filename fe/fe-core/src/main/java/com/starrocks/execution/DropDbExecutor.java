// This file is licensed under the Elastic License 2.0. Copyright 2021-present, StarRocks Limited.

package com.starrocks.execution;

import com.starrocks.analysis.DropDbStmt;
import com.starrocks.analysis.StatementBase;
import com.starrocks.common.DdlException;
import com.starrocks.qe.ConnectContext;
import com.starrocks.qe.ShowResultSet;

public class DropDbExecutor implements DataDefinitionExecutor {

    public ShowResultSet execute(StatementBase stmt, ConnectContext context) throws DdlException {
        context.getGlobalStateMgr().dropDb((DropDbStmt) stmt);
        return null;
    }
}
