package com.github.dbunit.rules.cdi.api.expoter;

import org.dbunit.DatabaseUnitException;

import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by pestano on 09/09/16.
 */
public interface DataSetExporter {


    OutputStream export(Connection connection, DataSetExportConfig dbUnitExportConfig) throws SQLException, DatabaseUnitException;
}
