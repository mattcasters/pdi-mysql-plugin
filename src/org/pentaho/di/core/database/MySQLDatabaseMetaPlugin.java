package org.pentaho.di.core.database;

import org.pentaho.di.core.plugins.DatabaseMetaPlugin;

@DatabaseMetaPlugin(
    type="MYSQL", 
    typeDescription="MySQL"
    )
public class MySQLDatabaseMetaPlugin extends MySQLDatabaseMeta implements DatabaseInterface {

}
